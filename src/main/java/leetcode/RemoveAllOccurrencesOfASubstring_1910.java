package leetcode;

public class RemoveAllOccurrencesOfASubstring_1910 {
    public static void main(String[] args) {
        String s = "aabababa";
        String part = "aba";
        String ans = removeOccurrences(s, part);
        System.out.println("Ans: " + ans);
    }

    private static String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.indexOf(part) != -1) {
            String temp = sb.toString();
            temp = temp.replaceFirst(part, "");
            sb = new StringBuilder(temp);
        }
        return sb.toString();
    }
}
