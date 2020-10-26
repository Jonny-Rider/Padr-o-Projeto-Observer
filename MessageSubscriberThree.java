public class MessageSubscriberThree implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("Mensagem assinante tres :: " + m.getMessageContent());
    }
}