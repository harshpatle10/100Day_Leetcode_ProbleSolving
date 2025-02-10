package leetcodeQ.AfterExam;

import java.util.ArrayList;
import java.util.List;

/*
Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".
Example 2:

Input: s = "applepenapple", wordDict = ["apple","pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
Note that you are allowed to reuse a dictionary word.
Example 3:

Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: false
 */
public class A139 {
    public static void main(String[] args) {
        String s = "applepenapple";
        List <String> wordDict = new ArrayList<>();

        wordDict.add("apple");
        wordDict.add("pen");

        for(int i=0;i<wordDict.size();i++)
        {
            if(s.contains(wordDict.get(i)))
            {

            }
        }

    }
}
