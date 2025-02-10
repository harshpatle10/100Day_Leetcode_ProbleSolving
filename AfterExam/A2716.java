package leetcodeQ.AfterExam;

import java.util.HashSet;
import java.util.Set;

public class A2716 {
    public static void main(String[] args) {
        String  s = "baadccab";
        Set <Character> setchar = new HashSet<>();
        for(int i=0;i<s.length();i++) {
            setchar.add(s.charAt(i));
        }
        System.out.println(setchar.size());
    }
}
