package leetcodeQ.AfterExam;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

/*
Input: date = "2080-02-29"

Output: "100000100000-10-11101"

Explanation:

100000100000, 10, and 11101 are the binary representations of 2080, 02, and 29 respectively.


 */
public class A3280 {
    public static void main(String[] args) {
        String date = "2080-02-29";


        String a = date.substring(0,4);
        String b = date.substring(5,7);
        String c = date.substring(8,10);
       StringBuilder sb = new StringBuilder("");

        sb.append(Integer.toBinaryString(Integer.parseInt(a)));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(b)));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(c)));



    }
}
