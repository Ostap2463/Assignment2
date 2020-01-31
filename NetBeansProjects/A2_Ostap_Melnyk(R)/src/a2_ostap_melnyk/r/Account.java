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
abstract class Account {

    protected String accountNo;
    protected String customerName;
    protected double balance;

    /**
     * This is constructor that's made some validation
     *
     * @param accountNo
     * @param customerName
     */

    public Account(String accountNo, String customerName) {
        if (accountNo.matches("^[0-9]{3}")) {
            this.accountNo = accountNo;
        } else {
            throw new IllegalArgumentException("Three numbers");

        }
        this.customerName = customerName;
        this.balance = 1000;
    }

    /**
     * Returning Customer name
     *
     * @return
     */

    public String getCustomerName() {
        return customerName;
    }

    /**
     * Returning balance
     *
     * @return
     */

    public double getBalance() {
        return balance;
    }

    /**
     * this method does calculation
     *
     * @param amount
     */
    public void deposit(double amount) {
        this.balance += amount;
    }

    /**
     * this method does calculation
     *
     * @param amount
     */
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    abstract public void interest();

}
