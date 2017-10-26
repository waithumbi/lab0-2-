/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.Scanner;

/**
 *
 * @author badi
 */
public  class BankAccount implements Bank {
    public  static Scanner scanner = new Scanner(System.in);
    public  static String fullNames;
    public  static int choice;
    public static  float amount, balance;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Please enter your fullnames (as per ID):\n");
        fullNames = scanner.nextLine();
        service();
        
        
    }
 
    public static void service (){
        BankAccount acc = new BankAccount();

        System.out.print("Please select service: \n"
                + "1. Withdraw\n2. Deposit\n3. View Balance\n4. Quit\n");
        choice = scanner.nextInt();
        
        switch (choice){
            case 1:
                System.out.print("Please enter amount to withdraw:\n");
                amount = scanner.nextFloat();
                acc.withdraw(amount);
            break;
            case 2:
                System.out.print("Please enter amount to deposit:\n");
                amount = scanner.nextFloat();
                acc.deposit(amount);
            break;
            case 3:
                balance = acc.getBalance();
                System.out.print("Your balance is KES " + balance + ".\n");
                service();
            break;
            case 4:
                System.out.print("Bye bye " + fullNames + ".\n");
                System.exit(0);
            break;            
            default:
                System.out.print("Invalid  option.\n");
                service();
            break;
        }
    }
    
    
    @Override
    public void deposit(float depositAmount) {
        balance = balance + depositAmount;
        service();
    }

    @Override
    public void withdraw(float withdrawAmount) {
        float newBalance = balance - withdrawAmount;
        if (newBalance < 0)
        {
            System.out.print("You cannot withdraw more than your "
                    + "current balance of KES " + balance +" \n");
        }
        else{
            balance = newBalance;
        }
        service();

    }

    @Override
    public float getBalance() {
        return balance;
    }

   
}
