package bank_system;

public abstract class BankSystem {
    int accountNo;

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getAccountNo() {
        return accountNo;
    }


    abstract void deposit(int amount) ;

    abstract void withdraw(int amount);

   
}
