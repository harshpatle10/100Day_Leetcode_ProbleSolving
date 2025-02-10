package leetcodeQ.AfterExam;
/*
*Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
Explanation:
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".
Example 2:

Input: s = "What is the solution to this problem", k = 4
Output: "What is the solution"
Explanation:
The words in s are ["What", "is" "the", "solution", "to", "this", "problem"].
The first 4 words are ["What", "is", "the", "solution"].
Hence, you should return "What is the solution".
Example 3:

Input: s = "chopper is not a tanuki", k = 5
Output: "chopper is not a tanuki"


*/
public class A1816 {
    public static void main(String[] args) {
        String s = "What is the solution to this problem";
        int k=4;

        int count = 0;
         String sub ="";
        for(int i=0;i<s.length();i++)
        {
            String str = String.valueOf(s.charAt(i));
            if(str.equalsIgnoreCase(" "))
            {
                count++;
                if(count==k)
                    break;

            }
                sub = sub.concat(str);

        }
        System.out.println(sub);
    }
}
