/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2_ostap_melnyk.r;

/**
 *
 * @author main
 */
public class ChequingAccount extends Account implements Overdraftable {

    final double annualRate = 0.01;
    double overdraftLimit = -500;
    double interest = this.balance * annualRate;

    /**
     * Constractor
     *
     * @param accountNo
     * @param customerName
     */
    public ChequingAccount(String accountNo, String customerName) {
        super(accountNo, customerName);
    }

    /**
     * Override method with different persentage
     */
    @Override
    public void interest() {

        this.balance += annualRate * this.balance;
    }

    /**
     * validation
     *
     * @param amount
     */
    @Override
    public void withdraw(double amount) {

        if (!(this.balance - amount < -500)) {
            this.balance -= amount;
        } else {
            throw new IllegalArgumentException("More than 500");
        }
        /**
         *
         */

    }

}
