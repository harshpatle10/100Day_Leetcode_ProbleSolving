package leetcodeQ.AfterExam;

class Solution {
    public static void main(String[] args) {

//        Input: names = ["Mary","John","Emma"], heights = [180,165,170]
//        Output: ["Mary","Emma","John"]
//        Explanation: Mary is the tallest, followed by Emma and John.
//        Example 2:
//
//        Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
//        Output: ["Bob","Alice","Bob"]
//        Explanation: The first Bob is the tallest, followed by Alice and the second

//    public String[] sortPeople(String[] names, int[] heights) {
//
//        }
        String [] names = {"Alice","Bob","Bob"};
        int [] heights = {155,185,150};

        int temp=0;
        String str = "";

        int l = heights.length-1;

        for(int i=0;i<=l;i++){
            for(int j=1+i;j<=l;j++)
            {
                if(heights[i]<heights[j])
                {

                   temp =heights[i];
                    heights[i]=heights[j];
                    heights[j]= temp;

                    str =names[i];
                    names[i]=names[j];
                    names[j]= str;
                }
                    temp=0;
                str="";

            }
        }
        for (int b : heights){
            System.out.print(b +"  ");
        }
        for(String a: names)
        {
            System.out.print(a + "  ");
        }

    }
}
