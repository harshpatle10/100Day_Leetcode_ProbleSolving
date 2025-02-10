package leetcodeQ.AfterExam;
/*
* Input: s = "aAbBcC"
Output: 2
Explanation:
From s[0] = 'a' to s[1] = 'A', there is no change of key as caps lock or shift is not counted.
From s[1] = 'A' to s[2] = 'b', there is a change of key.
From s[2] = 'b' to s[3] = 'B', there is no change of key as caps lock or shift is not counted.
From s[3] = 'B' to s[4] = 'c', there is a change of key.
From s[4] = 'c' to s[5] = 'C', there is no change of key as caps lock or shift is not counted.

Example 2:

Input: s = "AaAaAaaA"
Output: 0
Explanation: There is no change of key since only the letters 'a' and 'A' are pressed which does not require change of key.*/

public class A3019 {
    public static void main(String[] args) {
        String s = "AaAaAaaAabB" ;
        int count=0;
        for(int i=0;i<s.length()-1;i++)
        {
            String str1 = String.valueOf(s.charAt(i));
            String str2 = String.valueOf(s.charAt(i+1));
            if(str1.equalsIgnoreCase(str2));
            else
                count++;

        }
        System.out.println(count);
    }
}
