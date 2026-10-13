public class Solution {
    public String longestCommonPrefix(String[] strs) {

        int minLen = strs[0].length();

        for (String str : strs)
            minLen = Math.min(minLen, str.length());

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < minLen; i++) {


            char ch = strs[0].charAt(i);

            for (String str : strs) {
                if (str.charAt(i) != ch) {
                    return res.toString();
                }
            }


            res.append(ch);
        }
        return res.toString();
    }
}
