package services;

import models.Album;

import java.util.ArrayList;

public class AlbumService {
    private static int nextID = 1;
    private final ArrayList<Album> inventory = new ArrayList<>();

    public Album create(String albumName, String artistName, String[] trackListing, boolean hasPCs, int quantity, float price) {
        Album createdAlbum = new Album(nextID++, albumName, artistName, trackListing, hasPCs, quantity, price);
        inventory.add(createdAlbum);
        return createdAlbum;
    }

    public Album findAlbum(int id){
        for(Album a : inventory){
            if(id == a.getId()){
                return a;
            }
        }
        return null;
    }

    public Album[] findAll(){
        return inventory.toArray(new Album[inventory.size()]);
    }

    public boolean delete(int id){
        Album thisAlbum = findAlbum(id);
        if(thisAlbum != null){
            return inventory.remove(thisAlbum);
        }
        return false;
    }
}
