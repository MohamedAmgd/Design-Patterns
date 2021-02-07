import java.util.ArrayList;

/**
 * Playlist
 */
public class Playlist implements IComponent {
    public String playlistName;
    public ArrayList<IComponent> playlist;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        playlist = new ArrayList<>();
    }

    @Override
    public void play() {
        System.out.println("Now playing ".concat(playlistName));
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for (IComponent component : playlist) {
            component.setPlaybackSpeed(speed);
        }
    }

    @Override
    public String getName() {
        return playlistName;
    }

    public void add(IComponent component) {
        playlist.add(component);
    }

    public void remove(IComponent component) {
        playlist.remove(component);
    }
}