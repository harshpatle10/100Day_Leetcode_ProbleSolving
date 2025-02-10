package leetcodeQ.AfterExam;

import java.util.Arrays;

/*
Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.
'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
 */
public class A1941 {
    public static void main(String[] args) {
        String s = "abacbc";

        int arr[] = new int[26];
        for(int i=0;i<s.length();i++) {
            int n = s.charAt(i);
             arr[n-97]++;
        }
        int max = Integer.MIN_VALUE;
        for(int i: arr) {
             max = Math.max(i,max);
        }
        for(int i=0;i<26;i++) {
            if(arr[i]!=0 && arr[i]!=max){
                System.out.println("false");
                break;
            }
        }
        System.out.println("true");

    }
}
