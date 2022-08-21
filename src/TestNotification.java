public class TestNotification {
    public static void main(String[] args) {
        Notification notification = new Notification();
        Customer customer = new Customer();
        customer.setEmail("abc@gmail.com");
        customer.setMobileNo("9772423500");
        customer.setName("TestName");
        //In case of Mail and type of wish is Birthday Wish
        notification.sendMail(customer, ActualContent.BIRTHDAY_CONST);
        //In case of Mail and type of wish is Anniversary Wish
        notification.sendMail(customer, ActualContent.ANNIVERSARY_CONST);
        //In case of Message and type of wish is Birthday Wish
        notification.sendMessage(customer, ActualContent.BIRTHDAY_CONST);
        //In case of Message and type of wish is Anniversary Wish
        notification.sendMessage(customer, ActualContent.ANNIVERSARY_CONST);
    }
}

class Customer {
    private String email;
    private String mobile_no;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public String getMobile_no() {
        return this.mobile_no;
    }

    public void setMobileNo(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getMobileNo() {
        return mobile_no;
    }
}

class Notification extends ActualContent {
    // ActualContent ac = new ActualContent();
    Customer customer = new Customer();

    public void sendMail(Customer customer, String content) {
        String email = customer.getEmail();
        String name = customer.getName();
        String finalContent = content + name;
        System.out.println("Mail Sent to email id " + email + " " + finalContent);
        //Logic for sending mail
    }

    public void sendMessage(Customer customer, String content) {
        String name = customer.getName();
        String mobile_no = customer.getMobile_no();
        String finalContent = content + name;
        System.out.println("Message Sent to mobile number " + mobile_no + " " + finalContent);
        //Logic for sending Message
    }
}

class ActualContent {
    public static final String BIRTHDAY_CONST = "Happy Birthday Dear";
    public static final String ANNIVERSARY_CONST = "Happy ANNIVERSARY Dear";
}