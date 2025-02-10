package leetcodeQ.AfterExam;
/*
I	1
V	5
X	10
L	50
C	100
D	500
M	1000

Input: num = 3749

Output: "MMMDCCXLIX"

Explanation:

3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
 700 = DCC as 500 (D) + 100 (C) + 100 (C)
  40 = XL as 10 (X) less of 50 (L)
   9 = IX as 1 (I) less of 10 (X)
Note: 49 is not 1 (I) less of 50 (L) because

 if(num%1000==0){
                result.contains("M");
                num/=100;
            }
 else if(num%500==0){
                result.contains("D");
                num/=500;
            }
            else if(num%100==0){
                result.contains("C");
                num/=100;
            }
            else if(num%50==0){
                result.contains("L");
                num/=50;
            }
 */
public class A12 {
    public static void main(String[] args) {
        int num = 3749;
        StringBuilder res= new StringBuilder();
        while(num >= 1000){
            res.append('M');
            num -= 1000;

        }

        while(num >= 900){
            res.append("CM");
            num -= 900;

        }

        while(num >= 500){
            num -= 500;
            res.append('D');

        }

        while(num >= 400){
            num -= 400;
            res.append("CD");

        }

        while(num >= 100){
            num -= 100;
            res.append('C');

        }

        while(num >= 90){
            num -= 90;
            res.append("XC");

        }

        while(num >= 50){
            num -= 50;
            res.append('L');

        }

        while(num >= 40){
            num -= 40;
            res.append("XL");
        }

        while(num >= 10){
            num -= 10;
            res.append('X');

        }

        while(num >= 9){
            num -= 9;
            res.append("IX");
        }

        while(num >= 5){
            num -= 5;
            res.append('V');
        }

        while(num >= 4){
            num -= 4;
            res.append("IV");
        }

        while(num >= 1){
            num -= 1;
            res.append('I');

        }
    }
}
