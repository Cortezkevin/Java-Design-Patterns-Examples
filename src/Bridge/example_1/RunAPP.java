package Bridge.example_1;

/*
 * TODO -> App Example using Bridge design patterns
 * */
public class RunAPP {
    public static void main(String[] args) {
        Message email = new EmailMessage();
        Message sms = new SMSMessage();
        Message chat = new WhatsAppMessage();

        Notification pushNotification = new PushNotification(sms);
        pushNotification.send();

        Notification emailNotification = new EmailNotification(email);
        emailNotification.send();

        Notification appNotification = new AppNotification(chat);
        appNotification.send();
    }
}
