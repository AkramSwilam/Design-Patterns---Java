package bank_system;

public class InvestingAccount extends BankSystem {




    @Override
    public void deposit(int amount) {
        System.out.println(amount + " deposited in investing account");
    }

    @Override
    public void withdraw(int amount) {
        System.out.println(amount + " withdraw in investing account");
    }
}
