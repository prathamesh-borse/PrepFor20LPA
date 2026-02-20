package SOLIDPrinciples;

public class NotificationBeforeOCP {
    public void sendNotification(String type) {
        if (type.equals("Email")) {
            System.out.println("Sending email notification to clients");
        } else if (type.equals("SMS")) {
            System.out.println("Sending SMS Notification to clients");
        }

        // here we are modifying the existing code we are not extending it we are actually modifying
        // the whole method block different notification type
        else if (type.equals("OTP")) {
            System.out.println("Sending OTP notification to clients");
        }
    }
}
