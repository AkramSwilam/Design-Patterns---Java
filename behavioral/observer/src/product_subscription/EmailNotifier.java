package product_subscription;

import java.util.ArrayList;

public class EmailNotifier implements Observer{
    ArrayList<String> emails;
    public EmailNotifier(){
        emails=new ArrayList<>();
        emails.add("akram@mail.com");
    }
    @Override
    public void update() {
        for (String email:emails) {
            System.out.println("notifying "+email);
        }
    }
}
