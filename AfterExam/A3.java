package leetcodeQ.AfterExam;

import StringClassMethod.IndexOF;
import StringClassMethod.ValueOF;

import java.util.*;

/*
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/
public class A3 {
    public static void main(String[] args) {


//        String pattern = "abba";
//        String s = "dog dog dog dog";
//        String words[] = s.split(" ");

//        Map<Character , String> wToch = new HashMap<>();
//        Map<String , Character> chTw = new HashMap<>();

//        for(int i=0;i<pattern.length();i++){
//           char ch = pattern.charAt(i);
//           String str = words[i];
//
//           if(!wToch.containsKey(str)){
//               wToch.put(ch, str);
//           }
//           if(!chTw.containsKey(str)){
//               chTw.put(str,ch);
//           }
//           if(!chTw.)
//        }


//        List<String> namelist = new ArrayList<>();
//        String str ="";
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==' '){
//                namelist.add(str);
//                str ="";
//
//            }
//           else {
//                str += s.charAt(i);
//            }
//            if(i==s.length()-1){
//                namelist.add(str);
//            }
//        }
//        for(int i=0;i<pattern.length()-1;i++){
//            for(int k=i+1;k<pattern.length();k++){
//                if(pattern.charAt(i)==pattern.charAt(k)){
//
////                    System.out.println(namelist.get(i)+""+namelist.get(k));
//                    if(!(namelist.get(i).equals(namelist.get(k)))) {
//                          System.out.println("false");
//                        System.exit(0);
//                    }
//                }
//            }
//        }
//        System.out.println("true");
        String s[]= {"h","e","l","l","o"};
        int start =0;
        int end = s.length-1;
        while(start<end){
            if(!s[start].equals(s[end])){
                String temp = s[start];
                s[start] =s[end];
                s[end] = temp;
            }
        }
        for(String str : s){
            System.out.println(str);
        }

}
}
