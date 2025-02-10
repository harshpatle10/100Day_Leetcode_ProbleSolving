package leetcodeQ.AfterExam;
/*
Input: words = ["a","aba","ababa","aa"]
Output: 4
Explanation: In this example, the counted index pairs are:
i = 0 and j = 1 because isPrefixAndSuffix("a", "aba") is true.
i = 0 and j = 2 because isPrefixAndSuffix("a", "ababa") is true.
i = 0 and j = 3 because isPrefixAndSuffix("a", "aa") is true.
i = 1 and j = 2 because isPrefixAndSuffix("aba", "ababa") is true.
Therefore, the answer is 4.
Example 2:

Input: words = ["pa","papa","ma","mama"]
Output: 2
Explanation: In this example, the counted index pairs are:
i = 0 and j = 1 because isPrefixAndSuffix("pa", "papa") is true.
i = 2 and j = 3 because isPrefixAndSuffix("ma", "mama") is true.
Therefore, the answer is 2.

 */
public class A3042 {
    public static void main(String[] args) {
        String words[]  = {"pa","papa","ma","mama"};

        int n=0;
        for(int i=0;i<words.length-1;i++) {
            for(int j=i+1;j<words.length;j++) {
                if(words[j].contains(words[i]))
                    n++;
            }}
        System.out.println(n);
    }
}
