package leetcodeQ.AfterExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A2160 {
    public static void main(String[] args) {
        int num = 2932;
        List<Integer> numlist = new ArrayList<>();
        while(num>0)
        {
            int rem= num%10;
            numlist.add(rem);
            num /= 10;
        }
        Collections.sort(numlist);
        System.out.println(numlist);
        int a = (numlist.get(0)*10)+numlist.get(2);
        int b = (numlist.get(1)*10)+numlist.get(3);
        System.out.println(a+b);
    }
}
