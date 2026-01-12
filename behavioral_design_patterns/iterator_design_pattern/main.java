package behavioral_design_patterns.iterator_design_pattern;

public class main {
    public static void main(String[] args) {
        PlayList playlist=new PlayList();
        playlist.addSong("Song1");
        playlist.addSong("Song2 Fav");
        playlist.addSong("Song3");
        playlist.addSong("Song4 Fav");
        playlist.addSong("Song5");

        System.out.println("Simple Playlist");
        PlaylistIterator simplePlaylist= playlist.iterator("simple");
        while(simplePlaylist.hasNext()){
            System.out.println("Playing:-"+simplePlaylist.next());
        }

        System.out.println("\nFavourites Playlist");
        PlaylistIterator favoritesPlaylist=playlist.iterator("favorites");
        while(favoritesPlaylist.hasNext()){
            System.out.println("Playing:-"+favoritesPlaylist.next());
        }
        System.out.println("\nShuffled Playlist");
        PlaylistIterator shuffledPlaylist=playlist.iterator("shuffled");
        while(shuffledPlaylist.hasNext()){
            System.out.println("Playing:-"+shuffledPlaylist.next());
        }

    }
}
