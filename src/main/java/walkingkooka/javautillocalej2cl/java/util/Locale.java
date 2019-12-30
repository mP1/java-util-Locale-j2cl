/*
 * Copyright 2019 Miroslav Pokorny (github.com/mP1)
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
 */

package walkingkooka.javautillocalej2cl.java.util;


import walkingkooka.javautillocalej2cl.WalkingkookaLanguageTag;
import walkingkooka.javautillocalej2cl.WalkingkookaLocale;
import walkingkooka.text.CharSequences;
import walkingkooka.text.CharacterConstant;

import java.util.Objects;

/**
 * With some compiler package fixing, this will be the javascript JRE emulated java.util.Locale.
 */
public final class Locale {

    public final static Locale CANADA = defineConstant("en", "CA");
    public final static Locale CANADA_FRENCH = defineConstant("fr", "CA");
    public final static Locale CHINA = defineConstant("zh", "CN");
    public final static Locale CHINESE = defineConstant("zh");
    public final static Locale ENGLISH = defineConstant("en");
    public final static Locale FRANCE = defineConstant("fr", "FR");
    public final static Locale FRENCH = defineConstant("fr");
    public final static Locale GERMAN = defineConstant("de");
    public final static Locale GERMANY = defineConstant("de", "DE");
    public final static Locale ITALIAN = defineConstant("it");
    public final static Locale ITALY = defineConstant("it", "IT");
    public final static Locale JAPAN = defineConstant("ja", "JP");
    public final static Locale JAPANESE = defineConstant("ja");
    public final static Locale KOREA = defineConstant("ko", "KR");
    public final static Locale KOREAN = defineConstant("ko");
    public final static Locale PRC = defineConstant("zh", "CN");
    public final static Locale ROOT = defineConstant("");
    public final static Locale SIMPLIFIED_CHINESE = defineConstant("zh", "CN");
    public final static Locale TAIWAN = defineConstant("zh", "TW");
    public final static Locale TRADITIONAL_CHINESE = defineConstant("zh", "TW");
    public final static Locale UK = defineConstant("en", "GB");
    public final static Locale US = defineConstant("en", "US");

    public final static Locale UNDEFINED = defineConstant("und");

    public final static CharacterConstant SEPARATOR = CharacterConstant.with('-');

    private static Locale defineConstant(final String language) {
        return new Locale(language);
    }

    private static Locale defineConstant(final String language,
                                         final String country) {
        return new Locale(language, country);
    }

    public static Locale[] getAvailableLocales() {
        return WalkingkookaLocale.all()
                .stream()
                .map(Locale::new)
                .toArray(Locale[]::new);
    }

    /**
     * <a href="https://en.wikipedia.org/wiki/IETF_language_tag"></a>
     * <pre>
     * Syntax of language tags
     * Each language tag is composed of one or more "subtags" separated by hyphens (-). Each subtag is composed of basic Latin letters or digits only.
     *
     * With the exceptions of private-use language tags beginning with an x- prefix and grandfathered language tags (including those starting with an i- prefix and those previously registered in the old Language Tag Registry), subtags occur in the following order:
     *
     * A single primary language subtag based on a two-letter language code from ISO 639-1 (2002) or a three-letter code from ISO 639-2 (1998), ISO 639-3 (2007) or ISO 639-5 (2008), or registered through the BCP 47 process and composed of five to eight letters;
     * Up to three optional extended language subtags composed of three letters each, separated by hyphens; (There is currently no extended language subtag registered in the Language Subtag Registry without an equivalent and preferred primary language subtag. This component of language tags is preserved for backwards compatibility and to allow for future parts of ISO 639.)
     * An optional script subtag, based on a four-letter script code from ISO 15924 (usually written in Title Case);
     * An optional region subtag based on a two-letter country code from ISO 3166-1 alpha-2 (usually written in upper case), or a three-digit code from UN M.49 for geographical regions;
     * Optional variant subtags, separated by hyphens, each composed of five to eight letters, or of four characters starting with a digit; (Variant subtags are registered with IANA and not associated with any external standard.)
     * Optional extension subtags, separated by hyphens, each composed of a single character, with the exception of the letter x, and a hyphen followed by one or more subtags of two to eight characters each, separated by hyphens;
     * An optional private-use subtag, composed of the letter x and a hyphen followed by subtags of one to eight characters each, separated by hyphens.
     * Subtags are not case-sensitive, but the specification recommends using the same case as in the Language Subtag Registry, where region subtags are UPPERCASE, script subtags are Title Case, and all other subtags are lowercase. This capitalization follows the recommendations of the underlying ISO standards.
     *
     * Optional script and region subtags are preferred to be omitted when they add no distinguishing information to a language tag. For example, es is preferred over es-Latn, as Spanish is fully expected to be written in the Latin script; ja is preferred over ja-JP, as Japanese as used in Japan does not differ markedly from Japanese as used elsewhere.
     *
     * Not all linguistic regions can be represented with a valid region subtag: the subnational regional dialects of a primary language are registered as variant subtags. For example, the valencia variant subtag for the Valencian dialect of Catalan is registered in the Language Subtag Registry with the prefix ca. As this dialect is spoken almost exclusively in Spain, the region subtag ES can normally be omitted.
     *
     * IETF language tags have been used as locale identifiers in many applications. It may be necessary for these applications to establish their own strategy for defining, encoding and matching locales if the strategy described in RFC 4647 is not adequate.
     *
     * The use, interpretation and matching of IETF language tags is currently defined in RFC 5646 and RFC 4647. The Language Subtag Registry lists all currently valid public subtags. Private-use subtags are not included in the Registry as they are implementation-dependent and subject to private agreements between third parties using them. These private agreements are out of scope of BCP 47.
     * </pre>
     */
    public static Locale forLanguageTag(final String languageTag) {
        Objects.requireNonNull(languageTag, "languageTag");

        return languageTag.isEmpty() ?
                ROOT :
                new Locale(WalkingkookaLanguageTag.parse(languageTag));
    }

    /**
     * Retrieves the default or complains if one has not been set previously.
     */
    public static Locale getDefault() {
        if (null == defaultLocale) {
            throw new IllegalStateException("Default Locale not set");
        }
        return defaultLocale;
    }

    /**
     * Sets or replaces the default {@link Locale}. This must be called very early to avoid {@link #getDefault()} failing.
     */
    public static void setDefault(final Locale locale) {
        Objects.requireNonNull(locale, "locale");
        defaultLocale = locale;
    }

    private static Locale defaultLocale;

    public Locale(final String language) {
        this(language, "");
    }

    public Locale(final String language,
                  final String country) {
        this(language, country, "");
    }

    public Locale(final String language,
                  final String country,
                  final String variant) {
        this(WalkingkookaLanguageTag.with(null, language, country, variant));
    }

    private Locale(final WalkingkookaLocale locale) {
        this(locale.languageTag());
    }

    /**
     * This ctor is intended to be internal.
     */
    public Locale(final WalkingkookaLanguageTag tag) {
        super();
        this.tag = tag;
    }

    // java.util.Locale.................................................................................................

    /**
     * Returns the language which will always be in lower case.
     */
    public String getLanguage() {
        return this.tag.language();
    }

    /**
     * Returns the country which will always be in upper case.
     */
    public String getCountry() {
        return this.tag.country();
    }

    /**
     * Returns the script which will always be in title case.
     */
    public String getScript() {
        return this.tag.script();
    }

    public String getVariant() {
        return this.tag.variant();
    }

    public String toLanguageTag() {
        return this.tag.toLanguageTag();
    }

    private WalkingkookaLanguageTag tag;

    // Object...........................................................................................................

    @Override
    public int hashCode() {
        return this.tag.hashCode();
    }

    @Override
    public boolean equals(final Object other) {
        return this == other || other instanceof Locale && this.equals0((Locale) other);
    }

    private boolean equals0(final Locale other) {
        return this.tag.equals(other.tag);
    }

    /**
     * Attempts to mimic the toString behaviour of the JDK Locale to String.
     * Extensions are not supported.
     */
    @Override
    public String toString() {
        String toString = this.getLanguage(); // already lower case
        if ("und" .equals(toString)) {
            toString = "";
        } else {
            final String country = this.getCountry(); // already upper case
            if (false == CharSequences.isNullOrEmpty(country)) {
                toString = toString + "_" + country;
            }

            final String variant = this.getVariant();
            if (false == CharSequences.isNullOrEmpty(variant)) {
                toString = toString + "_" + variant;
            }
            final String script = this.getScript();
            if (false == CharSequences.isNullOrEmpty(script)) {
                toString = toString + "_#" + script;
            }
        }

        return toString;
    }
}