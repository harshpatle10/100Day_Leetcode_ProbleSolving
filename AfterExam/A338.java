package leetcodeQ.AfterExam;

public class A338 {
    public static void main(String[] args) {
        int n =2;
        int arr[] = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int num =i;
            while(num>0) {
                int rem = num%2;
                arr[i]=arr[i]+rem;
                num/=2;
            }
        }
        for(int i : arr)
        {
            System.out.println(i);
        }

    }
}
