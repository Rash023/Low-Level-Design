package behavioral_design_patterns.iterator_design_pattern;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffledPlaylist implements PlaylistIterator{
    private PlayList playList;

    private ArrayList<String> shuffledSongs;

    private int index;

    public ShuffledPlaylist(PlayList playList){
        this.playList=playList;
        this.shuffledSongs=new ArrayList<>(playList.getSongs());
        Collections.shuffle(shuffledSongs);
        this.index=0;
    }

    public boolean hasNext(){
        return index<playList.getSongs().size();
    }

    public String next(){
        return shuffledSongs.get(index++);
    }
}
