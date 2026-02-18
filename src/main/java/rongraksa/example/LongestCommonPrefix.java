package rongraksa.example;

    public class LongestCommonPrefix {
        public static String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0)
                return "";
            StringBuilder sb = new StringBuilder();
            String first = strs[0];
            for (int i = 0; i < first.length(); i++) {
                char c = first.charAt(i);
                for (String str : strs) {
                    if (i > str.length() - 1 || str.charAt(i) != c) {
                        return sb.toString();
                    }
                }
                sb.append(c);
            }
            return sb.toString();
        }

        public static void main(String[] args) {
            String[] strs = { "flower", "flow", "flight" };
            System.out.println(longestCommonPrefix(strs));
        }
    }

