/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author badi
 */
public interface Bank {
    
     public void deposit(float depositAmount);
     public void withdraw(float withdrawAmount);


    /**
     * @return balance
     */
    public float getBalance();
}
