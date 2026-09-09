/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.log.in;
import java.util.Scanner;

/**
 *
 * @author CL2-PC
 */
public class test {
    public static void main(String[]args){
        act();
        
    }
    //recursion pre-setup
    private static void act()
    {
        Scanner input = new Scanner(System.In);
        System.out.println("[1] Snacks");
        System.out.println("[2]Drinks");
        System.out.println("Enter your choice:");
        int choice1 = input.nextInt();
        if(choice1 == 1)
        {
            System.out.println("Snacks");
            System.out.println("[1] = Piatos [22.00 pesos]");
            System.out.println("[2] = Nova [25.00 pesos]");
            System.out.println("Enter your choice:");
            int snackchoice1 = input.nextInt();
            if(snackchoice1 == 1)
            {
                System.out.println("You chose Piatos");
                System.out.println("price is 22.00 pesos");
                int piatos = 22;
                System.out.println("Enter Quantity:");
                int quan = input.nextInt();
                int subtotal = quan * piatos;
                System.out.println("Subtotal is:" + subtotal);
                System.out.println("Enter Cash:");
                int cash = input.nextInt();
                int total = cash - subtotal;
                while(cash < subtotal)
                {
                    System.out.println("Enter Cash:");
                    cash = input.nextint();
                    total = cash - subtotal;
                }
                System.out.println("Your change is:" + total);
            }
            /** WITH RECURSION
             * 
             */
            package com.mycompany.log.in.;
            import java.util.Scanner;
            /**
             * @author Operator
             */
            public class test{
                act();
            }
            //Recursion Method
            private static void act(){
                Scanner input = new Scanner(System.in);
                System.out.println("[1] = Snacks");
                System.out.println("[2] = Drinks");
                System.out.println("Enter your choice:");
                int choice1 = input.nextInt();
                
                if(choice1 == 1){
                    System.out.println("Snacks");
                    System.out.println("[1] = Piatos [22.00 pesos]");
                    System.out.println("[2] = Nova [25.00 pesos]");
                    System.out.println("Enter your choice:");
                    int snackchoice1 = input.nextInt();
                    
                    if(snackchoice1 == 1){
                        System.out.println("You chose Piatos");
                        System.out.println("Price is 22.00 pesos");
                        int piatos = 22;
                        System.out.println("Enter Quantity:");
                        int quan = input.nextInt();
                        int subtotal = quan * piatos;
                        
                        System.out.println("Enter Cash:");
                        int cash = input.nextInt();
                        
                        while(cash < subtot){
                            System.out.println("Insufficient cash!");
                            System.out.println("Enter cash:");
                            cash = input.nextInt();
                        }
                        int total = cash - subtotal;
                        System.out.println("Your change is:" + total);
                    }
                    else if(snackchoice1 == 2){
                        System.out.println("You chose Nova");
                        System.out.println("Price is 25.00 pesos");
                        int nova = 25;
                        System.out.println("Enter Quantity:");
                        int quan = input.nextInt();
                        int subtotal = quan * nova;
                        System.out.println("Subtotal is:" + subtotal);
                        System.out.println("Enter cash:");
                        int cash = input.nextInt();
                        
                        while(cash < subtotal){
                            System.out.println("Insufficient cash!");
                            System.out.println("Enter Cash:");
                            cash = input.nextInt();
                        }
                        int total = cash - subtotal;
                        System.out.println("Your change is:" + total);
                        }
                    }
                // Ask if user want to repeat
                System.out.println("\nDo you want to order again?");
                System.out.println("[1] = Yes");
                System.out.println("[2]= No");
                System.out.println("Enter Choice:");
                int again = input.nextInt();
                if(again == 1){
                    //RECURSION
                    act();
                } else {
                    System.out.println("Thank you for ordering!");
                }
            }
        }
    }
}
