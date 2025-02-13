package leetcode;

public class RemoveAllOccurrencesOfASubstring_1910 {
    public static void main(String[] args) {
        String s = "aabababa";//"pramodkumarnagarabenchi";//"daabcbaabcbc";
        String part = "aba";
        // output: "ab" , expected: "ba"
        String ans = removeOccurrences(s, part);
        System.out.println("Ans: " + ans);
    }

    private static String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.indexOf(part) != -1) {
            String temp = sb.toString();
            temp = temp.replaceFirst(part, "");
            sb = new StringBuilder(temp);
            System.out.println("SB: " + sb + " temp = "+ temp);
        }
        System.out.println("outside1 = "+ sb + " ="+ sb.indexOf("part"));
        return sb.toString();
    }
}
