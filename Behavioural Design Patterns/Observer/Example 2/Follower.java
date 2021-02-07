public class Follower implements Observer {

    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    @Override
    public void update(String status) {
        System.out.println(status);
    }

    public void play() {
        System.out.println("playing");
    }

}
