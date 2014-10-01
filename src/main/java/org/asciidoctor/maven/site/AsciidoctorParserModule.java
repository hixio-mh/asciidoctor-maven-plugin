/*
 * Licensed under the Apache License, Version 2.0 (the &quot;License&quot;);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.asciidoctor.maven.site;

import org.apache.maven.doxia.parser.module.AbstractParserModule;
import org.apache.maven.doxia.parser.module.ParserModule;
import org.codehaus.plexus.component.annotations.Component;

/**
 * This class is the entry point for the site plugin integration for Doxia 1.6+.
 *
 * @author jdlee
 */
@Component(role = ParserModule.class, hint = AsciidoctorParser.ROLE_HINT)
public class AsciidoctorParserModule extends AbstractParserModule {

    /**
     * The source directory for AsciiDoc files.
     */
    public static final String SOURCE_DIRECTORY = AsciidoctorParser.ROLE_HINT;

    /**
     * The extension for AsciiDoc files.
     */
    public static final String FILE_EXTENSION = "adoc";

    /**
     * Build a new instance of {@link AsciidoctorParserModule}.
     */
    public AsciidoctorParserModule() {
        super(SOURCE_DIRECTORY, FILE_EXTENSION, AsciidoctorParser.ROLE_HINT);
    }
}
