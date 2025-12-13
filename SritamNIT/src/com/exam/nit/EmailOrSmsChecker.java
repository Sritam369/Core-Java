package com.exam.nit;

import java.util.Scanner;
interface NotificationHub{
    void sendAlert();
    void sendReport();
}

class EmailNotification implements NotificationHub{
    public void sendAlert(){
        System.out.println("Email Alert Sent");       
    }
    public void sendReport(){
    	 System.out.println("Email Report Generated");
    }
}
class SmsNotification implements NotificationHub{
    public void sendAlert(){
    	 System.out.println("SMS Alert Sent");       
    }
    public void sendReport(){
    	 System.out.println("SMS Report Generated");
    }
}

public class EmailOrSmsChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter email or sms");
		  String str = sc.nextLine();
		  NotificationHub noti ;
		  if(str.equals("email")){
		    noti = new EmailNotification();
		    processNotification(noti);
		  }
		  else if(str.equals("sms")){
		    noti = new SmsNotification();
		    processNotification(noti);
		  }
		  else{
			  System.out.println("Invalid notification type!");
		  }
		  sc.close();
		}
		public static void processNotification(NotificationHub nh){
		    nh.sendAlert();
		    nh.sendReport();
		}
		
		}	

				
