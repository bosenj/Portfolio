
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soblab
 */
public class TelevisionDemo {
    public static void main(String[] args){
       Scanner keyboard = new Scanner(System.in); 
       Television livingroomTV = new Television("Samsung", 50); //declare object livingroomTV
       
       livingroomTV.powerOn(); //turn power on
       
       System.out.println("What channel would you like to put on?");
       int chan = keyboard.nextInt();
       livingroomTV.setChannel(chan); //set channel
       
       livingroomTV.decreaseVolume(); //decrease volume twice
       livingroomTV.decreaseVolume();
       
       System.out.println("The current channel is: " + livingroomTV.getChannel() + 
               "And the current volume is: " + livingroomTV.getVolume()); //display channel and volume
       
        System.out.println("The current state of the TV is: " + livingroomTV.toString());
        
        Television diningroomTV = new Television("LG", 35);
        
        System.out.println("The current state of the TV is: " + diningroomTV.toString());
    }
    
}


