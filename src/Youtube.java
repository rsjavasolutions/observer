public class Youtube {
    public static void main(String[] args) {

        Channel channel1 = new Channel();

        Subscriber subscriber1 = new Subscriber("Zdzich");
        Subscriber subscriber2 = new Subscriber("Benek");
        Subscriber subscriber3 = new Subscriber("Maniek");
        Subscriber subscriber4 = new Subscriber("Tadzio");

        channel1.attach(subscriber1);
        channel1.attach(subscriber2);
        channel1.attach(subscriber3);
        channel1.attach(subscriber4);

        channel1.detach(subscriber3);

        subscriber1.subscribeChannel(channel1);
        subscriber2.subscribeChannel(channel1);
        subscriber3.subscribeChannel(channel1);
        subscriber4.subscribeChannel(channel1);

        channel1.upload("Tylko ketoza");
    }
}
