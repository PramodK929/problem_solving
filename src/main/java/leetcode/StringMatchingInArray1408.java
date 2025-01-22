package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortStringByLength implements Comparable<SortStringByLength> {

    private String s;

    public SortStringByLength(String p) {
        this.s = p;
    }

    public String getS() {return this.s;}

    public int compareTo(SortStringByLength that) {
        if (this.getS().length() < that.getS().length()) {
            return -1;
        } else if (this.getS().length() > that.getS().length()) {
            return +1;
        } else {
            return this.getS().compareTo(that.getS());
        }
    }

    @Override
    public String toString() {
        return getS();
    }

}

public class StringMatchingInArray1408 {
    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};
        List<String> ans = stringMatching(words);
        ans.stream().forEach(System.out::println);
    }
    
    private static List<String> stringMatching(String[] words) {
        List<SortStringByLength> result = new ArrayList<>();
        for(String s : words) {
            SortStringByLength ssbl = new SortStringByLength(s);
            result.add(ssbl);
        }
        List<String> res = new ArrayList<>();
        Collections.sort(result);
        words = new String[result.size()];

        for(int i=0; i<words.length; i++) {
            words[i] = result.get(i).toString();
        }

        for(int i=0; i<words.length-1; i++) {
            for(int j=i+1; j<words.length; j++) {
                if(words[j].length() > words[i].length() && words[j].contains(words[i])) {
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;
    }
}
