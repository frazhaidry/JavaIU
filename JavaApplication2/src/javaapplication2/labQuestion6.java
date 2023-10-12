package javaapplication2;

public class labQuestion6 {

    public static void main(String args[]) {
        int[] arr = {20, 30, 25, 25, -16, 60, -100};
        double avg = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }

        avg = sum / 7.0;
        System.out.println(avg);
        // System.out.println(arr[])
    }
}
