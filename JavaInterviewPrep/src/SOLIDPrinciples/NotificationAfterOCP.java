package SOLIDPrinciples;

interface Notification {
    void send();
}

class EmailNotificationService implements Notification {

    @Override
    public void send() {
        System.out.println("Sending Email Notification to clients");
    }
}

class SMSNotificationService implements Notification {

    @Override
    public void send() {
        System.out.println("Sending SMS Notification to clients");
    }
}

// here we are extending the notification interface and provide an implementation for the OTPNotificationService,
// but we are not modifying the email, sms notification service they are working as it is we are not touching them
// if we do not do it like this then we need to test it again the huge lines to code do regressions testing of it
// check flow of the service end to end that is bit of lengthy, here productivity decreases as well

class OTPNotificationService implements Notification {

    @Override
    public void send() {
        System.out.println("Sending OTP Notification to clients");
    }
}

// NotificationService.java
public class NotificationAfterOCP {

    public void sendNotification(Notification notification) {
        notification.send();
    }
}
