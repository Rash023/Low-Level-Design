package behavioral_design_patterns.iterator_design_pattern;

public class FavoritesPlaylist implements PlaylistIterator{
    private PlayList playList;
    private int index;

    public FavoritesPlaylist(PlayList playList){
        this.playList=playList;
        this.index=0;
    }

    public boolean hasNext(){
        while (index < playList.getSongs().size()) {
            if (playList.getSongs().get(index).contains(
                    "Fav")) { // Mark favorites with 'Fav' in name
                return true;
            }
            index++;
        }
        return false;
    }

    public String next(){
        return playList.getSongs().get(index++);
    }
}
