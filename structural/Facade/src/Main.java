import bank_system.BankFacade;

public class Main {
    public static void main(String[] args) {
        BankFacade bankFacade=new BankFacade();
       int investingAccountNo= bankFacade.createAccount("investing");
        bankFacade.deposit(1000);

    }
}