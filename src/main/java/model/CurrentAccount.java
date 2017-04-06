package model;

/**
 * Created by gpascal on 4/6/2017.
 */
public class CurrentAccount extends Account {
    public CurrentAccount(String description, String iban, int balance) {
        super(description, iban, balance);
    }
    private boolean overdraft;

    public boolean isOverdraft() {
        return overdraft;
    }

    public void setOverdraft(boolean overdraft) {
        this.overdraft = overdraft;
    }
}
