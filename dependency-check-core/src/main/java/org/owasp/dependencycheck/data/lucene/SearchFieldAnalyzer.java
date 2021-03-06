/*
 * This file is part of dependency-check-core.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright (c) 2012 Jeremy Long. All Rights Reserved.
 */
package org.owasp.dependencycheck.data.lucene;

import java.io.Reader;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.core.LowerCaseFilter;
import org.apache.lucene.analysis.core.StopAnalyzer;
import org.apache.lucene.analysis.core.StopFilter;
import org.apache.lucene.analysis.miscellaneous.WordDelimiterFilter;
import org.apache.lucene.util.Version;

/**
 * A Lucene field analyzer used to analyzer queries against the CPE data.
 *
 * @author Jeremy Long <jeremy.long@owasp.org>
 */
public class SearchFieldAnalyzer extends Analyzer {

    /**
     * The Lucene Version used.
     */
    private final Version version;
    /**
     * A local reference to the TokenPairConcatenatingFilter so that we can clear any left over state if this analyzer
     * is re-used.
     */
    private TokenPairConcatenatingFilter concatenatingFilter;

    /**
     * Constructs a new SearchFieldAnalyzer.
     *
     * @param version the Lucene version
     */
    public SearchFieldAnalyzer(Version version) {
        this.version = version;
    }

    /**
     * Creates a the TokenStreamComponents used to analyze the stream.
     *
     * @param fieldName the field that this lucene analyzer will process
     * @param reader a reader containing the tokens
     * @return the token stream filter chain
     */
    @Override
    protected TokenStreamComponents createComponents(String fieldName, Reader reader) {
        final Tokenizer source = new AlphaNumericTokenizer(version, reader);

        TokenStream stream = source;

        stream = new WordDelimiterFilter(stream,
                WordDelimiterFilter.GENERATE_WORD_PARTS
                | WordDelimiterFilter.GENERATE_NUMBER_PARTS
                | WordDelimiterFilter.PRESERVE_ORIGINAL
                | WordDelimiterFilter.SPLIT_ON_CASE_CHANGE
                | WordDelimiterFilter.SPLIT_ON_NUMERICS
                | WordDelimiterFilter.STEM_ENGLISH_POSSESSIVE, null);

        stream = new LowerCaseFilter(version, stream);
        stream = new UrlTokenizingFilter(stream);
        concatenatingFilter = new TokenPairConcatenatingFilter(stream);
        stream = concatenatingFilter;
        stream = new StopFilter(version, stream, StopAnalyzer.ENGLISH_STOP_WORDS_SET);

        return new TokenStreamComponents(source, stream);
    }

    /**
     * <p>
     * Resets the analyzer and clears any internal state data that may have been left-over from previous uses of the
     * analyzer.</p>
     * <p>
     * <b>If this analyzer is re-used this method must be called between uses.</b></p>
     */
    public void clear() {
        if (concatenatingFilter != null) {
            concatenatingFilter.clear();
        }
    }
}
