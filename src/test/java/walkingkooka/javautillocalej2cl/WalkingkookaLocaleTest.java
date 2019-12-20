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

import java.text.DateFormatSymbols;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class WalkingkookaLocaleTest implements ClassTesting<WalkingkookaLocale> {


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

        assertArrayEquals(jreSymbols.getAmPmStrings(), symbols.ampm(), () -> "ampm " + jreSymbols);
        assertArrayEquals(jreSymbols.getEras(), symbols.eras(), () -> "era " + jreSymbols);
        assertArrayEquals(jreSymbols.getMonths(), symbols.months(), () -> "months " + jreSymbols);
        assertArrayEquals(jreSymbols.getShortMonths(), symbols.shortMonths(), () -> "shortMonths " + jreSymbols);
        assertArrayEquals(jreSymbols.getShortWeekdays(), symbols.shortWeekdays(), () -> "shortWeekdays " + jreSymbols);
        assertArrayEquals(jreSymbols.getWeekdays(), symbols.weekdays(), () -> "weekdays " + jreSymbols);
    }

    private void checkDecimalFormatSymbols(final WalkingkookaDecimalFormatSymbols symbols,
                                           final Locale locale) {
        final DecimalFormatSymbols jreSymbols = DecimalFormatSymbols.getInstance(locale);

        assertEquals(jreSymbols.getCurrency().toString(), symbols.currency(), () -> "ampm " + jreSymbols);
        assertEquals(jreSymbols.getCurrencySymbol(), symbols.currencySymbol(), () -> "currencySymbol " + jreSymbols);
        assertEquals(jreSymbols.getDecimalSeparator(), symbols.decimalSeparator(), () -> "decimalSeparator " + jreSymbols);
        assertEquals(jreSymbols.getDigit(), symbols.digit(), () -> "digit " + jreSymbols);
        assertEquals(jreSymbols.getExponentSeparator(), symbols.exponentSeparator(), () -> "exponentSeparator " + jreSymbols);
        assertEquals(jreSymbols.getGroupingSeparator(), symbols.groupingSeparator(), () -> "groupingSeparator " + jreSymbols);
        assertEquals(jreSymbols.getInfinity(), symbols.infinity(), () -> "infinity " + jreSymbols);
        assertEquals(jreSymbols.getInternationalCurrencySymbol(), symbols.internationalCurrencySymbol(), () -> "internationalCurrencySymbol " + jreSymbols);
        assertEquals(jreSymbols.getMinusSign(), symbols.minusSign(), () -> "minusSign " + jreSymbols);
        assertEquals(jreSymbols.getMonetaryDecimalSeparator(), symbols.monetaryDecimalSeparator(), () -> "monetaryDecimalSeparator " + jreSymbols);
        assertEquals(jreSymbols.getNaN(), symbols.nan(), () -> "nan " + jreSymbols);
        assertEquals(jreSymbols.getPatternSeparator(), symbols.patternSeparator(), () -> "patternSeparator " + jreSymbols);
        assertEquals(jreSymbols.getPercent(), symbols.percent(), () -> "percent " + jreSymbols);
        assertEquals(jreSymbols.getPerMill(), symbols.perMill(), () -> "perMill " + jreSymbols);
        assertEquals(jreSymbols.getZeroDigit(), symbols.zeroDigit(), () -> "zeroDigit " + jreSymbols);
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
