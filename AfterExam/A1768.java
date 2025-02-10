package leetcodeQ.AfterExam;
/*
* Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
* word1 = "ab", word2 = "pqrs"
* */

import java.util.ArrayList;
import java.util.List;

public class A1768 {
    public static void main(String[] args) {

       String word1 = "ab";
       String word2 = "pqrs";

       StringBuffer sb = new StringBuffer();
       int i=0;
       while(i<word2.length() || i<word1.length())
       {
           if(i<word1.length())
               sb = sb.append(word1.charAt(i));

           if(i<word2.length())
            sb =   sb.append(word2.charAt(i));

           i++;
       }
        System.out.println(sb.toString());
    }
}
