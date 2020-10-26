public class MessageSubscriberTwo implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("Mensagem assinante dois :: " + m.getMessageContent());
    }
}