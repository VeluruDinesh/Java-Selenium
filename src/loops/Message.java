package loops;


class MessageSender {
    public void sendMessage() {
        System.out.println("Sending message");
    }
}


class Email extends MessageSender {
    
    public void sendMessage() {
        System.out.println("Email sent");
    }
}


class SMS extends MessageSender {
   
    public void sendMessage() {
        System.out.println("SMS sent");
    }
}


public class Message {
    public static void main(String[] args) {
       MessageSender s1=new SMS();
       s1.sendMessage();
       MessageSender s2=new Email();
       s2.sendMessage();
       MessageSender s3=new MessageSender();
       s3.sendMessage();
    }
}
