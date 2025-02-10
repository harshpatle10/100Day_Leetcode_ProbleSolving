package leetcodeQ.AfterExam;
/*
 l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
 */
public class A02 {
    public static void main(String[] args) {
        int []l1 = {9,9,9,9,9,9,9};
        int l2[] = {9,9,9,9};

        String str1 ="";
        String str2 ="";
        int n =Integer.parseInt(str1)+Integer.parseInt(str2);
        int arr[] = new int[String.valueOf(n).length()];

        for (int i=l1.length-1;i>=0;i--) {
            str1 = str1 + l1[i];
        }
        for(int i=l2.length-1;i>=0;i--){
            str2 = str2 + l2[i];
        }
        for(int i=0;i<arr.length;i++) {
            arr[i] = n%10;
            n = n/10;
        }

    }
}
