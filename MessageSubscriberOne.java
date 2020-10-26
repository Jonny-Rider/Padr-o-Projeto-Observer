public class MessageSubscriberOne implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("Mensagem assinate um :: " + m.getMessageContent());
    }
}