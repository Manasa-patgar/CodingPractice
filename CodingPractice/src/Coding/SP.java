package Coding;

import java.util.ArrayList;
import java.util.List;

public class SP {
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(getPalindSubstring(s));
    }

    private static List<String> getPalindSubstring(String s) {
        List<String> res = new ArrayList<>();
        dfs(s, res, 0, new StringBuilder());
        return res;
    }

    private static void dfs(String s, List<String> res, int cur, StringBuilder sb) {
        if(isValid(sb.toString()) && sb.length() > 0) {
            res.add(sb.toString());
        }
        for(int i=cur;i<s.length();i++) {
            if(i > cur && s.charAt(i) == s.charAt(i-1))
                continue;
            sb.append(s.charAt(i));
            dfs(s, res, i+1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    private static boolean isValid(String s) {
        int[] cnt = new int[26];
        for(char c : s.toCharArray()) {
            cnt[c - 'a']++;
        }
        int count = 0;
        for(int i=0;i<cnt.length;i++) {
            if(cnt[i]%2 == 1)
                count++;
        }
        return count < 2;
    }
}
