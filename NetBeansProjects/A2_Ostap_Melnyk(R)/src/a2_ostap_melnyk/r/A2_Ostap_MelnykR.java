/*
        Name:  [Ostap Melnyk]
        Assignment:  [Asignmen2]
        Program: [Computer programmer]
        Date:  [28.01.2019]
 */
package a2_ostap_melnyk.r;

import java.util.Scanner;

public class A2_Ostap_MelnykR {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Account NO Checkig: ");
        String y = input.nextLine();

        System.out.println("Enter Account NO saving: ");
        String t = input.nextLine();

        System.out.println("Enter Account NO investment: ");
        String m = input.nextLine();

        System.out.println("Enter Name: ");
        String r = input.nextLine();

        ChequingAccount chekChe = new ChequingAccount(y, r);
        chekChe.interest();
        System.out.println("Enter your deposit amount: ");
        double q = input.nextDouble();
        chekChe.deposit(q);
        System.out.println("Enter your withdraw: ");
        double d = input.nextDouble();
        chekChe.withdraw(d);

        System.out.println("Your amount: " + chekChe.getBalance());

        SavingsAccount checkAcc = new SavingsAccount(t, r);
        checkAcc.interest();
        checkAcc.deposit(q);
        checkAcc.withdraw(d);
        System.out.println(checkAcc.getBalance());

        InvestmentAccount invest = new InvestmentAccount(m, r);
        invest.interest();
        invest.deposit(q);
        invest.withdraw(d);
        System.out.println(invest.getBalance());
        System.out.println("Customer: " + chekChe.getCustomerName());
        System.out.println("==========================");
        System.out.println("AccNo. Interest  NewBal.");
        System.out.println("==========================");
        System.out.println(chekChe.accountNo + "     " + chekChe.interest + "     " + "" + chekChe.balance);
        System.out.println(checkAcc.accountNo + "     " + checkAcc.interest + "     " + "" + checkAcc.balance);
        System.out.println(invest.accountNo + "     " + invest.interest + "     " + "" + invest.balance);

    }

}
