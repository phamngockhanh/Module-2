package ss4_class_object.bai_tap.stop_watch;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 100000;
        int [] array = new int [length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt();
        }
        StopWatch stw = new StopWatch();
        stw.start();
        selectionSort(array);
        stw.end();
        System.out.printf("Thời gian thực thi là %d miliseconds",stw.getElapsedTime());

    }
    public static void selectionSort(int[] arrs){
        int n = arrs.length;
        for(int i = 0;i<n-1;i++){
            int minIndex= i;
            for (int j = i+1; j < n ; j++) {
                if(arrs[minIndex]<arrs[j]){
                    minIndex = j;
                }
            }
            int temp = arrs[minIndex];
            arrs[minIndex] = arrs[i];
            arrs[minIndex] = temp;
        }
    }
}
