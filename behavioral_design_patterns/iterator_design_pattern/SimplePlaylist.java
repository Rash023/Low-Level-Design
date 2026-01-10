package behavioral_design_patterns.iterator_design_pattern;

public class SimplePlaylist implements PlaylistIterator{
    private PlayList playList;
    private int index;

    public SimplePlaylist(PlayList playList){
        this.playList=playList;
        this.index=0;
    }

    @Override
    public boolean hasNext(){
        return index<playList.getSongs().size();
    }

    @Override
    public String next(){
        return playList.getSongs().get(index++);
    }


}
