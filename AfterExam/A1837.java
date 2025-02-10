package leetcodeQ.AfterExam;

public class A1837 {
    public static void main(String[] args) {
      int  n = 34;
        int k=6;
        int sum =0;
        while(n>0){
            sum+=(n%k);
            System.out.println();
            n=n/k;
        }
        System.out.println(sum);
    }
}
