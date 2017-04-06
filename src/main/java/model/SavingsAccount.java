package model;

/**
 * Created by gpascal on 4/6/2017.
 */
public class SavingsAccount extends Account {
    public SavingsAccount(String description, String iban, int balance) {
        super(description, iban, balance);
    }

    private float interestRate;

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
}
