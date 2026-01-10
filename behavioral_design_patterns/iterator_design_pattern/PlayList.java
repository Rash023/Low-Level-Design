package behavioral_design_patterns.iterator_design_pattern;

import java.util.ArrayList;

public class PlayList {
    private ArrayList<String> songs;
    public PlayList() {
        songs = new ArrayList<>();
    }
    public void addSong(String song) {
        songs.add(song);
    }
    public PlaylistIterator iterator(String type) {
        switch (type) {
            case "simple":
                return new SimplePlaylist(this);
            case "shuffled":
                return new ShuffledPlaylist(this);
            case "favorites":
                return new FavoritesPlaylist(this);
            default:
                return null;
        }
    }
    public ArrayList<String> getSongs() {
        return songs;
    }
}