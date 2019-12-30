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

import walkingkooka.ToStringBuilder;
import walkingkooka.collect.list.Lists;

import java.util.Optional;

public final class WalkingkookaLocale {

    /**
     * Complex locales that are ignored.
     */
    public static boolean isUnsupported(final String languageTag) {
        boolean ignored;

        switch (languageTag) {
            case "ja-JP-u-ca-japanese-x-lvariant-JP":
            case "th-TH-u-nu-thai-x-lvariant-TH":
                ignored = true;
                break;
            default:
                ignored = false;
                break;
        }

        return ignored;
    }

    /**
     * Makes the language lower case and substitutes new language codes with old to match JRE behaviour.
     */
    public static String languageFix(final String language) {
        final String lower = language.toLowerCase();

        final String fixed;

        switch (lower) {
            case "he":
                fixed = "iw";
                break;
            case "yi":
                fixed = "ji";
                break;
            case "id":
                fixed = "in";
                break;
            case "und":
                fixed = "";
                break;
            default:
                fixed = lower.toLowerCase();
                break;
        }
        return fixed;
    }

    /**
     * The inverse of {@link #languageFix(String).}
     */
    public static String languageTagFix(final String language) {
        final String lower = language.toLowerCase();

        final String fixed;

        switch (lower) {
            case "iw":
                fixed = "he";
                break;
            case "ji":
                fixed = "yi";
                break;
            case "in":
                fixed = "id";
                break;
            case "":
                fixed = "und";
                break;
            default:
                fixed = lower.toLowerCase();
                break;
        }

        return fixed;
    }

    /**
     * Finds the matching {@link WalkingkookaLocale} for the given {@link WalkingkookaLanguageTag}.
     */
    public static Optional<WalkingkookaLocale> forLanguageTag(final WalkingkookaLanguageTag tag) {
        return all()
            .stream()
            .filter(l -> l.test(tag))
            .findFirst();
    }

    /**
     * Returns all {@link WalkingkookaLocale locales} known to the system.
     */
    public static java.util.List<WalkingkookaLocale> all() {
        return ALL;
    }

    private static java.util.List<WalkingkookaLocale> ALL = Lists.of(
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "af",
                            "af",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_af(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "af-NA",
                            "af",
                            "NA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_af(),
                    walkingkookaDecimalFormatSymbols_af_NA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "af-ZA",
                            "af",
                            "ZA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_af(),
                    walkingkookaDecimalFormatSymbols_af_ZA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "agq",
                            "agq",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_agq(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "agq-CM",
                            "agq",
                            "CM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_agq(),
                    walkingkookaDecimalFormatSymbols_agq_CM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ak",
                            "ak",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ak(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ak-GH",
                            "ak",
                            "GH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ak(),
                    walkingkookaDecimalFormatSymbols_ak_GH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "am",
                            "am",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_am(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "am-ET",
                            "am",
                            "ET",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_am(),
                    walkingkookaDecimalFormatSymbols_am_ET()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar",
                            "ar",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar(),
                    walkingkookaDecimalFormatSymbols_ar()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-001",
                            "ar",
                            "001",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar(),
                    walkingkookaDecimalFormatSymbols_ar()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-AE",
                            "ar",
                            "AE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar(),
                    walkingkookaDecimalFormatSymbols_ar_AE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-BH",
                            "ar",
                            "BH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar(),
                    walkingkookaDecimalFormatSymbols_ar_BH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-DJ",
                            "ar",
                            "DJ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar(),
                    walkingkookaDecimalFormatSymbols_ar_DJ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-DZ",
                            "ar",
                            "DZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar_DZ(),
                    walkingkookaDecimalFormatSymbols_ar_DZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-EG",
                            "ar",
                            "EG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar(),
                    walkingkookaDecimalFormatSymbols_ar_EG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-EH",
                            "ar",
                            "EH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar(),
                    walkingkookaDecimalFormatSymbols_ar_EH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-ER",
                            "ar",
                            "ER",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar(),
                    walkingkookaDecimalFormatSymbols_ar_ER()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-IL",
                            "ar",
                            "IL",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar(),
                    walkingkookaDecimalFormatSymbols_ar_IL()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-IQ",
                            "ar",
                            "IQ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar_IQ(),
                    walkingkookaDecimalFormatSymbols_ar_IQ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-JO",
                            "ar",
                            "JO",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar_JO(),
                    walkingkookaDecimalFormatSymbols_ar_JO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-KM",
                            "ar",
                            "KM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar(),
                    walkingkookaDecimalFormatSymbols_ar_KM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-KW",
                            "ar",
                            "KW",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar(),
                    walkingkookaDecimalFormatSymbols_ar_KW()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-LB",
                            "ar",
                            "LB",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar_JO(),
                    walkingkookaDecimalFormatSymbols_ar_LB()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-LY",
                            "ar",
                            "LY",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar(),
                    walkingkookaDecimalFormatSymbols_ar_LY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-MA",
                            "ar",
                            "MA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar_MA(),
                    walkingkookaDecimalFormatSymbols_ar_MA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-MR",
                            "ar",
                            "MR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar_MR(),
                    walkingkookaDecimalFormatSymbols_ar_MR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-OM",
                            "ar",
                            "OM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar(),
                    walkingkookaDecimalFormatSymbols_ar_OM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-PS",
                            "ar",
                            "PS",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar_JO(),
                    walkingkookaDecimalFormatSymbols_ar_IL()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-QA",
                            "ar",
                            "QA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar(),
                    walkingkookaDecimalFormatSymbols_ar_QA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-SA",
                            "ar",
                            "SA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar(),
                    walkingkookaDecimalFormatSymbols_ar_SA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-SD",
                            "ar",
                            "SD",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar(),
                    walkingkookaDecimalFormatSymbols_ar_SD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-SO",
                            "ar",
                            "SO",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar(),
                    walkingkookaDecimalFormatSymbols_ar_SO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-SS",
                            "ar",
                            "SS",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar(),
                    walkingkookaDecimalFormatSymbols_ar_SS()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-SY",
                            "ar",
                            "SY",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar_JO(),
                    walkingkookaDecimalFormatSymbols_ar_SY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-TD",
                            "ar",
                            "TD",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar(),
                    walkingkookaDecimalFormatSymbols_ar_TD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-TN",
                            "ar",
                            "TN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar_DZ(),
                    walkingkookaDecimalFormatSymbols_ar_TN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ar-YE",
                            "ar",
                            "YE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ar(),
                    walkingkookaDecimalFormatSymbols_ar_YE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "as",
                            "as",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_as(),
                    walkingkookaDecimalFormatSymbols_as()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "as-IN",
                            "as",
                            "IN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_as(),
                    walkingkookaDecimalFormatSymbols_as_IN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "asa",
                            "asa",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_asa(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "asa-TZ",
                            "asa",
                            "TZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_asa(),
                    walkingkookaDecimalFormatSymbols_asa_TZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ast",
                            "ast",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ast(),
                    walkingkookaDecimalFormatSymbols_ast()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ast-ES",
                            "ast",
                            "ES",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ast(),
                    walkingkookaDecimalFormatSymbols_ast_ES()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "az",
                            "az",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_az(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "az-AZ",
                            "az",
                            "AZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_az(),
                    walkingkookaDecimalFormatSymbols_az_AZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "az-Cyrl",
                            "az",
                            "",
                            "",
                            "Cyrl"),
                    walkingkookaDateFormatSymbols_az__Cyrl(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "az-Cyrl-AZ",
                            "az",
                            "AZ",
                            "",
                            "Cyrl"),
                    walkingkookaDateFormatSymbols_az__Cyrl(),
                    walkingkookaDecimalFormatSymbols_az_AZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "az-Latn",
                            "az",
                            "",
                            "",
                            "Latn"),
                    walkingkookaDateFormatSymbols_az(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "az-Latn-AZ",
                            "az",
                            "AZ",
                            "",
                            "Latn"),
                    walkingkookaDateFormatSymbols_az(),
                    walkingkookaDecimalFormatSymbols_az_AZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bas",
                            "bas",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_bas(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bas-CM",
                            "bas",
                            "CM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_bas(),
                    walkingkookaDecimalFormatSymbols_agq_CM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "be",
                            "be",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_be(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "be-BY",
                            "be",
                            "BY",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_be(),
                    walkingkookaDecimalFormatSymbols_be_BY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bem",
                            "bem",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_bem(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bem-ZM",
                            "bem",
                            "ZM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_bem(),
                    walkingkookaDecimalFormatSymbols_bem_ZM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bez",
                            "bez",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_bez(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bez-TZ",
                            "bez",
                            "TZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_bez(),
                    walkingkookaDecimalFormatSymbols_asa_TZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bg",
                            "bg",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_bg(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bg-BG",
                            "bg",
                            "BG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_bg(),
                    walkingkookaDecimalFormatSymbols_bg_BG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bm",
                            "bm",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_bm(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bm-ML",
                            "bm",
                            "ML",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_bm(),
                    walkingkookaDecimalFormatSymbols_bm_ML()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bn",
                            "bn",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_bn(),
                    walkingkookaDecimalFormatSymbols_bn()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bn-BD",
                            "bn",
                            "BD",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_bn(),
                    walkingkookaDecimalFormatSymbols_bn_BD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bn-IN",
                            "bn",
                            "IN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_bn(),
                    walkingkookaDecimalFormatSymbols_bn_IN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bo",
                            "bo",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_bo(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bo-CN",
                            "bo",
                            "CN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_bo(),
                    walkingkookaDecimalFormatSymbols_bo_CN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bo-IN",
                            "bo",
                            "IN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_bo(),
                    walkingkookaDecimalFormatSymbols_bo_IN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "br",
                            "br",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_br(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "br-FR",
                            "br",
                            "FR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_br(),
                    walkingkookaDecimalFormatSymbols_br_FR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "brx",
                            "brx",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_brx(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "brx-IN",
                            "brx",
                            "IN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_brx(),
                    walkingkookaDecimalFormatSymbols_bo_IN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bs",
                            "bs",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_bs(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bs-BA",
                            "bs",
                            "BA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_bs(),
                    walkingkookaDecimalFormatSymbols_bs_BA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bs-Cyrl",
                            "bs",
                            "",
                            "",
                            "Cyrl"),
                    walkingkookaDateFormatSymbols_bs__Cyrl(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bs-Cyrl-BA",
                            "bs",
                            "BA",
                            "",
                            "Cyrl"),
                    walkingkookaDateFormatSymbols_bs__Cyrl(),
                    walkingkookaDecimalFormatSymbols_bs_BA_Cyrl()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bs-Latn",
                            "bs",
                            "",
                            "",
                            "Latn"),
                    walkingkookaDateFormatSymbols_bs(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "bs-Latn-BA",
                            "bs",
                            "BA",
                            "",
                            "Latn"),
                    walkingkookaDateFormatSymbols_bs(),
                    walkingkookaDecimalFormatSymbols_bs_BA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ca",
                            "ca",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ca(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ca-AD",
                            "ca",
                            "AD",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ca(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ca-ES",
                            "ca",
                            "ES",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ca(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ca-ES-VALENCIA",
                            "ca",
                            "ES",
                            "VALENCIA",
                            ""),
                    walkingkookaDateFormatSymbols_ca(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ca-FR",
                            "ca",
                            "FR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ca(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ca-IT",
                            "ca",
                            "IT",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ca(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ce",
                            "ce",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ce(),
                    walkingkookaDecimalFormatSymbols_ce()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ce-RU",
                            "ce",
                            "RU",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ce(),
                    walkingkookaDecimalFormatSymbols_ce_RU()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "cgg",
                            "cgg",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_cgg(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "cgg-UG",
                            "cgg",
                            "UG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_cgg(),
                    walkingkookaDecimalFormatSymbols_cgg_UG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "chr",
                            "chr",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_chr(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "chr-US",
                            "chr",
                            "US",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_chr(),
                    walkingkookaDecimalFormatSymbols_chr_US()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ckb",
                            "ckb",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ckb(),
                    walkingkookaDecimalFormatSymbols_ckb()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ckb-IQ",
                            "ckb",
                            "IQ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ckb(),
                    walkingkookaDecimalFormatSymbols_ckb_IQ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ckb-IR",
                            "ckb",
                            "IR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ckb(),
                    walkingkookaDecimalFormatSymbols_ckb_IR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "cs",
                            "cs",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_cs(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "cs-CZ",
                            "cs",
                            "CZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_cs(),
                    walkingkookaDecimalFormatSymbols_cs_CZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "cu",
                            "cu",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ckb(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "cu-RU",
                            "cu",
                            "RU",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ckb(),
                    walkingkookaDecimalFormatSymbols_cu_RU()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "cy",
                            "cy",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_cy(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "cy-GB",
                            "cy",
                            "GB",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_cy(),
                    walkingkookaDecimalFormatSymbols_cy_GB()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "da",
                            "da",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_da(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "da-DK",
                            "da",
                            "DK",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_da(),
                    walkingkookaDecimalFormatSymbols_da_DK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "da-GL",
                            "da",
                            "GL",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_da(),
                    walkingkookaDecimalFormatSymbols_da_DK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "dav",
                            "dav",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_dav(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "dav-KE",
                            "dav",
                            "KE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_dav(),
                    walkingkookaDecimalFormatSymbols_dav_KE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "de",
                            "de",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_de(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "de-AT",
                            "de",
                            "AT",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_de_AT(),
                    walkingkookaDecimalFormatSymbols_br_FR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "de-BE",
                            "de",
                            "BE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_de(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "de-CH",
                            "de",
                            "CH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_de(),
                    walkingkookaDecimalFormatSymbols_de_CH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "de-DE",
                            "de",
                            "DE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_de(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "de-LI",
                            "de",
                            "LI",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_de(),
                    walkingkookaDecimalFormatSymbols_de_CH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "de-LU",
                            "de",
                            "LU",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_de(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "dje",
                            "dje",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_dje(),
                    walkingkookaDecimalFormatSymbols_dje()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "dje-NE",
                            "dje",
                            "NE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_dje(),
                    walkingkookaDecimalFormatSymbols_dje_NE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "dsb",
                            "dsb",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_dsb(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "dsb-DE",
                            "dsb",
                            "DE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_dsb(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "dua",
                            "dua",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_dua(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "dua-CM",
                            "dua",
                            "CM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_dua(),
                    walkingkookaDecimalFormatSymbols_agq_CM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "dyo",
                            "dyo",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_dyo(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "dyo-SN",
                            "dyo",
                            "SN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_dyo(),
                    walkingkookaDecimalFormatSymbols_dyo_SN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "dz",
                            "dz",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_dz(),
                    walkingkookaDecimalFormatSymbols_dz()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "dz-BT",
                            "dz",
                            "BT",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_dz(),
                    walkingkookaDecimalFormatSymbols_dz_BT()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ebu",
                            "ebu",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ebu(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ebu-KE",
                            "ebu",
                            "KE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ebu(),
                    walkingkookaDecimalFormatSymbols_dav_KE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ee",
                            "ee",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ee(),
                    walkingkookaDecimalFormatSymbols_ee()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ee-GH",
                            "ee",
                            "GH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ee(),
                    walkingkookaDecimalFormatSymbols_ee_GH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ee-TG",
                            "ee",
                            "TG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ee(),
                    walkingkookaDecimalFormatSymbols_ee_TG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "el",
                            "el",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_el(),
                    walkingkookaDecimalFormatSymbols_el()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "el-CY",
                            "el",
                            "CY",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_el(),
                    walkingkookaDecimalFormatSymbols_el_CY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "el-GR",
                            "el",
                            "GR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_el(),
                    walkingkookaDecimalFormatSymbols_el_CY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en",
                            "en",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-001",
                            "en",
                            "001",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-150",
                            "en",
                            "150",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-AG",
                            "en",
                            "AG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_AG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-AI",
                            "en",
                            "AI",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_AG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-AS",
                            "en",
                            "AS",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_chr_US()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-AT",
                            "en",
                            "AT",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-AU",
                            "en",
                            "AU",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en_AU(),
                    walkingkookaDecimalFormatSymbols_en_AU()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-BB",
                            "en",
                            "BB",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_BB()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-BE",
                            "en",
                            "BE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-BI",
                            "en",
                            "BI",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_BI()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-BM",
                            "en",
                            "BM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_BM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-BS",
                            "en",
                            "BS",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_BS()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-BW",
                            "en",
                            "BW",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_BW()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-BZ",
                            "en",
                            "BZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_BZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-CA",
                            "en",
                            "CA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_CA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-CC",
                            "en",
                            "CC",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_CC()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-CH",
                            "en",
                            "CH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_CH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-CK",
                            "en",
                            "CK",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_CK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-CM",
                            "en",
                            "CM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_CM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-CX",
                            "en",
                            "CX",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_CC()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-CY",
                            "en",
                            "CY",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_CY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-DE",
                            "en",
                            "DE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-DG",
                            "en",
                            "DG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-DK",
                            "en",
                            "DK",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_da_DK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-DM",
                            "en",
                            "DM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_AG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-ER",
                            "en",
                            "ER",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_ER()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-FI",
                            "en",
                            "FI",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_br_FR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-FJ",
                            "en",
                            "FJ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_FJ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-FK",
                            "en",
                            "FK",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_FK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-FM",
                            "en",
                            "FM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_FM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-GB",
                            "en",
                            "GB",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en_GB(),
                    walkingkookaDecimalFormatSymbols_cy_GB()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-GD",
                            "en",
                            "GD",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_AG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-GG",
                            "en",
                            "GG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_cy_GB()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-GH",
                            "en",
                            "GH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_ak_GH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-GI",
                            "en",
                            "GI",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_GI()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-GM",
                            "en",
                            "GM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_GM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-GU",
                            "en",
                            "GU",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_chr_US()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-GY",
                            "en",
                            "GY",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_GY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-HK",
                            "en",
                            "HK",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_HK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-IE",
                            "en",
                            "IE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en_IE(),
                    walkingkookaDecimalFormatSymbols_en_CY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-IL",
                            "en",
                            "IL",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_IL()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-IM",
                            "en",
                            "IM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_cy_GB()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-IN",
                            "en",
                            "IN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_IN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-IO",
                            "en",
                            "IO",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_FM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-JE",
                            "en",
                            "JE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_cy_GB()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-JM",
                            "en",
                            "JM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_JM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-KE",
                            "en",
                            "KE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_dav_KE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-KI",
                            "en",
                            "KI",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_CC()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-KN",
                            "en",
                            "KN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_AG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-KY",
                            "en",
                            "KY",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_KY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-LC",
                            "en",
                            "LC",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_AG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-LR",
                            "en",
                            "LR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_LR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-LS",
                            "en",
                            "LS",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_LS()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-MG",
                            "en",
                            "MG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_MG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-MH",
                            "en",
                            "MH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_chr_US()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-MO",
                            "en",
                            "MO",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_MO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-MP",
                            "en",
                            "MP",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_chr_US()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-MS",
                            "en",
                            "MS",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_AG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-MT",
                            "en",
                            "MT",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_CY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-MU",
                            "en",
                            "MU",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_MU()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-MW",
                            "en",
                            "MW",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_MW()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-MY",
                            "en",
                            "MY",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_MY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-NA",
                            "en",
                            "NA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_NA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-NF",
                            "en",
                            "NF",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_CC()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-NG",
                            "en",
                            "NG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_NG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-NL",
                            "en",
                            "NL",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-NR",
                            "en",
                            "NR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_CC()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-NU",
                            "en",
                            "NU",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_CK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-NZ",
                            "en",
                            "NZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_CK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-PG",
                            "en",
                            "PG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_PG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-PH",
                            "en",
                            "PH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_PH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-PK",
                            "en",
                            "PK",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_PK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-PN",
                            "en",
                            "PN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_CK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-PR",
                            "en",
                            "PR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_chr_US()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-PW",
                            "en",
                            "PW",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_FM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-RW",
                            "en",
                            "RW",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_RW()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-SB",
                            "en",
                            "SB",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_SB()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-SC",
                            "en",
                            "SC",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_SC()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-SD",
                            "en",
                            "SD",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_SD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-SE",
                            "en",
                            "SE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_SE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-SG",
                            "en",
                            "SG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_SG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-SH",
                            "en",
                            "SH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_SH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-SI",
                            "en",
                            "SI",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_el_CY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-SL",
                            "en",
                            "SL",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_SL()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-SS",
                            "en",
                            "SS",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_SS()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-SX",
                            "en",
                            "SX",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_SX()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-SZ",
                            "en",
                            "SZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_SZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-TC",
                            "en",
                            "TC",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_FM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-TK",
                            "en",
                            "TK",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_CK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-TO",
                            "en",
                            "TO",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_TO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-TT",
                            "en",
                            "TT",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_TT()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-TV",
                            "en",
                            "TV",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_CC()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-TZ",
                            "en",
                            "TZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_asa_TZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-UG",
                            "en",
                            "UG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_cgg_UG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-UM",
                            "en",
                            "UM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_chr_US()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-US",
                            "en",
                            "US",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_chr_US()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-US-POSIX",
                            "en",
                            "US",
                            "POSIX",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_US_POSIX()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-VC",
                            "en",
                            "VC",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_AG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-VG",
                            "en",
                            "VG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_FM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-VI",
                            "en",
                            "VI",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_chr_US()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-VU",
                            "en",
                            "VU",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_VU()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-WS",
                            "en",
                            "WS",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_WS()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-ZA",
                            "en",
                            "ZA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_af_ZA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-ZM",
                            "en",
                            "ZM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_bem_ZM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "en-ZW",
                            "en",
                            "ZW",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_en(),
                    walkingkookaDecimalFormatSymbols_en_ZW()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "eo",
                            "eo",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_eo(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "eo-001",
                            "eo",
                            "001",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_eo(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es",
                            "es",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-419",
                            "es",
                            "419",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_419(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-AR",
                            "es",
                            "AR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_419(),
                    walkingkookaDecimalFormatSymbols_es_AR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-BO",
                            "es",
                            "BO",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_419(),
                    walkingkookaDecimalFormatSymbols_es_BO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-BR",
                            "es",
                            "BR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_419(),
                    walkingkookaDecimalFormatSymbols_es_BR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-CL",
                            "es",
                            "CL",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_CL(),
                    walkingkookaDecimalFormatSymbols_es_CL()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-CO",
                            "es",
                            "CO",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_CL(),
                    walkingkookaDecimalFormatSymbols_es_CO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-CR",
                            "es",
                            "CR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_419(),
                    walkingkookaDecimalFormatSymbols_es_CR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-CU",
                            "es",
                            "CU",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_419(),
                    walkingkookaDecimalFormatSymbols_es_CU()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-DO",
                            "es",
                            "DO",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_419(),
                    walkingkookaDecimalFormatSymbols_es_DO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-EA",
                            "es",
                            "EA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-EC",
                            "es",
                            "EC",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_419(),
                    walkingkookaDecimalFormatSymbols_es_EC()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-ES",
                            "es",
                            "ES",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-GQ",
                            "es",
                            "GQ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es(),
                    walkingkookaDecimalFormatSymbols_es_GQ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-GT",
                            "es",
                            "GT",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_419(),
                    walkingkookaDecimalFormatSymbols_es_GT()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-HN",
                            "es",
                            "HN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_419(),
                    walkingkookaDecimalFormatSymbols_es_HN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-IC",
                            "es",
                            "IC",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-MX",
                            "es",
                            "MX",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_MX(),
                    walkingkookaDecimalFormatSymbols_es_MX()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-NI",
                            "es",
                            "NI",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_419(),
                    walkingkookaDecimalFormatSymbols_es_NI()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-PA",
                            "es",
                            "PA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_419(),
                    walkingkookaDecimalFormatSymbols_es_PA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-PE",
                            "es",
                            "PE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_PE(),
                    walkingkookaDecimalFormatSymbols_es_PE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-PH",
                            "es",
                            "PH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es(),
                    walkingkookaDecimalFormatSymbols_es_PH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-PR",
                            "es",
                            "PR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_419(),
                    walkingkookaDecimalFormatSymbols_chr_US()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-PY",
                            "es",
                            "PY",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_CL(),
                    walkingkookaDecimalFormatSymbols_es_PY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-SV",
                            "es",
                            "SV",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_419(),
                    walkingkookaDecimalFormatSymbols_es_SV()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-US",
                            "es",
                            "US",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_US(),
                    walkingkookaDecimalFormatSymbols_chr_US()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-UY",
                            "es",
                            "UY",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es_PE(),
                    walkingkookaDecimalFormatSymbols_es_UY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "es-VE",
                            "es",
                            "VE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_es(),
                    walkingkookaDecimalFormatSymbols_es_VE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "et",
                            "et",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_et(),
                    walkingkookaDecimalFormatSymbols_et()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "et-EE",
                            "et",
                            "EE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_et(),
                    walkingkookaDecimalFormatSymbols_et_EE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "eu",
                            "eu",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_eu(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "eu-ES",
                            "eu",
                            "ES",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_eu(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ewo",
                            "ewo",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ewo(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ewo-CM",
                            "ewo",
                            "CM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ewo(),
                    walkingkookaDecimalFormatSymbols_agq_CM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fa",
                            "fa",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fa(),
                    walkingkookaDecimalFormatSymbols_fa()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fa-AF",
                            "fa",
                            "AF",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fa_AF(),
                    walkingkookaDecimalFormatSymbols_fa_AF()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fa-IR",
                            "fa",
                            "IR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fa(),
                    walkingkookaDecimalFormatSymbols_fa_IR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ff",
                            "ff",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ff(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ff-CM",
                            "ff",
                            "CM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ff(),
                    walkingkookaDecimalFormatSymbols_agq_CM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ff-GN",
                            "ff",
                            "GN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ff(),
                    walkingkookaDecimalFormatSymbols_ff_GN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ff-MR",
                            "ff",
                            "MR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ff(),
                    walkingkookaDecimalFormatSymbols_ff_MR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ff-SN",
                            "ff",
                            "SN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ff(),
                    walkingkookaDecimalFormatSymbols_dyo_SN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fi",
                            "fi",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fi(),
                    walkingkookaDecimalFormatSymbols_fi()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fi-FI",
                            "fi",
                            "FI",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fi(),
                    walkingkookaDecimalFormatSymbols_fi_FI()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fil",
                            "fil",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fil(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fil-PH",
                            "fil",
                            "PH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fil(),
                    walkingkookaDecimalFormatSymbols_en_PH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fo",
                            "fo",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fo(),
                    walkingkookaDecimalFormatSymbols_fo()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fo-DK",
                            "fo",
                            "DK",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fo(),
                    walkingkookaDecimalFormatSymbols_fo_DK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fo-FO",
                            "fo",
                            "FO",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fo(),
                    walkingkookaDecimalFormatSymbols_fo_FO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr",
                            "fr",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-BE",
                            "fr",
                            "BE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-BF",
                            "fr",
                            "BF",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_dyo_SN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-BI",
                            "fr",
                            "BI",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_fr_BI()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-BJ",
                            "fr",
                            "BJ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_dyo_SN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-BL",
                            "fr",
                            "BL",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_br_FR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-CA",
                            "fr",
                            "CA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_fr_CA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-CD",
                            "fr",
                            "CD",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_fr_CD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-CF",
                            "fr",
                            "CF",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_agq_CM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-CG",
                            "fr",
                            "CG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_agq_CM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-CH",
                            "fr",
                            "CH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_fr_CH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-CI",
                            "fr",
                            "CI",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_dyo_SN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-CM",
                            "fr",
                            "CM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_agq_CM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-DJ",
                            "fr",
                            "DJ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_fr_DJ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-DZ",
                            "fr",
                            "DZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_fr_DZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-FR",
                            "fr",
                            "FR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_br_FR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-GA",
                            "fr",
                            "GA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_agq_CM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-GF",
                            "fr",
                            "GF",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_br_FR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-GN",
                            "fr",
                            "GN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_ff_GN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-GP",
                            "fr",
                            "GP",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_br_FR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-GQ",
                            "fr",
                            "GQ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_agq_CM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-HT",
                            "fr",
                            "HT",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_fr_HT()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-KM",
                            "fr",
                            "KM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_fr_KM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-LU",
                            "fr",
                            "LU",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-MA",
                            "fr",
                            "MA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr_MA(),
                    walkingkookaDecimalFormatSymbols_fr_MA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-MC",
                            "fr",
                            "MC",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_br_FR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-MF",
                            "fr",
                            "MF",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_br_FR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-MG",
                            "fr",
                            "MG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_fr_MG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-ML",
                            "fr",
                            "ML",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_dyo_SN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-MQ",
                            "fr",
                            "MQ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_br_FR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-MR",
                            "fr",
                            "MR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_ff_MR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-MU",
                            "fr",
                            "MU",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_fr_MU()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-NC",
                            "fr",
                            "NC",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_fr_NC()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-NE",
                            "fr",
                            "NE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_dyo_SN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-PF",
                            "fr",
                            "PF",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_fr_NC()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-PM",
                            "fr",
                            "PM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_br_FR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-RE",
                            "fr",
                            "RE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_br_FR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-RW",
                            "fr",
                            "RW",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_fr_RW()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-SC",
                            "fr",
                            "SC",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_fr_SC()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-SN",
                            "fr",
                            "SN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_dyo_SN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-SY",
                            "fr",
                            "SY",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_fr_SY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-TD",
                            "fr",
                            "TD",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_agq_CM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-TG",
                            "fr",
                            "TG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_dyo_SN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-TN",
                            "fr",
                            "TN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_fr_TN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-VU",
                            "fr",
                            "VU",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_fr_VU()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-WF",
                            "fr",
                            "WF",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_fr_NC()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fr-YT",
                            "fr",
                            "YT",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fr(),
                    walkingkookaDecimalFormatSymbols_br_FR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fur",
                            "fur",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fur(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fur-IT",
                            "fur",
                            "IT",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fur(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fy",
                            "fy",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fy(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "fy-NL",
                            "fy",
                            "NL",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_fy(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ga",
                            "ga",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ga(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ga-IE",
                            "ga",
                            "IE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ga(),
                    walkingkookaDecimalFormatSymbols_en_CY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "gd",
                            "gd",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_gd(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "gd-GB",
                            "gd",
                            "GB",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_gd(),
                    walkingkookaDecimalFormatSymbols_cy_GB()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "gl",
                            "gl",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_gl(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "gl-ES",
                            "gl",
                            "ES",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_gl(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "gsw",
                            "gsw",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_gsw(),
                    walkingkookaDecimalFormatSymbols_gsw()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "gsw-CH",
                            "gsw",
                            "CH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_gsw(),
                    walkingkookaDecimalFormatSymbols_gsw_CH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "gsw-FR",
                            "gsw",
                            "FR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_gsw(),
                    walkingkookaDecimalFormatSymbols_gsw_FR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "gsw-LI",
                            "gsw",
                            "LI",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_gsw(),
                    walkingkookaDecimalFormatSymbols_gsw_CH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "gu",
                            "gu",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_gu(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "gu-IN",
                            "gu",
                            "IN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_gu(),
                    walkingkookaDecimalFormatSymbols_bo_IN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "guz",
                            "guz",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_guz(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "guz-KE",
                            "guz",
                            "KE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_guz(),
                    walkingkookaDecimalFormatSymbols_dav_KE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "gv",
                            "gv",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_gv(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "gv-IM",
                            "gv",
                            "IM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_gv(),
                    walkingkookaDecimalFormatSymbols_cy_GB()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ha",
                            "ha",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ha(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ha-GH",
                            "ha",
                            "GH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ha(),
                    walkingkookaDecimalFormatSymbols_ak_GH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ha-NE",
                            "ha",
                            "NE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ha(),
                    walkingkookaDecimalFormatSymbols_bm_ML()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ha-NG",
                            "ha",
                            "NG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ha(),
                    walkingkookaDecimalFormatSymbols_en_NG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "haw",
                            "haw",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_haw(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "haw-US",
                            "haw",
                            "US",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_haw(),
                    walkingkookaDecimalFormatSymbols_chr_US()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "he",
                            "iw",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_iw(),
                    walkingkookaDecimalFormatSymbols_iw()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "he-IL",
                            "iw",
                            "IL",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_iw(),
                    walkingkookaDecimalFormatSymbols_iw_IL()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "hi",
                            "hi",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_hi(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "hi-IN",
                            "hi",
                            "IN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_hi(),
                    walkingkookaDecimalFormatSymbols_bo_IN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "hr",
                            "hr",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_hr(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "hr-BA",
                            "hr",
                            "BA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_hr(),
                    walkingkookaDecimalFormatSymbols_bs_BA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "hr-HR",
                            "hr",
                            "HR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_hr(),
                    walkingkookaDecimalFormatSymbols_hr_HR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "hsb",
                            "hsb",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_hsb(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "hsb-DE",
                            "hsb",
                            "DE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_hsb(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "hu",
                            "hu",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_hu(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "hu-HU",
                            "hu",
                            "HU",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_hu(),
                    walkingkookaDecimalFormatSymbols_hu_HU()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "hy",
                            "hy",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_hy(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "hy-AM",
                            "hy",
                            "AM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_hy(),
                    walkingkookaDecimalFormatSymbols_hy_AM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "id",
                            "in",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_in(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "id-ID",
                            "in",
                            "ID",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_in(),
                    walkingkookaDecimalFormatSymbols_in_ID()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ig",
                            "ig",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ig(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ig-NG",
                            "ig",
                            "NG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ig(),
                    walkingkookaDecimalFormatSymbols_en_NG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ii",
                            "ii",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ii(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ii-CN",
                            "ii",
                            "CN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ii(),
                    walkingkookaDecimalFormatSymbols_bo_CN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "is",
                            "is",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_is(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "is-IS",
                            "is",
                            "IS",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_is(),
                    walkingkookaDecimalFormatSymbols_is_IS()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "it",
                            "it",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_it(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "it-CH",
                            "it",
                            "CH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_it(),
                    walkingkookaDecimalFormatSymbols_it_CH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "it-IT",
                            "it",
                            "IT",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_it(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "it-SM",
                            "it",
                            "SM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_it(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ja",
                            "ja",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ja(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ja-JP",
                            "ja",
                            "JP",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ja(),
                    walkingkookaDecimalFormatSymbols_ja_JP()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "jgo",
                            "jgo",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_jgo(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "jgo-CM",
                            "jgo",
                            "CM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_jgo(),
                    walkingkookaDecimalFormatSymbols_es_GQ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "jmc",
                            "jmc",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_jmc(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "jmc-TZ",
                            "jmc",
                            "TZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_jmc(),
                    walkingkookaDecimalFormatSymbols_asa_TZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ka",
                            "ka",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ka(),
                    walkingkookaDecimalFormatSymbols_ka()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ka-GE",
                            "ka",
                            "GE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ka(),
                    walkingkookaDecimalFormatSymbols_ka_GE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kab",
                            "kab",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kab(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kab-DZ",
                            "kab",
                            "DZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kab(),
                    walkingkookaDecimalFormatSymbols_fr_DZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kam",
                            "kam",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kam(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kam-KE",
                            "kam",
                            "KE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kam(),
                    walkingkookaDecimalFormatSymbols_dav_KE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kde",
                            "kde",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kde(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kde-TZ",
                            "kde",
                            "TZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kde(),
                    walkingkookaDecimalFormatSymbols_asa_TZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kea",
                            "kea",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kea(),
                    walkingkookaDecimalFormatSymbols_kea()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kea-CV",
                            "kea",
                            "CV",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kea(),
                    walkingkookaDecimalFormatSymbols_kea_CV()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "khq",
                            "khq",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_khq(),
                    walkingkookaDecimalFormatSymbols_dje()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "khq-ML",
                            "khq",
                            "ML",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_khq(),
                    walkingkookaDecimalFormatSymbols_dje_NE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ki",
                            "ki",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ki(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ki-KE",
                            "ki",
                            "KE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ki(),
                    walkingkookaDecimalFormatSymbols_dav_KE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kk",
                            "kk",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kk(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kk-KZ",
                            "kk",
                            "KZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kk(),
                    walkingkookaDecimalFormatSymbols_kk_KZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kkj",
                            "kkj",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kkj(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kkj-CM",
                            "kkj",
                            "CM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kkj(),
                    walkingkookaDecimalFormatSymbols_es_GQ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kl",
                            "kl",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kl(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kl-GL",
                            "kl",
                            "GL",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kl(),
                    walkingkookaDecimalFormatSymbols_da_DK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kln",
                            "kln",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kln(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kln-KE",
                            "kln",
                            "KE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kln(),
                    walkingkookaDecimalFormatSymbols_dav_KE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "km",
                            "km",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_km(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "km-KH",
                            "km",
                            "KH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_km(),
                    walkingkookaDecimalFormatSymbols_km_KH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kn",
                            "kn",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kn(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kn-IN",
                            "kn",
                            "IN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kn(),
                    walkingkookaDecimalFormatSymbols_bo_IN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ko",
                            "ko",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ko(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ko-KP",
                            "ko",
                            "KP",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ko(),
                    walkingkookaDecimalFormatSymbols_ko_KP()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ko-KR",
                            "ko",
                            "KR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ko(),
                    walkingkookaDecimalFormatSymbols_ko_KR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kok",
                            "kok",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kok(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kok-IN",
                            "kok",
                            "IN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kok(),
                    walkingkookaDecimalFormatSymbols_bo_IN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ks",
                            "ks",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ks(),
                    walkingkookaDecimalFormatSymbols_ks()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ks-IN",
                            "ks",
                            "IN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ks(),
                    walkingkookaDecimalFormatSymbols_ks_IN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ksb",
                            "ksb",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ksb(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ksb-TZ",
                            "ksb",
                            "TZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ksb(),
                    walkingkookaDecimalFormatSymbols_asa_TZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ksf",
                            "ksf",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ksf(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ksf-CM",
                            "ksf",
                            "CM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ksf(),
                    walkingkookaDecimalFormatSymbols_agq_CM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ksh",
                            "ksh",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ksh(),
                    walkingkookaDecimalFormatSymbols_ksh()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ksh-DE",
                            "ksh",
                            "DE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ksh(),
                    walkingkookaDecimalFormatSymbols_ksh_DE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kw",
                            "kw",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kw(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "kw-GB",
                            "kw",
                            "GB",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_kw(),
                    walkingkookaDecimalFormatSymbols_cy_GB()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ky",
                            "ky",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ky(),
                    walkingkookaDecimalFormatSymbols_ky()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ky-KG",
                            "ky",
                            "KG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ky(),
                    walkingkookaDecimalFormatSymbols_ky_KG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "lag",
                            "lag",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_lag(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "lag-TZ",
                            "lag",
                            "TZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_lag(),
                    walkingkookaDecimalFormatSymbols_asa_TZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "lb",
                            "lb",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_lb(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "lb-LU",
                            "lb",
                            "LU",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_lb(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "lg",
                            "lg",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_lg(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "lg-UG",
                            "lg",
                            "UG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_lg(),
                    walkingkookaDecimalFormatSymbols_cgg_UG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "lkt",
                            "lkt",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_lkt(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "lkt-US",
                            "lkt",
                            "US",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_lkt(),
                    walkingkookaDecimalFormatSymbols_chr_US()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ln",
                            "ln",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ln(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ln-AO",
                            "ln",
                            "AO",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ln(),
                    walkingkookaDecimalFormatSymbols_ln_AO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ln-CD",
                            "ln",
                            "CD",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ln(),
                    walkingkookaDecimalFormatSymbols_ln_CD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ln-CF",
                            "ln",
                            "CF",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ln(),
                    walkingkookaDecimalFormatSymbols_es_GQ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ln-CG",
                            "ln",
                            "CG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ln(),
                    walkingkookaDecimalFormatSymbols_es_GQ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "lo",
                            "lo",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_lo(),
                    walkingkookaDecimalFormatSymbols_lo()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "lo-LA",
                            "lo",
                            "LA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_lo(),
                    walkingkookaDecimalFormatSymbols_lo_LA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "lrc",
                            "lrc",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_lrc(),
                    walkingkookaDecimalFormatSymbols_ks()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "lrc-IQ",
                            "lrc",
                            "IQ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_lrc(),
                    walkingkookaDecimalFormatSymbols_lrc_IQ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "lrc-IR",
                            "lrc",
                            "IR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_lrc(),
                    walkingkookaDecimalFormatSymbols_lrc_IR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "lt",
                            "lt",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_lt(),
                    walkingkookaDecimalFormatSymbols_lt()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "lt-LT",
                            "lt",
                            "LT",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_lt(),
                    walkingkookaDecimalFormatSymbols_lt_LT()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "lu",
                            "lu",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_lu(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "lu-CD",
                            "lu",
                            "CD",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_lu(),
                    walkingkookaDecimalFormatSymbols_ln_CD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "luo",
                            "luo",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_luo(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "luo-KE",
                            "luo",
                            "KE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_luo(),
                    walkingkookaDecimalFormatSymbols_dav_KE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "luy",
                            "luy",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_luy(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "luy-KE",
                            "luy",
                            "KE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_luy(),
                    walkingkookaDecimalFormatSymbols_dav_KE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "lv",
                            "lv",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_lv(),
                    walkingkookaDecimalFormatSymbols_lv()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "lv-LV",
                            "lv",
                            "LV",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_lv(),
                    walkingkookaDecimalFormatSymbols_lv_LV()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mas",
                            "mas",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mas(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mas-KE",
                            "mas",
                            "KE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mas(),
                    walkingkookaDecimalFormatSymbols_dav_KE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mas-TZ",
                            "mas",
                            "TZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mas(),
                    walkingkookaDecimalFormatSymbols_asa_TZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mer",
                            "mer",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mer(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mer-KE",
                            "mer",
                            "KE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mer(),
                    walkingkookaDecimalFormatSymbols_dav_KE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mfe",
                            "mfe",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mfe(),
                    walkingkookaDecimalFormatSymbols_dje()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mfe-MU",
                            "mfe",
                            "MU",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mfe(),
                    walkingkookaDecimalFormatSymbols_mfe_MU()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mg",
                            "mg",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mg(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mg-MG",
                            "mg",
                            "MG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mg(),
                    walkingkookaDecimalFormatSymbols_en_MG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mgh",
                            "mgh",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mgh(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mgh-MZ",
                            "mgh",
                            "MZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mgh(),
                    walkingkookaDecimalFormatSymbols_mgh_MZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mgo",
                            "mgo",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mgo(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mgo-CM",
                            "mgo",
                            "CM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mgo(),
                    walkingkookaDecimalFormatSymbols_en_CM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mk",
                            "mk",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mk(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mk-MK",
                            "mk",
                            "MK",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mk(),
                    walkingkookaDecimalFormatSymbols_mk_MK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ml",
                            "ml",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ml(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ml-IN",
                            "ml",
                            "IN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ml(),
                    walkingkookaDecimalFormatSymbols_bo_IN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mn",
                            "mn",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mn(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mn-MN",
                            "mn",
                            "MN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mn(),
                    walkingkookaDecimalFormatSymbols_mn_MN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mr",
                            "mr",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mr(),
                    walkingkookaDecimalFormatSymbols_mr()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mr-IN",
                            "mr",
                            "IN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mr(),
                    walkingkookaDecimalFormatSymbols_mr_IN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ms",
                            "ms",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ms(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ms-BN",
                            "ms",
                            "BN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ms(),
                    walkingkookaDecimalFormatSymbols_ms_BN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ms-MY",
                            "ms",
                            "MY",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ms(),
                    walkingkookaDecimalFormatSymbols_en_MY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ms-SG",
                            "ms",
                            "SG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ms(),
                    walkingkookaDecimalFormatSymbols_en_SG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mt",
                            "mt",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mt(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mt-MT",
                            "mt",
                            "MT",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mt(),
                    walkingkookaDecimalFormatSymbols_en_CY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mua",
                            "mua",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mua(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mua-CM",
                            "mua",
                            "CM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mua(),
                    walkingkookaDecimalFormatSymbols_es_GQ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "my",
                            "my",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_my(),
                    walkingkookaDecimalFormatSymbols_my()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "my-MM",
                            "my",
                            "MM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_my(),
                    walkingkookaDecimalFormatSymbols_my_MM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mzn",
                            "mzn",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mzn(),
                    walkingkookaDecimalFormatSymbols_ks()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "mzn-IR",
                            "mzn",
                            "IR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_mzn(),
                    walkingkookaDecimalFormatSymbols_lrc_IR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "naq",
                            "naq",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_naq(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "naq-NA",
                            "naq",
                            "NA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_naq(),
                    walkingkookaDecimalFormatSymbols_en_NA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nb",
                            "nb",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nb(),
                    walkingkookaDecimalFormatSymbols_nb()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nb-NO",
                            "nb",
                            "NO",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nb(),
                    walkingkookaDecimalFormatSymbols_nb_NO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nb-SJ",
                            "nb",
                            "SJ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nb(),
                    walkingkookaDecimalFormatSymbols_nb_NO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nd",
                            "nd",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nd(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nd-ZW",
                            "nd",
                            "ZW",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nd(),
                    walkingkookaDecimalFormatSymbols_en_ZW()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ne",
                            "ne",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ne(),
                    walkingkookaDecimalFormatSymbols_mr()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ne-IN",
                            "ne",
                            "IN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ne(),
                    walkingkookaDecimalFormatSymbols_mr_IN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ne-NP",
                            "ne",
                            "NP",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ne(),
                    walkingkookaDecimalFormatSymbols_ne_NP()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nl",
                            "nl",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nl(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nl-AW",
                            "nl",
                            "AW",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nl(),
                    walkingkookaDecimalFormatSymbols_nl_AW()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nl-BE",
                            "nl",
                            "BE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nl(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nl-BQ",
                            "nl",
                            "BQ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nl(),
                    walkingkookaDecimalFormatSymbols_es_EC()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nl-CW",
                            "nl",
                            "CW",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nl(),
                    walkingkookaDecimalFormatSymbols_nl_CW()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nl-NL",
                            "nl",
                            "NL",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nl(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nl-SR",
                            "nl",
                            "SR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nl(),
                    walkingkookaDecimalFormatSymbols_nl_SR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nl-SX",
                            "nl",
                            "SX",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nl(),
                    walkingkookaDecimalFormatSymbols_nl_CW()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nmg",
                            "nmg",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nmg(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nmg-CM",
                            "nmg",
                            "CM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nmg(),
                    walkingkookaDecimalFormatSymbols_agq_CM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nn",
                            "nn",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nn(),
                    walkingkookaDecimalFormatSymbols_nb()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nn-NO",
                            "no",
                            "NO",
                            "NY",
                            ""),
                    walkingkookaDateFormatSymbols_nn(),
                    walkingkookaDecimalFormatSymbols_nb_NO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nn-NO",
                            "nn",
                            "NO",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nn(),
                    walkingkookaDecimalFormatSymbols_nb_NO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nnh",
                            "nnh",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nnh(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nnh-CM",
                            "nnh",
                            "CM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nnh(),
                    walkingkookaDecimalFormatSymbols_es_GQ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "no",
                            "no",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nb(),
                    walkingkookaDecimalFormatSymbols_nb()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "no-NO",
                            "no",
                            "NO",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nb(),
                    walkingkookaDecimalFormatSymbols_nb_NO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nus",
                            "nus",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nus(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nus-SS",
                            "nus",
                            "SS",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_nus(),
                    walkingkookaDecimalFormatSymbols_en_SS()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nyn",
                            "nyn",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_cgg(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "nyn-UG",
                            "nyn",
                            "UG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_cgg(),
                    walkingkookaDecimalFormatSymbols_cgg_UG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "om",
                            "om",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_om(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "om-ET",
                            "om",
                            "ET",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_om(),
                    walkingkookaDecimalFormatSymbols_om_ET()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "om-KE",
                            "om",
                            "KE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_om(),
                    walkingkookaDecimalFormatSymbols_dav_KE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "or",
                            "or",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_or(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "or-IN",
                            "or",
                            "IN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_or(),
                    walkingkookaDecimalFormatSymbols_bo_IN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "os",
                            "os",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_os(),
                    walkingkookaDecimalFormatSymbols_os()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "os-GE",
                            "os",
                            "GE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_os(),
                    walkingkookaDecimalFormatSymbols_os_GE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "os-RU",
                            "os",
                            "RU",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_os(),
                    walkingkookaDecimalFormatSymbols_os_RU()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pa",
                            "pa",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_pa(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pa-Arab",
                            "pa",
                            "",
                            "",
                            "Arab"),
                    walkingkookaDateFormatSymbols_pa__Arab(),
                    walkingkookaDecimalFormatSymbols_ks()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pa-Arab-PK",
                            "pa",
                            "PK",
                            "",
                            "Arab"),
                    walkingkookaDateFormatSymbols_pa__Arab(),
                    walkingkookaDecimalFormatSymbols_pa_PK_Arab()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pa-Guru",
                            "pa",
                            "",
                            "",
                            "Guru"),
                    walkingkookaDateFormatSymbols_pa(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pa-Guru-IN",
                            "pa",
                            "IN",
                            "",
                            "Guru"),
                    walkingkookaDateFormatSymbols_pa(),
                    walkingkookaDecimalFormatSymbols_bo_IN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pa-IN",
                            "pa",
                            "IN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_pa(),
                    walkingkookaDecimalFormatSymbols_bo_IN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pa-PK",
                            "pa",
                            "PK",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_pa(),
                    walkingkookaDecimalFormatSymbols_pa_PK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pl",
                            "pl",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_pl(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pl-PL",
                            "pl",
                            "PL",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_pl(),
                    walkingkookaDecimalFormatSymbols_pl_PL()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "prg",
                            "prg",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ckb(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "prg-001",
                            "prg",
                            "001",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ckb(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ps",
                            "ps",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ps(),
                    walkingkookaDecimalFormatSymbols_ks()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ps-AF",
                            "ps",
                            "AF",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ps(),
                    walkingkookaDecimalFormatSymbols_ps_AF()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pt",
                            "pt",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_pt(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pt-AO",
                            "pt",
                            "AO",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_pt_AO(),
                    walkingkookaDecimalFormatSymbols_pt_AO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pt-BR",
                            "pt",
                            "BR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_pt(),
                    walkingkookaDecimalFormatSymbols_pt_BR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pt-CH",
                            "pt",
                            "CH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_pt_AO(),
                    walkingkookaDecimalFormatSymbols_pt_CH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pt-CV",
                            "pt",
                            "CV",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_pt_AO(),
                    walkingkookaDecimalFormatSymbols_kea_CV()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pt-GQ",
                            "pt",
                            "GQ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_pt_AO(),
                    walkingkookaDecimalFormatSymbols_pt_GQ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pt-GW",
                            "pt",
                            "GW",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_pt_AO(),
                    walkingkookaDecimalFormatSymbols_pt_GW()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pt-LU",
                            "pt",
                            "LU",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_pt_AO(),
                    walkingkookaDecimalFormatSymbols_pt_LU()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pt-MO",
                            "pt",
                            "MO",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_pt_AO(),
                    walkingkookaDecimalFormatSymbols_pt_MO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pt-MZ",
                            "pt",
                            "MZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_pt_AO(),
                    walkingkookaDecimalFormatSymbols_pt_MZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pt-PT",
                            "pt",
                            "PT",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_pt_AO(),
                    walkingkookaDecimalFormatSymbols_pt_LU()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pt-ST",
                            "pt",
                            "ST",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_pt_AO(),
                    walkingkookaDecimalFormatSymbols_pt_ST()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "pt-TL",
                            "pt",
                            "TL",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_pt_AO(),
                    walkingkookaDecimalFormatSymbols_pt_TL()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "qu",
                            "qu",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_qu(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "qu-BO",
                            "qu",
                            "BO",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_qu(),
                    walkingkookaDecimalFormatSymbols_es_BO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "qu-EC",
                            "qu",
                            "EC",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_qu(),
                    walkingkookaDecimalFormatSymbols_chr_US()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "qu-PE",
                            "qu",
                            "PE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_qu(),
                    walkingkookaDecimalFormatSymbols_es_PE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "rm",
                            "rm",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_rm(),
                    walkingkookaDecimalFormatSymbols_gsw()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "rm-CH",
                            "rm",
                            "CH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_rm(),
                    walkingkookaDecimalFormatSymbols_gsw_CH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "rn",
                            "rn",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_rn(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "rn-BI",
                            "rn",
                            "BI",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_rn(),
                    walkingkookaDecimalFormatSymbols_rn_BI()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ro",
                            "ro",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ro(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ro-MD",
                            "ro",
                            "MD",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ro_MD(),
                    walkingkookaDecimalFormatSymbols_ro_MD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ro-RO",
                            "ro",
                            "RO",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ro(),
                    walkingkookaDecimalFormatSymbols_ro_RO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "rof",
                            "rof",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_rof(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "rof-TZ",
                            "rof",
                            "TZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_rof(),
                    walkingkookaDecimalFormatSymbols_asa_TZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ru",
                            "ru",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ru(),
                    walkingkookaDecimalFormatSymbols_ru()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ru-BY",
                            "ru",
                            "BY",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ru(),
                    walkingkookaDecimalFormatSymbols_ru_BY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ru-KG",
                            "ru",
                            "KG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ru(),
                    walkingkookaDecimalFormatSymbols_ru_KG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ru-KZ",
                            "ru",
                            "KZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ru(),
                    walkingkookaDecimalFormatSymbols_ru_KZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ru-MD",
                            "ru",
                            "MD",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ru(),
                    walkingkookaDecimalFormatSymbols_ru_MD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ru-RU",
                            "ru",
                            "RU",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ru(),
                    walkingkookaDecimalFormatSymbols_ru_RU()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ru-UA",
                            "ru",
                            "UA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ru(),
                    walkingkookaDecimalFormatSymbols_ru_UA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "rw",
                            "rw",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_rw(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "rw-RW",
                            "rw",
                            "RW",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_rw(),
                    walkingkookaDecimalFormatSymbols_rw_RW()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "rwk",
                            "rwk",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_jmc(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "rwk-TZ",
                            "rwk",
                            "TZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_jmc(),
                    walkingkookaDecimalFormatSymbols_asa_TZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sah",
                            "sah",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sah(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sah-RU",
                            "sah",
                            "RU",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sah(),
                    walkingkookaDecimalFormatSymbols_cu_RU()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "saq",
                            "saq",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_saq(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "saq-KE",
                            "saq",
                            "KE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_saq(),
                    walkingkookaDecimalFormatSymbols_dav_KE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sbp",
                            "sbp",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sbp(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sbp-TZ",
                            "sbp",
                            "TZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sbp(),
                    walkingkookaDecimalFormatSymbols_asa_TZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "se",
                            "se",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_se(),
                    walkingkookaDecimalFormatSymbols_ksh()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "se-FI",
                            "se",
                            "FI",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_se(),
                    walkingkookaDecimalFormatSymbols_ksh_DE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "se-NO",
                            "se",
                            "NO",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_se(),
                    walkingkookaDecimalFormatSymbols_se_NO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "se-SE",
                            "se",
                            "SE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_se(),
                    walkingkookaDecimalFormatSymbols_se_SE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "seh",
                            "seh",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_seh(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "seh-MZ",
                            "seh",
                            "MZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_seh(),
                    walkingkookaDecimalFormatSymbols_mgh_MZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ses",
                            "ses",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ses(),
                    walkingkookaDecimalFormatSymbols_dje()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ses-ML",
                            "ses",
                            "ML",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ses(),
                    walkingkookaDecimalFormatSymbols_dje_NE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sg",
                            "sg",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sg(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sg-CF",
                            "sg",
                            "CF",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sg(),
                    walkingkookaDecimalFormatSymbols_es_GQ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "shi",
                            "shi",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_shi(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "shi-Latn",
                            "shi",
                            "",
                            "",
                            "Latn"),
                    walkingkookaDateFormatSymbols_shi__Latn(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "shi-Latn-MA",
                            "shi",
                            "MA",
                            "",
                            "Latn"),
                    walkingkookaDateFormatSymbols_shi__Latn(),
                    walkingkookaDecimalFormatSymbols_shi_MA_Latn()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "shi-MA",
                            "shi",
                            "MA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_shi(),
                    walkingkookaDecimalFormatSymbols_shi_MA_Latn()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "shi-Tfng",
                            "shi",
                            "",
                            "",
                            "Tfng"),
                    walkingkookaDateFormatSymbols_shi(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "shi-Tfng-MA",
                            "shi",
                            "MA",
                            "",
                            "Tfng"),
                    walkingkookaDateFormatSymbols_shi(),
                    walkingkookaDecimalFormatSymbols_shi_MA_Latn()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "si",
                            "si",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_si(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "si-LK",
                            "si",
                            "LK",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_si(),
                    walkingkookaDecimalFormatSymbols_si_LK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sk",
                            "sk",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sk(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sk-SK",
                            "sk",
                            "SK",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sk(),
                    walkingkookaDecimalFormatSymbols_br_FR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sl",
                            "sl",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sl(),
                    walkingkookaDecimalFormatSymbols_el()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sl-SI",
                            "sl",
                            "SI",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sl(),
                    walkingkookaDecimalFormatSymbols_el_CY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "smn",
                            "smn",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_smn(),
                    walkingkookaDecimalFormatSymbols_smn()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "smn-FI",
                            "smn",
                            "FI",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_smn(),
                    walkingkookaDecimalFormatSymbols_smn_FI()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sn",
                            "sn",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sn(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sn-ZW",
                            "sn",
                            "ZW",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sn(),
                    walkingkookaDecimalFormatSymbols_en_ZW()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "so",
                            "so",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_so(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "so-DJ",
                            "so",
                            "DJ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_so(),
                    walkingkookaDecimalFormatSymbols_so_DJ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "so-ET",
                            "so",
                            "ET",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_so(),
                    walkingkookaDecimalFormatSymbols_om_ET()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "so-KE",
                            "so",
                            "KE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_so(),
                    walkingkookaDecimalFormatSymbols_dav_KE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "so-SO",
                            "so",
                            "SO",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_so(),
                    walkingkookaDecimalFormatSymbols_so_SO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sq",
                            "sq",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sq(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sq-AL",
                            "sq",
                            "AL",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sq(),
                    walkingkookaDecimalFormatSymbols_sq_AL()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sq-MK",
                            "sq",
                            "MK",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sq(),
                    walkingkookaDecimalFormatSymbols_sq_MK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sq-XK",
                            "sq",
                            "XK",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sq(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sr",
                            "sr",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sr(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sr-BA",
                            "sr",
                            "BA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sr_BA(),
                    walkingkookaDecimalFormatSymbols_sr_BA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sr-CS",
                            "sr",
                            "CS",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sr_CS(),
                    walkingkookaDecimalFormatSymbols_sr_CS()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sr-Cyrl",
                            "sr",
                            "",
                            "",
                            "Cyrl"),
                    walkingkookaDateFormatSymbols_sr(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sr-Cyrl-BA",
                            "sr",
                            "BA",
                            "",
                            "Cyrl"),
                    walkingkookaDateFormatSymbols_sr(),
                    walkingkookaDecimalFormatSymbols_sr_BA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sr-Cyrl-ME",
                            "sr",
                            "ME",
                            "",
                            "Cyrl"),
                    walkingkookaDateFormatSymbols_sr(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sr-Cyrl-RS",
                            "sr",
                            "RS",
                            "",
                            "Cyrl"),
                    walkingkookaDateFormatSymbols_sr(),
                    walkingkookaDecimalFormatSymbols_sr_RS_Cyrl()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sr-Cyrl-XK",
                            "sr",
                            "XK",
                            "",
                            "Cyrl"),
                    walkingkookaDateFormatSymbols_sr(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sr-Latn",
                            "sr",
                            "",
                            "",
                            "Latn"),
                    walkingkookaDateFormatSymbols_sr__Latn(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sr-Latn-BA",
                            "sr",
                            "BA",
                            "",
                            "Latn"),
                    walkingkookaDateFormatSymbols_sr__Latn(),
                    walkingkookaDecimalFormatSymbols_bs_BA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sr-Latn-ME",
                            "sr",
                            "ME",
                            "",
                            "Latn"),
                    walkingkookaDateFormatSymbols_sr__Latn(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sr-Latn-RS",
                            "sr",
                            "RS",
                            "",
                            "Latn"),
                    walkingkookaDateFormatSymbols_sr__Latn(),
                    walkingkookaDecimalFormatSymbols_sr_RS_Latn()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sr-Latn-XK",
                            "sr",
                            "XK",
                            "",
                            "Latn"),
                    walkingkookaDateFormatSymbols_sr__Latn(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sr-ME",
                            "sr",
                            "ME",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sr_CS(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sr-RS",
                            "sr",
                            "RS",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sr(),
                    walkingkookaDecimalFormatSymbols_sr_RS_Cyrl()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sv",
                            "sv",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sv(),
                    walkingkookaDecimalFormatSymbols_ksh()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sv-AX",
                            "sv",
                            "AX",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sv(),
                    walkingkookaDecimalFormatSymbols_ksh_DE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sv-FI",
                            "sv",
                            "FI",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sv(),
                    walkingkookaDecimalFormatSymbols_ksh_DE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sv-SE",
                            "sv",
                            "SE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sv(),
                    walkingkookaDecimalFormatSymbols_se_SE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sw",
                            "sw",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sw(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sw-CD",
                            "sw",
                            "CD",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sw_CD(),
                    walkingkookaDecimalFormatSymbols_ln_CD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sw-KE",
                            "sw",
                            "KE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sw(),
                    walkingkookaDecimalFormatSymbols_dav_KE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sw-TZ",
                            "sw",
                            "TZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sw(),
                    walkingkookaDecimalFormatSymbols_asa_TZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "sw-UG",
                            "sw",
                            "UG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_sw(),
                    walkingkookaDecimalFormatSymbols_cgg_UG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ta",
                            "ta",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ta(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ta-IN",
                            "ta",
                            "IN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ta(),
                    walkingkookaDecimalFormatSymbols_bo_IN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ta-LK",
                            "ta",
                            "LK",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ta(),
                    walkingkookaDecimalFormatSymbols_ta_LK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ta-MY",
                            "ta",
                            "MY",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ta(),
                    walkingkookaDecimalFormatSymbols_en_MY()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ta-SG",
                            "ta",
                            "SG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ta(),
                    walkingkookaDecimalFormatSymbols_en_SG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "te",
                            "te",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_te(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "te-IN",
                            "te",
                            "IN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_te(),
                    walkingkookaDecimalFormatSymbols_bo_IN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "teo",
                            "teo",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_teo(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "teo-KE",
                            "teo",
                            "KE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_teo(),
                    walkingkookaDecimalFormatSymbols_dav_KE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "teo-UG",
                            "teo",
                            "UG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_teo(),
                    walkingkookaDecimalFormatSymbols_cgg_UG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "th",
                            "th",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_th(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "th-TH",
                            "th",
                            "TH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_th(),
                    walkingkookaDecimalFormatSymbols_th_TH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ti",
                            "ti",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ti(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ti-ER",
                            "ti",
                            "ER",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ti_ER(),
                    walkingkookaDecimalFormatSymbols_en_ER()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ti-ET",
                            "ti",
                            "ET",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ti(),
                    walkingkookaDecimalFormatSymbols_om_ET()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "tk",
                            "tk",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ckb(),
                    walkingkookaDecimalFormatSymbols_tk()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "tk-TM",
                            "tk",
                            "TM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ckb(),
                    walkingkookaDecimalFormatSymbols_tk_TM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "to",
                            "to",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_to(),
                    walkingkookaDecimalFormatSymbols_to()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "to-TO",
                            "to",
                            "TO",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_to(),
                    walkingkookaDecimalFormatSymbols_to_TO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "tr",
                            "tr",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_tr(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "tr-CY",
                            "tr",
                            "CY",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_tr(),
                    walkingkookaDecimalFormatSymbols_ca_AD()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "tr-TR",
                            "tr",
                            "TR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_tr(),
                    walkingkookaDecimalFormatSymbols_tr_TR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "twq",
                            "twq",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_twq(),
                    walkingkookaDecimalFormatSymbols_dje()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "twq-NE",
                            "twq",
                            "NE",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_twq(),
                    walkingkookaDecimalFormatSymbols_dje_NE()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "tzm",
                            "tzm",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_tzm(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "tzm-MA",
                            "tzm",
                            "MA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_tzm(),
                    walkingkookaDecimalFormatSymbols_shi_MA_Latn()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ug",
                            "ug",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ug(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ug-CN",
                            "ug",
                            "CN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ug(),
                    walkingkookaDecimalFormatSymbols_ug_CN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "uk",
                            "uk",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_uk(),
                    walkingkookaDecimalFormatSymbols_uk()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "uk-UA",
                            "uk",
                            "UA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_uk(),
                    walkingkookaDecimalFormatSymbols_uk_UA()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "und",
                            "",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ckb(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ur",
                            "ur",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ur(),
                    walkingkookaDecimalFormatSymbols_iw()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ur-IN",
                            "ur",
                            "IN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ur(),
                    walkingkookaDecimalFormatSymbols_ur_IN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "ur-PK",
                            "ur",
                            "PK",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ur(),
                    walkingkookaDecimalFormatSymbols_ur_PK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "uz",
                            "uz",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_uz(),
                    walkingkookaDecimalFormatSymbols_uz()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "uz-AF",
                            "uz",
                            "AF",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_uz(),
                    walkingkookaDecimalFormatSymbols_uz_AF()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "uz-Arab",
                            "uz",
                            "",
                            "",
                            "Arab"),
                    walkingkookaDateFormatSymbols_uz__Arab(),
                    walkingkookaDecimalFormatSymbols_ks()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "uz-Arab-AF",
                            "uz",
                            "AF",
                            "",
                            "Arab"),
                    walkingkookaDateFormatSymbols_uz__Arab(),
                    walkingkookaDecimalFormatSymbols_ps_AF()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "uz-Cyrl",
                            "uz",
                            "",
                            "",
                            "Cyrl"),
                    walkingkookaDateFormatSymbols_uz__Cyrl(),
                    walkingkookaDecimalFormatSymbols_uz__Cyrl()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "uz-Cyrl-UZ",
                            "uz",
                            "UZ",
                            "",
                            "Cyrl"),
                    walkingkookaDateFormatSymbols_uz__Cyrl(),
                    walkingkookaDecimalFormatSymbols_uz_UZ_Cyrl()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "uz-Latn",
                            "uz",
                            "",
                            "",
                            "Latn"),
                    walkingkookaDateFormatSymbols_uz(),
                    walkingkookaDecimalFormatSymbols_uz()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "uz-Latn-UZ",
                            "uz",
                            "UZ",
                            "",
                            "Latn"),
                    walkingkookaDateFormatSymbols_uz(),
                    walkingkookaDecimalFormatSymbols_uz_UZ_Latn()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "uz-UZ",
                            "uz",
                            "UZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_uz(),
                    walkingkookaDecimalFormatSymbols_uz_UZ_Latn()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "vai",
                            "vai",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_vai(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "vai-LR",
                            "vai",
                            "LR",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_vai(),
                    walkingkookaDecimalFormatSymbols_en_LR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "vai-Latn",
                            "vai",
                            "",
                            "",
                            "Latn"),
                    walkingkookaDateFormatSymbols_vai__Latn(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "vai-Latn-LR",
                            "vai",
                            "LR",
                            "",
                            "Latn"),
                    walkingkookaDateFormatSymbols_vai__Latn(),
                    walkingkookaDecimalFormatSymbols_en_LR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "vai-Vaii",
                            "vai",
                            "",
                            "",
                            "Vaii"),
                    walkingkookaDateFormatSymbols_vai(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "vai-Vaii-LR",
                            "vai",
                            "LR",
                            "",
                            "Vaii"),
                    walkingkookaDateFormatSymbols_vai(),
                    walkingkookaDecimalFormatSymbols_en_LR()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "vi",
                            "vi",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_vi(),
                    walkingkookaDecimalFormatSymbols_az()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "vi-VN",
                            "vi",
                            "VN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_vi(),
                    walkingkookaDecimalFormatSymbols_vi_VN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "vo",
                            "vo",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ckb(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "vo-001",
                            "vo",
                            "001",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ckb(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "vun",
                            "vun",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_jmc(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "vun-TZ",
                            "vun",
                            "TZ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_jmc(),
                    walkingkookaDecimalFormatSymbols_asa_TZ()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "wae",
                            "wae",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_wae(),
                    walkingkookaDecimalFormatSymbols_wae()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "wae-CH",
                            "wae",
                            "CH",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_wae(),
                    walkingkookaDecimalFormatSymbols_wae_CH()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "xog",
                            "xog",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_xog(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "xog-UG",
                            "xog",
                            "UG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_xog(),
                    walkingkookaDecimalFormatSymbols_cgg_UG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "yav",
                            "yav",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_yav(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "yav-CM",
                            "yav",
                            "CM",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_yav(),
                    walkingkookaDecimalFormatSymbols_agq_CM()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "yi",
                            "ji",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ji(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "yi-001",
                            "ji",
                            "001",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_ji(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "yo",
                            "yo",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_yo(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "yo-BJ",
                            "yo",
                            "BJ",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_yo_BJ(),
                    walkingkookaDecimalFormatSymbols_bm_ML()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "yo-NG",
                            "yo",
                            "NG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_yo(),
                    walkingkookaDecimalFormatSymbols_en_NG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "yue",
                            "yue",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_yue(),
                    walkingkookaDecimalFormatSymbols_yue()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "yue-HK",
                            "yue",
                            "HK",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_yue(),
                    walkingkookaDecimalFormatSymbols_yue_HK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "zgh",
                            "zgh",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_zgh(),
                    walkingkookaDecimalFormatSymbols_af()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "zgh-MA",
                            "zgh",
                            "MA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_zgh(),
                    walkingkookaDecimalFormatSymbols_shi_MA_Latn()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "zh",
                            "zh",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_zh(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "zh-CN",
                            "zh",
                            "CN",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_zh(),
                    walkingkookaDecimalFormatSymbols_ug_CN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "zh-HK",
                            "zh",
                            "HK",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_zh_HK(),
                    walkingkookaDecimalFormatSymbols_yue_HK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "zh-Hans",
                            "zh",
                            "",
                            "",
                            "Hans"),
                    walkingkookaDateFormatSymbols_zh(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "zh-Hans-CN",
                            "zh",
                            "CN",
                            "",
                            "Hans"),
                    walkingkookaDateFormatSymbols_zh(),
                    walkingkookaDecimalFormatSymbols_ug_CN()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "zh-Hans-HK",
                            "zh",
                            "HK",
                            "",
                            "Hans"),
                    walkingkookaDateFormatSymbols_zh(),
                    walkingkookaDecimalFormatSymbols_en_HK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "zh-Hans-MO",
                            "zh",
                            "MO",
                            "",
                            "Hans"),
                    walkingkookaDateFormatSymbols_zh(),
                    walkingkookaDecimalFormatSymbols_en_MO()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "zh-Hans-SG",
                            "zh",
                            "SG",
                            "",
                            "Hans"),
                    walkingkookaDateFormatSymbols_zh(),
                    walkingkookaDecimalFormatSymbols_en_SG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "zh-Hant",
                            "zh",
                            "",
                            "",
                            "Hant"),
                    walkingkookaDateFormatSymbols_yue(),
                    walkingkookaDecimalFormatSymbols_yue()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "zh-Hant-HK",
                            "zh",
                            "HK",
                            "",
                            "Hant"),
                    walkingkookaDateFormatSymbols_zh_HK(),
                    walkingkookaDecimalFormatSymbols_yue_HK()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "zh-Hant-MO",
                            "zh",
                            "MO",
                            "",
                            "Hant"),
                    walkingkookaDateFormatSymbols_zh_HK(),
                    walkingkookaDecimalFormatSymbols_zh_MO_Hant()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "zh-Hant-TW",
                            "zh",
                            "TW",
                            "",
                            "Hant"),
                    walkingkookaDateFormatSymbols_yue(),
                    walkingkookaDecimalFormatSymbols_zh_TW_Hant()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "zh-SG",
                            "zh",
                            "SG",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_zh_SG(),
                    walkingkookaDecimalFormatSymbols_en_SG()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "zh-TW",
                            "zh",
                            "TW",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_yue(),
                    walkingkookaDecimalFormatSymbols_zh_TW_Hant()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "zu",
                            "zu",
                            "",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_zu(),
                    walkingkookaDecimalFormatSymbols_ak()
            ),
            WalkingkookaLocale.with(
                    WalkingkookaLanguageTag.with(
                            "zu-ZA",
                            "zu",
                            "ZA",
                            "",
                            ""),
                    walkingkookaDateFormatSymbols_zu(),
                    walkingkookaDecimalFormatSymbols_zu_ZA()
            ));

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_br() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("A.M.", "G.M."),
                Lists.of("a-raok J.K.", "goude J.K."),
                Lists.of("Genver", "Cʼhwevrer", "Meurzh", "Ebrel", "Mae", "Mezheven", "Gouere", "Eost", "Gwengolo", "Here", "Du", "Kerzu", ""),
                Lists.of("Gen.", "Cʼhwe.", "Meur.", "Ebr.", "Mae", "Mezh.", "Goue.", "Eost", "Gwen.", "Here", "Du", "Kzu.", ""),
                Lists.of("", "Sul", "Lun", "Meu.", "Mer.", "Yaou", "Gwe.", "Sad."),
                Lists.of("", "Sul", "Lun", "Meurzh", "Mercʼher", "Yaou", "Gwener", "Sadorn"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ig() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("A.M.", "P.M."),
                Lists.of("T.K.", "A.K."),
                Lists.of("Jenụwarị", "Febrụwarị", "Maachị", "Eprel", "Mee", "Juun", "Julaị", "Ọgọọst", "Septemba", "Ọktoba", "Novemba", "Disemba", ""),
                Lists.of("Jen", "Feb", "Maa", "Epr", "Mee", "Juu", "Jul", "Ọgọ", "Sep", "Ọkt", "Nov", "Dis", ""),
                Lists.of("", "Ụka", "Mọn", "Tiu", "Wen", "Tọọ", "Fraị", "Sat"),
                Lists.of("", "Mbọsị Ụka", "Mọnde", "Tiuzdee", "Wenezdee", "Tọọzdee", "Fraịdee", "Satọdee"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_seh() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("AC", "AD"),
                Lists.of("Janeiro", "Fevreiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Augusto", "Setembro", "Otubro", "Novembro", "Decembro", ""),
                Lists.of("Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Aug", "Set", "Otu", "Nov", "Dec", ""),
                Lists.of("", "Dim", "Pos", "Pir", "Tat", "Nai", "Sha", "Sab"),
                Lists.of("", "Dimingu", "Chiposi", "Chipiri", "Chitatu", "Chinai", "Chishanu", "Sabudu"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_dyo() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("ArY", "AtY"),
                Lists.of("Sanvie", "Fébirie", "Mars", "Aburil", "Mee", "Sueŋ", "Súuyee", "Ut", "Settembar", "Oktobar", "Novembar", "Disambar", ""),
                Lists.of("Sa", "Fe", "Ma", "Ab", "Me", "Su", "Sú", "Ut", "Se", "Ok", "No", "De", ""),
                Lists.of("", "Dim", "Ten", "Tal", "Ala", "Ara", "Arj", "Sib"),
                Lists.of("", "Dimas", "Teneŋ", "Talata", "Alarbay", "Aramisay", "Arjuma", "Sibiti"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_fil() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BC", "AD"),
                Lists.of("Enero", "Pebrero", "Marso", "Abril", "Mayo", "Hunyo", "Hulyo", "Agosto", "Setyembre", "Oktubre", "Nobyembre", "Disyembre", ""),
                Lists.of("Ene", "Peb", "Mar", "Abr", "May", "Hun", "Hul", "Ago", "Set", "Okt", "Nob", "Dis", ""),
                Lists.of("", "Lin", "Lun", "Mar", "Miy", "Huw", "Biy", "Sab"),
                Lists.of("", "Linggo", "Lunes", "Martes", "Miyerkules", "Huwebes", "Biyernes", "Sabado"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_mg() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BC", "AD"),
                Lists.of("Janoary", "Febroary", "Martsa", "Aprily", "Mey", "Jona", "Jolay", "Aogositra", "Septambra", "Oktobra", "Novambra", "Desambra", ""),
                Lists.of("Jan", "Feb", "Mar", "Apr", "Mey", "Jon", "Jol", "Aog", "Sep", "Okt", "Nov", "Des", ""),
                Lists.of("", "Alah", "Alats", "Tal", "Alar", "Alak", "Zom", "Asab"),
                Lists.of("", "Alahady", "Alatsinainy", "Talata", "Alarobia", "Alakamisy", "Zoma", "Asabotsy"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_sw() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BC", "AD"),
                Lists.of("Januari", "Februari", "Machi", "Aprili", "Mei", "Juni", "Julai", "Agosti", "Septemba", "Oktoba", "Novemba", "Desemba", ""),
                Lists.of("Jan", "Feb", "Mac", "Apr", "Mei", "Jun", "Jul", "Ago", "Sep", "Okt", "Nov", "Des", ""),
                Lists.of("", "Jumapili", "Jumatatu", "Jumanne", "Jumatano", "Alhamisi", "Ijumaa", "Jumamosi"),
                Lists.of("", "Jumapili", "Jumatatu", "Jumanne", "Jumatano", "Alhamisi", "Ijumaa", "Jumamosi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_en() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BC", "AD"),
                Lists.of("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", ""),
                Lists.of("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", ""),
                Lists.of("", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"),
                Lists.of("", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_zu() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BC", "AD"),
                Lists.of("Januwari", "Februwari", "Mashi", "Ephreli", "Meyi", "Juni", "Julayi", "Agasti", "Septhemba", "Okthoba", "Novemba", "Disemba", ""),
                Lists.of("Jan", "Feb", "Mas", "Eph", "Mey", "Jun", "Jul", "Aga", "Sep", "Okt", "Nov", "Dis", ""),
                Lists.of("", "Son", "Mso", "Bil", "Tha", "Sin", "Hla", "Mgq"),
                Lists.of("", "ISonto", "UMsombuluko", "ULwesibili", "ULwesithathu", "ULwesine", "ULwesihlanu", "UMgqibelo"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_lg() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BC", "AD"),
                Lists.of("Janwaliyo", "Febwaliyo", "Marisi", "Apuli", "Maayi", "Juuni", "Julaayi", "Agusito", "Sebuttemba", "Okitobba", "Novemba", "Desemba", ""),
                Lists.of("Jan", "Feb", "Mar", "Apu", "Maa", "Juu", "Jul", "Agu", "Seb", "Oki", "Nov", "Des", ""),
                Lists.of("", "Sab", "Bal", "Lw2", "Lw3", "Lw4", "Lw5", "Lw6"),
                Lists.of("", "Sabbiiti", "Balaza", "Lwakubiri", "Lwakusatu", "Lwakuna", "Lwakutaano", "Lwamukaaga"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_sn() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BC", "AD"),
                Lists.of("Ndira", "Kukadzi", "Kurume", "Kubvumbi", "Chivabvu", "Chikumi", "Chikunguru", "Nyamavhuvhu", "Gunyana", "Gumiguru", "Mbudzi", "Zvita", ""),
                Lists.of("Ndi", "Kuk", "Kur", "Kub", "Chv", "Chk", "Chg", "Nya", "Gun", "Gum", "Mb", "Zvi", ""),
                Lists.of("", "Svo", "Muv", "Chip", "Chit", "Chin", "Chis", "Mug"),
                Lists.of("", "Svondo", "Muvhuro", "Chipiri", "Chitatu", "China", "Chishanu", "Mugovera"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_cgg() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BC", "AD"),
                Lists.of("Okwokubanza", "Okwakabiri", "Okwakashatu", "Okwakana", "Okwakataana", "Okwamukaaga", "Okwamushanju", "Okwamunaana", "Okwamwenda", "Okwaikumi", "Okwaikumi na kumwe", "Okwaikumi na ibiri", ""),
                Lists.of("KBZ", "KBR", "KST", "KKN", "KTN", "KMK", "KMS", "KMN", "KMW", "KKM", "KNK", "KNB", ""),
                Lists.of("", "SAN", "ORK", "OKB", "OKS", "OKN", "OKT", "OMK"),
                Lists.of("", "Sande", "Orwokubanza", "Orwakabiri", "Orwakashatu", "Orwakana", "Orwakataano", "Orwamukaaga"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_nd() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BC", "AD"),
                Lists.of("Zibandlela", "Nhlolanja", "Mbimbitho", "Mabasa", "Nkwenkwezi", "Nhlangula", "Ntulikazi", "Ncwabakazi", "Mpandula", "Mfumfu", "Lwezi", "Mpalakazi", ""),
                Lists.of("Zib", "Nhlo", "Mbi", "Mab", "Nkw", "Nhla", "Ntu", "Ncw", "Mpan", "Mfu", "Lwe", "Mpal", ""),
                Lists.of("", "Son", "Mvu", "Sib", "Sit", "Sin", "Sih", "Mgq"),
                Lists.of("", "Sonto", "Mvulo", "Sibili", "Sithathu", "Sine", "Sihlanu", "Mgqibelo"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_haw() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BCE", "CE"),
                Lists.of("Ianuali", "Pepeluali", "Malaki", "ʻApelila", "Mei", "Iune", "Iulai", "ʻAukake", "Kepakemapa", "ʻOkakopa", "Nowemapa", "Kekemapa", ""),
                Lists.of("Ian.", "Pep.", "Mal.", "ʻAp.", "Mei", "Iun.", "Iul.", "ʻAu.", "Kep.", "ʻOk.", "Now.", "Kek.", ""),
                Lists.of("", "LP", "P1", "P2", "P3", "P4", "P5", "P6"),
                Lists.of("", "Lāpule", "Poʻakahi", "Poʻalua", "Poʻakolu", "Poʻahā", "Poʻalima", "Poʻaono"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ckb() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BCE", "CE"),
                Lists.of("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", ""),
                Lists.of("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", ""),
                Lists.of("", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"),
                Lists.of("", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_rw() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BCE", "CE"),
                Lists.of("Mutarama", "Gashyantare", "Werurwe", "Mata", "Gicuransi", "Kamena", "Nyakanga", "Kanama", "Nzeli", "Ukwakira", "Ugushyingo", "Ukuboza", ""),
                Lists.of("mut.", "gas.", "wer.", "mat.", "gic.", "kam.", "nya.", "kan.", "nze.", "ukw.", "ugu.", "uku.", ""),
                Lists.of("", "cyu.", "mbe.", "kab.", "gtu.", "kan.", "gnu.", "gnd."),
                Lists.of("", "Ku cyumweru", "Kuwa mbere", "Kuwa kabiri", "Kuwa gatatu", "Kuwa kane", "Kuwa gatanu", "Kuwa gatandatu"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_lkt() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BCE", "CE"),
                Lists.of("Wiótheȟika Wí", "Thiyóȟeyuŋka Wí", "Ištáwičhayazaŋ Wí", "Pȟežítȟo Wí", "Čhaŋwápetȟo Wí", "Wípazukȟa-wašté Wí", "Čhaŋpȟásapa Wí", "Wasútȟuŋ Wí", "Čhaŋwápeǧi Wí", "Čhaŋwápe-kasná Wí", "Waníyetu Wí", "Tȟahékapšuŋ Wí", ""),
                Lists.of("Wiótheȟika Wí", "Thiyóȟeyuŋka Wí", "Ištáwičhayazaŋ Wí", "Pȟežítȟo Wí", "Čhaŋwápetȟo Wí", "Wípazukȟa-wašté Wí", "Čhaŋpȟásapa Wí", "Wasútȟuŋ Wí", "Čhaŋwápeǧi Wí", "Čhaŋwápe-kasná Wí", "Waníyetu Wí", "Tȟahékapšuŋ Wí", ""),
                Lists.of("", "Aŋpétuwakȟaŋ", "Aŋpétuwaŋži", "Aŋpétunuŋpa", "Aŋpétuyamni", "Aŋpétutopa", "Aŋpétuzaptaŋ", "Owáŋgyužažapi"),
                Lists.of("", "Aŋpétuwakȟaŋ", "Aŋpétuwaŋži", "Aŋpétunuŋpa", "Aŋpétuyamni", "Aŋpétutopa", "Aŋpétuzaptaŋ", "Owáŋgyužažapi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_mgo() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BCE", "CE"),
                Lists.of("iməg mbegtug", "imeg àbùbì", "imeg mbəŋchubi", "iməg ngwə̀t", "iməg fog", "iməg ichiibɔd", "iməg àdùmbə̀ŋ", "iməg ichika", "iməg kud", "iməg tèsiʼe", "iməg zò", "iməg krizmed", ""),
                Lists.of("mbegtug", "imeg àbùbì", "imeg mbəŋchubi", "iməg ngwə̀t", "iməg fog", "iməg ichiibɔd", "iməg àdùmbə̀ŋ", "iməg ichika", "iməg kud", "iməg tèsiʼe", "iməg zò", "iməg krizmed", ""),
                Lists.of("", "Aneg 1", "Aneg 2", "Aneg 3", "Aneg 4", "Aneg 5", "Aneg 6", "Aneg 7"),
                Lists.of("", "Aneg 1", "Aneg 2", "Aneg 3", "Aneg 4", "Aneg 5", "Aneg 6", "Aneg 7"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_kl() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BCE", "CE"),
                Lists.of("januari", "februari", "martsi", "aprili", "maji", "juni", "juli", "augustusi", "septemberi", "oktoberi", "novemberi", "decemberi", ""),
                Lists.of("jan", "feb", "mar", "apr", "maj", "jun", "jul", "aug", "sep", "okt", "nov", "dec", ""),
                Lists.of("", "sab", "ata", "mar", "pin", "sis", "tal", "arf"),
                Lists.of("", "sabaat", "ataasinngorneq", "marlunngorneq", "pingasunngorneq", "sisamanngorneq", "tallimanngorneq", "arfininngorneq"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_vai__Latn() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BCE", "CE"),
                Lists.of("luukao kemã", "ɓandaɓu", "vɔɔ", "fulu", "goo", "6", "7", "kɔnde", "saah", "galo", "kenpkato ɓololɔ", "luukao lɔma", ""),
                Lists.of("luukao kemã", "ɓandaɓu", "vɔɔ", "fulu", "goo", "6", "7", "kɔnde", "saah", "galo", "kenpkato ɓololɔ", "luukao lɔma", ""),
                Lists.of("", "lahadi", "tɛɛnɛɛ", "talata", "alaba", "aimisa", "aijima", "siɓiti"),
                Lists.of("", "lahadi", "tɛɛnɛɛ", "talata", "alaba", "aimisa", "aijima", "siɓiti"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_kkj() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BCE", "CE"),
                Lists.of("pamba", "wanja", "mbiyɔ mɛndoŋgɔ", "Nyɔlɔmbɔŋgɔ", "Mɔnɔ ŋgbanja", "Nyaŋgwɛ ŋgbanja", "kuŋgwɛ", "fɛ", "njapi", "nyukul", "11", "ɓulɓusɛ", ""),
                Lists.of("pamba", "wanja", "mbiyɔ mɛndoŋgɔ", "Nyɔlɔmbɔŋgɔ", "Mɔnɔ ŋgbanja", "Nyaŋgwɛ ŋgbanja", "kuŋgwɛ", "fɛ", "njapi", "nyukul", "11", "ɓulɓusɛ", ""),
                Lists.of("", "sɔndi", "lundi", "mardi", "mɛrkɛrɛdi", "yedi", "vaŋdɛrɛdi", "mɔnɔ sɔndi"),
                Lists.of("", "sɔndi", "lundi", "mardi", "mɛrkɛrɛdi", "yedi", "vaŋdɛrɛdi", "mɔnɔ sɔndi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_smn() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BCE", "CE"),
                Lists.of("uđđâivemáánu", "kuovâmáánu", "njuhčâmáánu", "cuáŋuimáánu", "vyesimáánu", "kesimáánu", "syeinimáánu", "porgemáánu", "čohčâmáánu", "roovvâdmáánu", "skammâmáánu", "juovlâmáánu", ""),
                Lists.of("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", ""),
                Lists.of("", "pa", "vu", "ma", "ko", "tu", "vá", "lá"),
                Lists.of("", "pasepeeivi", "vuossaargâ", "majebaargâ", "koskoho", "tuorâstuv", "vástuppeeivi", "lávurduv"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ce() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BCE", "CE"),
                Lists.of("январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь", ""),
                Lists.of("янв", "фев", "мар", "апр", "май", "июн", "июл", "авг", "сен", "окт", "ноя", "дек", ""),
                Lists.of("", "кӀиранан де", "оршотан де", "шинарин де", "кхаарин де", "еарин де", "пӀераскан де", "шот де"),
                Lists.of("", "кӀиранан де", "оршотан де", "шинарин де", "кхаарин де", "еарин де", "пӀераскан де", "шот де"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_az__Cyrl() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BCE", "CE"),
                Lists.of("јанвар", "феврал", "март", "апрел", "май", "ијун", "ијул", "август", "сентјабр", "октјабр", "нојабр", "декабр", ""),
                Lists.of("јанвар", "феврал", "март", "апрел", "май", "ијун", "ијул", "август", "сентјабр", "октјабр", "нојабр", "декабр", ""),
                Lists.of("", "базар", "базар ертәси", "чәршәнбә ахшамы", "чәршәнбә", "ҹүмә ахшамы", "ҹүмә", "шәнбә"),
                Lists.of("", "базар", "базар ертәси", "чәршәнбә ахшамы", "чәршәнбә", "ҹүмә ахшамы", "ҹүмә", "шәнбә"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_lrc() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BCE", "CE"),
                Lists.of("جانڤیە", "فئڤریە", "مارس", "آڤریل", "مئی", "جوٙأن", "جوٙلا", "آگوست", "سئپتامر", "ئوکتوڤر", "نوڤامر", "دئسامر", ""),
                Lists.of("جانڤیە", "فئڤریە", "مارس", "آڤریل", "مئی", "جوٙأن", "جوٙلا", "آگوست", "سئپتامر", "ئوکتوڤر", "نوڤامر", "دئسامر", ""),
                Lists.of("", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"),
                Lists.of("", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_uz__Arab() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BCE", "CE"),
                Lists.of("جنوری", "فبروری", "مارچ", "اپریل", "می", "جون", "جولای", "اگست", "سپتمبر", "اکتوبر", "نومبر", "دسمبر", ""),
                Lists.of("جنو", "فبر", "مار", "اپر", "می", "جون", "جول", "اگس", "سپت", "اکت", "نوم", "دسم", ""),
                Lists.of("", "ی.", "د.", "س.", "چ.", "پ.", "ج.", "ش."),
                Lists.of("", "یکشنبه", "دوشنبه", "سه‌شنبه", "چهارشنبه", "پنجشنبه", "جمعه", "شنبه"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_vai() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("BCE", "CE"),
                Lists.of("ꖨꕪꖃ ꔞꕮ", "ꕒꕡꖝꖕ", "ꕾꖺ", "ꖢꖕ", "ꖑꕱ", "6", "7", "ꗛꔕ", "ꕢꕌ", "ꕭꖃ", "ꔞꘋꕔꕿ ꕸꖃꗏ", "ꖨꕪꕱ ꗏꕮ", ""),
                Lists.of("ꖨꕪꖃ ꔞꕮ", "ꕒꕡꖝꖕ", "ꕾꖺ", "ꖢꖕ", "ꖑꕱ", "6", "7", "ꗛꔕ", "ꕢꕌ", "ꕭꖃ", "ꔞꘋꕔꕿ ꕸꖃꗏ", "ꖨꕪꕱ ꗏꕮ", ""),
                Lists.of("", "ꕞꕌꔵ", "ꗳꗡꘉ", "ꕚꕞꕚ", "ꕉꕞꕒ", "ꕉꔤꕆꕢ", "ꕉꔤꕀꕮ", "ꔻꔬꔳ"),
                Lists.of("", "ꕞꕌꔵ", "ꗳꗡꘉ", "ꕚꕞꕚ", "ꕉꕞꕒ", "ꕉꔤꕆꕢ", "ꕉꔤꕀꕮ", "ꔻꔬꔳ"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_cy() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("CC", "OC"),
                Lists.of("Ionawr", "Chwefror", "Mawrth", "Ebrill", "Mai", "Mehefin", "Gorffennaf", "Awst", "Medi", "Hydref", "Tachwedd", "Rhagfyr", ""),
                Lists.of("Ion", "Chwef", "Maw", "Ebrill", "Mai", "Meh", "Gorff", "Awst", "Medi", "Hyd", "Tach", "Rhag", ""),
                Lists.of("", "Sul", "Llun", "Maw", "Mer", "Iau", "Gwen", "Sad"),
                Lists.of("", "Dydd Sul", "Dydd Llun", "Dydd Mawrth", "Dydd Mercher", "Dydd Iau", "Dydd Gwener", "Dydd Sadwrn"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_bm() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("J.-C. ɲɛ", "ni J.-C."),
                Lists.of("zanwuye", "feburuye", "marisi", "awirili", "mɛ", "zuwɛn", "zuluye", "uti", "sɛtanburu", "ɔkutɔburu", "nowanburu", "desanburu", ""),
                Lists.of("zan", "feb", "mar", "awi", "mɛ", "zuw", "zul", "uti", "sɛt", "ɔku", "now", "des", ""),
                Lists.of("", "kar", "ntɛ", "tar", "ara", "ala", "jum", "sib"),
                Lists.of("", "kari", "ntɛnɛ", "tarata", "araba", "alamisa", "juma", "sibiri"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_eu() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("K.a.", "K.o."),
                Lists.of("urtarrilak", "otsailak", "martxoak", "apirilak", "maiatzak", "ekainak", "uztailak", "abuztuak", "irailak", "urriak", "azaroak", "abenduak", ""),
                Lists.of("urt.", "ots.", "mar.", "api.", "mai.", "eka.", "uzt.", "abu.", "ira.", "urr.", "aza.", "abe.", ""),
                Lists.of("", "ig.", "al.", "ar.", "az.", "og.", "or.", "lr."),
                Lists.of("", "igandea", "astelehena", "asteartea", "asteazkena", "osteguna", "ostirala", "larunbata"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ha() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("KHAI", "BHAI"),
                Lists.of("Janairu", "Faburairu", "Maris", "Afirilu", "Mayu", "Yuni", "Yuli", "Agusta", "Satumba", "Oktoba", "Nuwamba", "Disamba", ""),
                Lists.of("Jan", "Fab", "Mar", "Afi", "May", "Yun", "Yul", "Agu", "Sat", "Okt", "Nuw", "Dis", ""),
                Lists.of("", "Lh", "Li", "Ta", "Lr", "Al", "Ju", "As"),
                Lists.of("", "Lahadi", "Litinin", "Talata", "Laraba", "Alhamis", "Jummaʼa", "Asabar"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_to() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("KM", "TS"),
                Lists.of("Sānuali", "Fēpueli", "Maʻasi", "ʻEpeleli", "Mē", "Sune", "Siulai", "ʻAokosi", "Sepitema", "ʻOkatopa", "Nōvema", "Tīsema", ""),
                Lists.of("Sān", "Fēp", "Maʻa", "ʻEpe", "Mē", "Sun", "Siu", "ʻAok", "Sep", "ʻOka", "Nōv", "Tīs", ""),
                Lists.of("", "Sāp", "Mōn", "Tūs", "Pul", "Tuʻa", "Fal", "Tok"),
                Lists.of("", "Sāpate", "Mōnite", "Tūsite", "Pulelulu", "Tuʻapulelulu", "Falaite", "Tokonaki"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_mt() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("QK", "WK"),
                Lists.of("Jannar", "Frar", "Marzu", "April", "Mejju", "Ġunju", "Lulju", "Awwissu", "Settembru", "Ottubru", "Novembru", "Diċembru", ""),
                Lists.of("Jan", "Fra", "Mar", "Apr", "Mej", "Ġun", "Lul", "Aww", "Set", "Ott", "Nov", "Diċ", ""),
                Lists.of("", "Ħad", "Tne", "Tli", "Erb", "Ħam", "Ġim", "Sib"),
                Lists.of("", "Il-Ħadd", "It-Tnejn", "It-Tlieta", "L-Erbgħa", "Il-Ħamis", "Il-Ġimgħa", "Is-Sibt"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_in() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("SM", "M"),
                Lists.of("Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember", ""),
                Lists.of("Jan", "Feb", "Mar", "Apr", "Mei", "Jun", "Jul", "Agt", "Sep", "Okt", "Nov", "Des", ""),
                Lists.of("", "Min", "Sen", "Sel", "Rab", "Kam", "Jum", "Sab"),
                Lists.of("", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_es_US() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("a. C.", "d. C."),
                Lists.of("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre", ""),
                Lists.of("ene.", "feb.", "mar.", "abr.", "may.", "jun.", "jul.", "ago.", "sep.", "oct.", "nov.", "dic.", ""),
                Lists.of("", "dom.", "lun.", "mar.", "mié.", "jue.", "vie.", "sáb."),
                Lists.of("", "domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_it() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("a.C.", "d.C."),
                Lists.of("gennaio", "febbraio", "marzo", "aprile", "maggio", "giugno", "luglio", "agosto", "settembre", "ottobre", "novembre", "dicembre", ""),
                Lists.of("gen", "feb", "mar", "apr", "mag", "giu", "lug", "ago", "set", "ott", "nov", "dic", ""),
                Lists.of("", "dom", "lun", "mar", "mer", "gio", "ven", "sab"),
                Lists.of("", "domenica", "lunedì", "martedì", "mercoledì", "giovedì", "venerdì", "sabato"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_pt() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("a.C.", "d.C."),
                Lists.of("janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro", ""),
                Lists.of("jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez", ""),
                Lists.of("", "dom", "seg", "ter", "qua", "qui", "sex", "sáb"),
                Lists.of("", "domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sábado"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_fr() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("av. J.-C.", "ap. J.-C."),
                Lists.of("janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre", ""),
                Lists.of("janv.", "févr.", "mars", "avr.", "mai", "juin", "juil.", "août", "sept.", "oct.", "nov.", "déc.", ""),
                Lists.of("", "dim.", "lun.", "mar.", "mer.", "jeu.", "ven.", "sam."),
                Lists.of("", "dimanche", "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_mfe() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("av. Z-K", "ap. Z-K"),
                Lists.of("zanvie", "fevriye", "mars", "avril", "me", "zin", "zilye", "out", "septam", "oktob", "novam", "desam", ""),
                Lists.of("zan", "fev", "mar", "avr", "me", "zin", "zil", "out", "sep", "okt", "nov", "des", ""),
                Lists.of("", "dim", "lin", "mar", "mer", "ze", "van", "sam"),
                Lists.of("", "dimans", "lindi", "mardi", "merkredi", "zedi", "vandredi", "samdi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_az() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("e.ə.", "b.e."),
                Lists.of("yanvar", "fevral", "mart", "aprel", "may", "iyun", "iyul", "avqust", "sentyabr", "oktyabr", "noyabr", "dekabr", ""),
                Lists.of("yan", "fev", "mar", "apr", "may", "iyn", "iyl", "avq", "sen", "okt", "noy", "dek", ""),
                Lists.of("", "B.", "B.E.", "Ç.A.", "Ç.", "C.A.", "C.", "Ş."),
                Lists.of("", "bazar", "bazar ertəsi", "çərşənbə axşamı", "çərşənbə", "cümə axşamı", "cümə", "şənbə"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_et() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("eKr", "pKr"),
                Lists.of("jaanuar", "veebruar", "märts", "aprill", "mai", "juuni", "juuli", "august", "september", "oktoober", "november", "detsember", ""),
                Lists.of("jaan", "veebr", "märts", "apr", "mai", "juuni", "juuli", "aug", "sept", "okt", "nov", "dets", ""),
                Lists.of("", "P", "E", "T", "K", "N", "R", "L"),
                Lists.of("", "pühapäev", "esmaspäev", "teisipäev", "kolmapäev", "neljapäev", "reede", "laupäev"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_fo() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("f.Kr.", "e.Kr."),
                Lists.of("januar", "februar", "mars", "apríl", "mai", "juni", "juli", "august", "september", "oktober", "november", "desember", ""),
                Lists.of("jan.", "feb.", "mar.", "apr.", "mai", "jun.", "jul.", "aug.", "sep.", "okt.", "nov.", "des.", ""),
                Lists.of("", "sun.", "mán.", "týs.", "mik.", "hós.", "frí.", "ley."),
                Lists.of("", "sunnudagur", "mánadagur", "týsdagur", "mikudagur", "hósdagur", "fríggjadagur", "leygardagur"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_da() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("f.Kr.", "e.Kr."),
                Lists.of("januar", "februar", "marts", "april", "maj", "juni", "juli", "august", "september", "oktober", "november", "december", ""),
                Lists.of("jan.", "feb.", "mar.", "apr.", "maj", "jun.", "jul.", "aug.", "sep.", "okt.", "nov.", "dec.", ""),
                Lists.of("", "søn.", "man.", "tir.", "ons.", "tor.", "fre.", "lør."),
                Lists.of("", "søndag", "mandag", "tirsdag", "onsdag", "torsdag", "fredag", "lørdag"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_fy() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("f.Kr.", "n.Kr."),
                Lists.of("jannewaris", "febrewaris", "maart", "april", "maaie", "juny", "july", "augustus", "septimber", "oktober", "novimber", "desimber", ""),
                Lists.of("jan.", "feb.", "mrt.", "apr.", "mai.", "jun.", "jul.", "aug.", "sep.", "okt.", "nov.", "des.", ""),
                Lists.of("", "si", "mo", "ti", "wo", "to", "fr", "so"),
                Lists.of("", "snein", "moandei", "tiisdei", "woansdei", "tongersdei", "freed", "sneon"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_pl() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("p.n.e.", "n.e."),
                Lists.of("stycznia", "lutego", "marca", "kwietnia", "maja", "czerwca", "lipca", "sierpnia", "września", "października", "listopada", "grudnia", ""),
                Lists.of("sty", "lut", "mar", "kwi", "maj", "cze", "lip", "sie", "wrz", "paź", "lis", "gru", ""),
                Lists.of("", "niedz.", "pon.", "wt.", "śr.", "czw.", "pt.", "sob."),
                Lists.of("", "niedziela", "poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_hr() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("pr. Kr.", "p. Kr."),
                Lists.of("siječnja", "veljače", "ožujka", "travnja", "svibnja", "lipnja", "srpnja", "kolovoza", "rujna", "listopada", "studenoga", "prosinca", ""),
                Lists.of("sij", "velj", "ožu", "tra", "svi", "lip", "srp", "kol", "ruj", "lis", "stu", "pro", ""),
                Lists.of("", "ned", "pon", "uto", "sri", "čet", "pet", "sub"),
                Lists.of("", "nedjelja", "ponedjeljak", "utorak", "srijeda", "četvrtak", "petak", "subota"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_sk() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("pred Kr.", "po Kr."),
                Lists.of("januára", "februára", "marca", "apríla", "mája", "júna", "júla", "augusta", "septembra", "októbra", "novembra", "decembra", ""),
                Lists.of("jan", "feb", "mar", "apr", "máj", "jún", "júl", "aug", "sep", "okt", "nov", "dec", ""),
                Lists.of("", "ne", "po", "ut", "st", "št", "pi", "so"),
                Lists.of("", "nedeľa", "pondelok", "utorok", "streda", "štvrtok", "piatok", "sobota"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_wae() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("v. Chr.", "n. Chr"),
                Lists.of("Jenner", "Hornig", "Märze", "Abrille", "Meije", "Bráčet", "Heiwet", "Öigšte", "Herbštmánet", "Wímánet", "Wintermánet", "Chrištmánet", ""),
                Lists.of("Jen", "Hor", "Mär", "Abr", "Mei", "Brá", "Hei", "Öig", "Her", "Wím", "Win", "Chr", ""),
                Lists.of("", "Sun", "Män", "Ziš", "Mit", "Fró", "Fri", "Sam"),
                Lists.of("", "Sunntag", "Mäntag", "Zištag", "Mittwuč", "Fróntag", "Fritag", "Samštag"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_uz__Cyrl() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("М.А.", "Э"),
                Lists.of("Январ", "Феврал", "Март", "Апрел", "Май", "Июн", "Июл", "Август", "Сентябр", "Октябр", "Ноябр", "Декабр", ""),
                Lists.of("Янв", "Фев", "Мар", "Апр", "Май", "Июн", "Июл", "Авг", "Сен", "Окт", "Ноя", "Дек", ""),
                Lists.of("", "Якш", "Душ", "Сеш", "Чор", "Пай", "Жум", "Шан"),
                Lists.of("", "якшанба", "душанба", "сешанба", "чоршанба", "пайшанба", "жума", "шанба"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_sr_CS() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("п. н. е.", "н. е"),
                Lists.of("јануар", "фебруар", "март", "април", "мај", "јун", "јул", "август", "септембар", "октобар", "новембар", "децембар", ""),
                Lists.of("јан", "феб", "мар", "апр", "мај", "јун", "јул", "авг", "сеп", "окт", "нов", "дец", ""),
                Lists.of("", "нед", "пон", "уто", "сре", "чет", "пет", "суб"),
                Lists.of("", "недеља", "понедељак", "уторак", "среда", "четвртак", "петак", "субота"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_sr_BA() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("п. н. е.", "н. е"),
                Lists.of("јануар", "фебруар", "март", "април", "мај", "јуни", "јули", "август", "септембар", "октобар", "новембар", "децембар", ""),
                Lists.of("јан", "феб", "мар", "апр", "мај", "јун", "јул", "авг", "сеп", "окт", "нов", "дец", ""),
                Lists.of("", "нед", "пон", "уто", "сри", "чет", "пет", "суб"),
                Lists.of("", "недеља", "понедељак", "уторак", "сриједа", "четвртак", "петак", "субота"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_hy() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("մ.թ.ա.", "մ.թ."),
                Lists.of("հունվարի", "փետրվարի", "մարտի", "ապրիլի", "մայիսի", "հունիսի", "հուլիսի", "օգոստոսի", "սեպտեմբերի", "հոկտեմբերի", "նոյեմբերի", "դեկտեմբերի", ""),
                Lists.of("հնվ", "փտվ", "մրտ", "ապր", "մյս", "հնս", "հլս", "օգս", "սեպ", "հոկ", "նոյ", "դեկ", ""),
                Lists.of("", "կիր", "երկ", "երք", "չրք", "հնգ", "ուր", "շբթ"),
                Lists.of("", "կիրակի", "երկուշաբթի", "երեքշաբթի", "չորեքշաբթի", "հինգշաբթի", "ուրբաթ", "շաբաթ"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_pa__Arab() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("ايساپورو", "سں"),
                Lists.of("جنوری", "فروری", "مارچ", "اپریل", "مئ", "جون", "جولائی", "اگست", "ستمبر", "اکتوبر", "نومبر", "دسمبر", ""),
                Lists.of("جنوری", "فروری", "مارچ", "اپریل", "مئ", "جون", "جولائی", "اگست", "ستمبر", "اکتوبر", "نومبر", "دسمبر", ""),
                Lists.of("", "اتوار", "پیر", "منگل", "بُدھ", "جمعرات", "جمعہ", "ہفتہ"),
                Lists.of("", "اتوار", "پیر", "منگل", "بُدھ", "جمعرات", "جمعہ", "ہفتہ"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ks() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("بی سی", "اے ڈی"),
                Lists.of("جنؤری", "فرؤری", "مارٕچ", "اپریل", "میٔ", "جوٗن", "جوٗلایی", "اگست", "ستمبر", "اکتوٗبر", "نومبر", "دسمبر", ""),
                Lists.of("جنؤری", "فرؤری", "مارٕچ", "اپریل", "میٔ", "جوٗن", "جوٗلایی", "اگست", "ستمبر", "اکتوٗبر", "نومبر", "دسمبر", ""),
                Lists.of("", "آتھوار", "ژٔنٛدٕروار", "بوٚموار", "بودوار", "برٛٮ۪سوار", "جُمہ", "بٹوار"),
                Lists.of("", "اَتھوار", "ژٔنٛدرٕروار", "بوٚموار", "بودوار", "برٛٮ۪سوار", "جُمہ", "بٹوار"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_mzn() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("پ.م", "م."),
                Lists.of("ژانویه", "فوریه", "مارس", "آوریل", "مه", "ژوئن", "ژوئیه", "اوت", "سپتامبر", "اکتبر", "نوامبر", "دسامبر", ""),
                Lists.of("ژانویه", "فوریه", "مارس", "آوریل", "مه", "ژوئن", "ژوئیه", "اوت", "سپتامبر", "اکتبر", "نوامبر", "دسامبر", ""),
                Lists.of("", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"),
                Lists.of("", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_gu() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("ઈ.સ.પૂર્વે", "ઈ.સ."),
                Lists.of("જાન્યુઆરી", "ફેબ્રુઆરી", "માર્ચ", "એપ્રિલ", "મે", "જૂન", "જુલાઈ", "ઑગસ્ટ", "સપ્ટેમ્બર", "ઑક્ટોબર", "નવેમ્બર", "ડિસેમ્બર", ""),
                Lists.of("જાન્યુ", "ફેબ્રુ", "માર્ચ", "એપ્રિલ", "મે", "જૂન", "જુલાઈ", "ઑગસ્ટ", "સપ્ટે", "ઑક્ટો", "નવે", "ડિસે", ""),
                Lists.of("", "રવિ", "સોમ", "મંગળ", "બુધ", "ગુરુ", "શુક્ર", "શનિ"),
                Lists.of("", "રવિવાર", "સોમવાર", "મંગળવાર", "બુધવાર", "ગુરુવાર", "શુક્રવાર", "શનિવાર"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ml() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("ക്രി.മു.", "എഡി"),
                Lists.of("ജനുവരി", "ഫെബ്രുവരി", "മാർച്ച്", "ഏപ്രിൽ", "മേയ്", "ജൂൺ", "ജൂലൈ", "ഓഗസ്റ്റ്", "സെപ്റ്റംബർ", "ഒക്‌ടോബർ", "നവംബർ", "ഡിസംബർ", ""),
                Lists.of("ജനു", "ഫെബ്രു", "മാർ", "ഏപ്രി", "മേയ്", "ജൂൺ", "ജൂലൈ", "ഓഗ", "സെപ്റ്റം", "ഒക്ടോ", "നവം", "ഡിസം", ""),
                Lists.of("", "ഞായർ", "തിങ്കൾ", "ചൊവ്വ", "ബുധൻ", "വ്യാഴം", "വെള്ളി", "ശനി"),
                Lists.of("", "ഞായറാഴ്‌ച", "തിങ്കളാഴ്‌ച", "ചൊവ്വാഴ്ച", "ബുധനാഴ്‌ച", "വ്യാഴാഴ്‌ച", "വെള്ളിയാഴ്‌ച", "ശനിയാഴ്‌ച"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ka() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AM", "PM"),
                Lists.of("ძვ. წ.", "ახ. წ."),
                Lists.of("იანვარი", "თებერვალი", "მარტი", "აპრილი", "მაისი", "ივნისი", "ივლისი", "აგვისტო", "სექტემბერი", "ოქტომბერი", "ნოემბერი", "დეკემბერი", ""),
                Lists.of("იან", "თებ", "მარ", "აპრ", "მაი", "ივნ", "ივლ", "აგვ", "სექ", "ოქტ", "ნოე", "დეკ", ""),
                Lists.of("", "კვი", "ორშ", "სამ", "ოთხ", "ხუთ", "პარ", "შაბ"),
                Lists.of("", "კვირა", "ორშაბათი", "სამშაბათი", "ოთხშაბათი", "ხუთშაბათი", "პარასკევი", "შაბათი"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ak() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("AN", "EW"),
                Lists.of("AK", "KE"),
                Lists.of("Sanda-Ɔpɛpɔn", "Kwakwar-Ɔgyefuo", "Ebɔw-Ɔbenem", "Ebɔbira-Oforisuo", "Esusow Aketseaba-Kɔtɔnimba", "Obirade-Ayɛwohomumu", "Ayɛwoho-Kitawonsa", "Difuu-Ɔsandaa", "Fankwa-Ɛbɔ", "Ɔbɛsɛ-Ahinime", "Ɔberɛfɛw-Obubuo", "Mumu-Ɔpɛnimba", ""),
                Lists.of("S-Ɔ", "K-Ɔ", "E-Ɔ", "E-O", "E-K", "O-A", "A-K", "D-Ɔ", "F-Ɛ", "Ɔ-A", "Ɔ-O", "M-Ɔ", ""),
                Lists.of("", "Kwe", "Dwo", "Ben", "Wuk", "Yaw", "Fia", "Mem"),
                Lists.of("", "Kwesida", "Dwowda", "Benada", "Wukuda", "Yawda", "Fida", "Memeneda"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_khq() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("Adduha", "Aluula"),
                Lists.of("IJ", "IZ"),
                Lists.of("Žanwiye", "Feewiriye", "Marsi", "Awiril", "Me", "Žuweŋ", "Žuyye", "Ut", "Sektanbur", "Oktoobur", "Noowanbur", "Deesanbur", ""),
                Lists.of("Žan", "Fee", "Mar", "Awi", "Me", "Žuw", "Žuy", "Ut", "Sek", "Okt", "Noo", "Dee", ""),
                Lists.of("", "Alh", "Ati", "Ata", "Ala", "Alm", "Alj", "Ass"),
                Lists.of("", "Alhadi", "Atini", "Atalata", "Alarba", "Alhamiisa", "Aljuma", "Assabdu"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ses() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("Adduha", "Aluula"),
                Lists.of("IJ", "IZ"),
                Lists.of("Žanwiye", "Feewiriye", "Marsi", "Awiril", "Me", "Žuweŋ", "Žuyye", "Ut", "Sektanbur", "Oktoobur", "Noowanbur", "Deesanbur", ""),
                Lists.of("Žan", "Fee", "Mar", "Awi", "Me", "Žuw", "Žuy", "Ut", "Sek", "Okt", "Noo", "Dee", ""),
                Lists.of("", "Alh", "Ati", "Ata", "Ala", "Alm", "Alz", "Asi"),
                Lists.of("", "Alhadi", "Atinni", "Atalaata", "Alarba", "Alhamiisa", "Alzuma", "Asibti"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_lu() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("Dinda", "Dilolo"),
                Lists.of("kmp. Y.K.", "kny. Y. K."),
                Lists.of("Ciongo", "Lùishi", "Lusòlo", "Mùuyà", "Lumùngùlù", "Lufuimi", "Kabàlàshìpù", "Lùshìkà", "Lutongolo", "Lungùdi", "Kaswèkèsè", "Ciswà", ""),
                Lists.of("Cio", "Lui", "Lus", "Muu", "Lum", "Luf", "Kab", "Lush", "Lut", "Lun", "Kas", "Cis", ""),
                Lists.of("", "Lum", "Nko", "Ndy", "Ndg", "Njw", "Ngv", "Lub"),
                Lists.of("", "Lumingu", "Nkodya", "Ndàayà", "Ndangù", "Njòwa", "Ngòvya", "Lubingu"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_bas() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("I bikɛ̂glà", "I ɓugajɔp"),
                Lists.of("b.Y.K", "m.Y.K"),
                Lists.of("Kɔndɔŋ", "Màcɛ̂l", "Màtùmb", "Màtop", "M̀puyɛ", "Hìlòndɛ̀", "Njèbà", "Hìkaŋ", "Dìpɔ̀s", "Bìòôm", "Màyɛsèp", "Lìbuy li ńyèe", ""),
                Lists.of("kɔn", "mac", "mat", "mto", "mpu", "hil", "nje", "hik", "dip", "bio", "may", "liɓ", ""),
                Lists.of("", "nɔy", "nja", "uum", "ŋge", "mbɔ", "kɔɔ", "jon"),
                Lists.of("", "ŋgwà nɔ̂y", "ŋgwà njaŋgumba", "ŋgwà ûm", "ŋgwà ŋgê", "ŋgwà mbɔk", "ŋgwà kɔɔ", "ŋgwà jôn"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ebu() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("KI", "UT"),
                Lists.of("MK", "TK"),
                Lists.of("Mweri wa mbere", "Mweri wa kaĩri", "Mweri wa kathatũ", "Mweri wa kana", "Mweri wa gatano", "Mweri wa gatantatũ", "Mweri wa mũgwanja", "Mweri wa kanana", "Mweri wa kenda", "Mweri wa ikũmi", "Mweri wa ikũmi na ũmwe", "Mweri wa ikũmi na Kaĩrĩ", ""),
                Lists.of("Mbe", "Kai", "Kat", "Kan", "Gat", "Gan", "Mug", "Knn", "Ken", "Iku", "Imw", "Igi", ""),
                Lists.of("", "Kma", "Tat", "Ine", "Tan", "Arm", "Maa", "NMM"),
                Lists.of("", "Kiumia", "Njumatatu", "Njumaine", "Njumatano", "Aramithi", "Njumaa", "NJumamothii"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ki() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("Kiroko", "Hwaĩ-inĩ"),
                Lists.of("MK", "TK"),
                Lists.of("Njenuarĩ", "Mwere wa kerĩ", "Mwere wa gatatũ", "Mwere wa kana", "Mwere wa gatano", "Mwere wa gatandatũ", "Mwere wa mũgwanja", "Mwere wa kanana", "Mwere wa kenda", "Mwere wa ikũmi", "Mwere wa ikũmi na ũmwe", "Ndithemba", ""),
                Lists.of("JEN", "WKR", "WGT", "WKN", "WTN", "WTD", "WMJ", "WNN", "WKD", "WIK", "WMW", "DIT", ""),
                Lists.of("", "KMA", "NTT", "NMN", "NMT", "ART", "NMA", "NMM"),
                Lists.of("", "Kiumia", "Njumatatũ", "Njumaine", "Njumatana", "Aramithi", "Njumaa", "Njumamothi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_dav() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("Luma lwa K", "luma lwa p"),
                Lists.of("KK", "BK"),
                Lists.of("Mori ghwa imbiri", "Mori ghwa kawi", "Mori ghwa kadadu", "Mori ghwa kana", "Mori ghwa kasanu", "Mori ghwa karandadu", "Mori ghwa mfungade", "Mori ghwa wunyanya", "Mori ghwa ikenda", "Mori ghwa ikumi", "Mori ghwa ikumi na imweri", "Mori ghwa ikumi na iwi", ""),
                Lists.of("Imb", "Kaw", "Kad", "Kan", "Kas", "Kar", "Mfu", "Wun", "Ike", "Iku", "Imw", "Iwi", ""),
                Lists.of("", "Jum", "Jim", "Kaw", "Kad", "Kan", "Kas", "Ngu"),
                Lists.of("", "Ituku ja jumwa", "Kuramuka jimweri", "Kuramuka kawi", "Kuramuka kadadu", "Kuramuka kana", "Kuramuka kasanu", "Kifula nguwo"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_sbp() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("Lwamilawu", "Pashamihe"),
                Lists.of("AK", "PK"),
                Lists.of("Mupalangulwa", "Mwitope", "Mushende", "Munyi", "Mushende Magali", "Mujimbi", "Mushipepo", "Mupuguto", "Munyense", "Mokhu", "Musongandembwe", "Muhaano", ""),
                Lists.of("Mup", "Mwi", "Msh", "Mun", "Mag", "Muj", "Msp", "Mpg", "Mye", "Mok", "Mus", "Muh", ""),
                Lists.of("", "Mul", "Jtt", "Jnn", "Jtn", "Alh", "Iju", "Jmo"),
                Lists.of("", "Mulungu", "Jumatatu", "Jumanne", "Jumatano", "Alahamisi", "Ijumaa", "Jumamosi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_guz() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("Mambia", "Mog"),
                Lists.of("YA", "YK"),
                Lists.of("Chanuari", "Feburari", "Machi", "Apiriri", "Mei", "Juni", "Chulai", "Agosti", "Septemba", "Okitoba", "Nobemba", "Disemba", ""),
                Lists.of("Can", "Feb", "Mac", "Apr", "Mei", "Jun", "Cul", "Agt", "Sep", "Okt", "Nob", "Dis", ""),
                Lists.of("", "Cpr", "Ctt", "Cmn", "Cmt", "Ars", "Icm", "Est"),
                Lists.of("", "Chumapiri", "Chumatato", "Chumaine", "Chumatano", "Aramisi", "Ichuma", "Esabato"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_kde() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("Muhi", "Chilo"),
                Lists.of("AY", "NY"),
                Lists.of("Mwedi Ntandi", "Mwedi wa Pili", "Mwedi wa Tatu", "Mwedi wa Nchechi", "Mwedi wa Nnyano", "Mwedi wa Nnyano na Umo", "Mwedi wa Nnyano na Mivili", "Mwedi wa Nnyano na Mitatu", "Mwedi wa Nnyano na Nchechi", "Mwedi wa Nnyano na Nnyano", "Mwedi wa Nnyano na Nnyano na U", "Mwedi wa Nnyano na Nnyano na M", ""),
                Lists.of("Jan", "Feb", "Mac", "Apr", "Mei", "Jun", "Jul", "Ago", "Sep", "Okt", "Nov", "Des", ""),
                Lists.of("", "Ll2", "Ll3", "Ll4", "Ll5", "Ll6", "Ll7", "Ll1"),
                Lists.of("", "Liduva lyapili", "Liduva lyatatu", "Liduva lyanchechi", "Liduva lyannyano", "Liduva lyannyano na linji", "Liduva lyannyano na mavili", "Liduva litandi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_xog() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("Munkyo", "Eigulo"),
                Lists.of("AZ", "AF"),
                Lists.of("Janwaliyo", "Febwaliyo", "Marisi", "Apuli", "Maayi", "Juuni", "Julaayi", "Agusito", "Sebuttemba", "Okitobba", "Novemba", "Desemba", ""),
                Lists.of("Jan", "Feb", "Mar", "Apu", "Maa", "Juu", "Jul", "Agu", "Seb", "Oki", "Nov", "Des", ""),
                Lists.of("", "Sabi", "Bala", "Kubi", "Kusa", "Kuna", "Kuta", "Muka"),
                Lists.of("", "Sabiiti", "Balaza", "Owokubili", "Owokusatu", "Olokuna", "Olokutaanu", "Olomukaaga"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_sg() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ND", "LK"),
                Lists.of("KnK", "NpK"),
                Lists.of("Nyenye", "Fulundïgi", "Mbängü", "Ngubùe", "Bêläwü", "Föndo", "Lengua", "Kükürü", "Mvuka", "Ngberere", "Nabändüru", "Kakauka", ""),
                Lists.of("Nye", "Ful", "Mbä", "Ngu", "Bêl", "Fön", "Len", "Kük", "Mvu", "Ngb", "Nab", "Kak", ""),
                Lists.of("", "Bk1", "Bk2", "Bk3", "Bk4", "Bk5", "Lâp", "Lây"),
                Lists.of("", "Bikua-ôko", "Bïkua-ûse", "Bïkua-ptâ", "Bïkua-usïö", "Bïkua-okü", "Lâpôsö", "Lâyenga"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_luo() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("OD", "OT"),
                Lists.of("BC", "AD"),
                Lists.of("Dwe mar Achiel", "Dwe mar Ariyo", "Dwe mar Adek", "Dwe mar Ang’wen", "Dwe mar Abich", "Dwe mar Auchiel", "Dwe mar Abiriyo", "Dwe mar Aboro", "Dwe mar Ochiko", "Dwe mar Apar", "Dwe mar gi achiel", "Dwe mar Apar gi ariyo", ""),
                Lists.of("DAC", "DAR", "DAD", "DAN", "DAH", "DAU", "DAO", "DAB", "DOC", "DAP", "DGI", "DAG", ""),
                Lists.of("", "JMP", "WUT", "TAR", "TAD", "TAN", "TAB", "NGS"),
                Lists.of("", "Jumapil", "Wuok Tich", "Tich Ariyo", "Tich Adek", "Tich Ang’wen", "Tich Abich", "Ngeso"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ms() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("PG", "PTG"),
                Lists.of("S.M.", "TM"),
                Lists.of("Januari", "Februari", "Mac", "April", "Mei", "Jun", "Julai", "Ogos", "September", "Oktober", "November", "Disember", ""),
                Lists.of("Jan", "Feb", "Mac", "Apr", "Mei", "Jun", "Jul", "Ogo", "Sep", "Okt", "Nov", "Dis", ""),
                Lists.of("", "Ahd", "Isn", "Sel", "Rab", "Kha", "Jum", "Sab"),
                Lists.of("", "Ahad", "Isnin", "Selasa", "Rabu", "Khamis", "Jumaat", "Sabtu"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_nus() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("RW", "TŊ"),
                Lists.of("AY", "ƐY"),
                Lists.of("Tiop thar pɛt", "Pɛt", "Duɔ̱ɔ̱ŋ", "Guak", "Duät", "Kornyoot", "Pay yie̱tni", "Tho̱o̱r", "Tɛɛr", "Laath", "Kur", "Tio̱p in di̱i̱t", ""),
                Lists.of("Tiop", "Pɛt", "Duɔ̱ɔ̱", "Guak", "Duä", "Kor", "Pay", "Thoo", "Tɛɛ", "Laa", "Kur", "Tid", ""),
                Lists.of("", "Cäŋ", "Jiec", "Rɛw", "Diɔ̱k", "Ŋuaan", "Dhieec", "Bäkɛl"),
                Lists.of("", "Cäŋ kuɔth", "Jiec la̱t", "Rɛw lätni", "Diɔ̱k lätni", "Ŋuaan lätni", "Dhieec lätni", "Bäkɛl lätni"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_mer() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("RŨ", "ŨG"),
                Lists.of("MK", "NK"),
                Lists.of("Januarĩ", "Feburuarĩ", "Machi", "Ĩpurũ", "Mĩĩ", "Njuni", "Njuraĩ", "Agasti", "Septemba", "Oktũba", "Novemba", "Dicemba", ""),
                Lists.of("JAN", "FEB", "MAC", "ĨPU", "MĨĨ", "NJU", "NJR", "AGA", "SPT", "OKT", "NOV", "DEC", ""),
                Lists.of("", "KIU", "MRA", "WAI", "WET", "WEN", "WTN", "JUM"),
                Lists.of("", "Kiumia", "Muramuko", "Wairi", "Wethatu", "Wena", "Wetano", "Jumamosi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_vi() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("SA", "CH"),
                Lists.of("tr. CN", "sau CN"),
                Lists.of("tháng 1", "tháng 2", "tháng 3", "tháng 4", "tháng 5", "tháng 6", "tháng 7", "tháng 8", "tháng 9", "tháng 10", "tháng 11", "tháng 12", ""),
                Lists.of("thg 1", "thg 2", "thg 3", "thg 4", "thg 5", "thg 6", "thg 7", "thg 8", "thg 9", "thg 10", "thg 11", "thg 12", ""),
                Lists.of("", "CN", "Th 2", "Th 3", "Th 4", "Th 5", "Th 6", "Th 7"),
                Lists.of("", "Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_twq() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("Subbaahi", "Zaarikay b"),
                Lists.of("IJ", "IZ"),
                Lists.of("Žanwiye", "Feewiriye", "Marsi", "Awiril", "Me", "Žuweŋ", "Žuyye", "Ut", "Sektanbur", "Oktoobur", "Noowanbur", "Deesanbur", ""),
                Lists.of("Žan", "Fee", "Mar", "Awi", "Me", "Žuw", "Žuy", "Ut", "Sek", "Okt", "Noo", "Dee", ""),
                Lists.of("", "Alh", "Ati", "Ata", "Ala", "Alm", "Alz", "Asi"),
                Lists.of("", "Alhadi", "Atinni", "Atalaata", "Alarba", "Alhamiisa", "Alzuma", "Asibti"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_dje() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("Subbaahi", "Zaarikay b"),
                Lists.of("IJ", "IZ"),
                Lists.of("Žanwiye", "Feewiriye", "Marsi", "Awiril", "Me", "Žuweŋ", "Žuyye", "Ut", "Sektanbur", "Oktoobur", "Noowanbur", "Deesanbur", ""),
                Lists.of("Žan", "Fee", "Mar", "Awi", "Me", "Žuw", "Žuy", "Ut", "Sek", "Okt", "Noo", "Dee", ""),
                Lists.of("", "Alh", "Ati", "Ata", "Ala", "Alm", "Alz", "Asi"),
                Lists.of("", "Alhadi", "Atinni", "Atalaata", "Alarba", "Alhamisi", "Alzuma", "Asibti"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_uz() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("TO", "TK"),
                Lists.of("m.a.", "milodiy"),
                Lists.of("yanvar", "fevral", "mart", "aprel", "may", "iyun", "iyul", "avgust", "Sentabr", "Oktabr", "noyabr", "dekabr", ""),
                Lists.of("yan", "fev", "mar", "apr", "may", "iyn", "iyl", "avg", "sen", "okt", "noy", "dek", ""),
                Lists.of("", "Ya", "Du", "Se", "Ch", "Pa", "Ju", "Sh"),
                Lists.of("", "yakshanba", "dushanba", "seshanba", "chorshanba", "payshanba", "juma", "shanba"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_lag() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("TOO", "MUU"),
                Lists.of("KSA", "KA"),
                Lists.of("Kʉfúngatɨ", "Kʉnaanɨ", "Kʉkeenda", "Kwiikumi", "Kwiinyambála", "Kwiidwaata", "Kʉmʉʉnchɨ", "Kʉvɨɨrɨ", "Kʉsaatʉ", "Kwiinyi", "Kʉsaano", "Kʉsasatʉ", ""),
                Lists.of("Fúngatɨ", "Naanɨ", "Keenda", "Ikúmi", "Inyambala", "Idwaata", "Mʉʉnchɨ", "Vɨɨrɨ", "Saatʉ", "Inyi", "Saano", "Sasatʉ", ""),
                Lists.of("", "Píili", "Táatu", "Íne", "Táano", "Alh", "Ijm", "Móosi"),
                Lists.of("", "Jumapíiri", "Jumatátu", "Jumaíne", "Jumatáano", "Alamíisi", "Ijumáa", "Jumamóosi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_teo() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("Taparachu", "Ebongi"),
                Lists.of("KK", "BK"),
                Lists.of("Orara", "Omuk", "Okwamg’", "Odung’el", "Omaruk", "Omodok’king’ol", "Ojola", "Opedel", "Osokosokoma", "Otibar", "Olabor", "Opoo", ""),
                Lists.of("Rar", "Muk", "Kwa", "Dun", "Mar", "Mod", "Jol", "Ped", "Sok", "Tib", "Lab", "Poo", ""),
                Lists.of("", "Jum", "Bar", "Aar", "Uni", "Ung", "Kan", "Sab"),
                Lists.of("", "Nakaejuma", "Nakaebarasa", "Nakaare", "Nakauni", "Nakaung’on", "Nakakany", "Nakasabiti"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_saq() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("Tesiran", "Teipa"),
                Lists.of("KK", "BK"),
                Lists.of("Lapa le obo", "Lapa le waare", "Lapa le okuni", "Lapa le ong’wan", "Lapa le imet", "Lapa le ile", "Lapa le sapa", "Lapa le isiet", "Lapa le saal", "Lapa le tomon", "Lapa le tomon obo", "Lapa le tomon waare", ""),
                Lists.of("Obo", "Waa", "Oku", "Ong", "Ime", "Ile", "Sap", "Isi", "Saa", "Tom", "Tob", "Tow", ""),
                Lists.of("", "Are", "Kun", "Ong", "Ine", "Ile", "Sap", "Kwe"),
                Lists.of("", "Mderot ee are", "Mderot ee kuni", "Mderot ee ong’wan", "Mderot ee inet", "Mderot ee ile", "Mderot ee sapa", "Mderot ee kwe"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ksh() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("Uhr vörmiddaachs", "Uhr nommendaachs"),
                Lists.of("v. Chr.", "n. Chr."),
                Lists.of("Jannewa", "Fäbrowa", "Määz", "Aprell", "Mäi", "Juuni", "Juuli", "Oujoß", "Septämber", "Oktoober", "Novämber", "Dezämber", ""),
                Lists.of("Jan", "Fäb", "Mäz", "Apr", "Mäi", "Jun", "Jul", "Ouj", "Säp", "Okt", "Nov", "Dez", ""),
                Lists.of("", "Su.", "Mo.", "Di.", "Me.", "Du.", "Fr.", "Sa."),
                Lists.of("", "Sunndaach", "Moondaach", "Dinnsdaach", "Metwoch", "Dunnersdaach", "Friidaach", "Samsdaach"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_om() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("WD", "WB"),
                Lists.of("KD", "KB"),
                Lists.of("Amajjii", "Guraandhala", "Bitooteessa", "Elba", "Caamsa", "Waxabajjii", "Adooleessa", "Hagayya", "Fuulbana", "Onkololeessa", "Sadaasa", "Muddee", ""),
                Lists.of("Ama", "Gur", "Bit", "Elb", "Cam", "Wax", "Ado", "Hag", "Ful", "Onk", "Sad", "Mud", ""),
                Lists.of("", "Dil", "Wix", "Qib", "Rob", "Kam", "Jim", "San"),
                Lists.of("", "Dilbata", "Wiixata", "Qibxata", "Roobii", "Kamiisa", "Jimaata", "Sanbata"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_rn() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("Z.MU.", "Z.MW."),
                Lists.of("Mb.Y.", "Ny.Y"),
                Lists.of("Nzero", "Ruhuhuma", "Ntwarante", "Ndamukiza", "Rusama", "Ruheshi", "Mukakaro", "Nyandagaro", "Nyakanga", "Gitugutu", "Munyonyo", "Kigarama", ""),
                Lists.of("Mut.", "Gas.", "Wer.", "Mat.", "Gic.", "Kam.", "Nya.", "Kan.", "Nze.", "Ukw.", "Ugu.", "Uku.", ""),
                Lists.of("", "cu.", "mbe.", "kab.", "gtu.", "kan.", "gnu.", "gnd."),
                Lists.of("", "Ku w’indwi", "Ku wa mbere", "Ku wa kabiri", "Ku wa gatatu", "Ku wa kane", "Ku wa gatanu", "Ku wa gatandatu"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_tzm() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("Zdat azal", "Ḍeffir aza"),
                Lists.of("ZƐ", "ḌƐ"),
                Lists.of("Yennayer", "Yebrayer", "Mars", "Ibrir", "Mayyu", "Yunyu", "Yulyuz", "Ɣuct", "Cutanbir", "Kṭuber", "Nwanbir", "Dujanbir", ""),
                Lists.of("Yen", "Yeb", "Mar", "Ibr", "May", "Yun", "Yul", "Ɣuc", "Cut", "Kṭu", "Nwa", "Duj", ""),
                Lists.of("", "Asa", "Ayn", "Asn", "Akr", "Akw", "Asm", "Asḍ"),
                Lists.of("", "Asamas", "Aynas", "Asinas", "Akras", "Akwas", "Asimwas", "Asiḍyas"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_te() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("[AM]", "[PM]"),
                Lists.of("క్రీపూ", "క్రీశ"),
                Lists.of("జనవరి", "ఫిబ్రవరి", "మార్చి", "ఏప్రిల్", "మే", "జూన్", "జులై", "ఆగస్టు", "సెప్టెంబర్", "అక్టోబర్", "నవంబర్", "డిసెంబర్", ""),
                Lists.of("జన", "ఫిబ్ర", "మార్చి", "ఏప్రి", "మే", "జూన్", "జులై", "ఆగ", "సెప్టెం", "అక్టో", "నవం", "డిసెం", ""),
                Lists.of("", "ఆది", "సోమ", "మంగళ", "బుధ", "గురు", "శుక్ర", "శని"),
                Lists.of("", "ఆదివారం", "సోమవారం", "మంగళవారం", "బుధవారం", "గురువారం", "శుక్రవారం", "శనివారం"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_es() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("a. m.", "p. m."),
                Lists.of("a. C.", "d. C."),
                Lists.of("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre", ""),
                Lists.of("ene.", "feb.", "mar.", "abr.", "may.", "jun.", "jul.", "ago.", "sept.", "oct.", "nov.", "dic.", ""),
                Lists.of("", "dom.", "lun.", "mar.", "mié.", "jue.", "vie.", "sáb."),
                Lists.of("", "domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ca() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("a. m.", "p. m."),
                Lists.of("aC", "dC"),
                Lists.of("de gener", "de febrer", "de març", "d’abril", "de maig", "de juny", "de juliol", "d’agost", "de setembre", "d’octubre", "de novembre", "de desembre", ""),
                Lists.of("gen.", "febr.", "març", "abr.", "maig", "juny", "jul.", "ag.", "set.", "oct.", "nov.", "des.", ""),
                Lists.of("", "dg.", "dl.", "dt.", "dc.", "dj.", "dv.", "ds."),
                Lists.of("", "diumenge", "dilluns", "dimarts", "dimecres", "dijous", "divendres", "dissabte"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_fur() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("a.", "p."),
                Lists.of("pdC", "ddC"),
                Lists.of("Zenâr", "Fevrâr", "Març", "Avrîl", "Mai", "Jugn", "Lui", "Avost", "Setembar", "Otubar", "Novembar", "Dicembar", ""),
                Lists.of("Zen", "Fev", "Mar", "Avr", "Mai", "Jug", "Lui", "Avo", "Set", "Otu", "Nov", "Dic", ""),
                Lists.of("", "dom", "lun", "mar", "mie", "joi", "vin", "sab"),
                Lists.of("", "domenie", "lunis", "martars", "miercus", "joibe", "vinars", "sabide"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_agq() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("a.g", "a.k"),
                Lists.of("SK", "BK"),
                Lists.of("ndzɔ̀ŋɔ̀nùm", "ndzɔ̀ŋɔ̀kƗ̀zùʔ", "ndzɔ̀ŋɔ̀tƗ̀dʉ̀ghà", "ndzɔ̀ŋɔ̀tǎafʉ̄ghā", "ndzɔ̀ŋèsèe", "ndzɔ̀ŋɔ̀nzùghò", "ndzɔ̀ŋɔ̀dùmlo", "ndzɔ̀ŋɔ̀kwîfɔ̀e", "ndzɔ̀ŋɔ̀tƗ̀fʉ̀ghàdzughù", "ndzɔ̀ŋɔ̀ghǔuwelɔ̀m", "ndzɔ̀ŋɔ̀chwaʔàkaa wo", "ndzɔ̀ŋèfwòo", ""),
                Lists.of("nùm", "kɨz", "tɨd", "taa", "see", "nzu", "dum", "fɔe", "dzu", "lɔm", "kaa", "fwo", ""),
                Lists.of("", "nts", "kpa", "ghɔ", "tɔm", "ume", "ghɨ", "dzk"),
                Lists.of("", "tsuʔntsɨ", "tsuʔukpà", "tsuʔughɔe", "tsuʔutɔ̀mlò", "tsuʔumè", "tsuʔughɨ̂m", "tsuʔndzɨkɔʔɔ"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_luy() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("a.m.", "p.m."),
                Lists.of("BC", "AD"),
                Lists.of("Januari", "Februari", "Machi", "Aprili", "Mei", "Juni", "Julai", "Agosti", "Septemba", "Oktoba", "Novemba", "Desemba", ""),
                Lists.of("Jan", "Feb", "Mar", "Apr", "Mei", "Jun", "Jul", "Ago", "Sep", "Okt", "Nov", "Des", ""),
                Lists.of("", "J2", "J3", "J4", "J5", "Al", "Ij", "J1"),
                Lists.of("", "Jumapiri", "Jumatatu", "Jumanne", "Jumatano", "Murwa wa Kanne", "Murwa wa Katano", "Jumamosi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_en_IE() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("a.m.", "p.m."),
                Lists.of("BC", "AD"),
                Lists.of("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", ""),
                Lists.of("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", ""),
                Lists.of("", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"),
                Lists.of("", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_qu() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("a.m.", "p.m."),
                Lists.of("BCE", "d.C."),
                Lists.of("Qulla puquy", "Hatun puquy", "Pauqar waray", "Ayriwa", "Aymuray", "Inti raymi", "Anta Sitwa", "Qhapaq Sitwa", "Uma raymi", "Kantaray", "Ayamarqʼa", "Kapaq Raymi", ""),
                Lists.of("Qul", "Hat", "Pau", "Ayr", "Aym", "Int", "Ant", "Qha", "Uma", "Kan", "Aya", "Kap", ""),
                Lists.of("", "Dom", "Lun", "Mar", "Mié", "Jue", "Vie", "Sab"),
                Lists.of("", "Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ga() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("a.m.", "p.m."),
                Lists.of("RC", "AD"),
                Lists.of("Eanáir", "Feabhra", "Márta", "Aibreán", "Bealtaine", "Meitheamh", "Iúil", "Lúnasa", "Meán Fómhair", "Deireadh Fómhair", "Samhain", "Nollaig", ""),
                Lists.of("Ean", "Feabh", "Márta", "Aib", "Beal", "Meith", "Iúil", "Lún", "MFómh", "DFómh", "Samh", "Noll", ""),
                Lists.of("", "Domh", "Luan", "Máirt", "Céad", "Déar", "Aoine", "Sath"),
                Lists.of("", "Dé Domhnaigh", "Dé Luain", "Dé Máirt", "Dé Céadaoin", "Déardaoin", "Dé hAoine", "Dé Sathairn"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_gv() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("a.m.", "p.m."),
                Lists.of("RC", "AD"),
                Lists.of("Jerrey-geuree", "Toshiaght-arree", "Mayrnt", "Averil", "Boaldyn", "Mean-souree", "Jerrey-souree", "Luanistyn", "Mean-fouyir", "Jerrey-fouyir", "Mee Houney", "Mee ny Nollick", ""),
                Lists.of("J-guer", "T-arree", "Mayrnt", "Avrril", "Boaldyn", "M-souree", "J-souree", "Luanistyn", "M-fouyir", "J-fouyir", "M-Houney", "M-Nollick", ""),
                Lists.of("", "Jed", "Jel", "Jem", "Jerc", "Jerd", "Jeh", "Jes"),
                Lists.of("", "Jedoonee", "Jelhein", "Jemayrt", "Jercean", "Jerdein", "Jeheiney", "Jesarn"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_kw() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("a.m.", "p.m."),
                Lists.of("RC", "AD"),
                Lists.of("mis Genver", "mis Hwevrer", "mis Meurth", "mis Ebrel", "mis Me", "mis Metheven", "mis Gortheren", "mis Est", "mis Gwynngala", "mis Hedra", "mis Du", "mis Kevardhu", ""),
                Lists.of("Gen", "Hwe", "Meu", "Ebr", "Me", "Met", "Gor", "Est", "Gwn", "Hed", "Du", "Kev", ""),
                Lists.of("", "Sul", "Lun", "Mth", "Mhr", "Yow", "Gwe", "Sad"),
                Lists.of("", "dy Sul", "dy Lun", "dy Meurth", "dy Merher", "dy Yow", "dy Gwener", "dy Sadorn"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_es_MX() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("a.m.", "p.m."),
                Lists.of("a. C.", "d. C."),
                Lists.of("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre", ""),
                Lists.of("ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic", ""),
                Lists.of("", "dom.", "lun.", "mar.", "mié.", "jue.", "vie.", "sáb."),
                Lists.of("", "domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_es_419() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("a.m.", "p.m."),
                Lists.of("a. C.", "d. C."),
                Lists.of("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre", ""),
                Lists.of("ene.", "feb.", "mar.", "abr.", "may.", "jun.", "jul.", "ago.", "sep.", "oct.", "nov.", "dic.", ""),
                Lists.of("", "dom.", "lun.", "mar.", "mié.", "jue.", "vie.", "sáb."),
                Lists.of("", "domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_es_CL() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("a.m.", "p.m."),
                Lists.of("a. C.", "d. C."),
                Lists.of("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre", ""),
                Lists.of("ene.", "feb.", "mar.", "abr.", "may.", "jun.", "jul.", "ago.", "sept.", "oct.", "nov.", "dic.", ""),
                Lists.of("", "dom.", "lun.", "mar.", "mié.", "jue.", "vie.", "sáb."),
                Lists.of("", "domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_es_PE() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("a.m.", "p.m."),
                Lists.of("a. C.", "d. C."),
                Lists.of("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre", "octubre", "noviembre", "diciembre", ""),
                Lists.of("ene.", "feb.", "mar.", "abr.", "may.", "jun.", "jul.", "ago.", "set.", "oct.", "nov.", "dic.", ""),
                Lists.of("", "dom.", "lun.", "mar.", "mié.", "jue.", "vie.", "sáb."),
                Lists.of("", "domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_gl() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("a.m.", "p.m."),
                Lists.of("a.C.", "d.C."),
                Lists.of("xaneiro", "febreiro", "marzo", "abril", "maio", "xuño", "xullo", "agosto", "setembro", "outubro", "novembro", "decembro", ""),
                Lists.of("xan", "feb", "mar", "abr", "mai", "xuñ", "xul", "ago", "set", "out", "nov", "dec", ""),
                Lists.of("", "dom", "luns", "mar", "mér", "xov", "ven", "sáb"),
                Lists.of("", "domingo", "luns", "martes", "mércores", "xoves", "venres", "sábado"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_fr_MA() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("a.m.", "p.m."),
                Lists.of("av. J.-C.", "ap. J.-C."),
                Lists.of("janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre", ""),
                Lists.of("jan.", "fév.", "mar.", "avr.", "mai", "jui.", "juil.", "août", "sept.", "oct.", "nov.", "déc.", ""),
                Lists.of("", "dim.", "lun.", "mar.", "mer.", "jeu.", "ven.", "sam."),
                Lists.of("", "dimanche", "lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_nb() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("a.m.", "p.m."),
                Lists.of("f.Kr.", "e.Kr."),
                Lists.of("januar", "februar", "mars", "april", "mai", "juni", "juli", "august", "september", "oktober", "november", "desember", ""),
                Lists.of("jan.", "feb.", "mar.", "apr.", "mai", "jun.", "jul.", "aug.", "sep.", "okt.", "nov.", "des.", ""),
                Lists.of("", "søn.", "man.", "tir.", "ons.", "tor.", "fre.", "lør."),
                Lists.of("", "søndag", "mandag", "tirsdag", "onsdag", "torsdag", "fredag", "lørdag"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_nl() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("a.m.", "p.m."),
                Lists.of("v.Chr.", "n.Chr."),
                Lists.of("januari", "februari", "maart", "april", "mei", "juni", "juli", "augustus", "september", "oktober", "november", "december", ""),
                Lists.of("jan.", "feb.", "mrt.", "apr.", "mei", "jun.", "jul.", "aug.", "sep.", "okt.", "nov.", "dec.", ""),
                Lists.of("", "zo", "ma", "di", "wo", "do", "vr", "za"),
                Lists.of("", "zondag", "maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ro_MD() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("a.m.", "p.m."),
                Lists.of("î.Hr.", "d.Hr."),
                Lists.of("ianuarie", "februarie", "martie", "aprilie", "mai", "iunie", "iulie", "august", "septembrie", "octombrie", "noiembrie", "decembrie", ""),
                Lists.of("ian.", "feb.", "mar.", "apr.", "mai", "iun.", "iul.", "aug.", "sept.", "oct.", "nov.", "dec.", ""),
                Lists.of("", "Dum", "Lun", "Mar", "Mie", "Joi", "Vin", "Sâm"),
                Lists.of("", "duminică", "luni", "marți", "miercuri", "joi", "vineri", "sâmbătă"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ro() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("a.m.", "p.m."),
                Lists.of("î.Hr.", "d.Hr."),
                Lists.of("ianuarie", "februarie", "martie", "aprilie", "mai", "iunie", "iulie", "august", "septembrie", "octombrie", "noiembrie", "decembrie", ""),
                Lists.of("ian.", "feb.", "mar.", "apr.", "mai", "iun.", "iul.", "aug.", "sept.", "oct.", "nov.", "dec.", ""),
                Lists.of("", "dum.", "lun.", "mar.", "mie.", "joi", "vin.", "sâm."),
                Lists.of("", "duminică", "luni", "marți", "miercuri", "joi", "vineri", "sâmbătă"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_kea() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("am", "pm"),
                Lists.of("AK", "DK"),
                Lists.of("Janeru", "Febreru", "Marsu", "Abril", "Maiu", "Junhu", "Julhu", "Agostu", "Setenbru", "Otubru", "Nuvenbru", "Dizenbru", ""),
                Lists.of("Jan", "Feb", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Otu", "Nuv", "Diz", ""),
                Lists.of("", "dum", "sig", "ter", "kua", "kin", "ses", "sab"),
                Lists.of("", "dumingu", "sigunda-fera", "tersa-fera", "kuarta-fera", "kinta-fera", "sesta-fera", "sabadu"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_en_GB() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("am", "pm"),
                Lists.of("BC", "AD"),
                Lists.of("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", ""),
                Lists.of("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", ""),
                Lists.of("", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"),
                Lists.of("", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_en_AU() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("am", "pm"),
                Lists.of("BC", "AD"),
                Lists.of("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", ""),
                Lists.of("Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec.", ""),
                Lists.of("", "Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."),
                Lists.of("", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_or() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("am", "pm"),
                Lists.of("BCE", "CE"),
                Lists.of("ଜାନୁଆରୀ", "ଫେବୃଆରୀ", "ମାର୍ଚ୍ଚ", "ଅପ୍ରେଲ", "ମଇ", "ଜୁନ", "ଜୁଲାଇ", "ଅଗଷ୍ଟ", "ସେପ୍ଟେମ୍ବର", "ଅକ୍ଟୋବର", "ନଭେମ୍ବର", "ଡିସେମ୍ବର", ""),
                Lists.of("ଜାନୁଆରୀ", "ଫେବୃଆରୀ", "ମାର୍ଚ୍ଚ", "ଅପ୍ରେଲ", "ମଇ", "ଜୁନ", "ଜୁଲାଇ", "ଅଗଷ୍ଟ", "ସେପ୍ଟେମ୍ବର", "ଅକ୍ଟୋବର", "ନଭେମ୍ବର", "ଡିସେମ୍ବର", ""),
                Lists.of("", "ରବି", "ସୋମ", "ମଙ୍ଗଳ", "ବୁଧ", "ଗୁରୁ", "ଶୁକ୍ର", "ଶନି"),
                Lists.of("", "ରବିବାର", "ସୋମବାର", "ମଙ୍ଗଳବାର", "ବୁଧବାର", "ଗୁରୁବାର", "ଶୁକ୍ରବାର", "ଶନିବାର"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_rm() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("am", "sm"),
                Lists.of("av. Cr.", "s. Cr."),
                Lists.of("schaner", "favrer", "mars", "avrigl", "matg", "zercladur", "fanadur", "avust", "settember", "october", "november", "december", ""),
                Lists.of("schan.", "favr.", "mars", "avr.", "matg", "zercl.", "fan.", "avust", "sett.", "oct.", "nov.", "dec.", ""),
                Lists.of("", "du", "gli", "ma", "me", "gie", "ve", "so"),
                Lists.of("", "dumengia", "glindesdi", "mardi", "mesemna", "gievgia", "venderdi", "sonda"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_fi() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ap.", "ip."),
                Lists.of("eKr.", "jKr."),
                Lists.of("tammikuuta", "helmikuuta", "maaliskuuta", "huhtikuuta", "toukokuuta", "kesäkuuta", "heinäkuuta", "elokuuta", "syyskuuta", "lokakuuta", "marraskuuta", "joulukuuta", ""),
                Lists.of("tammikuuta", "helmikuuta", "maaliskuuta", "huhtikuuta", "toukokuuta", "kesäkuuta", "heinäkuuta", "elokuuta", "syyskuuta", "lokakuuta", "marraskuuta", "joulukuuta", ""),
                Lists.of("", "su", "ma", "ti", "ke", "to", "pe", "la"),
                Lists.of("", "sunnuntaina", "maanantaina", "tiistaina", "keskiviikkona", "torstaina", "perjantaina", "lauantaina"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_eo() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("atm", "ptm"),
                Lists.of("aK", "pK"),
                Lists.of("januaro", "februaro", "marto", "aprilo", "majo", "junio", "julio", "aŭgusto", "septembro", "oktobro", "novembro", "decembro", ""),
                Lists.of("jan", "feb", "mar", "apr", "maj", "jun", "jul", "aŭg", "sep", "okt", "nov", "dec", ""),
                Lists.of("", "di", "lu", "ma", "me", "ĵa", "ve", "sa"),
                Lists.of("", "dimanĉo", "lundo", "mardo", "merkredo", "ĵaŭdo", "vendredo", "sabato"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_mua() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("comme", "lilli"),
                Lists.of("KK", "PK"),
                Lists.of("Fĩi Loo", "Cokcwaklaŋne", "Cokcwaklii", "Fĩi Marfoo", "Madǝǝuutǝbijaŋ", "Mamǝŋgwãafahbii", "Mamǝŋgwãalii", "Madǝmbii", "Fĩi Dǝɓlii", "Fĩi Mundaŋ", "Fĩi Gwahlle", "Fĩi Yuru", ""),
                Lists.of("FLO", "CLA", "CKI", "FMF", "MAD", "MBI", "MLI", "MAM", "FDE", "FMU", "FGW", "FYU", ""),
                Lists.of("", "Cya", "Cla", "Czi", "Cko", "Cka", "Cga", "Cze"),
                Lists.of("", "Com’yakke", "Comlaaɗii", "Comzyiiɗii", "Comkolle", "Comkaldǝɓlii", "Comgaisuu", "Comzyeɓsuu"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_pt_AO() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("da manhã", "da tarde"),
                Lists.of("a.C.", "d.C."),
                Lists.of("janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro", ""),
                Lists.of("jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez", ""),
                Lists.of("", "domingo", "segunda", "terça", "quarta", "quinta", "sexta", "sábado"),
                Lists.of("", "domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sábado"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ast() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("de la mañana", "de la tardi"),
                Lists.of("a.C.", "d.C."),
                Lists.of("de xineru", "de febreru", "de marzu", "d’abril", "de mayu", "de xunu", "de xunetu", "d’agostu", "de setiembre", "d’ochobre", "de payares", "d’avientu", ""),
                Lists.of("xin", "feb", "mar", "abr", "may", "xun", "xnt", "ago", "set", "och", "pay", "avi", ""),
                Lists.of("", "dom", "llu", "mar", "mié", "xue", "vie", "sáb"),
                Lists.of("", "domingu", "llunes", "martes", "miércoles", "xueves", "vienres", "sábadu"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_hu() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("de.", "du."),
                Lists.of("i. e.", "i. sz."),
                Lists.of("január", "február", "március", "április", "május", "június", "július", "augusztus", "szeptember", "október", "november", "december", ""),
                Lists.of("jan.", "febr.", "márc.", "ápr.", "máj.", "jún.", "júl.", "aug.", "szept.", "okt.", "nov.", "dec.", ""),
                Lists.of("", "V", "H", "K", "Sze", "Cs", "P", "Szo"),
                Lists.of("", "vasárnap", "hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_cs() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("dop.", "odp."),
                Lists.of("př. n. l.", "n. l."),
                Lists.of("ledna", "února", "března", "dubna", "května", "června", "července", "srpna", "září", "října", "listopadu", "prosince", ""),
                Lists.of("led", "úno", "bře", "dub", "kvě", "čvn", "čvc", "srp", "zář", "říj", "lis", "pro", ""),
                Lists.of("", "ne", "po", "út", "st", "čt", "pá", "so"),
                Lists.of("", "neděle", "pondělí", "úterý", "středa", "čtvrtek", "pátek", "sobota"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_sl() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("dop.", "pop."),
                Lists.of("pr. Kr.", "po n. št."),
                Lists.of("januar", "februar", "marec", "april", "maj", "junij", "julij", "avgust", "september", "oktober", "november", "december", ""),
                Lists.of("jan.", "feb.", "mar.", "apr.", "maj", "jun.", "jul.", "avg.", "sep.", "okt.", "nov.", "dec.", ""),
                Lists.of("", "ned.", "pon.", "tor.", "sre.", "čet.", "pet.", "sob."),
                Lists.of("", "nedelja", "ponedeljek", "torek", "sreda", "četrtek", "petek", "sobota"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_hsb() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("dopołdnja", "popołdnju"),
                Lists.of("př.Chr.n.", "po Chr.n."),
                Lists.of("januara", "februara", "měrca", "apryla", "meje", "junija", "julija", "awgusta", "septembra", "oktobra", "nowembra", "decembra", ""),
                Lists.of("jan.", "feb.", "měr.", "apr.", "mej.", "jun.", "jul.", "awg.", "sep.", "okt.", "now.", "dec.", ""),
                Lists.of("", "nje", "pón", "wut", "srj", "štw", "pja", "sob"),
                Lists.of("", "njedźela", "póndźela", "wutora", "srjeda", "štwórtk", "pjatk", "sobota"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_dsb() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("dopołdnja", "wótpołdnja"),
                Lists.of("pś.Chr.n.", "pó Chr.n."),
                Lists.of("januara", "februara", "měrca", "apryla", "maja", "junija", "julija", "awgusta", "septembra", "oktobra", "nowembra", "decembra", ""),
                Lists.of("jan.", "feb.", "měr.", "apr.", "maj.", "jun.", "jul.", "awg.", "sep.", "okt.", "now.", "dec.", ""),
                Lists.of("", "nje", "pón", "wał", "srj", "stw", "pět", "sob"),
                Lists.of("", "njeźela", "pónjeźele", "wałtora", "srjoda", "stwórtk", "pětk", "sobota"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_sq() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("e paradites", "e pasdites"),
                Lists.of("p.e.r.", "e.r."),
                Lists.of("janar", "shkurt", "mars", "prill", "maj", "qershor", "korrik", "gusht", "shtator", "tetor", "nëntor", "dhjetor", ""),
                Lists.of("Jan", "Shk", "Mar", "Pri", "Maj", "Qer", "Kor", "Gsh", "Sht", "Tet", "Nën", "Dhj", ""),
                Lists.of("", "Die", "Hën", "Mar", "Mër", "Enj", "Pre", "Sht"),
                Lists.of("", "e diel", "e hënë", "e martë", "e mërkurë", "e enjte", "e premte", "e shtunë"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_is() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("f.h.", "e.h."),
                Lists.of("f.Kr.", "e.Kr."),
                Lists.of("janúar", "febrúar", "mars", "apríl", "maí", "júní", "júlí", "ágúst", "september", "október", "nóvember", "desember", ""),
                Lists.of("jan.", "feb.", "mar.", "apr.", "maí", "jún.", "júl.", "ágú.", "sep.", "okt.", "nóv.", "des.", ""),
                Lists.of("", "sun.", "mán.", "þri.", "mið.", "fim.", "fös.", "lau."),
                Lists.of("", "sunnudagur", "mánudagur", "þriðjudagur", "miðvikudagur", "fimmtudagur", "föstudagur", "laugardagur"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_sv() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("fm", "em"),
                Lists.of("f.Kr.", "e.Kr."),
                Lists.of("januari", "februari", "mars", "april", "maj", "juni", "juli", "augusti", "september", "oktober", "november", "december", ""),
                Lists.of("jan.", "feb.", "mars", "apr.", "maj", "juni", "juli", "aug.", "sep.", "okt.", "nov.", "dec.", ""),
                Lists.of("", "sön", "mån", "tis", "ons", "tors", "fre", "lör"),
                Lists.of("", "söndag", "måndag", "tisdag", "onsdag", "torsdag", "fredag", "lördag"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_nn() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("formiddag", "ettermiddag"),
                Lists.of("f.Kr.", "e.Kr."),
                Lists.of("januar", "februar", "mars", "april", "mai", "juni", "juli", "august", "september", "oktober", "november", "desember", ""),
                Lists.of("jan.", "feb.", "mars", "apr.", "mai", "juni", "juli", "aug.", "sep.", "okt.", "nov.", "des.", ""),
                Lists.of("", "sø.", "må.", "ty.", "on.", "to.", "fr.", "la."),
                Lists.of("", "søndag", "måndag", "tysdag", "onsdag", "torsdag", "fredag", "laurdag"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_asa() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("icheheavo", "ichamthi"),
                Lists.of("KM", "BM"),
                Lists.of("Januari", "Februari", "Machi", "Aprili", "Mei", "Juni", "Julai", "Agosti", "Septemba", "Oktoba", "Novemba", "Desemba", ""),
                Lists.of("Jan", "Feb", "Mac", "Apr", "Mei", "Jun", "Jul", "Ago", "Sep", "Okt", "Nov", "Dec", ""),
                Lists.of("", "Jpi", "Jtt", "Jnn", "Jtn", "Alh", "Ijm", "Jmo"),
                Lists.of("", "Jumapili", "Jumatatu", "Jumanne", "Jumatano", "Alhamisi", "Ijumaa", "Jumamosi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_dua() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("idiɓa", "ebyámu"),
                Lists.of("ɓ.Ys", "mb.Ys"),
                Lists.of("dimɔ́di", "ŋgɔndɛ", "sɔŋɛ", "diɓáɓá", "emiasele", "esɔpɛsɔpɛ", "madiɓɛ́díɓɛ́", "diŋgindi", "nyɛtɛki", "mayésɛ́", "tiníní", "eláŋgɛ́", ""),
                Lists.of("di", "ŋgɔn", "sɔŋ", "diɓ", "emi", "esɔ", "mad", "diŋ", "nyɛt", "may", "tin", "elá", ""),
                Lists.of("", "ét", "mɔ́s", "kwa", "muk", "ŋgi", "ɗón", "esa"),
                Lists.of("", "éti", "mɔ́sú", "kwasú", "mukɔ́sú", "ŋgisú", "ɗónɛsú", "esaɓasú"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_se() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("iđitbeaivet", "eahketbeaivet"),
                Lists.of("o.Kr.", "m.Kr."),
                Lists.of("ođđajagemánnu", "guovvamánnu", "njukčamánnu", "cuoŋománnu", "miessemánnu", "geassemánnu", "suoidnemánnu", "borgemánnu", "čakčamánnu", "golggotmánnu", "skábmamánnu", "juovlamánnu", ""),
                Lists.of("ođđj", "guov", "njuk", "cuo", "mies", "geas", "suoi", "borg", "čakč", "golg", "skáb", "juov", ""),
                Lists.of("", "sotn", "vuos", "maŋ", "gask", "duor", "bear", "láv"),
                Lists.of("", "sotnabeaivi", "vuossárga", "maŋŋebárga", "gaskavahkku", "duorasdat", "bearjadat", "lávvardat"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_rof() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("kang’ama", "kingoto"),
                Lists.of("KM", "BM"),
                Lists.of("Mweri wa kwanza", "Mweri wa kaili", "Mweri wa katatu", "Mweri wa kaana", "Mweri wa tanu", "Mweri wa sita", "Mweri wa saba", "Mweri wa nane", "Mweri wa tisa", "Mweri wa ikumi", "Mweri wa ikumi na moja", "Mweri wa ikumi na mbili", ""),
                Lists.of("M1", "M2", "M3", "M4", "M5", "M6", "M7", "M8", "M9", "M10", "M11", "M12", ""),
                Lists.of("", "Ijp", "Ijt", "Ijn", "Ijtn", "Alh", "Iju", "Ijm"),
                Lists.of("", "Ijumapili", "Ijumatatu", "Ijumanne", "Ijumatano", "Alhamisi", "Ijumaa", "Ijumamosi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_kln() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("karoon", "kooskoliny"),
                Lists.of("AM", "KO"),
                Lists.of("Mulgul", "Ng’atyaato", "Kiptaamo", "Iwootkuut", "Mamuut", "Paagi", "Ng’eiyeet", "Rooptui", "Bureet", "Epeeso", "Kipsuunde ne taai", "Kipsuunde nebo aeng’", ""),
                Lists.of("Mul", "Ngat", "Taa", "Iwo", "Mam", "Paa", "Nge", "Roo", "Bur", "Epe", "Kpt", "Kpa", ""),
                Lists.of("", "Kts", "Kot", "Koo", "Kos", "Koa", "Kom", "Kol"),
                Lists.of("", "Kotisap", "Kotaai", "Koaeng’", "Kosomok", "Koang’wan", "Komuut", "Kolo"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_yav() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("kiɛmɛ́ɛm", "kisɛ́ndɛ"),
                Lists.of("k.Y.", "+J.C."),
                Lists.of("pikítíkítie, oólí ú kutúan", "siɛyɛ́, oóli ú kándíɛ", "ɔnsúmbɔl, oóli ú kátátúɛ", "mesiŋ, oóli ú kénie", "ensil, oóli ú kátánuɛ", "ɔsɔn", "efute", "pisuyú", "imɛŋ i puɔs", "imɛŋ i putúk,oóli ú kátíɛ", "makandikɛ", "pilɔndɔ́", ""),
                Lists.of("o.1", "o.2", "o.3", "o.4", "o.5", "o.6", "o.7", "o.8", "o.9", "o.10", "o.11", "o.12", ""),
                Lists.of("", "sd", "md", "mw", "et", "kl", "fl", "ss"),
                Lists.of("", "sɔ́ndiɛ", "móndie", "muányáŋmóndie", "metúkpíápɛ", "kúpélimetúkpiapɛ", "feléte", "séselé"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ewo() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("kíkíríg", "ngəgógəle"),
                Lists.of("oyk", "ayk"),
                Lists.of("ngɔn osú", "ngɔn bɛ̌", "ngɔn lála", "ngɔn nyina", "ngɔn tána", "ngɔn saməna", "ngɔn zamgbála", "ngɔn mwom", "ngɔn ebulú", "ngɔn awóm", "ngɔn awóm ai dziá", "ngɔn awóm ai bɛ̌", ""),
                Lists.of("ngo", "ngb", "ngl", "ngn", "ngt", "ngs", "ngz", "ngm", "nge", "nga", "ngad", "ngab", ""),
                Lists.of("", "sɔ́n", "mɔ́n", "smb", "sml", "smn", "fúl", "sér"),
                Lists.of("", "sɔ́ndɔ", "mɔ́ndi", "sɔ́ndɔ məlú mə́bɛ̌", "sɔ́ndɔ məlú mə́lɛ́", "sɔ́ndɔ məlú mə́nyi", "fúladé", "séradé"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_gd() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("m", "f"),
                Lists.of("RC", "AD"),
                Lists.of("dhen Fhaoilleach", "dhen Ghearran", "dhen Mhàrt", "dhen Ghiblean", "dhen Chèitean", "dhen Ògmhios", "dhen Iuchar", "dhen Lùnastal", "dhen t-Sultain", "dhen Dàmhair", "dhen t-Samhain", "dhen Dùbhlachd", ""),
                Lists.of("Faoi", "Gearr", "Màrt", "Gibl", "Cèit", "Ògmh", "Iuch", "Lùna", "Sult", "Dàmh", "Samh", "Dùbh", ""),
                Lists.of("", "DiD", "DiL", "DiM", "DiC", "Dia", "Dih", "DiS"),
                Lists.of("", "DiDòmhnaich", "DiLuain", "DiMàirt", "DiCiadain", "DiarDaoin", "DihAoine", "DiSathairne"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ksb() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("makeo", "nyiaghuo"),
                Lists.of("KK", "BK"),
                Lists.of("Januali", "Febluali", "Machi", "Aplili", "Mei", "Juni", "Julai", "Agosti", "Septemba", "Oktoba", "Novemba", "Desemba", ""),
                Lists.of("Jan", "Feb", "Mac", "Apr", "Mei", "Jun", "Jul", "Ago", "Sep", "Okt", "Nov", "Des", ""),
                Lists.of("", "Jpi", "Jtt", "Jmn", "Jtn", "Alh", "Iju", "Jmo"),
                Lists.of("", "Jumaapii", "Jumaatatu", "Jumaane", "Jumaatano", "Alhamisi", "Ijumaa", "Jumaamosi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_nmg() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("maná", "kugú"),
                Lists.of("BL", "PB"),
                Lists.of("ngwɛn matáhra", "ngwɛn ńmba", "ngwɛn ńlal", "ngwɛn ńna", "ngwɛn ńtan", "ngwɛn ńtuó", "ngwɛn hɛmbuɛrí", "ngwɛn lɔmbi", "ngwɛn rɛbvuâ", "ngwɛn wum", "ngwɛn wum navǔr", "krísimin", ""),
                Lists.of("ng1", "ng2", "ng3", "ng4", "ng5", "ng6", "ng7", "ng8", "ng9", "ng10", "ng11", "kris", ""),
                Lists.of("", "sɔ́n", "mɔ́n", "smb", "sml", "smn", "mbs", "sas"),
                Lists.of("", "sɔ́ndɔ", "mɔ́ndɔ", "sɔ́ndɔ mafú mába", "sɔ́ndɔ mafú málal", "sɔ́ndɔ mafú mána", "mabágá má sukul", "sásadi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_nnh() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("mbaʼámbaʼ", "ncwònzém"),
                Lists.of("m.z.Y.", "m.g.n.Y."),
                Lists.of("saŋ tsetsɛ̀ɛ lùm", "saŋ kàg ngwóŋ", "saŋ lepyè shúm", "saŋ cÿó", "saŋ tsɛ̀ɛ cÿó", "saŋ njÿoláʼ", "saŋ tyɛ̀b tyɛ̀b mbʉ̀ŋ", "saŋ mbʉ̀ŋ", "saŋ ngwɔ̀ʼ mbÿɛ", "saŋ tàŋa tsetsáʼ", "saŋ mejwoŋó", "saŋ lùm", ""),
                Lists.of("saŋ tsetsɛ̀ɛ lùm", "saŋ kàg ngwóŋ", "saŋ lepyè shúm", "saŋ cÿó", "saŋ tsɛ̀ɛ cÿó", "saŋ njÿoláʼ", "saŋ tyɛ̀b tyɛ̀b mbʉ̀ŋ", "saŋ mbʉ̀ŋ", "saŋ ngwɔ̀ʼ mbÿɛ", "saŋ tàŋa tsetsáʼ", "saŋ mejwoŋó", "saŋ lùm", ""),
                Lists.of("", "lyɛʼɛ́ sẅíŋtè", "mvfò lyɛ̌ʼ", "mbɔ́ɔntè mvfò lyɛ̌ʼ", "tsètsɛ̀ɛ lyɛ̌ʼ", "mbɔ́ɔntè tsetsɛ̀ɛ lyɛ̌ʼ", "mvfò màga lyɛ̌ʼ", "màga lyɛ̌ʼ"),
                Lists.of("", "lyɛʼɛ́ sẅíŋtè", "mvfò lyɛ̌ʼ", "mbɔ́ɔntè mvfò lyɛ̌ʼ", "tsètsɛ̀ɛ lyɛ̌ʼ", "mbɔ́ɔntè tsetsɛ̀ɛ lyɛ̌ʼ", "mvfò màga lyɛ̌ʼ", "màga lyɛ̌ʼ"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_jgo() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("mbaꞌmbaꞌ", "ŋka mbɔ́t nji"),
                Lists.of("BCE", "CE"),
                Lists.of("Nduŋmbi Saŋ", "Pɛsaŋ Pɛ́pá", "Pɛsaŋ Pɛ́tát", "Pɛsaŋ Pɛ́nɛ́kwa", "Pɛsaŋ Pataa", "Pɛsaŋ Pɛ́nɛ́ntúkú", "Pɛsaŋ Saambá", "Pɛsaŋ Pɛ́nɛ́fɔm", "Pɛsaŋ Pɛ́nɛ́pfúꞋú", "Pɛsaŋ Nɛgɛ́m", "Pɛsaŋ Ntsɔ̌pmɔ́", "Pɛsaŋ Ntsɔ̌ppá", ""),
                Lists.of("Nduŋmbi Saŋ", "Pɛsaŋ Pɛ́pá", "Pɛsaŋ Pɛ́tát", "Pɛsaŋ Pɛ́nɛ́kwa", "Pɛsaŋ Pataa", "Pɛsaŋ Pɛ́nɛ́ntúkú", "Pɛsaŋ Saambá", "Pɛsaŋ Pɛ́nɛ́fɔm", "Pɛsaŋ Pɛ́nɛ́pfúꞋú", "Pɛsaŋ Nɛgɛ́m", "Pɛsaŋ Ntsɔ̌pmɔ́", "Pɛsaŋ Ntsɔ̌ppá", ""),
                Lists.of("", "Sɔ́ndi", "Mɔ́ndi", "Ápta Mɔ́ndi", "Wɛ́nɛsɛdɛ", "Tɔ́sɛdɛ", "Fɛlâyɛdɛ", "Sásidɛ"),
                Lists.of("", "Sɔ́ndi", "Mɔ́ndi", "Ápta Mɔ́ndi", "Wɛ́nɛsɛdɛ", "Tɔ́sɛdɛ", "Fɛlâyɛdɛ", "Sásidɛ"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_lb() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("moies", "nomëttes"),
                Lists.of("v. Chr.", "n. Chr."),
                Lists.of("Januar", "Februar", "Mäerz", "Abrëll", "Mee", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember", ""),
                Lists.of("Jan.", "Feb.", "Mäe.", "Abr.", "Mee", "Juni", "Juli", "Aug.", "Sep.", "Okt.", "Nov.", "Dez.", ""),
                Lists.of("", "Son.", "Méi.", "Dën.", "Mët.", "Don.", "Fre.", "Sam."),
                Lists.of("", "Sonndeg", "Méindeg", "Dënschdeg", "Mëttwoch", "Donneschdeg", "Freideg", "Samschdeg"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_kab() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("n tufat", "n tmeddit"),
                Lists.of("snd. T.Ɛ", "sld. T.Ɛ"),
                Lists.of("Yennayer", "Fuṛar", "Meɣres", "Yebrir", "Mayyu", "Yunyu", "Yulyu", "Ɣuct", "Ctembeṛ", "Tubeṛ", "Nunembeṛ", "Duǧembeṛ", ""),
                Lists.of("Yen", "Fur", "Meɣ", "Yeb", "May", "Yun", "Yul", "Ɣuc", "Cte", "Tub", "Nun", "Duǧ", ""),
                Lists.of("", "Yan", "San", "Kraḍ", "Kuẓ", "Sam", "Sḍis", "Say"),
                Lists.of("", "Yanass", "Sanass", "Kraḍass", "Kuẓass", "Samass", "Sḍisass", "Sayass"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ln() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ntɔ́ngɔ́", "mpókwa"),
                Lists.of("libóso ya", "nsima ya Y"),
                Lists.of("sánzá ya yambo", "sánzá ya míbalé", "sánzá ya mísáto", "sánzá ya mínei", "sánzá ya mítáno", "sánzá ya motóbá", "sánzá ya nsambo", "sánzá ya mwambe", "sánzá ya libwa", "sánzá ya zómi", "sánzá ya zómi na mɔ̌kɔ́", "sánzá ya zómi na míbalé", ""),
                Lists.of("yan", "fbl", "msi", "apl", "mai", "yun", "yul", "agt", "stb", "ɔtb", "nvb", "dsb", ""),
                Lists.of("", "eye", "ybo", "mbl", "mst", "min", "mtn", "mps"),
                Lists.of("", "eyenga", "mokɔlɔ mwa yambo", "mokɔlɔ mwa míbalé", "mokɔlɔ mwa mísáto", "mokɔlɔ ya mínéi", "mokɔlɔ ya mítáno", "mpɔ́sɔ"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_bez() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("pamilau", "pamunyi"),
                Lists.of("KM", "BM"),
                Lists.of("pa mwedzi gwa hutala", "pa mwedzi gwa wuvili", "pa mwedzi gwa wudatu", "pa mwedzi gwa wutai", "pa mwedzi gwa wuhanu", "pa mwedzi gwa sita", "pa mwedzi gwa saba", "pa mwedzi gwa nane", "pa mwedzi gwa tisa", "pa mwedzi gwa kumi", "pa mwedzi gwa kumi na moja", "pa mwedzi gwa kumi na mbili", ""),
                Lists.of("Hut", "Vil", "Dat", "Tai", "Han", "Sit", "Sab", "Nan", "Tis", "Kum", "Kmj", "Kmb", ""),
                Lists.of("", "Mul", "Vil", "Hiv", "Hid", "Hit", "Hih", "Lem"),
                Lists.of("", "pa mulungu", "pa shahuviluha", "pa hivili", "pa hidatu", "pa hitayi", "pa hihanu", "pa shahulembela"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_sr__Latn() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("pre podne", "po podne"),
                Lists.of("p. n. e.", "n. e."),
                Lists.of("januar", "februar", "mart", "april", "maj", "jun", "jul", "avgust", "septembar", "oktobar", "novembar", "decembar", ""),
                Lists.of("jan", "feb", "mar", "apr", "maj", "jun", "jul", "avg", "sep", "okt", "nov", "dec", ""),
                Lists.of("", "ned", "pon", "uto", "sre", "čet", "pet", "sub"),
                Lists.of("", "nedelja", "ponedeljak", "utorak", "sreda", "četvrtak", "petak", "subota"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_lv() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("priekšpusdienā", "pēcpusdienā"),
                Lists.of("p.m.ē.", "m.ē."),
                Lists.of("janvāris", "februāris", "marts", "aprīlis", "maijs", "jūnijs", "jūlijs", "augusts", "septembris", "oktobris", "novembris", "decembris", ""),
                Lists.of("janv.", "febr.", "marts", "apr.", "maijs", "jūn.", "jūl.", "aug.", "sept.", "okt.", "nov.", "dec.", ""),
                Lists.of("", "Sv", "Pr", "Ot", "Tr", "Ce", "Pk", "Se"),
                Lists.of("", "svētdiena", "pirmdiena", "otrdiena", "trešdiena", "ceturtdiena", "piektdiena", "sestdiena"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_lt() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("priešpiet", "popiet"),
                Lists.of("pr. Kr.", "po Kr."),
                Lists.of("sausio", "vasario", "kovo", "balandžio", "gegužės", "birželio", "liepos", "rugpjūčio", "rugsėjo", "spalio", "lapkričio", "gruodžio", ""),
                Lists.of("saus.", "vas.", "kov.", "bal.", "geg.", "birž.", "liep.", "rugp.", "rugs.", "spal.", "lapkr.", "gruod.", ""),
                Lists.of("", "sk", "pr", "an", "tr", "kt", "pn", "št"),
                Lists.of("", "sekmadienis", "pirmadienis", "antradienis", "trečiadienis", "ketvirtadienis", "penktadienis", "šeštadienis"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_bs() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("prije podne", "popodne"),
                Lists.of("p. n. e.", "n. e."),
                Lists.of("januar", "februar", "mart", "april", "maj", "juni", "juli", "august", "septembar", "oktobar", "novembar", "decembar", ""),
                Lists.of("jan", "feb", "mar", "apr", "maj", "jun", "jul", "aug", "sep", "okt", "nov", "dec", ""),
                Lists.of("", "ned", "pon", "uto", "sri", "čet", "pet", "sub"),
                Lists.of("", "nedjelja", "ponedjeljak", "utorak", "srijeda", "četvrtak", "petak", "subota"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_so() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("sn.", "gn."),
                Lists.of("CK", "CD"),
                Lists.of("Bisha Koobaad", "Bisha Labaad", "Bisha Saddexaad", "Bisha Afraad", "Bisha Shanaad", "Bisha Lixaad", "Bisha Todobaad", "Bisha Sideedaad", "Bisha Sagaalaad", "Bisha Tobnaad", "Bisha Kow iyo Tobnaad", "Bisha Laba iyo Tobnaad", ""),
                Lists.of("Kob", "Lab", "Sad", "Afr", "Sha", "Lix", "Tod", "Sid", "Sag", "Tob", "KIT", "LIT", ""),
                Lists.of("", "Axd", "Isn", "Tal", "Arb", "Kha", "Jim", "Sab"),
                Lists.of("", "Axad", "Isniin", "Talaado", "Arbaco", "Khamiis", "Jimco", "Sabti"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ff() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("subaka", "kikiiɗe"),
                Lists.of("H-I", "C-I"),
                Lists.of("siilo", "colte", "mbooy", "seeɗto", "duujal", "korse", "morso", "juko", "siilto", "yarkomaa", "jolal", "bowte", ""),
                Lists.of("sii", "col", "mbo", "see", "duu", "kor", "mor", "juk", "slt", "yar", "jol", "bow", ""),
                Lists.of("", "dew", "aaɓ", "maw", "nje", "naa", "mwd", "hbi"),
                Lists.of("", "dewo", "aaɓnde", "mawbaare", "njeslaare", "naasaande", "mawnde", "hoore-biir"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ksf() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("sárúwá", "cɛɛ́nko"),
                Lists.of("d.Y.", "k.Y."),
                Lists.of("ŋwíí a ntɔ́ntɔ", "ŋwíí akǝ bɛ́ɛ", "ŋwíí akǝ ráá", "ŋwíí akǝ nin", "ŋwíí akǝ táan", "ŋwíí akǝ táafɔk", "ŋwíí akǝ táabɛɛ", "ŋwíí akǝ táaraa", "ŋwíí akǝ táanin", "ŋwíí akǝ ntɛk", "ŋwíí akǝ ntɛk di bɔ́k", "ŋwíí akǝ ntɛk di bɛ́ɛ", ""),
                Lists.of("ŋ1", "ŋ2", "ŋ3", "ŋ4", "ŋ5", "ŋ6", "ŋ7", "ŋ8", "ŋ9", "ŋ10", "ŋ11", "ŋ12", ""),
                Lists.of("", "sɔ́n", "lǝn", "maa", "mɛk", "jǝǝ", "júm", "sam"),
                Lists.of("", "sɔ́ndǝ", "lǝndí", "maadí", "mɛkrɛdí", "jǝǝdí", "júmbá", "samdí"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_shi__Latn() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("tifawt", "tadggʷat"),
                Lists.of("daɛ", "dfɛ"),
                Lists.of("innayr", "bṛayṛ", "maṛṣ", "ibrir", "mayyu", "yunyu", "yulyuz", "ɣuct", "cutanbir", "ktubr", "nuwanbir", "dujanbir", ""),
                Lists.of("inn", "bṛa", "maṛ", "ibr", "may", "yun", "yul", "ɣuc", "cut", "ktu", "nuw", "duj", ""),
                Lists.of("", "asa", "ayn", "asi", "akṛ", "akw", "asim", "asiḍ"),
                Lists.of("", "asamas", "aynas", "asinas", "akṛas", "akwas", "asimwas", "asiḍyas"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_bem() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("uluchelo", "akasuba"),
                Lists.of("BC", "AD"),
                Lists.of("Januari", "Februari", "Machi", "Epreo", "Mei", "Juni", "Julai", "Ogasti", "Septemba", "Oktoba", "Novemba", "Disemba", ""),
                Lists.of("Jan", "Feb", "Mac", "Epr", "Mei", "Jun", "Jul", "Oga", "Sep", "Okt", "Nov", "Dis", ""),
                Lists.of("", "Pa Mulungu", "Palichimo", "Palichibuli", "Palichitatu", "Palichine", "Palichisano", "Pachibelushi"),
                Lists.of("", "Pa Mulungu", "Palichimo", "Palichibuli", "Palichitatu", "Palichine", "Palichisano", "Pachibelushi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_jmc() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("utuko", "kyiukonyi"),
                Lists.of("KK", "BK"),
                Lists.of("Januari", "Februari", "Machi", "Aprilyi", "Mei", "Junyi", "Julyai", "Agusti", "Septemba", "Oktoba", "Novemba", "Desemba", ""),
                Lists.of("Jan", "Feb", "Mac", "Apr", "Mei", "Jun", "Jul", "Ago", "Sep", "Okt", "Nov", "Des", ""),
                Lists.of("", "Jpi", "Jtt", "Jnn", "Jtn", "Alh", "Iju", "Jmo"),
                Lists.of("", "Jumapilyi", "Jumatatuu", "Jumanne", "Jumatanu", "Alhamisi", "Ijumaa", "Jumamosi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_af() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("vm.", "nm."),
                Lists.of("v.C.", "n.C."),
                Lists.of("Januarie", "Februarie", "Maart", "April", "Mei", "Junie", "Julie", "Augustus", "September", "Oktober", "November", "Desember", ""),
                Lists.of("Jan.", "Feb.", "Mrt.", "Apr.", "Mei", "Jun.", "Jul.", "Aug.", "Sep.", "Okt.", "Nov.", "Des.", ""),
                Lists.of("", "So.", "Ma.", "Di.", "Wo.", "Do.", "Vr.", "Sa."),
                Lists.of("", "Sondag", "Maandag", "Dinsdag", "Woensdag", "Donderdag", "Vrydag", "Saterdag"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_de() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("vorm.", "nachm."),
                Lists.of("v. Chr.", "n. Chr."),
                Lists.of("Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember", ""),
                Lists.of("Jan.", "Feb.", "März", "Apr.", "Mai", "Juni", "Juli", "Aug.", "Sep.", "Okt.", "Nov.", "Dez.", ""),
                Lists.of("", "So.", "Mo.", "Di.", "Mi.", "Do.", "Fr.", "Sa."),
                Lists.of("", "Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_de_AT() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("vorm.", "nachm."),
                Lists.of("v. Chr.", "n. Chr."),
                Lists.of("Jänner", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember", ""),
                Lists.of("Jän.", "Feb.", "März", "Apr.", "Mai", "Juni", "Juli", "Aug.", "Sep.", "Okt.", "Nov.", "Dez.", ""),
                Lists.of("", "So.", "Mo.", "Di.", "Mi.", "Do.", "Fr.", "Sa."),
                Lists.of("", "Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_gsw() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("vorm.", "nam."),
                Lists.of("v. Chr.", "n. Chr."),
                Lists.of("Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "Auguscht", "Septämber", "Oktoober", "Novämber", "Dezämber", ""),
                Lists.of("Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez", ""),
                Lists.of("", "Su.", "Mä.", "Zi.", "Mi.", "Du.", "Fr.", "Sa."),
                Lists.of("", "Sunntig", "Määntig", "Ziischtig", "Mittwuch", "Dunschtig", "Friitig", "Samschtig"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_mgh() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("wichishu", "mchochil’l"),
                Lists.of("HY", "YY"),
                Lists.of("Mweri wo kwanza", "Mweri wo unayeli", "Mweri wo uneraru", "Mweri wo unecheshe", "Mweri wo unethanu", "Mweri wo thanu na mocha", "Mweri wo saba", "Mweri wo nane", "Mweri wo tisa", "Mweri wo kumi", "Mweri wo kumi na moja", "Mweri wo kumi na yel’li", ""),
                Lists.of("Kwa", "Una", "Rar", "Che", "Tha", "Moc", "Sab", "Nan", "Tis", "Kum", "Moj", "Yel", ""),
                Lists.of("", "Sab", "Jtt", "Jnn", "Jtn", "Ara", "Iju", "Jmo"),
                Lists.of("", "Sabato", "Jumatatu", "Jumanne", "Jumatano", "Arahamisi", "Ijumaa", "Jumamosi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_sw_CD() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ya asubuyi", "ya muchana"),
                Lists.of("BC", "AD"),
                Lists.of("mwezi ya kwanja", "mwezi ya pili", "mwezi ya tatu", "mwezi ya ine", "mwezi ya tanu", "mwezi ya sita", "mwezi ya saba", "mwezi ya munane", "mwezi ya tisa", "mwezi ya kumi", "mwezi ya kumi na moya", "mwezi ya kumi ya mbili", ""),
                Lists.of("mkw", "mpi", "mtu", "min", "mtn", "mst", "msb", "mun", "mts", "mku", "mkm", "mkb", ""),
                Lists.of("", "yen", "kwa", "pil", "tat", "ine", "tan", "sit"),
                Lists.of("", "siku ya yenga", "siku ya kwanza", "siku ya pili", "siku ya tatu", "siku ya ine", "siku ya tanu", "siku ya sita"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_yo_BJ() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("Àárɔ̀", "Ɔ̀sán"),
                Lists.of("SK", "LK"),
                Lists.of("Oshù Shɛ́rɛ́", "Oshù Èrèlè", "Oshù Ɛrɛ̀nà", "Oshù Ìgbé", "Oshù Ɛ̀bibi", "Oshù Òkúdu", "Oshù Agɛmɔ", "Oshù Ògún", "Oshù Owewe", "Oshù Ɔ̀wàrà", "Oshù Bélú", "Oshù Ɔ̀pɛ̀", ""),
                Lists.of("Shɛ́rɛ́", "Èrèlè", "Ɛrɛ̀nà", "Ìgbé", "Ɛ̀bibi", "Òkúdu", "Agɛmɔ", "Ògún", "Owewe", "Ɔ̀wàrà", "Bélú", "Ɔ̀pɛ̀", ""),
                Lists.of("", "Àìkú", "Ajé", "Ìsɛ́gun", "Ɔjɔ́rú", "Ɔjɔ́bɔ", "Ɛtì", "Àbámɛ́ta"),
                Lists.of("", "Ɔjɔ́ Àìkú", "Ɔjɔ́ Ajé", "Ɔjɔ́ Ìsɛ́gun", "Ɔjɔ́rú", "Ɔjɔ́bɔ", "Ɔjɔ́ Ɛtì", "Ɔjɔ́ Àbámɛ́ta"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_yo() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("Àárọ̀", "Ọ̀sán"),
                Lists.of("SK", "LK"),
                Lists.of("Oṣù Ṣẹ́rẹ́", "Oṣù Èrèlè", "Oṣù Ẹrẹ̀nà", "Oṣù Ìgbé", "Oṣù Ẹ̀bibi", "Oṣù Òkúdu", "Oṣù Agẹmọ", "Oṣù Ògún", "Oṣù Owewe", "Oṣù Ọ̀wàrà", "Oṣù Bélú", "Oṣù Ọ̀pẹ̀", ""),
                Lists.of("Ṣẹ́rẹ́", "Èrèlè", "Ẹrẹ̀nà", "Ìgbé", "Ẹ̀bibi", "Òkúdu", "Agẹmọ", "Ògún", "Owewe", "Ọ̀wàrà", "Bélú", "Ọ̀pẹ̀", ""),
                Lists.of("", "Àìkú", "Ajé", "Ìsẹ́gun", "Ọjọ́rú", "Ọjọ́bọ", "Ẹtì", "Àbámẹ́ta"),
                Lists.of("", "Ọjọ́ Àìkú", "Ọjọ́ Ajé", "Ọjọ́ Ìsẹ́gun", "Ọjọ́rú", "Ọjọ́bọ", "Ọjọ́ Ẹtì", "Ọjọ́ Àbámẹ́ta"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_tr() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ÖÖ", "ÖS"),
                Lists.of("MÖ", "MS"),
                Lists.of("Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık", ""),
                Lists.of("Oca", "Şub", "Mar", "Nis", "May", "Haz", "Tem", "Ağu", "Eyl", "Eki", "Kas", "Ara", ""),
                Lists.of("", "Paz", "Pzt", "Sal", "Çar", "Per", "Cum", "Cmt"),
                Lists.of("", "Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_kam() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("Ĩyakwakya", "Ĩyawĩoo"),
                Lists.of("MY", "IY"),
                Lists.of("Mwai wa mbee", "Mwai wa kelĩ", "Mwai wa katatũ", "Mwai wa kana", "Mwai wa katano", "Mwai wa thanthatũ", "Mwai wa muonza", "Mwai wa nyaanya", "Mwai wa kenda", "Mwai wa ĩkumi", "Mwai wa ĩkumi na ĩmwe", "Mwai wa ĩkumi na ilĩ", ""),
                Lists.of("Mbe", "Kel", "Ktũ", "Kan", "Ktn", "Tha", "Moo", "Nya", "Knd", "Ĩku", "Ĩkm", "Ĩkl", ""),
                Lists.of("", "Wky", "Wkw", "Wkl", "Wtũ", "Wkn", "Wtn", "Wth"),
                Lists.of("", "Wa kyumwa", "Wa kwambĩlĩlya", "Wa kelĩ", "Wa katatũ", "Wa kana", "Wa katano", "Wa thanthatũ"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ee() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ŋdi", "ɣetrɔ"),
                Lists.of("hY", "Yŋ"),
                Lists.of("dzove", "dzodze", "tedoxe", "afɔfĩe", "dama", "masa", "siamlɔm", "deasiamime", "anyɔnyɔ", "kele", "adeɛmekpɔxe", "dzome", ""),
                Lists.of("dzv", "dzd", "ted", "afɔ", "dam", "mas", "sia", "dea", "any", "kel", "ade", "dzm", ""),
                Lists.of("", "kɔs", "dzo", "bla", "kuɖ", "yaw", "fiɖ", "mem"),
                Lists.of("", "kɔsiɖa", "dzoɖa", "blaɖa", "kuɖa", "yawoɖa", "fiɖa", "memleɖa"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_mas() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("Ɛnkakɛnyá", "Ɛndámâ"),
                Lists.of("MY", "EY"),
                Lists.of("Oladalʉ́", "Arát", "Ɔɛnɨ́ɔɨŋɔk", "Olodoyíóríê inkókúâ", "Oloilépūnyīē inkókúâ", "Kújúɔrɔk", "Mórusásin", "Ɔlɔ́ɨ́bɔ́rárɛ", "Kúshîn", "Olgísan", "Pʉshʉ́ka", "Ntʉ́ŋʉ́s", ""),
                Lists.of("Dal", "Ará", "Ɔɛn", "Doy", "Lép", "Rok", "Sás", "Bɔ́r", "Kús", "Gís", "Shʉ́", "Ntʉ́", ""),
                Lists.of("", "Jpi", "Jtt", "Jnn", "Jtn", "Alh", "Iju", "Jmo"),
                Lists.of("", "Jumapílí", "Jumatátu", "Jumane", "Jumatánɔ", "Alaámisi", "Jumáa", "Jumamósi"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_naq() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ǁgoagas", "ǃuias"),
                Lists.of("BC", "AD"),
                Lists.of("ǃKhanni", "ǃKhanǀgôab", "ǀKhuuǁkhâb", "ǃHôaǂkhaib", "ǃKhaitsâb", "Gamaǀaeb", "ǂKhoesaob", "Aoǁkhuumûǁkhâb", "Taraǀkhuumûǁkhâb", "ǂNûǁnâiseb", "ǀHooǂgaeb", "Hôasoreǁkhâb", ""),
                Lists.of("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", ""),
                Lists.of("", "Son", "Ma", "De", "Wu", "Do", "Fr", "Sat"),
                Lists.of("", "Sontaxtsees", "Mantaxtsees", "Denstaxtsees", "Wunstaxtsees", "Dondertaxtsees", "Fraitaxtsees", "Satertaxtsees"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_el() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("π.μ.", "μ.μ."),
                Lists.of("π.Χ.", "μ.Χ."),
                Lists.of("Ιανουαρίου", "Φεβρουαρίου", "Μαρτίου", "Απριλίου", "Μαΐου", "Ιουνίου", "Ιουλίου", "Αυγούστου", "Σεπτεμβρίου", "Οκτωβρίου", "Νοεμβρίου", "Δεκεμβρίου", ""),
                Lists.of("Ιαν", "Φεβ", "Μαρ", "Απρ", "Μαΐ", "Ιουν", "Ιουλ", "Αυγ", "Σεπ", "Οκτ", "Νοε", "Δεκ", ""),
                Lists.of("", "Κυρ", "Δευ", "Τρί", "Τετ", "Πέμ", "Παρ", "Σάβ"),
                Lists.of("", "Κυριακή", "Δευτέρα", "Τρίτη", "Τετάρτη", "Πέμπτη", "Παρασκευή", "Σάββατο"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ru() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ДП", "ПП"),
                Lists.of("до н. э.", "н. э."),
                Lists.of("января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря", ""),
                Lists.of("янв.", "февр.", "мар.", "апр.", "мая", "июн.", "июл.", "авг.", "сент.", "окт.", "нояб.", "дек.", ""),
                Lists.of("", "вс", "пн", "вт", "ср", "чт", "пт", "сб"),
                Lists.of("", "воскресенье", "понедельник", "вторник", "среда", "четверг", "пятница", "суббота"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_sah() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ЭИ", "ЭК"),
                Lists.of("б. э. и.", "б. э"),
                Lists.of("Тохсунньу", "Олунньу", "Кулун тутар", "Муус устар", "Ыам ыйын", "Бэс ыйын", "От ыйын", "Атырдьых ыйын", "Балаҕан ыйын", "Алтынньы", "Сэтинньи", "Ахсынньы", ""),
                Lists.of("Тохс", "Олун", "Клн_ттр", "Мус_уст", "Ыам_йн", "Бэс_йн", "От_йн", "Атрдь_йн", "Блҕн_йн", "Алт", "Сэт", "Ахс", ""),
                Lists.of("", "Бс", "Бн", "Оп", "Сэ", "Чп", "Бэ", "Сб"),
                Lists.of("", "Баскыһыанньа", "Бэнидиэлинньик", "Оптуорунньук", "Сэрэдэ", "Чэппиэр", "Бээтиҥсэ", "Субуота"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_be() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("да паўдня", "пасля паўдня"),
                Lists.of("да н.э.", "н.э."),
                Lists.of("студзеня", "лютага", "сакавіка", "красавіка", "мая", "чэрвеня", "ліпеня", "жніўня", "верасня", "кастрычніка", "лістапада", "снежня", ""),
                Lists.of("сту", "лют", "сак", "кра", "мая", "чэр", "ліп", "жні", "вер", "кас", "ліс", "сне", ""),
                Lists.of("", "нд", "пн", "аў", "ср", "чц", "пт", "сб"),
                Lists.of("", "нядзеля", "панядзелак", "аўторак", "серада", "чацвер", "пятніца", "субота"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_uk() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("дп", "пп"),
                Lists.of("до н. е.", "н. е."),
                Lists.of("січня", "лютого", "березня", "квітня", "травня", "червня", "липня", "серпня", "вересня", "жовтня", "листопада", "грудня", ""),
                Lists.of("січ.", "лют.", "бер.", "квіт.", "трав.", "черв.", "лип.", "серп.", "вер.", "жовт.", "лист.", "груд.", ""),
                Lists.of("", "Нд", "Пн", "Вт", "Ср", "Чт", "Пт", "Сб"),
                Lists.of("", "неділя", "понеділок", "вівторок", "середа", "четвер", "пʼятниця", "субота"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_bg() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("пр.об.", "сл.об."),
                Lists.of("пр.Хр.", "сл.Хр."),
                Lists.of("януари", "февруари", "март", "април", "май", "юни", "юли", "август", "септември", "октомври", "ноември", "декември", ""),
                Lists.of("яну", "фев", "март", "апр", "май", "юни", "юли", "авг", "сеп", "окт", "ное", "дек", ""),
                Lists.of("", "нд", "пн", "вт", "ср", "чт", "пт", "сб"),
                Lists.of("", "неделя", "понеделник", "вторник", "сряда", "четвъртък", "петък", "събота"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_sr() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("пре подне", "по подне"),
                Lists.of("п. н. е.", "н. е."),
                Lists.of("јануар", "фебруар", "март", "април", "мај", "јун", "јул", "август", "септембар", "октобар", "новембар", "децембар", ""),
                Lists.of("јан", "феб", "мар", "апр", "мај", "јун", "јул", "авг", "сеп", "окт", "нов", "дец", ""),
                Lists.of("", "нед", "пон", "уто", "сре", "чет", "пет", "суб"),
                Lists.of("", "недеља", "понедељак", "уторак", "среда", "четвртак", "петак", "субота"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_bs__Cyrl() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("пре подне", "поподне"),
                Lists.of("п. н. е.", "н. е."),
                Lists.of("јануар", "фебруар", "март", "април", "мај", "јуни", "јули", "август", "септембар", "октобар", "новембар", "децембар", ""),
                Lists.of("јан", "феб", "мар", "апр", "мај", "јун", "јул", "авг", "сеп", "окт", "нов", "дец", ""),
                Lists.of("", "нед", "пон", "уто", "сри", "чет", "пет", "суб"),
                Lists.of("", "недеља", "понедељак", "уторак", "сриједа", "четвртак", "петак", "субота"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_mk() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("претпладне", "попладне"),
                Lists.of("пр.н.е.", "н.е."),
                Lists.of("јануари", "февруари", "март", "април", "мај", "јуни", "јули", "август", "септември", "октомври", "ноември", "декември", ""),
                Lists.of("јан.", "фев.", "мар.", "апр.", "мај", "јун.", "јул.", "авг.", "септ.", "окт.", "ноем.", "дек.", ""),
                Lists.of("", "нед.", "пон.", "вт.", "сре.", "чет.", "пет.", "саб."),
                Lists.of("", "недела", "понеделник", "вторник", "среда", "четврток", "петок", "сабота"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ky() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("таңкы", "түштөн кийинки"),
                Lists.of("б.з.ч.", "б.з."),
                Lists.of("январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь", ""),
                Lists.of("янв.", "фев.", "мар.", "апр.", "май", "июн.", "июл.", "авг.", "сен.", "окт.", "ноя.", "дек.", ""),
                Lists.of("", "жек.", "дүй.", "шейш.", "шарш.", "бейш.", "жума", "ишм."),
                Lists.of("", "жекшемби", "дүйшөмбү", "шейшемби", "шаршемби", "бейшемби", "жума", "ишемби"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_kk() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("таңғы", "түскі/кешкі"),
                Lists.of("б.з.д.", "б.з."),
                Lists.of("қаңтар", "ақпан", "наурыз", "сәуір", "мамыр", "маусым", "шілде", "тамыз", "қыркүйек", "қазан", "қараша", "желтоқсан", ""),
                Lists.of("қаң.", "ақп.", "нау.", "сәу.", "мам.", "мау.", "шіл.", "там.", "қыр.", "қаз.", "қар.", "жел.", ""),
                Lists.of("", "Жс", "Дс", "Сс", "Ср", "Бс", "Жм", "Сб"),
                Lists.of("", "жексенбі", "дүйсенбі", "сейсенбі", "сәрсенбі", "бейсенбі", "жұма", "сенбі"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_mn() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ҮӨ", "ҮХ"),
                Lists.of("м.э.ө", "м.э."),
                Lists.of("Нэгдүгээр сар", "Хоёрдугаар сар", "Гуравдугаар сар", "Дөрөвдүгээр сар", "Тавдугаар сар", "Зургадугаар сар", "Долдугаар сар", "Наймдугаар сар", "Есдүгээр сар", "Аравдугаар сар", "Арван нэгдүгээр сар", "Арван хоёрдугаар сар", ""),
                Lists.of("1-р сар", "2-р сар", "3-р сар", "4-р сар", "5-р сар", "6-р сар", "7-р сар", "8-р сар", "9-р сар", "10-р сар", "11-р сар", "12-р сар", ""),
                Lists.of("", "Ня", "Да", "Мя", "Лх", "Пү", "Ба", "Бя"),
                Lists.of("", "ням", "даваа", "мягмар", "лхагва", "пүрэв", "баасан", "бямба"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_os() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ӕмбисбоны размӕ", "ӕмбисбоны фӕстӕ"),
                Lists.of("н.д.а.", "н.д."),
                Lists.of("январы", "февралы", "мартъийы", "апрелы", "майы", "июны", "июлы", "августы", "сентябры", "октябры", "ноябры", "декабры", ""),
                Lists.of("янв.", "фев.", "мар.", "апр.", "майы", "июны", "июлы", "авг.", "сен.", "окт.", "ноя.", "дек.", ""),
                Lists.of("", "хцб", "крс", "дцг", "ӕрт", "цпр", "мрб", "сбт"),
                Lists.of("", "хуыцаубон", "къуырисӕр", "дыццӕг", "ӕртыццӕг", "цыппӕрӕм", "майрӕмбон", "сабат"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_iw() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("לפנה״צ", "אחה״צ"),
                Lists.of("לפנה״ס", "לספירה"),
                Lists.of("ינואר", "פברואר", "מרץ", "אפריל", "מאי", "יוני", "יולי", "אוגוסט", "ספטמבר", "אוקטובר", "נובמבר", "דצמבר", ""),
                Lists.of("ינו׳", "פבר׳", "מרץ", "אפר׳", "מאי", "יוני", "יולי", "אוג׳", "ספט׳", "אוק׳", "נוב׳", "דצמ׳", ""),
                Lists.of("", "יום א׳", "יום ב׳", "יום ג׳", "יום ד׳", "יום ה׳", "יום ו׳", "שבת"),
                Lists.of("", "יום ראשון", "יום שני", "יום שלישי", "יום רביעי", "יום חמישי", "יום שישי", "יום שבת"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ji() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("פֿאַרמיטאָג", "נאָכמיטאָג"),
                Lists.of("BCE", "CE"),
                Lists.of("יאַנואַר", "פֿעברואַר", "מערץ", "אַפּריל", "מיי", "יוני", "יולי", "אויגוסט", "סעפּטעמבער", "אקטאבער", "נאוועמבער", "דעצעמבער", ""),
                Lists.of("יאַנואַר", "פֿעברואַר", "מערץ", "אַפּריל", "מיי", "יוני", "יולי", "אויגוסט", "סעפּטעמבער", "אקטאבער", "נאוועמבער", "דעצעמבער", ""),
                Lists.of("", "זונטיק", "מאָנטיק", "דינסטיק", "מיטוואך", "דאנערשטיק", "פֿרײַטיק", "שבת"),
                Lists.of("", "זונטיק", "מאָנטיק", "דינסטיק", "מיטוואך", "דאנערשטיק", "פֿרײַטיק", "שבת"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ar_DZ() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ص", "م"),
                Lists.of("ق.م", "م"),
                Lists.of("جانفي", "فيفري", "مارس", "أفريل", "ماي", "جوان", "جويلية", "أوت", "سبتمبر", "أكتوبر", "نوفمبر", "ديسمبر", ""),
                Lists.of("جانفي", "فيفري", "مارس", "أفريل", "ماي", "جوان", "جويلية", "أوت", "سبتمبر", "أكتوبر", "نوفمبر", "ديسمبر", ""),
                Lists.of("", "الأحد", "الاثنين", "الثلاثاء", "الأربعاء", "الخميس", "الجمعة", "السبت"),
                Lists.of("", "الأحد", "الاثنين", "الثلاثاء", "الأربعاء", "الخميس", "الجمعة", "السبت"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ar_JO() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ص", "م"),
                Lists.of("ق.م", "م"),
                Lists.of("كانون الثاني", "شباط", "آذار", "نيسان", "أيار", "حزيران", "تموز", "آب", "أيلول", "تشرين الأول", "تشرين الثاني", "كانون الأول", ""),
                Lists.of("كانون الثاني", "شباط", "آذار", "نيسان", "أيار", "حزيران", "تموز", "آب", "أيلول", "تشرين الأول", "تشرين الثاني", "كانون الأول", ""),
                Lists.of("", "الأحد", "الاثنين", "الثلاثاء", "الأربعاء", "الخميس", "الجمعة", "السبت"),
                Lists.of("", "الأحد", "الاثنين", "الثلاثاء", "الأربعاء", "الخميس", "الجمعة", "السبت"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ar_IQ() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ص", "م"),
                Lists.of("ق.م", "م"),
                Lists.of("كانون الثاني", "شباط", "آذار", "نيسان", "أيار", "حزيران", "تموز", "آب", "أيلول", "تشرين الأول", "تشرين الثاني", "كانون الأول", ""),
                Lists.of("كانون الثاني", "شباط", "آذار", "نيسان", "أيار", "حزيران", "تموز", "آب", "أيلول", "تشرین الأول", "تشرين الثاني", "كانون الأول", ""),
                Lists.of("", "الأحد", "الاثنين", "الثلاثاء", "الأربعاء", "الخميس", "الجمعة", "السبت"),
                Lists.of("", "الأحد", "الاثنين", "الثلاثاء", "الأربعاء", "الخميس", "الجمعة", "السبت"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ar_MA() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ص", "م"),
                Lists.of("ق.م", "م"),
                Lists.of("يناير", "فبراير", "مارس", "أبريل", "ماي", "يونيو", "يوليوز", "غشت", "شتنبر", "أكتوبر", "نونبر", "دجنبر", ""),
                Lists.of("يناير", "فبراير", "مارس", "أبريل", "ماي", "يونيو", "يوليوز", "غشت", "شتنبر", "أكتوبر", "نونبر", "دجنبر", ""),
                Lists.of("", "الأحد", "الاثنين", "الثلاثاء", "الأربعاء", "الخميس", "الجمعة", "السبت"),
                Lists.of("", "الأحد", "الاثنين", "الثلاثاء", "الأربعاء", "الخميس", "الجمعة", "السبت"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ar() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ص", "م"),
                Lists.of("ق.م", "م"),
                Lists.of("يناير", "فبراير", "مارس", "أبريل", "مايو", "يونيو", "يوليو", "أغسطس", "سبتمبر", "أكتوبر", "نوفمبر", "ديسمبر", ""),
                Lists.of("يناير", "فبراير", "مارس", "أبريل", "مايو", "يونيو", "يوليو", "أغسطس", "سبتمبر", "أكتوبر", "نوفمبر", "ديسمبر", ""),
                Lists.of("", "الأحد", "الاثنين", "الثلاثاء", "الأربعاء", "الخميس", "الجمعة", "السبت"),
                Lists.of("", "الأحد", "الاثنين", "الثلاثاء", "الأربعاء", "الخميس", "الجمعة", "السبت"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ar_MR() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ص", "م"),
                Lists.of("ق.م", "م"),
                Lists.of("يناير", "فبراير", "مارس", "إبريل", "مايو", "يونيو", "يوليو", "أغشت", "شتمبر", "أكتوبر", "نوفمبر", "دجمبر", ""),
                Lists.of("يناير", "فبراير", "مارس", "إبريل", "مايو", "يونيو", "يوليو", "أغشت", "شتمبر", "أكتوبر", "نوفمبر", "دجمبر", ""),
                Lists.of("", "الأحد", "الاثنين", "الثلاثاء", "الأربعاء", "الخميس", "الجمعة", "السبت"),
                Lists.of("", "الأحد", "الاثنين", "الثلاثاء", "الأربعاء", "الخميس", "الجمعة", "السبت"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ps() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("غ.م.", "غ.و."),
                Lists.of("ق.م.", "م."),
                Lists.of("جنوري", "فبروري", "مارچ", "اپریل", "می", "جون", "جولای", "اګست", "سپتمبر", "اکتوبر", "نومبر", "دسمبر", ""),
                Lists.of("جنوري", "فبروري", "مارچ", "اپریل", "می", "جون", "جولای", "اګست", "سپتمبر", "اکتوبر", "نومبر", "دسمبر", ""),
                Lists.of("", "یکشنبه", "دوشنبه", "سه‌شنبه", "چهارشنبه", "پنجشنبه", "جمعه", "شنبه"),
                Lists.of("", "یکشنبه", "دوشنبه", "سه‌شنبه", "چهارشنبه", "پنجشنبه", "جمعه", "شنبه"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ur() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("قبل دوپہر", "بعد دوپہر"),
                Lists.of("قبل مسیح", "عیسوی"),
                Lists.of("جنوری", "فروری", "مارچ", "اپریل", "مئی", "جون", "جولائی", "اگست", "ستمبر", "اکتوبر", "نومبر", "دسمبر", ""),
                Lists.of("جنوری", "فروری", "مارچ", "اپریل", "مئی", "جون", "جولائی", "اگست", "ستمبر", "اکتوبر", "نومبر", "دسمبر", ""),
                Lists.of("", "اتوار", "سوموار", "منگل", "بدھ", "جمعرات", "جمعہ", "ہفتہ"),
                Lists.of("", "اتوار", "سوموار", "منگل", "بدھ", "جمعرات", "جمعہ", "ہفتہ"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_fa_AF() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("قبل‌ازظهر", "بعدازظهر"),
                Lists.of("ق.م.", "م."),
                Lists.of("جنوری", "فبروری", "مارچ", "اپریل", "می", "جون", "جولای", "اگست", "سپتمبر", "اکتوبر", "نومبر", "دسمبر", ""),
                Lists.of("جنو", "فبروری", "مارچ", "اپریل", "می", "جون", "جول", "اگست", "سپتمبر", "اکتوبر", "نومبر", "دسم", ""),
                Lists.of("", "یکشنبه", "دوشنبه", "سه‌شنبه", "چهارشنبه", "پنجشنبه", "جمعه", "شنبه"),
                Lists.of("", "یکشنبه", "دوشنبه", "سه‌شنبه", "چهارشنبه", "پنجشنبه", "جمعه", "شنبه"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_fa() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("قبل‌ازظهر", "بعدازظهر"),
                Lists.of("ق.م.", "م."),
                Lists.of("ژانویهٔ", "فوریهٔ", "مارس", "آوریل", "مهٔ", "ژوئن", "ژوئیهٔ", "اوت", "سپتامبر", "اکتبر", "نوامبر", "دسامبر", ""),
                Lists.of("ژانویهٔ", "فوریهٔ", "مارس", "آوریل", "مهٔ", "ژوئن", "ژوئیهٔ", "اوت", "سپتامبر", "اکتبر", "نوامبر", "دسامبر", ""),
                Lists.of("", "یکشنبه", "دوشنبه", "سه‌شنبه", "چهارشنبه", "پنجشنبه", "جمعه", "شنبه"),
                Lists.of("", "یکشنبه", "دوشنبه", "سه‌شنبه", "چهارشنبه", "پنجشنبه", "جمعه", "شنبه"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ug() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("چۈشتىن بۇرۇن", "چۈشتىن كېيىن"),
                Lists.of("BCE", "مىلادىيە"),
                Lists.of("يانۋار", "فېۋرال", "مارت", "ئاپرېل", "ماي", "ئىيۇن", "ئىيۇل", "ئاۋغۇست", "سېنتەبىر", "ئۆكتەبىر", "نويابىر", "دېكابىر", ""),
                Lists.of("يانۋار", "فېۋرال", "مارت", "ئاپرېل", "ماي", "ئىيۇن", "ئىيۇل", "ئاۋغۇست", "سېنتەبىر", "ئۆكتەبىر", "نويابىر", "دېكابىر", ""),
                Lists.of("", "يە", "دۈ", "سە", "چا", "پە", "جۈ", "شە"),
                Lists.of("", "يەكشەنبە", "دۈشەنبە", "سەيشەنبە", "چارشەنبە", "پەيشەنبە", "جۈمە", "شەنبە"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ne() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("पूर्वाह्न", "अपराह्न"),
                Lists.of("ईसा पूर्व", "सन्"),
                Lists.of("जनवरी", "फेब्रुअरी", "मार्च", "अप्रिल", "मई", "जुन", "जुलाई", "अगस्ट", "सेप्टेम्बर", "अक्टोबर", "नोभेम्बर", "डिसेम्बर", ""),
                Lists.of("जनवरी", "फेब्रुअरी", "मार्च", "अप्रिल", "मे", "जुन", "जुलाई", "अगस्ट", "सेप्टेम्बर", "अक्टोबर", "नोभेम्बर", "डिसेम्बर", ""),
                Lists.of("", "आइत", "सोम", "मङ्गल", "बुध", "बिही", "शुक्र", "शनि"),
                Lists.of("", "आइतबार", "सोमबार", "मङ्गलबार", "बुधबार", "बिहिबार", "शुक्रबार", "शनिबार"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_hi() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("पूर्वाह्न", "अपराह्न"),
                Lists.of("ईसा-पूर्व", "ईस्वी"),
                Lists.of("जनवरी", "फ़रवरी", "मार्च", "अप्रैल", "मई", "जून", "जुलाई", "अगस्त", "सितंबर", "अक्तूबर", "नवंबर", "दिसंबर", ""),
                Lists.of("जन॰", "फ़र॰", "मार्च", "अप्रैल", "मई", "जून", "जुल॰", "अग॰", "सित॰", "अक्तू॰", "नव॰", "दिस॰", ""),
                Lists.of("", "रवि", "सोम", "मंगल", "बुध", "गुरु", "शुक्र", "शनि"),
                Lists.of("", "रविवार", "सोमवार", "मंगलवार", "बुधवार", "गुरुवार", "शुक्रवार", "शनिवार"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_brx() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("फुं", "बेलासे"),
                Lists.of("ईसा.पूर्व", "सन"),
                Lists.of("जानुवारी", "फेब्रुवारी", "मार्स", "एफ्रिल", "मे", "जुन", "जुलाइ", "आगस्थ", "सेबथेज्ब़र", "अखथबर", "नबेज्ब़र", "दिसेज्ब़र", ""),
                Lists.of("जानुवारी", "फेब्रुवारी", "मार्स", "एफ्रिल", "मे", "जुन", "जुलाइ", "आगस्थ", "सेबथेज्ब़र", "अखथबर", "नबेज्ब़र", "दिसेज्ब़र", ""),
                Lists.of("", "रबि", "सम", "मंगल", "बुद", "बिसथि", "सुखुर", "सुनि"),
                Lists.of("", "रबिबार", "समबार", "मंगलबार", "बुदबार", "बिसथिबार", "सुखुरबार", "सुनिबार"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_mr() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("म.पू.", "म.उ."),
                Lists.of("इ. स. पू.", "इ. स."),
                Lists.of("जानेवारी", "फेब्रुवारी", "मार्च", "एप्रिल", "मे", "जून", "जुलै", "ऑगस्ट", "सप्टेंबर", "ऑक्टोबर", "नोव्हेंबर", "डिसेंबर", ""),
                Lists.of("जाने", "फेब्रु", "मार्च", "एप्रि", "मे", "जून", "जुलै", "ऑग", "सप्टें", "ऑक्टो", "नोव्हें", "डिसें", ""),
                Lists.of("", "रवि", "सोम", "मंगळ", "बुध", "गुरु", "शुक्र", "शनि"),
                Lists.of("", "रविवार", "सोमवार", "मंगळवार", "बुधवार", "गुरुवार", "शुक्रवार", "शनिवार"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_kok() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("म.पू.", "म.नं."),
                Lists.of("क्रिस्तपूर्व", "क्रिस्तशखा"),
                Lists.of("जानेवारी", "फेब्रुवारी", "मार्च", "एप्रिल", "मे", "जून", "जुलै", "ओगस्ट", "सेप्टेंबर", "ओक्टोबर", "नोव्हेंबर", "डिसेंबर", ""),
                Lists.of("जानेवारी", "फेब्रुवारी", "मार्च", "एप्रिल", "मे", "जून", "जुलै", "ओगस्ट", "सेप्टेंबर", "ओक्टोबर", "नोव्हेंबर", "डिसेंबर", ""),
                Lists.of("", "रवि", "सोम", "मंगळ", "बुध", "गुरु", "शुक्र", "शनि"),
                Lists.of("", "आदित्यवार", "सोमवार", "मंगळार", "बुधवार", "गुरुवार", "शुक्रवार", "शनिवार"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_bn() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("পূর্বাহ্ণ", "অপরাহ্ণ"),
                Lists.of("খ্রিস্টপূর্ব", "খৃষ্টাব্দ"),
                Lists.of("জানুয়ারী", "ফেব্রুয়ারী", "মার্চ", "এপ্রিল", "মে", "জুন", "জুলাই", "আগস্ট", "সেপ্টেম্বর", "অক্টোবর", "নভেম্বর", "ডিসেম্বর", ""),
                Lists.of("জানুয়ারী", "ফেব্রুয়ারী", "মার্চ", "এপ্রিল", "মে", "জুন", "জুলাই", "আগস্ট", "সেপ্টেম্বর", "অক্টোবর", "নভেম্বর", "ডিসেম্বর", ""),
                Lists.of("", "রবি", "সোম", "মঙ্গল", "বুধ", "বৃহস্পতি", "শুক্র", "শনি"),
                Lists.of("", "রবিবার", "সোমবার", "মঙ্গলবার", "বুধবার", "বৃহস্পতিবার", "শুক্রবার", "শনিবার"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_as() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("পূৰ্বাহ্ণ", "অপৰাহ্ণ"),
                Lists.of("BCE", "CE"),
                Lists.of("জানুৱাৰী", "ফেব্ৰুৱাৰী", "মাৰ্চ", "এপ্ৰিল", "মে", "জুন", "জুলাই", "আগষ্ট", "ছেপ্তেম্বৰ", "অক্টোবৰ", "নৱেম্বৰ", "ডিচেম্বৰ", ""),
                Lists.of("জানু", "ফেব্ৰু", "মাৰ্চ", "এপ্ৰিল", "মে", "জুন", "জুলাই", "আগ", "সেপ্ট", "অক্টো", "নভে", "ডিসে", ""),
                Lists.of("", "ৰবি", "সোম", "মঙ্গল", "বুধ", "বৃহষ্পতি", "শুক্ৰ", "শনি"),
                Lists.of("", "দেওবাৰ", "সোমবাৰ", "মঙ্গলবাৰ", "বুধবাৰ", "বৃহষ্পতিবাৰ", "শুক্ৰবাৰ", "শনিবাৰ"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_pa() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ਪੂ.ਦੁ.", "ਬਾ.ਦੁ."),
                Lists.of("ਈ. ਪੂ.", "ਸੰਨ"),
                Lists.of("ਜਨਵਰੀ", "ਫ਼ਰਵਰੀ", "ਮਾਰਚ", "ਅਪ੍ਰੈਲ", "ਮਈ", "ਜੂਨ", "ਜੁਲਾਈ", "ਅਗਸਤ", "ਸਤੰਬਰ", "ਅਕਤੂਬਰ", "ਨਵੰਬਰ", "ਦਸੰਬਰ", ""),
                Lists.of("ਜਨ", "ਫ਼ਰ", "ਮਾਰਚ", "ਅਪ੍ਰੈ", "ਮਈ", "ਜੂਨ", "ਜੁਲਾ", "ਅਗ", "ਸਤੰ", "ਅਕਤੂ", "ਨਵੰ", "ਦਸੰ", ""),
                Lists.of("", "ਐਤ", "ਸੋਮ", "ਮੰਗਲ", "ਬੁੱਧ", "ਵੀਰ", "ਸ਼ੁੱਕਰ", "ਸ਼ਨਿੱਚਰ"),
                Lists.of("", "ਐਤਵਾਰ", "ਸੋਮਵਾਰ", "ਮੰਗਲਵਾਰ", "ਬੁੱਧਵਾਰ", "ਵੀਰਵਾਰ", "ਸ਼ੁੱਕਰਵਾਰ", "ਸ਼ਨਿੱਚਰਵਾਰ"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ta() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("முற்பகல்", "பிற்பகல்"),
                Lists.of("கி.மு.", "கி.பி."),
                Lists.of("ஜனவரி", "பிப்ரவரி", "மார்ச்", "ஏப்ரல்", "மே", "ஜூன்", "ஜூலை", "ஆகஸ்ட்", "செப்டம்பர்", "அக்டோபர்", "நவம்பர்", "டிசம்பர்", ""),
                Lists.of("ஜன.", "பிப்.", "மார்.", "ஏப்.", "மே", "ஜூன்", "ஜூலை", "ஆக.", "செப்.", "அக்.", "நவ.", "டிச.", ""),
                Lists.of("", "ஞாயி.", "திங்.", "செவ்.", "புத.", "வியா.", "வெள்.", "சனி"),
                Lists.of("", "ஞாயிறு", "திங்கள்", "செவ்வாய்", "புதன்", "வியாழன்", "வெள்ளி", "சனி"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_kn() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ಪೂರ್ವಾಹ್ನ", "ಅಪರಾಹ್ನ"),
                Lists.of("ಕ್ರಿ.ಪೂ", "ಕ್ರಿ.ಶ"),
                Lists.of("ಜನವರಿ", "ಫೆಬ್ರವರಿ", "ಮಾರ್ಚ್", "ಏಪ್ರಿಲ್", "ಮೇ", "ಜೂನ್", "ಜುಲೈ", "ಆಗಸ್ಟ್", "ಸೆಪ್ಟೆಂಬರ್", "ಅಕ್ಟೋಬರ್", "ನವೆಂಬರ್", "ಡಿಸೆಂಬರ್", ""),
                Lists.of("ಜನ", "ಫೆಬ್ರ", "ಮಾರ್ಚ್", "ಏಪ್ರಿ", "ಮೇ", "ಜೂನ್", "ಜುಲೈ", "ಆಗ", "ಸೆಪ್ಟೆಂ", "ಅಕ್ಟೋ", "ನವೆಂ", "ಡಿಸೆಂ", ""),
                Lists.of("", "ಭಾನು", "ಸೋಮ", "ಮಂಗಳ", "ಬುಧ", "ಗುರು", "ಶುಕ್ರ", "ಶನಿ"),
                Lists.of("", "ಭಾನುವಾರ", "ಸೋಮವಾರ", "ಮಂಗಳವಾರ", "ಬುಧವಾರ", "ಗುರುವಾರ", "ಶುಕ್ರವಾರ", "ಶನಿವಾರ"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_si() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("පෙ.ව.", "ප.ව."),
                Lists.of("ක්‍රි.පූ.", "ක්‍රි.ව."),
                Lists.of("ජනවාරි", "පෙබරවාරි", "මාර්තු", "අප්‍රේල්", "මැයි", "ජූනි", "ජූලි", "අගෝස්තු", "සැප්තැම්බර්", "ඔක්තෝබර්", "නොවැම්බර්", "දෙසැම්බර්", ""),
                Lists.of("ජන", "පෙබ", "මාර්තු", "අප්‍රේල්", "මැයි", "ජූනි", "ජූලි", "අගෝ", "සැප්", "ඔක්", "නොවැ", "දෙසැ", ""),
                Lists.of("", "ඉරිදා", "සඳුදා", "අඟහ", "බදාදා", "බ්‍රහස්", "සිකු", "සෙන"),
                Lists.of("", "ඉරිදා", "සඳුදා", "අඟහරුවාදා", "බදාදා", "බ්‍රහස්පතින්දා", "සිකුරාදා", "සෙනසුරාදා"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_th() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ก่อนเที่ยง", "หลังเที่ยง"),
                Lists.of("ปีก่อน ค.ศ.", "ค.ศ."),
                Lists.of("มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม", ""),
                Lists.of("ม.ค.", "ก.พ.", "มี.ค.", "เม.ย.", "พ.ค.", "มิ.ย.", "ก.ค.", "ส.ค.", "ก.ย.", "ต.ค.", "พ.ย.", "ธ.ค.", ""),
                Lists.of("", "อา.", "จ.", "อ.", "พ.", "พฤ.", "ศ.", "ส."),
                Lists.of("", "วันอาทิตย์", "วันจันทร์", "วันอังคาร", "วันพุธ", "วันพฤหัสบดี", "วันศุกร์", "วันเสาร์"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_lo() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ກ່ອນທ່ຽງ", "ຫຼັງທ່ຽງ"),
                Lists.of("ກ່ອນ ຄ.ສ.", "ຄ.ສ."),
                Lists.of("ມັງກອນ", "ກຸມພາ", "ມີນາ", "ເມສາ", "ພຶດສະພາ", "ມິຖຸນາ", "ກໍລະກົດ", "ສິງຫາ", "ກັນຍາ", "ຕຸລາ", "ພະຈິກ", "ທັນວາ", ""),
                Lists.of("ມ.ກ.", "ກ.ພ.", "ມ.ນ.", "ມ.ສ.", "ພ.ພ.", "ມິ.ຖ.", "ກ.ລ.", "ສ.ຫ.", "ກ.ຍ.", "ຕ.ລ.", "ພ.ຈ.", "ທ.ວ.", ""),
                Lists.of("", "ວັນອາທິດ", "ວັນຈັນ", "ວັນອັງຄານ", "ວັນພຸດ", "ວັນພະຫັດ", "ວັນສຸກ", "ວັນເສົາ"),
                Lists.of("", "ວັນອາທິດ", "ວັນຈັນ", "ວັນອັງຄານ", "ວັນພຸດ", "ວັນພະຫັດ", "ວັນສຸກ", "ວັນເສົາ"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_dz() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("སྔ་ཆ་", "ཕྱི་ཆ་"),
                Lists.of("BCE", "CE"),
                Lists.of("ཟླ་དངཔ་", "ཟླ་གཉིས་པ་", "ཟླ་གསུམ་པ་", "ཟླ་བཞི་པ་", "ཟླ་ལྔ་པ་", "ཟླ་དྲུག་པ", "ཟླ་བདུན་པ་", "ཟླ་བརྒྱད་པ་", "ཟླ་དགུ་པ་", "ཟླ་བཅུ་པ་", "ཟླ་བཅུ་གཅིག་པ་", "ཟླ་བཅུ་གཉིས་པ་", ""),
                Lists.of("༡", "༢", "༣", "༤", "༥", "༦", "༧", "༨", "༩", "༡༠", "༡༡", "12", ""),
                Lists.of("", "ཟླ་", "མིར་", "ལྷག་", "ཕུར་", "སངས་", "སྤེན་", "ཉི་"),
                Lists.of("", "གཟའ་ཟླ་བ་", "གཟའ་མིག་དམར་", "གཟའ་ལྷག་པ་", "གཟའ་ཕུར་བུ་", "གཟའ་པ་སངས་", "གཟའ་སྤེན་པ་", "གཟའ་ཉི་མ་"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_bo() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("སྔ་དྲོ་", "ཕྱི་དྲོ་"),
                Lists.of("སྤྱི་ལོ་སྔོན་", "སྤྱི་ལོ་"),
                Lists.of("ཟླ་བ་དང་པོ", "ཟླ་བ་གཉིས་པ", "ཟླ་བ་གསུམ་པ", "ཟླ་བ་བཞི་པ", "ཟླ་བ་ལྔ་པ", "ཟླ་བ་དྲུག་པ", "ཟླ་བ་བདུན་པ", "ཟླ་བ་བརྒྱད་པ", "ཟླ་བ་དགུ་པ", "ཟླ་བ་བཅུ་པ", "ཟླ་བ་བཅུ་གཅིག་པ", "ཟླ་བ་བཅུ་གཉིས་པ", ""),
                Lists.of("ཟླ་༡", "ཟླ་༢", "ཟླ་༣", "ཟླ་༤", "ཟླ་༥", "ཟླ་༦", "ཟླ་༧", "ཟླ་༨", "ཟླ་༩", "ཟླ་༡༠", "ཟླ་༡༡", "ཟླ་༡༢", ""),
                Lists.of("", "ཉི་མ་", "ཟླ་བ་", "མིག་དམར་", "ལྷག་པ་", "ཕུར་བུ་", "པ་སངས་", "སྤེན་པ་"),
                Lists.of("", "གཟའ་ཉི་མ་", "གཟའ་ཟླ་བ་", "གཟའ་མིག་དམར་", "གཟའ་ལྷག་པ་", "གཟའ་ཕུར་བུ་", "གཟའ་པ་སངས་", "གཟའ་སྤེན་པ་"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_my() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("နံနက်", "ညနေ"),
                Lists.of("ဘီစီ", "အေဒီ"),
                Lists.of("ဇန်နဝါရီ", "ဖေဖော်ဝါရီ", "မတ်", "ဧပြီ", "မေ", "ဇွန်", "ဇူလိုင်", "ဩဂုတ်", "စက်တင်ဘာ", "အောက်တိုဘာ", "နိုဝင်ဘာ", "ဒီဇင်ဘာ", ""),
                Lists.of("ဇန်", "ဖေ", "မတ်", "ဧပြီ", "မေ", "ဇွန်", "ဇူ", "ဩ", "စက်", "အောက်", "နို", "ဒီ", ""),
                Lists.of("", "တနင်္ဂနွေ", "တနင်္လာ", "အင်္ဂါ", "ဗုဒ္ဓဟူး", "ကြာသပတေး", "သောကြာ", "စနေ"),
                Lists.of("", "တနင်္ဂနွေ", "တနင်္လာ", "အင်္ဂါ", "ဗုဒ္ဓဟူး", "ကြာသပတေး", "သောကြာ", "စနေ"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ti() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ንጉሆ ሰዓተ", "ድሕር ሰዓት"),
                Lists.of("ዓ/ዓ", "ዓ/ም"),
                Lists.of("ጃንዩወሪ", "ፌብሩወሪ", "ማርች", "ኤፕረል", "ሜይ", "ጁን", "ጁላይ", "ኦገስት", "ሴፕቴምበር", "ኦክተውበር", "ኖቬምበር", "ዲሴምበር", ""),
                Lists.of("ጃንዩ", "ፌብሩ", "ማርች", "ኤፕረ", "ሜይ", "ጁን", "ጁላይ", "ኦገስ", "ሴፕቴ", "ኦክተ", "ኖቬም", "ዲሴም", ""),
                Lists.of("", "ሰንበት", "ሰኑይ", "ሠሉስ", "ረቡዕ", "ኃሙስ", "ዓርቢ", "ቀዳም"),
                Lists.of("", "ሰንበት", "ሰኑይ", "ሠሉስ", "ረቡዕ", "ኃሙስ", "ዓርቢ", "ቀዳም"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ti_ER() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ንጉሆ ሰዓተ", "ድሕር ሰዓት"),
                Lists.of("ዓ/ዓ", "ዓ/ም"),
                Lists.of("ጥሪ", "ለካቲት", "መጋቢት", "ሚያዝያ", "ግንቦት", "ሰነ", "ሓምለ", "ነሓሰ", "መስከረም", "ጥቅምቲ", "ሕዳር", "ታሕሳስ", ""),
                Lists.of("ጥሪ", "ለካቲ", "መጋቢ", "ሚያዝ", "ግንቦ", "ሰነ", "ሓምለ", "ነሓሰ", "መስከ", "ጥቅም", "ሕዳር", "ታሕሳ", ""),
                Lists.of("", "ሰንበት", "ሰኑይ", "ሰሉስ", "ረቡዕ", "ሓሙስ", "ዓርቢ", "ቀዳም"),
                Lists.of("", "ሰንበት", "ሰኑይ", "ሰሉስ", "ረቡዕ", "ሓሙስ", "ዓርቢ", "ቀዳም"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_am() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ጥዋት", "ከሰዓት"),
                Lists.of("ዓ/ዓ", "ዓ/ም"),
                Lists.of("ጃንዩወሪ", "ፌብሩወሪ", "ማርች", "ኤፕሪል", "ሜይ", "ጁን", "ጁላይ", "ኦገስት", "ሴፕቴምበር", "ኦክቶበር", "ኖቬምበር", "ዲሴምበር", ""),
                Lists.of("ጃንዩ", "ፌብሩ", "ማርች", "ኤፕሪ", "ሜይ", "ጁን", "ጁላይ", "ኦገስ", "ሴፕቴ", "ኦክቶ", "ኖቬም", "ዲሴም", ""),
                Lists.of("", "እሑድ", "ሰኞ", "ማክሰ", "ረቡዕ", "ሐሙስ", "ዓርብ", "ቅዳሜ"),
                Lists.of("", "እሑድ", "ሰኞ", "ማክሰኞ", "ረቡዕ", "ሐሙስ", "ዓርብ", "ቅዳሜ"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_chr() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ᏌᎾᎴ", "ᏒᎯᏱᎢᏗᏢ"),
                Lists.of("ᎤᏓᎷᎸ", "ᎤᎶᏐᏅ"),
                Lists.of("ᎤᏃᎸᏔᏅ", "ᎧᎦᎵ", "ᎠᏅᏱ", "ᎧᏬᏂ", "ᎠᏂᏍᎬᏘ", "ᏕᎭᎷᏱ", "ᎫᏰᏉᏂ", "ᎦᎶᏂ", "ᏚᎵᏍᏗ", "ᏚᏂᏅᏗ", "ᏅᏓᏕᏆ", "ᎥᏍᎩᏱ", ""),
                Lists.of("ᎤᏃ", "ᎧᎦ", "ᎠᏅ", "ᎧᏬ", "ᎠᏂ", "ᏕᎭ", "ᎫᏰ", "ᎦᎶ", "ᏚᎵ", "ᏚᏂ", "ᏅᏓ", "ᎥᏍ", ""),
                Lists.of("", "ᏆᏍᎬ", "ᏉᏅᎯ", "ᏔᎵᏁ", "ᏦᎢᏁ", "ᏅᎩᏁ", "ᏧᎾᎩ", "ᏈᏕᎾ"),
                Lists.of("", "ᎤᎾᏙᏓᏆᏍᎬ", "ᎤᎾᏙᏓᏉᏅᎯ", "ᏔᎵᏁᎢᎦ", "ᏦᎢᏁᎢᎦ", "ᏅᎩᏁᎢᎦ", "ᏧᎾᎩᎶᏍᏗ", "ᎤᎾᏙᏓᏈᏕᎾ"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_km() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ព្រឹក", "ល្ងាច"),
                Lists.of("មុន គ.ស.", "គ.ស."),
                Lists.of("មករា", "កុម្ភៈ", "មីនា", "មេសា", "ឧសភា", "មិថុនា", "កក្កដា", "សីហា", "កញ្ញា", "តុលា", "វិច្ឆិកា", "ធ្នូ", ""),
                Lists.of("មករា", "កុម្ភៈ", "មីនា", "មេសា", "ឧសភា", "មិថុនា", "កក្កដា", "សីហា", "កញ្ញា", "តុលា", "វិច្ឆិកា", "ធ្នូ", ""),
                Lists.of("", "អាទិត្យ", "ច័ន្ទ", "អង្គារ", "ពុធ", "ព្រហស្បតិ៍", "សុក្រ", "សៅរ៍"),
                Lists.of("", "អាទិត្យ", "ច័ន្ទ", "អង្គារ", "ពុធ", "ព្រហស្បតិ៍", "សុក្រ", "សៅរ៍"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_zgh() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ⵜⵉⴼⴰⵡⵜ", "ⵜⴰⴷⴳⴳⵯⴰⵜ"),
                Lists.of("ⴷⴰⵄ", "ⴷⴼⵄ"),
                Lists.of("ⵉⵏⵏⴰⵢⵔ", "ⴱⵕⴰⵢⵕ", "ⵎⴰⵕⵚ", "ⵉⴱⵔⵉⵔ", "ⵎⴰⵢⵢⵓ", "ⵢⵓⵏⵢⵓ", "ⵢⵓⵍⵢⵓⵣ", "ⵖⵓⵛⵜ", "ⵛⵓⵜⴰⵏⴱⵉⵔ", "ⴽⵜⵓⴱⵔ", "ⵏⵓⵡⴰⵏⴱⵉⵔ", "ⴷⵓⵊⴰⵏⴱⵉⵔ", ""),
                Lists.of("ⵉⵏⵏ", "ⴱⵕⴰ", "ⵎⴰⵕ", "ⵉⴱⵔ", "ⵎⴰⵢ", "ⵢⵓⵏ", "ⵢⵓⵍ", "ⵖⵓⵛ", "ⵛⵓⵜ", "ⴽⵜⵓ", "ⵏⵓⵡ", "ⴷⵓⵊ", ""),
                Lists.of("", "ⴰⵙⴰ", "ⴰⵢⵏ", "ⴰⵙⵉ", "ⴰⴽⵕ", "ⴰⴽⵡ", "ⴰⵙⵉⵎ", "ⴰⵙⵉⴹ"),
                Lists.of("", "ⴰⵙⴰⵎⴰⵙ", "ⴰⵢⵏⴰⵙ", "ⴰⵙⵉⵏⴰⵙ", "ⴰⴽⵕⴰⵙ", "ⴰⴽⵡⴰⵙ", "ⴰⵙⵉⵎⵡⴰⵙ", "ⴰⵙⵉⴹⵢⴰⵙ"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_shi() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ⵜⵉⴼⴰⵡⵜ", "ⵜⴰⴷⴳⴳⵯⴰⵜ"),
                Lists.of("ⴷⴰⵄ", "ⴷⴼⵄ"),
                Lists.of("ⵉⵏⵏⴰⵢⵔ", "ⴱⵕⴰⵢⵕ", "ⵎⴰⵕⵚ", "ⵉⴱⵔⵉⵔ", "ⵎⴰⵢⵢⵓ", "ⵢⵓⵏⵢⵓ", "ⵢⵓⵍⵢⵓⵣ", "ⵖⵓⵛⵜ", "ⵛⵓⵜⴰⵏⴱⵉⵔ", "ⴽⵜⵓⴱⵔ", "ⵏⵓⵡⴰⵏⴱⵉⵔ", "ⴷⵓⵊⴰⵏⴱⵉⵔ", ""),
                Lists.of("ⵉⵏⵏ", "ⴱⵕⴰ", "ⵎⴰⵕ", "ⵉⴱⵔ", "ⵎⴰⵢ", "ⵢⵓⵏ", "ⵢⵓⵍ", "ⵖⵓⵛ", "ⵛⵓⵜ", "ⴽⵜⵓ", "ⵏⵓⵡ", "ⴷⵓⵊ", ""),
                Lists.of("", "ⴰⵙⴰ", "ⴰⵢⵏ", "ⴰⵙⵉ", "ⴰⴽⵕ", "ⴰⴽⵡ", "ⴰⵙⵉⵎ", "ⴰⵙⵉⴹ"),
                Lists.of("", "ⴰⵙⴰⵎⴰⵙ", "ⴰⵢⵏⴰⵙ", "ⴰⵙⵉⵏⴰⵙ", "ⴰⴽⵕⴰⵙ", "ⴰⴽⵡⴰⵙ", "ⵙⵉⵎⵡⴰⵙ", "ⴰⵙⵉⴹⵢⴰⵙ"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_zh_HK() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("上午", "下午"),
                Lists.of("公元前", "公元"),
                Lists.of("1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月", "9月", "10月", "11月", "12月", ""),
                Lists.of("1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月", "9月", "10月", "11月", "12月", ""),
                Lists.of("", "週日", "週一", "週二", "週三", "週四", "週五", "週六"),
                Lists.of("", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_zh() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("上午", "下午"),
                Lists.of("公元前", "公元"),
                Lists.of("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月", ""),
                Lists.of("1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月", "9月", "10月", "11月", "12月", ""),
                Lists.of("", "周日", "周一", "周二", "周三", "周四", "周五", "周六"),
                Lists.of("", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_zh_SG() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("上午", "下午"),
                Lists.of("公元前", "公元"),
                Lists.of("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月", ""),
                Lists.of("一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月", ""),
                Lists.of("", "周日", "周一", "周二", "周三", "周四", "周五", "周六"),
                Lists.of("", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_yue() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("上午", "下午"),
                Lists.of("西元前", "西元"),
                Lists.of("1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月", "9月", "10月", "11月", "12月", ""),
                Lists.of("1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月", "9月", "10月", "11月", "12月", ""),
                Lists.of("", "週日", "週一", "週二", "週三", "週四", "週五", "週六"),
                Lists.of("", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ja() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("午前", "午後"),
                Lists.of("紀元前", "西暦"),
                Lists.of("1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月", "9月", "10月", "11月", "12月", ""),
                Lists.of("1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月", "9月", "10月", "11月", "12月", ""),
                Lists.of("", "日", "月", "火", "水", "木", "金", "土"),
                Lists.of("", "日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ii() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("ꎸꄑ", "ꁯꋒ"),
                Lists.of("ꃅꋊꂿ", "ꃅꋊꊂ"),
                Lists.of("ꋍꆪ", "ꑍꆪ", "ꌕꆪ", "ꇖꆪ", "ꉬꆪ", "ꃘꆪ", "ꏃꆪ", "ꉆꆪ", "ꈬꆪ", "ꊰꆪ", "ꊰꊪꆪ", "ꊰꑋꆪ", ""),
                Lists.of("ꋍꆪ", "ꑍꆪ", "ꌕꆪ", "ꇖꆪ", "ꉬꆪ", "ꃘꆪ", "ꏃꆪ", "ꉆꆪ", "ꈬꆪ", "ꊰꆪ", "ꊰꊪꆪ", "ꊰꑋꆪ", ""),
                Lists.of("", "ꑭꆏ", "ꆏꋍ", "ꆏꑍ", "ꆏꌕ", "ꆏꇖ", "ꆏꉬ", "ꆏꃘ"),
                Lists.of("", "ꑭꆏꑍ", "ꆏꊂꋍ", "ꆏꊂꑍ", "ꆏꊂꌕ", "ꆏꊂꇖ", "ꆏꊂꉬ", "ꆏꊂꃘ"));
    }

    private static WalkingkookaDateFormatSymbols walkingkookaDateFormatSymbols_ko() {
        return WalkingkookaDateFormatSymbols.with(
                Lists.of("오전", "오후"),
                Lists.of("BC", "AD"),
                Lists.of("1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월", ""),
                Lists.of("1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월", ""),
                Lists.of("", "일", "월", "화", "수", "목", "금", "토"),
                Lists.of("", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"));
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_AE() {
        return WalkingkookaDecimalFormatSymbols.with(
                "AED",
                "د.إ.‏",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "AED",
                '‏',
                '٫',
                "ليس رقم",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_uz_AF() {
        return WalkingkookaDecimalFormatSymbols.with(
                "AFN",
                "AFN",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "AFN",
                '-',
                ',',
                "haqiqiy son emas",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ps_AF() {
        return WalkingkookaDecimalFormatSymbols.with(
                "AFN",
                "؋",
                '٫',
                '#',
                "×۱۰^",
                '٬',
                "∞",
                "AFN",
                '‎',
                '٫',
                "NaN",
                '؛',
                '٪',
                '؉',
                '۰');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fa_AF() {
        return WalkingkookaDecimalFormatSymbols.with(
                "AFN",
                "؋",
                '٫',
                '#',
                "×۱۰^",
                '٬',
                "∞",
                "AFN",
                '‎',
                '٫',
                "ناعدد",
                '؛',
                '٪',
                '؉',
                '۰');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_sq_AL() {
        return WalkingkookaDecimalFormatSymbols.with(
                "ALL",
                "Lekë",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "ALL",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_hy_AM() {
        return WalkingkookaDecimalFormatSymbols.with(
                "AMD",
                "֏",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "AMD",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_nl_CW() {
        return WalkingkookaDecimalFormatSymbols.with(
                "ANG",
                "NAf.",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "ANG",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_SX() {
        return WalkingkookaDecimalFormatSymbols.with(
                "ANG",
                "NAf.",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "ANG",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_pt_AO() {
        return WalkingkookaDecimalFormatSymbols.with(
                "AOA",
                "Kz",
                '$',
                '#',
                "E",
                ',',
                "∞",
                "AOA",
                '-',
                '$',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ln_AO() {
        return WalkingkookaDecimalFormatSymbols.with(
                "AOA",
                "Kz",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "AOA",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_AR() {
        return WalkingkookaDecimalFormatSymbols.with(
                "ARS",
                "$",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "ARS",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_CC() {
        return WalkingkookaDecimalFormatSymbols.with(
                "AUD",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "AUD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_AU() {
        return WalkingkookaDecimalFormatSymbols.with(
                "AUD",
                "$",
                '.',
                '#',
                "e",
                ',',
                "∞",
                "AUD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_nl_AW() {
        return WalkingkookaDecimalFormatSymbols.with(
                "AWG",
                "Afl.",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "AWG",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_az_AZ() {
        return WalkingkookaDecimalFormatSymbols.with(
                "AZN",
                "₼",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "AZN",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_bs_BA() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BAM",
                "KM",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "BAM",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_bs_BA_Cyrl() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BAM",
                "КМ",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "BAM",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_sr_BA() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BAM",
                "КМ.",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "BAM",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_BB() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BBD",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "BBD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_bn_BD() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BDT",
                "৳",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "BDT",
                '-',
                '.',
                "সংখ্যা না",
                ';',
                '%',
                '‰',
                '০');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_bg_BG() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BGN",
                "лв.",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "BGN",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_BH() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BHD",
                "د.ب.‏",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "BHD",
                '‏',
                '٫',
                "ليس رقم",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_rn_BI() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BIF",
                "FBu",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "BIF",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fr_BI() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BIF",
                "FBu",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "BIF",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_BI() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BIF",
                "FBu",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "BIF",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_BM() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BMD",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "BMD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ms_BN() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BND",
                "$",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "BND",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_BO() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BOB",
                "Bs",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "BOB",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_pt_BR() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BRL",
                "R$",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "BRL",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_BR() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BRL",
                "R$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "BRL",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_BS() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BSD",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "BSD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_dz_BT() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BTN",
                "Nu.",
                '.',
                '#',
                "E",
                ',',
                "གྲངས་མེད",
                "BTN",
                '-',
                '.',
                "ཨང་མད",
                'ད',
                '%',
                '‰',
                '༠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_BW() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BWP",
                "P",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "BWP",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ru_BY() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BYN",
                "BYN",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "BYN",
                '-',
                ',',
                "не число",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_be_BY() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BYN",
                "Руб",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "BYN",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_BZ() {
        return WalkingkookaDecimalFormatSymbols.with(
                "BZD",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "BZD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fr_CA() {
        return WalkingkookaDecimalFormatSymbols.with(
                "CAD",
                "$",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "CAD",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_CA() {
        return WalkingkookaDecimalFormatSymbols.with(
                "CAD",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "CAD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ln_CD() {
        return WalkingkookaDecimalFormatSymbols.with(
                "CDF",
                "FC",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "CDF",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fr_CD() {
        return WalkingkookaDecimalFormatSymbols.with(
                "CDF",
                "FC",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "CDF",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_pt_CH() {
        return WalkingkookaDecimalFormatSymbols.with(
                "CHF",
                "CHF",
                '$',
                '#',
                "E",
                ',',
                "∞",
                "CHF",
                '-',
                '$',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_CH() {
        return WalkingkookaDecimalFormatSymbols.with(
                "CHF",
                "CHF",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "CHF",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_wae_CH() {
        return WalkingkookaDecimalFormatSymbols.with(
                "CHF",
                "CHF",
                ',',
                '#',
                "E",
                '’',
                "∞",
                "CHF",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_de_CH() {
        return WalkingkookaDecimalFormatSymbols.with(
                "CHF",
                "CHF",
                '.',
                '#',
                "E",
                '\'',
                "∞",
                "CHF",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_gsw_CH() {
        return WalkingkookaDecimalFormatSymbols.with(
                "CHF",
                "CHF",
                '.',
                '#',
                "E",
                '’',
                "∞",
                "CHF",
                '−',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_it_CH() {
        return WalkingkookaDecimalFormatSymbols.with(
                "CHF",
                "SFr.",
                '.',
                '#',
                "E",
                '\'',
                "∞",
                "CHF",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fr_CH() {
        return WalkingkookaDecimalFormatSymbols.with(
                "CHF",
                "SFr.",
                '.',
                '#',
                "E",
                ' ',
                "∞",
                "CHF",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_CL() {
        return WalkingkookaDecimalFormatSymbols.with(
                "CLP",
                "$",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "CLP",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_bo_CN() {
        return WalkingkookaDecimalFormatSymbols.with(
                "CNY",
                "¥",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "CNY",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ug_CN() {
        return WalkingkookaDecimalFormatSymbols.with(
                "CNY",
                "￥",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "CNY",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_CO() {
        return WalkingkookaDecimalFormatSymbols.with(
                "COP",
                "$",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "COP",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_CR() {
        return WalkingkookaDecimalFormatSymbols.with(
                "CRC",
                "₡",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "CRC",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_sr_CS() {
        return WalkingkookaDecimalFormatSymbols.with(
                "CSD",
                "CSD",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "CSD",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_CU() {
        return WalkingkookaDecimalFormatSymbols.with(
                "CUP",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "CUP",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_kea_CV() {
        return WalkingkookaDecimalFormatSymbols.with(
                "CVE",
                "​",
                '$',
                '#',
                "E",
                ',',
                "∞",
                "CVE",
                '-',
                '$',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_cs_CZ() {
        return WalkingkookaDecimalFormatSymbols.with(
                "CZK",
                "Kč",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "CZK",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fr_DJ() {
        return WalkingkookaDecimalFormatSymbols.with(
                "DJF",
                "Fdj",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "DJF",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_so_DJ() {
        return WalkingkookaDecimalFormatSymbols.with(
                "DJF",
                "Fdj",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "DJF",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_DJ() {
        return WalkingkookaDecimalFormatSymbols.with(
                "DJF",
                "Fdj",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "DJF",
                '‏',
                '٫',
                "ليس رقم",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fo_FO() {
        return WalkingkookaDecimalFormatSymbols.with(
                "DKK",
                "kr",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "DKK",
                '−',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_da_DK() {
        return WalkingkookaDecimalFormatSymbols.with(
                "DKK",
                "kr.",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "DKK",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fo_DK() {
        return WalkingkookaDecimalFormatSymbols.with(
                "DKK",
                "kr.",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "DKK",
                '−',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_DO() {
        return WalkingkookaDecimalFormatSymbols.with(
                "DOP",
                "RD$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "DOP",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fr_DZ() {
        return WalkingkookaDecimalFormatSymbols.with(
                "DZD",
                "DA",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "DZD",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_DZ() {
        return WalkingkookaDecimalFormatSymbols.with(
                "DZD",
                "د.ج.‏",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "DZD",
                '‎',
                ',',
                "ليس رقمًا",
                ';',
                '٪',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_EG() {
        return WalkingkookaDecimalFormatSymbols.with(
                "EGP",
                "ج.م.‏",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "EGP",
                '‏',
                '٫',
                "ليس رقم",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_ER() {
        return WalkingkookaDecimalFormatSymbols.with(
                "ERN",
                "Nfk",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "ERN",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_ER() {
        return WalkingkookaDecimalFormatSymbols.with(
                "ERN",
                "Nfk",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "ERN",
                '‏',
                '٫',
                "ليس رقم",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_om_ET() {
        return WalkingkookaDecimalFormatSymbols.with(
                "ETB",
                "Br",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "ETB",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_am_ET() {
        return WalkingkookaDecimalFormatSymbols.with(
                "ETB",
                "ብር",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "ETB",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_pt_LU() {
        return WalkingkookaDecimalFormatSymbols.with(
                "EUR",
                "€",
                '$',
                '#',
                "E",
                ',',
                "∞",
                "EUR",
                '-',
                '$',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ast_ES() {
        return WalkingkookaDecimalFormatSymbols.with(
                "EUR",
                "€",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "EUR",
                '-',
                ',',
                "ND",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ca_AD() {
        return WalkingkookaDecimalFormatSymbols.with(
                "EUR",
                "€",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "EUR",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_br_FR() {
        return WalkingkookaDecimalFormatSymbols.with(
                "EUR",
                "€",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "EUR",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_lv_LV() {
        return WalkingkookaDecimalFormatSymbols.with(
                "EUR",
                "€",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "EUR",
                '-',
                ',',
                "nav skaitlis",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fi_FI() {
        return WalkingkookaDecimalFormatSymbols.with(
                "EUR",
                "€",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "EUR",
                '−',
                ',',
                "epäluku",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_el_CY() {
        return WalkingkookaDecimalFormatSymbols.with(
                "EUR",
                "€",
                ',',
                '#',
                "e",
                '.',
                "∞",
                "EUR",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_lt_LT() {
        return WalkingkookaDecimalFormatSymbols.with(
                "EUR",
                "€",
                ',',
                '#',
                "×10^",
                ' ',
                "∞",
                "EUR",
                '−',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ksh_DE() {
        return WalkingkookaDecimalFormatSymbols.with(
                "EUR",
                "€",
                ',',
                '#',
                "×10^",
                ' ',
                "∞",
                "EUR",
                '−',
                ',',
                "¤¤¤",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_CY() {
        return WalkingkookaDecimalFormatSymbols.with(
                "EUR",
                "€",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "EUR",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_smn_FI() {
        return WalkingkookaDecimalFormatSymbols.with(
                "EUR",
                "€",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "EUR",
                '-',
                '.',
                "epiloho",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_gsw_FR() {
        return WalkingkookaDecimalFormatSymbols.with(
                "EUR",
                "€",
                '.',
                '#',
                "E",
                '’',
                "∞",
                "EUR",
                '−',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_et_EE() {
        return WalkingkookaDecimalFormatSymbols.with(
                "EUR",
                "€",
                '.',
                '#',
                "×10^",
                ' ',
                "∞",
                "EUR",
                '−',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_FJ() {
        return WalkingkookaDecimalFormatSymbols.with(
                "FJD",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "FJD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_FK() {
        return WalkingkookaDecimalFormatSymbols.with(
                "FKP",
                "£",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "FKP",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_cy_GB() {
        return WalkingkookaDecimalFormatSymbols.with(
                "GBP",
                "£",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "GBP",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_os_GE() {
        return WalkingkookaDecimalFormatSymbols.with(
                "GEL",
                "₾",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "GEL",
                '-',
                ',',
                "НН",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ka_GE() {
        return WalkingkookaDecimalFormatSymbols.with(
                "GEL",
                "₾",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "GEL",
                '-',
                ',',
                "არ არის რიცხვი",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ak_GH() {
        return WalkingkookaDecimalFormatSymbols.with(
                "GHS",
                "GH₵",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "GHS",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ee_GH() {
        return WalkingkookaDecimalFormatSymbols.with(
                "GHS",
                "GH₵",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "GHS",
                '-',
                '.',
                "mnn",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_GI() {
        return WalkingkookaDecimalFormatSymbols.with(
                "GIP",
                "£",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "GIP",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_GM() {
        return WalkingkookaDecimalFormatSymbols.with(
                "GMD",
                "D",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "GMD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ff_GN() {
        return WalkingkookaDecimalFormatSymbols.with(
                "GNF",
                "FG",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "GNF",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_GT() {
        return WalkingkookaDecimalFormatSymbols.with(
                "GTQ",
                "Q",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "GTQ",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_GY() {
        return WalkingkookaDecimalFormatSymbols.with(
                "GYD",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "GYD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_HK() {
        return WalkingkookaDecimalFormatSymbols.with(
                "HKD",
                "HK$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "HKD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_yue_HK() {
        return WalkingkookaDecimalFormatSymbols.with(
                "HKD",
                "HK$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "HKD",
                '-',
                '.',
                "非數值",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_HN() {
        return WalkingkookaDecimalFormatSymbols.with(
                "HNL",
                "L",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "HNL",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_hr_HR() {
        return WalkingkookaDecimalFormatSymbols.with(
                "HRK",
                "HRK",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "HRK",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fr_HT() {
        return WalkingkookaDecimalFormatSymbols.with(
                "HTG",
                "G",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "HTG",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_hu_HU() {
        return WalkingkookaDecimalFormatSymbols.with(
                "HUF",
                "Ft",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "HUF",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_in_ID() {
        return WalkingkookaDecimalFormatSymbols.with(
                "IDR",
                "Rp",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "IDR",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_IL() {
        return WalkingkookaDecimalFormatSymbols.with(
                "ILS",
                "₪",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "ILS",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_iw_IL() {
        return WalkingkookaDecimalFormatSymbols.with(
                "ILS",
                "₪",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "ILS",
                '‎',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_IL() {
        return WalkingkookaDecimalFormatSymbols.with(
                "ILS",
                "₪",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "ILS",
                '‏',
                '٫',
                "ليس رقم",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_IN() {
        return WalkingkookaDecimalFormatSymbols.with(
                "INR",
                "Rs.",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "INR",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_bo_IN() {
        return WalkingkookaDecimalFormatSymbols.with(
                "INR",
                "₹",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "INR",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_mr_IN() {
        return WalkingkookaDecimalFormatSymbols.with(
                "INR",
                "₹",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "INR",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '०');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_as_IN() {
        return WalkingkookaDecimalFormatSymbols.with(
                "INR",
                "₹",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "INR",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '০');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_bn_IN() {
        return WalkingkookaDecimalFormatSymbols.with(
                "INR",
                "₹",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "INR",
                '-',
                '.',
                "সংখ্যা না",
                ';',
                '%',
                '‰',
                '০');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ur_IN() {
        return WalkingkookaDecimalFormatSymbols.with(
                "INR",
                "₹",
                '.',
                '#',
                "×۱۰^",
                ',',
                "∞",
                "INR",
                '‎',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '۰');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ks_IN() {
        return WalkingkookaDecimalFormatSymbols.with(
                "INR",
                "₹",
                '٫',
                '#',
                "×۱۰^",
                '٬',
                "∞",
                "INR",
                '‎',
                '٫',
                "NaN",
                '؛',
                '٪',
                '؉',
                '۰');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_lrc_IQ() {
        return WalkingkookaDecimalFormatSymbols.with(
                "IQD",
                "IQD",
                '٫',
                '#',
                "×۱۰^",
                '٬',
                "∞",
                "IQD",
                '‎',
                '٫',
                "NaN",
                '؛',
                '٪',
                '؉',
                '۰');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ckb_IQ() {
        return WalkingkookaDecimalFormatSymbols.with(
                "IQD",
                "IQD",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "IQD",
                '‏',
                '٫',
                "NaN",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_IQ() {
        return WalkingkookaDecimalFormatSymbols.with(
                "IQD",
                "د.ع.‏",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "IQD",
                '‏',
                '٫',
                "ليس رقم",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_lrc_IR() {
        return WalkingkookaDecimalFormatSymbols.with(
                "IRR",
                "IRR",
                '٫',
                '#',
                "×۱۰^",
                '٬',
                "∞",
                "IRR",
                '‎',
                '٫',
                "NaN",
                '؛',
                '٪',
                '؉',
                '۰');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ckb_IR() {
        return WalkingkookaDecimalFormatSymbols.with(
                "IRR",
                "IRR",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "IRR",
                '‏',
                '٫',
                "NaN",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fa_IR() {
        return WalkingkookaDecimalFormatSymbols.with(
                "IRR",
                "ریال",
                '٫',
                '#',
                "×۱۰^",
                '٬',
                "∞",
                "IRR",
                '‎',
                '٫',
                "ناعدد",
                '؛',
                '٪',
                '؉',
                '۰');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_is_IS() {
        return WalkingkookaDecimalFormatSymbols.with(
                "ISK",
                "ISK",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "ISK",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_JM() {
        return WalkingkookaDecimalFormatSymbols.with(
                "JMD",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "JMD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_JO() {
        return WalkingkookaDecimalFormatSymbols.with(
                "JOD",
                "د.أ.‏",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "JOD",
                '‏',
                '٫',
                "ليس رقم",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ja_JP() {
        return WalkingkookaDecimalFormatSymbols.with(
                "JPY",
                "￥",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "JPY",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_dav_KE() {
        return WalkingkookaDecimalFormatSymbols.with(
                "KES",
                "Ksh",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "KES",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ru_KG() {
        return WalkingkookaDecimalFormatSymbols.with(
                "KGS",
                "сом",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "KGS",
                '-',
                ',',
                "не число",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ky_KG() {
        return WalkingkookaDecimalFormatSymbols.with(
                "KGS",
                "сом",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "KGS",
                '-',
                ',',
                "сан эмес",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_km_KH() {
        return WalkingkookaDecimalFormatSymbols.with(
                "KHR",
                "៛",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "KHR",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fr_KM() {
        return WalkingkookaDecimalFormatSymbols.with(
                "KMF",
                "CF",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "KMF",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_KM() {
        return WalkingkookaDecimalFormatSymbols.with(
                "KMF",
                "ف.ج.ق.‏",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "KMF",
                '‏',
                '٫',
                "ليس رقم",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ko_KP() {
        return WalkingkookaDecimalFormatSymbols.with(
                "KPW",
                "KPW",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "KPW",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ko_KR() {
        return WalkingkookaDecimalFormatSymbols.with(
                "KRW",
                "₩",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "KRW",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_KW() {
        return WalkingkookaDecimalFormatSymbols.with(
                "KWD",
                "د.ك.‏",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "KWD",
                '‏',
                '٫',
                "ليس رقم",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_KY() {
        return WalkingkookaDecimalFormatSymbols.with(
                "KYD",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "KYD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_kk_KZ() {
        return WalkingkookaDecimalFormatSymbols.with(
                "KZT",
                "₸",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "KZT",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ru_KZ() {
        return WalkingkookaDecimalFormatSymbols.with(
                "KZT",
                "₸",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "KZT",
                '-',
                ',',
                "не число",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_lo_LA() {
        return WalkingkookaDecimalFormatSymbols.with(
                "LAK",
                "₭",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "LAK",
                '-',
                ',',
                "ບໍ່​ແມ່ນ​ໂຕ​ເລກ",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_LB() {
        return WalkingkookaDecimalFormatSymbols.with(
                "LBP",
                "ل.ل.‏",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "LBP",
                '‎',
                ',',
                "ليس رقمًا",
                ';',
                '٪',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ta_LK() {
        return WalkingkookaDecimalFormatSymbols.with(
                "LKR",
                "Rs.",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "LKR",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_si_LK() {
        return WalkingkookaDecimalFormatSymbols.with(
                "LKR",
                "රු.",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "LKR",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_LR() {
        return WalkingkookaDecimalFormatSymbols.with(
                "LRD",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "LRD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_LS() {
        return WalkingkookaDecimalFormatSymbols.with(
                "LSL",
                "LSL",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "LSL",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_LY() {
        return WalkingkookaDecimalFormatSymbols.with(
                "LYD",
                "د.ل.‏",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "LYD",
                '‎',
                ',',
                "ليس رقمًا",
                ';',
                '٪',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fr_MA() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MAD",
                "MAD",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "MAD",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_shi_MA_Latn() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MAD",
                "MAD",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "MAD",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_MA() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MAD",
                "د.م.‏",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "MAD",
                '‎',
                ',',
                "ليس رقمًا",
                ';',
                '٪',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_EH() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MAD",
                "د.م.‏",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "MAD",
                '‎',
                '.',
                "ليس رقمًا",
                ';',
                '٪',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ro_MD() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MDL",
                "L",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "MDL",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ru_MD() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MDL",
                "L",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "MDL",
                '-',
                ',',
                "не число",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fr_MG() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MGA",
                "Ar",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "MGA",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_MG() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MGA",
                "Ar",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "MGA",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_sq_MK() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MKD",
                "den",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "MKD",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_mk_MK() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MKD",
                "ден",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "MKD",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_my_MM() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MMK",
                "K",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "MMK",
                '-',
                '.',
                "NaN",
                '၊',
                '%',
                '‰',
                '၀');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_mn_MN() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MNT",
                "₮",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "MNT",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_pt_MO() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MOP",
                "MOP$",
                '$',
                '#',
                "E",
                ',',
                "∞",
                "MOP",
                '-',
                '$',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_MO() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MOP",
                "MOP$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "MOP",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_zh_MO_Hant() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MOP",
                "MOP$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "MOP",
                '-',
                '.',
                "非數值",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ff_MR() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MRO",
                "UM",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "MRO",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_MR() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MRO",
                "أ.م.‏",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "MRO",
                '‎',
                ',',
                "ليس رقمًا",
                ';',
                '٪',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fr_MU() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MUR",
                "Rs",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "MUR",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_MU() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MUR",
                "Rs",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "MUR",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_mfe_MU() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MUR",
                "Rs",
                '.',
                '#',
                "E",
                ' ',
                "∞",
                "MUR",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_MW() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MWK",
                "MK",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "MWK",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_MX() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MXN",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "MXN",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_MY() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MYR",
                "RM",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "MYR",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_pt_MZ() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MZN",
                "MTn",
                '$',
                '#',
                "E",
                ',',
                "∞",
                "MZN",
                '-',
                '$',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_mgh_MZ() {
        return WalkingkookaDecimalFormatSymbols.with(
                "MZN",
                "MTn",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "MZN",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_af_NA() {
        return WalkingkookaDecimalFormatSymbols.with(
                "NAD",
                "$",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "NAD",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_NA() {
        return WalkingkookaDecimalFormatSymbols.with(
                "NAD",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "NAD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_NG() {
        return WalkingkookaDecimalFormatSymbols.with(
                "NGN",
                "₦",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "NGN",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_NI() {
        return WalkingkookaDecimalFormatSymbols.with(
                "NIO",
                "C$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "NIO",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_nb_NO() {
        return WalkingkookaDecimalFormatSymbols.with(
                "NOK",
                "kr",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "NOK",
                '−',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_se_NO() {
        return WalkingkookaDecimalFormatSymbols.with(
                "NOK",
                "kr",
                ',',
                '#',
                "×10^",
                ' ',
                "∞",
                "NOK",
                '−',
                ',',
                "¤¤¤",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ne_NP() {
        return WalkingkookaDecimalFormatSymbols.with(
                "NPR",
                "नेरू",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "NPR",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '०');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_CK() {
        return WalkingkookaDecimalFormatSymbols.with(
                "NZD",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "NZD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_OM() {
        return WalkingkookaDecimalFormatSymbols.with(
                "OMR",
                "ر.ع.‏",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "OMR",
                '‏',
                '٫',
                "ليس رقم",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_PA() {
        return WalkingkookaDecimalFormatSymbols.with(
                "PAB",
                "B/.",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "PAB",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_PE() {
        return WalkingkookaDecimalFormatSymbols.with(
                "PEN",
                "S/.",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "PEN",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_PG() {
        return WalkingkookaDecimalFormatSymbols.with(
                "PGK",
                "K",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "PGK",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_PH() {
        return WalkingkookaDecimalFormatSymbols.with(
                "PHP",
                "₱",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "PHP",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_PH() {
        return WalkingkookaDecimalFormatSymbols.with(
                "PHP",
                "₱",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "PHP",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_pa_PK() {
        return WalkingkookaDecimalFormatSymbols.with(
                "PKR",
                "PKR",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "PKR",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_PK() {
        return WalkingkookaDecimalFormatSymbols.with(
                "PKR",
                "Rs",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "PKR",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ur_PK() {
        return WalkingkookaDecimalFormatSymbols.with(
                "PKR",
                "Rs",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "PKR",
                '‎',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_pa_PK_Arab() {
        return WalkingkookaDecimalFormatSymbols.with(
                "PKR",
                "ر",
                '٫',
                '#',
                "×۱۰^",
                '٬',
                "∞",
                "PKR",
                '‎',
                '٫',
                "NaN",
                '؛',
                '٪',
                '؉',
                '۰');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_pl_PL() {
        return WalkingkookaDecimalFormatSymbols.with(
                "PLN",
                "zł",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "PLN",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_PY() {
        return WalkingkookaDecimalFormatSymbols.with(
                "PYG",
                "Gs.",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "PYG",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_QA() {
        return WalkingkookaDecimalFormatSymbols.with(
                "QAR",
                "ر.ق.‏",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "QAR",
                '‏',
                '٫',
                "ليس رقم",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ro_RO() {
        return WalkingkookaDecimalFormatSymbols.with(
                "RON",
                "RON",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "RON",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_sr_RS_Cyrl() {
        return WalkingkookaDecimalFormatSymbols.with(
                "RSD",
                "RSD",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "RSD",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_sr_RS_Latn() {
        return WalkingkookaDecimalFormatSymbols.with(
                "RSD",
                "din.",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "RSD",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_os_RU() {
        return WalkingkookaDecimalFormatSymbols.with(
                "RUB",
                "₽",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "RUB",
                '-',
                ',',
                "НН",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ru_RU() {
        return WalkingkookaDecimalFormatSymbols.with(
                "RUB",
                "₽",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "RUB",
                '-',
                ',',
                "не число",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_cu_RU() {
        return WalkingkookaDecimalFormatSymbols.with(
                "RUB",
                "₽",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "RUB",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ce_RU() {
        return WalkingkookaDecimalFormatSymbols.with(
                "RUB",
                "₽",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "RUB",
                '-',
                '.',
                "Терхьаш дац",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_rw_RW() {
        return WalkingkookaDecimalFormatSymbols.with(
                "RWF",
                "RF",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "RWF",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fr_RW() {
        return WalkingkookaDecimalFormatSymbols.with(
                "RWF",
                "RF",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "RWF",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_RW() {
        return WalkingkookaDecimalFormatSymbols.with(
                "RWF",
                "RF",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "RWF",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_SA() {
        return WalkingkookaDecimalFormatSymbols.with(
                "SAR",
                "ر.س.‏",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "SAR",
                '‏',
                '٫',
                "ليس رقم",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_SB() {
        return WalkingkookaDecimalFormatSymbols.with(
                "SBD",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "SBD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fr_SC() {
        return WalkingkookaDecimalFormatSymbols.with(
                "SCR",
                "SR",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "SCR",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_SC() {
        return WalkingkookaDecimalFormatSymbols.with(
                "SCR",
                "SR",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "SCR",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_SD() {
        return WalkingkookaDecimalFormatSymbols.with(
                "SDG",
                "SDG",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "SDG",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_SD() {
        return WalkingkookaDecimalFormatSymbols.with(
                "SDG",
                "ج.س.‏",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "SDG",
                '‏',
                '٫',
                "ليس رقم",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_SE() {
        return WalkingkookaDecimalFormatSymbols.with(
                "SEK",
                "kr",
                ',',
                '#',
                "×10^",
                ' ',
                "∞",
                "SEK",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_se_SE() {
        return WalkingkookaDecimalFormatSymbols.with(
                "SEK",
                "kr",
                ',',
                '#',
                "×10^",
                ' ',
                "∞",
                "SEK",
                '−',
                ',',
                "¤¤¤",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_SG() {
        return WalkingkookaDecimalFormatSymbols.with(
                "SGD",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "SGD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_SH() {
        return WalkingkookaDecimalFormatSymbols.with(
                "SHP",
                "£",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "SHP",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_SL() {
        return WalkingkookaDecimalFormatSymbols.with(
                "SLL",
                "Le",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "SLL",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_so_SO() {
        return WalkingkookaDecimalFormatSymbols.with(
                "SOS",
                "S",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "SOS",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_SO() {
        return WalkingkookaDecimalFormatSymbols.with(
                "SOS",
                "S",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "SOS",
                '‏',
                '٫',
                "ليس رقم",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_nl_SR() {
        return WalkingkookaDecimalFormatSymbols.with(
                "SRD",
                "$",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "SRD",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_SS() {
        return WalkingkookaDecimalFormatSymbols.with(
                "SSP",
                "£",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "SSP",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_SS() {
        return WalkingkookaDecimalFormatSymbols.with(
                "SSP",
                "£",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "SSP",
                '‏',
                '٫',
                "ليس رقم",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_pt_ST() {
        return WalkingkookaDecimalFormatSymbols.with(
                "STD",
                "Db",
                '$',
                '#',
                "E",
                ',',
                "∞",
                "STD",
                '-',
                '$',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_SV() {
        return WalkingkookaDecimalFormatSymbols.with(
                "SVC",
                "C",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "SVC",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fr_SY() {
        return WalkingkookaDecimalFormatSymbols.with(
                "SYP",
                "LS",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "SYP",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_SY() {
        return WalkingkookaDecimalFormatSymbols.with(
                "SYP",
                "ل.س.‏",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "SYP",
                '‏',
                '٫',
                "ليس رقم",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_SZ() {
        return WalkingkookaDecimalFormatSymbols.with(
                "SZL",
                "E",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "SZL",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_th_TH() {
        return WalkingkookaDecimalFormatSymbols.with(
                "THB",
                "THB",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "THB",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_tk_TM() {
        return WalkingkookaDecimalFormatSymbols.with(
                "TMT",
                "TMT",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "TMT",
                '-',
                ',',
                "san däl",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fr_TN() {
        return WalkingkookaDecimalFormatSymbols.with(
                "TND",
                "DT",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "TND",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_TN() {
        return WalkingkookaDecimalFormatSymbols.with(
                "TND",
                "د.ت.‏",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "TND",
                '‎',
                ',',
                "ليس رقمًا",
                ';',
                '٪',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_TO() {
        return WalkingkookaDecimalFormatSymbols.with(
                "TOP",
                "T$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "TOP",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_to_TO() {
        return WalkingkookaDecimalFormatSymbols.with(
                "TOP",
                "T$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "TOP",
                '-',
                '.',
                "TF",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_tr_TR() {
        return WalkingkookaDecimalFormatSymbols.with(
                "TRY",
                "₺",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "TRY",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_TT() {
        return WalkingkookaDecimalFormatSymbols.with(
                "TTD",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "TTD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_zh_TW_Hant() {
        return WalkingkookaDecimalFormatSymbols.with(
                "TWD",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "TWD",
                '-',
                '.',
                "非數值",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_asa_TZ() {
        return WalkingkookaDecimalFormatSymbols.with(
                "TZS",
                "TSh",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "TZS",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ru_UA() {
        return WalkingkookaDecimalFormatSymbols.with(
                "UAH",
                "₴",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "UAH",
                '-',
                ',',
                "не число",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_uk_UA() {
        return WalkingkookaDecimalFormatSymbols.with(
                "UAH",
                "₴",
                ',',
                '#',
                "Е",
                ' ',
                "∞",
                "UAH",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_cgg_UG() {
        return WalkingkookaDecimalFormatSymbols.with(
                "UGX",
                "USh",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "UGX",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_EC() {
        return WalkingkookaDecimalFormatSymbols.with(
                "USD",
                "$",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "USD",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_US_POSIX() {
        return WalkingkookaDecimalFormatSymbols.with(
                "USD",
                "$",
                '.',
                '#',
                "E",
                ',',
                "INF",
                "USD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '0',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_chr_US() {
        return WalkingkookaDecimalFormatSymbols.with(
                "USD",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "USD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_pt_TL() {
        return WalkingkookaDecimalFormatSymbols.with(
                "USD",
                "US$",
                '$',
                '#',
                "E",
                ',',
                "∞",
                "USD",
                '-',
                '$',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_FM() {
        return WalkingkookaDecimalFormatSymbols.with(
                "USD",
                "US$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "USD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_UY() {
        return WalkingkookaDecimalFormatSymbols.with(
                "UYU",
                "$",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "UYU",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_uz_UZ_Latn() {
        return WalkingkookaDecimalFormatSymbols.with(
                "UZS",
                "soʻm",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "UZS",
                '-',
                ',',
                "haqiqiy son emas",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_uz_UZ_Cyrl() {
        return WalkingkookaDecimalFormatSymbols.with(
                "UZS",
                "сўм",
                '٫',
                '#',
                "×۱۰^",
                '٬',
                "∞",
                "UZS",
                '-',
                '٫',
                "NaN",
                '؛',
                '٪',
                '؉',
                '۰');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_VE() {
        return WalkingkookaDecimalFormatSymbols.with(
                "VEF",
                "Bs.",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "VEF",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_vi_VN() {
        return WalkingkookaDecimalFormatSymbols.with(
                "VND",
                "₫",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "VND",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fr_VU() {
        return WalkingkookaDecimalFormatSymbols.with(
                "VUV",
                "VT",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "VUV",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_VU() {
        return WalkingkookaDecimalFormatSymbols.with(
                "VUV",
                "VT",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "VUV",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_WS() {
        return WalkingkookaDecimalFormatSymbols.with(
                "WST",
                "WS$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "WST",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_pt_GQ() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XAF",
                "FCFA",
                '$',
                '#',
                "E",
                ',',
                "∞",
                "XAF",
                '-',
                '$',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_es_GQ() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XAF",
                "FCFA",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "XAF",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_agq_CM() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XAF",
                "FCFA",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "XAF",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_CM() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XAF",
                "FCFA",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "XAF",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_TD() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XAF",
                "FCFA",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "XAF",
                '‏',
                '٫',
                "ليس رقم",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_AG() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XCD",
                "$",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "XCD",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_pt_GW() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XOF",
                "CFA",
                '$',
                '#',
                "E",
                ',',
                "∞",
                "XOF",
                '-',
                '$',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_dyo_SN() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XOF",
                "CFA",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "XOF",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_bm_ML() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XOF",
                "CFA",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "XOF",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ee_TG() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XOF",
                "CFA",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "XOF",
                '-',
                '.',
                "mnn",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_dje_NE() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XOF",
                "CFA",
                '.',
                '#',
                "E",
                ' ',
                "∞",
                "XOF",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fr_NC() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XPF",
                "FCFP",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "XPF",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_kea() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '$',
                '#',
                "E",
                ',',
                "∞",
                "XXX",
                '-',
                '$',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ast() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "XXX",
                '-',
                ',',
                "ND",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_az() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "XXX",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_lo() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "XXX",
                '-',
                ',',
                "ບໍ່​ແມ່ນ​ໂຕ​ເລກ",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fo() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                ',',
                '#',
                "E",
                '.',
                "∞",
                "XXX",
                '−',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_af() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "XXX",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_uz() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "XXX",
                '-',
                ',',
                "haqiqiy son emas",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_lv() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "XXX",
                '-',
                ',',
                "nav skaitlis",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_tk() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "XXX",
                '-',
                ',',
                "san däl",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_os() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "XXX",
                '-',
                ',',
                "НН",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ru() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "XXX",
                '-',
                ',',
                "не число",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ky() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "XXX",
                '-',
                ',',
                "сан эмес",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ka() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "XXX",
                '-',
                ',',
                "არ არის რიცხვი",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_nb() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "XXX",
                '−',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fi() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "XXX",
                '−',
                ',',
                "epäluku",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_wae() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                ',',
                '#',
                "E",
                '’',
                "∞",
                "XXX",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_el() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                ',',
                '#',
                "e",
                '.',
                "∞",
                "XXX",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_lt() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                ',',
                '#',
                "×10^",
                ' ',
                "∞",
                "XXX",
                '−',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ksh() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                ',',
                '#',
                "×10^",
                ' ',
                "∞",
                "XXX",
                '−',
                ',',
                "¤¤¤",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_uk() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                ',',
                '#',
                "Е",
                ' ',
                "∞",
                "XXX",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_dz() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '.',
                '#',
                "E",
                ',',
                "གྲངས་མེད",
                "XXX",
                '-',
                '.',
                "ཨང་མད",
                'ད',
                '%',
                '‰',
                '༠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ak() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "XXX",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_mr() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "XXX",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '०');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_as() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "XXX",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '০');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_my() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "XXX",
                '-',
                '.',
                "NaN",
                '၊',
                '%',
                '‰',
                '၀');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_to() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "XXX",
                '-',
                '.',
                "TF",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_smn() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "XXX",
                '-',
                '.',
                "epiloho",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ee() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "XXX",
                '-',
                '.',
                "mnn",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ce() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "XXX",
                '-',
                '.',
                "Терхьаш дац",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_bn() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "XXX",
                '-',
                '.',
                "সংখ্যা না",
                ';',
                '%',
                '‰',
                '০');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_yue() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "XXX",
                '-',
                '.',
                "非數值",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_iw() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "XXX",
                '‎',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_dje() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '.',
                '#',
                "E",
                ' ',
                "∞",
                "XXX",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_gsw() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '.',
                '#',
                "E",
                '’',
                "∞",
                "XXX",
                '−',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_et() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '.',
                '#',
                "×10^",
                ' ',
                "∞",
                "XXX",
                '−',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_uz__Cyrl() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '٫',
                '#',
                "×۱۰^",
                '٬',
                "∞",
                "XXX",
                '-',
                '٫',
                "NaN",
                '؛',
                '٪',
                '؉',
                '۰');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ks() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '٫',
                '#',
                "×۱۰^",
                '٬',
                "∞",
                "XXX",
                '‎',
                '٫',
                "NaN",
                '؛',
                '٪',
                '؉',
                '۰');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_fa() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '٫',
                '#',
                "×۱۰^",
                '٬',
                "∞",
                "XXX",
                '‎',
                '٫',
                "ناعدد",
                '؛',
                '٪',
                '؉',
                '۰');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ckb() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "XXX",
                '‏',
                '٫',
                "NaN",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar() {
        return WalkingkookaDecimalFormatSymbols.with(
                "XXX",
                "¤",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "XXX",
                '‏',
                '٫',
                "ليس رقم",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_ar_YE() {
        return WalkingkookaDecimalFormatSymbols.with(
                "YER",
                "ر.ي.‏",
                '٫',
                '#',
                "اس",
                '٬',
                "∞",
                "YER",
                '‏',
                '٫',
                "ليس رقم",
                '؛',
                '٪',
                '؉',
                '٠');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_af_ZA() {
        return WalkingkookaDecimalFormatSymbols.with(
                "ZAR",
                "R",
                ',',
                '#',
                "E",
                ' ',
                "∞",
                "ZAR",
                '-',
                ',',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_zu_ZA() {
        return WalkingkookaDecimalFormatSymbols.with(
                "ZAR",
                "R",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "ZAR",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_bem_ZM() {
        return WalkingkookaDecimalFormatSymbols.with(
                "ZMW",
                "K",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "ZMW",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    private static WalkingkookaDecimalFormatSymbols walkingkookaDecimalFormatSymbols_en_ZW() {
        return WalkingkookaDecimalFormatSymbols.with(
                "ZWL",
                "ZWL",
                '.',
                '#',
                "E",
                ',',
                "∞",
                "ZWL",
                '-',
                '.',
                "NaN",
                ';',
                '%',
                '‰',
                '0');
    }

    /**
     * Factory that parses and creates a {@link WalkingkookaLocale} from a language tag.
     */
    static WalkingkookaLocale with(final WalkingkookaLanguageTag tag,
                                   final WalkingkookaDateFormatSymbols dateFormatSymbols,
                                   final WalkingkookaDecimalFormatSymbols decimalFormatSymbols) {
        return new WalkingkookaLocale(tag,
                dateFormatSymbols,
                decimalFormatSymbols);
    }

    private WalkingkookaLocale(final WalkingkookaLanguageTag tag,
                               final WalkingkookaDateFormatSymbols dateFormatSymbols,
                               final WalkingkookaDecimalFormatSymbols decimalFormatSymbols) {
        super();

        this.languageTag = tag;
        this.dateFormatSymbols = dateFormatSymbols;
        this.decimalFormatSymbols = decimalFormatSymbols;
    }

    // Locale...........................................................................................................

    private boolean test(final WalkingkookaLanguageTag other) {
        return this.languageTag().equals(other);
    }

    public WalkingkookaLanguageTag languageTag() {
        return this.languageTag;
    }

    private WalkingkookaLanguageTag languageTag;

    public WalkingkookaDateFormatSymbols dateFormatSymbols() {
        return this.dateFormatSymbols;
    }

    private final WalkingkookaDateFormatSymbols dateFormatSymbols;

    public WalkingkookaDecimalFormatSymbols decimalFormatSymbols() {
        return this.decimalFormatSymbols;
    }

    private final WalkingkookaDecimalFormatSymbols decimalFormatSymbols;

    // Object...........................................................................................................

    @Override
    public String toString() {
        return ToStringBuilder.empty()
                .value(this.languageTag)
                .value(this.dateFormatSymbols())
                .value(this.decimalFormatSymbols())
                .build();
    }
}
