package leetcodeQ.AfterExam;
/*
Input: words = ["pay","attention","practice","attend"], pref = "at"
Output: 2
Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
Example 2:

Input: words = ["leetcode","win","loops","success"], pref = "code"
Output: 0
Explanation: There are no strings that contain "code" as a prefix.
 */
public class A2185 {
    public static void main(String[] args) {
     String []words = {"leetcode","win","loops","success"};
       String pref = "at";


       int count=0;
        for(int i=0;i<words.length;i++) {
            if(words[i].startsWith(pref))
                count++;
        }
        System.out.println(count);
    }
}
