package org.apache.commons.cli;

/* JADX INFO: loaded from: classes7.dex */
class OptionValidator {
    OptionValidator() {
    }

    static void validateOption(String str) throws IllegalArgumentException {
        if (str == null) {
            return;
        }
        if (str.length() == 1) {
            char cCharAt = str.charAt(0);
            if (!isValidOpt(cCharAt)) {
                throw new IllegalArgumentException(new StringBuffer("illegal option value '").append(cCharAt).append("'").toString());
            }
        } else {
            char[] charArray = str.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if (!isValidChar(charArray[i])) {
                    throw new IllegalArgumentException(new StringBuffer("opt contains illegal character value '").append(charArray[i]).append("'").toString());
                }
            }
        }
    }

    private static boolean isValidOpt(char c) {
        return isValidChar(c) || c == ' ' || c == '?' || c == '@';
    }

    private static boolean isValidChar(char c) {
        return Character.isJavaIdentifierPart(c);
    }
}
