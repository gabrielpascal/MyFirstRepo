package model;

/**
 * Created by gpascal on 4/6/2017.
 */
public class SavingsAccount extends Account implements Printable{
    public SavingsAccount(String description, String iban, int balance) {
        super(description, iban, balance);
    }

    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void printInstance() {
        System.out.println("afisam din clasa savings account" + "\n description " + this.getDescription() + "\niban " + this.getIban() + "\nbalanta " + this.getBalance() + "\n interested rate " + this.getInterestRate());
    }
}
