package leetcodeQ.AfterExam;

import javax.swing.plaf.IconUIResource;

/*
arr1 = [1,10,100], arr2 = [1000]
Output: 3
Explanation: There are 3 pairs (arr1[i], arr2[j]):
- The longest common prefix of (1, 1000) is 1.
- The longest common prefix of (10, 1000) is 10.
- The longest common prefix of (100, 1000) is 100.
The longest common prefix is 100 with a length of 3.
 */
public class A3043 {
    public static void main(String[] args) {
        int arr1[] = {1,10,100};
        int arr2[] = {1000};

        int max=0;
        for(int i=0;i<arr2.length;i++) {
            String pp = String.valueOf(arr2[i]);

            for(int k=0;k<arr1.length;k++) {
                String tt = String.valueOf(arr1[k]);

                    int count=0;
                for(int j=0;j<tt.length() && j<pp.length();j++) {

                        if (pp.charAt(j) == tt.charAt(j))
                            count++;
                        else
                            break;

                }
                    if(count>max)
                       max = Math.max(count,max);

            }
        }
        System.out.println(max);
    }
}
