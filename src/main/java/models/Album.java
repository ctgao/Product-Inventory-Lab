package models;

public class Album extends InventoryItem{
    // my variables here
    private String album_name;
    private String artist_name;
    private String[] track_listing;
    private boolean hasPhotoCards;

    // constructors time
    public Album(){
        this(-1, "", "", null, false, 0, 0F);
    }
    public Album(int id, String album_name, String artist_name, String[] track_listing, boolean hasPhotoCards, int quantity, float price) {
        this.id = id;
        this.album_name = album_name;
        this.artist_name = artist_name;
        this.track_listing = track_listing;
        this.hasPhotoCards = hasPhotoCards;
        this.quantity = quantity;
        this.price = price;
    }

    public String getAlbumName() {
        return album_name;
    }

    public void setAlbumName(String album_name) {
        this.album_name = album_name;
    }

    public String getArtistName() {
        return artist_name;
    }

    public void setArtistName(String artist_name) {
        this.artist_name = artist_name;
    }

    public String[] getTrackListing() {
        return track_listing;
    }

    public void setTrackListing(String[] track_listing) {
        this.track_listing = track_listing;
    }

    public boolean hasPhotoCards() {
        return hasPhotoCards;
    }

    public void setHasPhotoCards(boolean hasPhotoCards) {
        this.hasPhotoCards = hasPhotoCards;
    }

    @Override
    public String toString(){
        return album_name + " by " + artist_name;
    }
}
