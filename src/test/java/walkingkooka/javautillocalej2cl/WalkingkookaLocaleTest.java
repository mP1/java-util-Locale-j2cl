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

package walkingkooka.javautillocalej2cl;

import org.junit.jupiter.api.Test;
import walkingkooka.reflect.ClassTesting;
import walkingkooka.reflect.JavaVisibility;
import walkingkooka.text.CharSequences;

import java.text.DateFormatSymbols;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class WalkingkookaLocaleTest implements ClassTesting<WalkingkookaLocale> {

    @Test
    public void testForLanguageTagUnknown() {
        this.forLanguageTagAndCheck("abcdef", null);
    }

    @Test
    public void testForLanguageTag() {
        final String tag = "EN";
        final WalkingkookaLocale en = WalkingkookaLocale.all()
                .stream()
                .filter(l -> l.languageTag().toLanguageTag().equals("en"))
                .findFirst().
                        orElseThrow(() -> new AssertionError("Failed to find Locale with tag " + CharSequences.quote(tag)));
        this.forLanguageTagAndCheck(tag, en);
    }

    private void forLanguageTagAndCheck(final String tag, final WalkingkookaLocale expected) {
        assertEquals(Optional.ofNullable(expected),
        WalkingkookaLocale.forLanguageTag(WalkingkookaLanguageTag.parse(tag)),
                () -> "forLanguageTag " + CharSequences.quote(tag));
    }

    @Test
    public void testEn() {
        this.checkLocale(Locale.ENGLISH);
    }

    @Test
    public void testNo_No_Ny() {
        this.checkLocale(Locale.forLanguageTag("no_NO_NY"));
    }

    @Test
    public void testAllLocales() {
        for (final Locale locale : Locale.getAvailableLocales()) {
            final String languageTag = locale.toLanguageTag();
            if(WalkingkookaLocale.isUnsupported(languageTag)) {
                continue;
            }

            switch(languageTag) {
                case "no-NO-NY":
                case "nn-NO":
                case "und":
                    break;
                default:
                    this.checkLocale(locale);
            }
        }
    }

    private void checkLocale(final Locale locale) {
        final WalkingkookaLanguageTag tag = WalkingkookaLanguageTag.parse(locale.toLanguageTag());
        this.checkLocale(WalkingkookaLocale.all()
        .stream()
        .filter(l -> l.languageTag().toLanguageTag().equalsIgnoreCase(tag.toLanguageTag()))
        .findFirst()
        .orElseThrow(() -> new AssertionError("Unable to find locale " + locale.toLanguageTag())),
         locale);
    }

    private void checkLocale(final WalkingkookaLocale locale,
                             final Locale jreLocale) {
        this.checkLanguageTag(locale.languageTag(), jreLocale);
        this.checkDateFormatSymbols(locale.dateFormatSymbols(), jreLocale);
        this.checkDecimalFormatSymbols(locale.decimalFormatSymbols(), jreLocale);
    }

    private void checkLanguageTag(final WalkingkookaLanguageTag tag,
                                  final Locale locale) {
        assertEquals(locale.getLanguage(), tag.language(), () -> "language " + locale.toLanguageTag() + " " + locale);
        assertEquals(locale.getCountry(), tag.country(), () -> "country " + locale.toLanguageTag() + " " + locale);
        assertEquals(locale.getVariant(), tag.variant(), () -> "variant " +locale.toLanguageTag() + " " + locale);
        assertEquals(locale.getScript(), tag.script(), () -> "script " +locale.toLanguageTag() + " " + locale);
    }

    private void checkDateFormatSymbols(final WalkingkookaDateFormatSymbols symbols,
                                        final Locale locale) {
        final DateFormatSymbols jreSymbols = DateFormatSymbols.getInstance(locale);

        assertArrayEquals(jreSymbols.getAmPmStrings(), symbols.ampm(), () -> "ampm " + jreSymbols + " locale: " + locale);
        assertArrayEquals(jreSymbols.getEras(), symbols.eras(), () -> "era " + jreSymbols + " locale: " + locale);
        assertArrayEquals(jreSymbols.getMonths(), symbols.months(), () -> "months " + jreSymbols + " locale: " + locale);
        assertArrayEquals(jreSymbols.getShortMonths(), symbols.shortMonths(), () -> "shortMonths " + jreSymbols + " locale: " + locale);
        assertArrayEquals(jreSymbols.getShortWeekdays(), symbols.shortWeekdays(), () -> "shortWeekdays " + jreSymbols + " locale: " + locale);
        assertArrayEquals(jreSymbols.getWeekdays(), symbols.weekdays(), () -> "weekdays " + jreSymbols + " locale: " + locale);
    }

    private void checkDecimalFormatSymbols(final WalkingkookaDecimalFormatSymbols symbols,
                                           final Locale locale) {
        final DecimalFormatSymbols jreSymbols = DecimalFormatSymbols.getInstance(locale);

        assertEquals(jreSymbols.getCurrency().toString(), symbols.currency(), () -> "ampm " + jreSymbols + " locale: " + locale);
        assertEquals(jreSymbols.getCurrencySymbol(), symbols.currencySymbol(), () -> "currencySymbol " + jreSymbols + " locale: " + locale);
        assertEquals(jreSymbols.getDecimalSeparator(), symbols.decimalSeparator(), () -> "decimalSeparator " + jreSymbols + " locale: " + locale);
        assertEquals(jreSymbols.getDigit(), symbols.digit(), () -> "digit " + jreSymbols + " locale: " + locale);
        assertEquals(jreSymbols.getExponentSeparator(), symbols.exponentSeparator(), () -> "exponentSeparator " + jreSymbols + " locale: " + locale);
        assertEquals(jreSymbols.getGroupingSeparator(), symbols.groupingSeparator(), () -> "groupingSeparator " + jreSymbols + " locale: " + locale);
        assertEquals(jreSymbols.getInfinity(), symbols.infinity(), () -> "infinity " + jreSymbols + " locale: " + locale);
        assertEquals(jreSymbols.getInternationalCurrencySymbol(), symbols.internationalCurrencySymbol(), () -> "internationalCurrencySymbol " + jreSymbols + " locale: " + locale);
        assertEquals((int)jreSymbols.getMinusSign(), (int)symbols.minusSign(), () -> "minusSign " + jreSymbols + " locale: " + locale);
        assertEquals(jreSymbols.getMonetaryDecimalSeparator(), symbols.monetaryDecimalSeparator(), () -> "monetaryDecimalSeparator " + jreSymbols + " locale: " + locale);
        assertEquals(jreSymbols.getNaN(), symbols.nan(), () -> "nan " + jreSymbols + " locale: " + locale);
        assertEquals(jreSymbols.getPatternSeparator(), symbols.patternSeparator(), () -> "patternSeparator " + jreSymbols + " locale: " + locale);
        assertEquals(jreSymbols.getPercent(), symbols.percent(), () -> "percent " + jreSymbols + " locale: " + locale);
        assertEquals(jreSymbols.getPerMill(), symbols.perMill(), () -> "perMill " + jreSymbols + " locale: " + locale);
        assertEquals(jreSymbols.getZeroDigit(), symbols.zeroDigit(), () -> "zeroDigit " + jreSymbols + " locale: " + locale);
    }

    // ClassTesting.....................................................................................................

    @Override
    public Class<WalkingkookaLocale> type() {
        return WalkingkookaLocale.class;
    }

    @Override
    public JavaVisibility typeVisibility() {
        return JavaVisibility.PUBLIC;
    }
}
