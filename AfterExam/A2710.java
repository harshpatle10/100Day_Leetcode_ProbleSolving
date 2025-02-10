package leetcodeQ.AfterExam;
/*
Input: num = "51230100"
Output: "512301"
Explanation: Integer "51230100" has 2 trailing zeros, we remove them and return integer "512301".

 */
public class A2710 {
    public static void main(String[] args) {
        String num = "2330420";
       StringBuilder str = new StringBuilder(num);
       str.reverse();
       for(int i=0;i<str.length();i++)
       {
           if(str.charAt(i)=='0'){
               str.delete(i,i+1);
               i--;
           }
           else
               break;
       }
        System.out.println(str.reverse().toString());
       int nn = 0 ^ 2 ^ 4 ^ 6 ^ 8;
        System.out.println(nn);

    }
}
