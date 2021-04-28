
import java.util.Random;
import java.util.Scanner;

@author soblab

public class NumberFunctions {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = keyboard.nextInt();
        int[] alpha = new int[num + 10];
        Random rand = new Random();
        for(int i = 0; i < alpha.length; i++){
            alpha[i] = rand.nextInt(50);
        }
        
        printArray(alpha);
        alpha[alpha.length - 1] = alpha[7] - 2*  alpha[4];
        
        printArray(alpha);
        System.out.println("The total is: " + getTotal(alpha));
        System.out.println("The average is: " + getAverage(alpha));
        System.out.println("The highest number is: " + getHighest(alpha));
        System.out.println("The lowest number is: " + getLowest(alpha));
    }
    
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }    
        
    public static double getTotal(int[] array){
        double total = 0;
        for(int i = 0; i < array.length; i++){
            total += array[i];
        }
        return total;
    }    
    
    public static double getAverage(int[] array){
        double average;
        double total = 0;
        for(int i = 0; i < array.length; i++){
            total += array[i];
        }
        return average = total / array.length;
    }
    
    public static double getHighest(int[] array){
        int highest = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > highest)
                highest = array[i];
        }
        return highest;
    }
    
    public static double getLowest(int[] array){
        int lowest = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] < lowest)
                lowest = array[i];
        }
        return lowest;
    }
}
