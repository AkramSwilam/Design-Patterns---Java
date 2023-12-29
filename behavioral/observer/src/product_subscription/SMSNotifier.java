package product_subscription;

import java.util.ArrayList;

public class SMSNotifier implements Observer{
    ArrayList<String> sms=new ArrayList<>();
    SMSNotifier(){
        sms=new ArrayList<>();
        sms.add("01009988");
    }
    @Override
    public void update() {
        for (String s:sms) {
            System.out.println("notifying "+s);
        }
    }
}
