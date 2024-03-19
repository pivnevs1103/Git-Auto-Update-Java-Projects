package Algorithms;

public class BubbleSort {

    public static void bubbleSort(int[] array){
        for(int start = 0; start < array.length; start++){
            for(int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swapMethod(array, i, (i + 1));
                }
            }
        }
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void swapMethod(int[] array, int num1, int num2){
        if(num1 == num2){
            return;
        }
        int tempValue = array[num1];
        array[num1] = array[num2];
        array[num2] = tempValue;
    }
}
