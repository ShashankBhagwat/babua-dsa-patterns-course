package src.main.java.P001_TwoPointer;

// https://neetcode.io/problems/valid-word-abbreviation?list=neetcode250
//        A string can be shortened by replacing any number of non-adjacent, non-empty substrings with their lengths (without leading zeros).
//
//        For example, the string "implementation" can be abbreviated in several ways, such as:
//
//        "i12n" -> ("i mplementatio n")
//        "imp4n5n" -> ("imp leme n tatio n")
//        "14" -> ("implementation")
//        "implemetation" -> (no substrings replaced)
//        Invalid abbreviations include:
//
//        "i57n" -> (i mplem entatio n, adjacent substrings are replaced.)
//        "i012n" -> (has leading zeros)
//        "i0mplementation" (replaces an empty substring)

public class P005_ValidWordAbbreviation {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.validWordAbbreviation("internationalization", "i18n"));
    }

    static class Solution {
        public boolean validWordAbbreviation(String word, String abbr) {
            if (word.equalsIgnoreCase(abbr))
                return true;

            int wordIndex = 0, abbrIndex = 0;
            while (wordIndex < word.length() && abbrIndex < abbr.length()) {
                if (Character.isDigit(abbr.charAt(abbrIndex))) {
                    if (abbr.charAt(abbrIndex) == '0')
                        return false;

                    int number = getNumberFromAbbr(abbr, abbrIndex);
                    wordIndex = wordIndex + number;
                    abbrIndex = abbrIndex + String.valueOf(number).length();

                } else if (abbr.charAt(abbrIndex) != word.charAt(wordIndex)) {
                    return false;
                } else {
                    wordIndex++;
                    abbrIndex++;
                }
            }
            return wordIndex == word.length() && abbrIndex == abbr.length();
        }

        private int getNumberFromAbbr(String s, int index) {
            StringBuilder number = new StringBuilder();
            while (index < s.length() && Character.isDigit(s.charAt(index))) {
                number.append(s.charAt(index));
                index++;
            }
            return Integer.parseInt(number.toString());
        }
    }
}
