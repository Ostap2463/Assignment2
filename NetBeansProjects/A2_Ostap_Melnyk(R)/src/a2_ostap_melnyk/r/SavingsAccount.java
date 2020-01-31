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
public class SavingsAccount extends Account {

    final double annualRate = 0.02;
    double interest = this.balance * annualRate;

    /**
     *
     * @param accountNo
     * @param customerName
     */
    public SavingsAccount(String accountNo, String customerName) {
        super(accountNo, customerName);
    }

    /**
     * Override with different percentage
     */
    @Override
    public void interest() {
        this.balance += this.balance * annualRate;
    }

}
