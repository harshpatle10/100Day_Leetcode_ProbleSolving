package leetcodeQ.AfterExam;
/*
Input: arrivalTime = 15, delayedTime = 5
Output: 20
Explanation: Arrival time of the train was 15:00 hours. It is delayed by 5 hours. Now it will reach at 15+5 = 20 (20:00 hours).

 */
public class A2651 {
    public static void main(String[] args) {
        int arrivalTime = 13;
        int delayedTime = 11;
        int sum = arrivalTime+delayedTime;
        if(sum<24) {
            System.out.println(sum);
//            return sum;
        }
        else {
            System.out.println(sum-24);
//            return sum-24;
           }
    }
}
