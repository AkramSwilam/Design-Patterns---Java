import bank_system.BankFacade;
import report_system.Facade;
import report_system.Report;

public class Main {
    public static void main(String[] args) {
//        BankFacade bankFacade=new BankFacade();
//       int investingAccountNo= bankFacade.createAccount("investing");
//        bankFacade.deposit(1000);

        Facade facade=new Facade();
        facade.generatePdfReport();
    }
}