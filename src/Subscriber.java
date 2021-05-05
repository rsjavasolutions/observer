
// Subscriber jest obserwatorem, obserwuje czy coś nowego sie pojawia na obserwowanym kanale i dostaje powiadomienia
public class Subscriber implements Observer {

    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(String.format("Hey %s Video Uploaded %s", name, channel.getTitle()));
    }

    public void subscribeChannel(Channel channel) {
        this.channel = channel;
    }
}
