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
public class InvestmentAccount extends SavingsAccount {

    final double annualRate = 0.03;
    double interest = this.balance * annualRate;

    /**
     *
     * @param accountNo
     * @param customerName
     */

    public InvestmentAccount(String accountNo, String customerName) {
        super(accountNo, customerName);
    }

    /**
     *
     * @param amount
     */

    @Override
    public void deposit(double amount) {
        amount *= 1.5;
        this.balance += amount;
    }

    /**
     * Override with different percentage
     */

    @Override
    public void interest() {
        this.balance += this.balance * annualRate;
    }

}
