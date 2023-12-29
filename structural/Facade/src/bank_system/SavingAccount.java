package bank_system;

public class SavingAccount extends BankSystem {

    @Override
    public void deposit(int amount) {
        System.out.println(amount + " deposited in saving account");
    }

    @Override
    public void withdraw(int amount) {
        System.out.println(amount + " withdraw in saving account");
    }
}
