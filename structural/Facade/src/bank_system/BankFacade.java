package bank_system;

public class BankFacade {
   private BankSystem bankSystem;
   private int c=0;

   public int createAccount(String type){
       switch (type) {
           case "investing" -> bankSystem = new InvestingAccount();
           case "saving" -> bankSystem = new SavingAccount();
           default -> System.out.println("invalid type");
       }
       if(bankSystem!=null){
           bankSystem.setAccountNo(c);
           c++;
           return bankSystem.getAccountNo();
       }
       return -1;
   }

   public void withdraw(int amount){
       bankSystem.withdraw(amount);
   }

   public void deposit(int amount){ bankSystem.deposit(amount);}


}
