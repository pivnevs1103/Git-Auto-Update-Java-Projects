package Algorithms;

public class Search {

    public static int linearSearch(int[] dataSet, int target){
        // Iterate through dataset searching for target
        for(int i = 0; i < dataSet.length; i++){
            if(dataSet[i] == target){
                return i;
            }
        }
        return -1;
    }

    // Using recursion we call the method again and again until the midpoint matches the target value and then
    // it gets returned
    public static int binarySearch(int[] dataSet, int target, int start, int end){
        // Binary search assumes a sorted array and can therefore continually split our search domain in half
        int midPoint = ((start+end)/2);
        int value = dataSet[midPoint];

        //System.out.println(midPoint + " " + value);

        if(target > value){
            return binarySearch(dataSet, target, midPoint + 1, end);
        }
        else if(target < value){
            return binarySearch(dataSet, target, start, midPoint);
        }
        // System.out.println(target + " = " + value);
        return midPoint;
    }
}
