package models;

public class Album {
    // my variables here
    private int id;
    private String album_name;
    private String artist_name;
    private String[] track_listing;
    private boolean hasPhotoCards;
    private int quantity;
    private float price;

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

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
