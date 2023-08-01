package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Test;

public class AlbumTest {
    @Test
    public void setIDTest() {
        //Given
        int expected = 17;
        Album testAlbum = new Album();
        //When
        testAlbum.setID(expected);
        //Then
        Assert.assertEquals(expected, testAlbum.getID());
    }

    @Test
    public void setAlbumNameTest() {
        //Given
        String expected = "Exodus";
        Album testAlbum = new Album();
        //When
        testAlbum.setAlbumName(expected);
        //Then
        Assert.assertEquals(expected, testAlbum.getAlbumName());
    }

    @Test
    public void setArtistNameTest() {
        //Given
        String expected = "MCND";
        Album testAlbum = new Album();
        //When
        testAlbum.setArtistName(expected);
        //Then
        Assert.assertEquals(expected, testAlbum.getArtistName());
    }

    @Test
    public void setTrackListingTest() {
        //Given
        String[] expected = new String[]{"Knock Knock"};
        Album testAlbum = new Album();
        //When
        testAlbum.setTrackListing(expected);
        //Then
        Assert.assertEquals(expected, testAlbum.getTrackListing());
    }

    @Test
    public void setHasPhotoCardsTest() {
        //Given
        boolean expected = true;
        Album testAlbum = new Album();
        //When
        testAlbum.setHasPhotoCards(expected);
        //Then
        Assert.assertEquals(expected, testAlbum.hasPhotoCards());
    }

    @Test
    public void setQuantityTest() {
        //Given
        int expected = 4;
        Album testAlbum = new Album();
        //When
        testAlbum.setQuantity(expected);
        //Then
        Assert.assertEquals(expected, testAlbum.getQuantity());
    }

    @Test
    public void setPriceTest() {
        //Given
        float expected = 3.1F;
        Album testAlbum = new Album();
        //When
        testAlbum.setPrice(expected);
        //Then
        Assert.assertEquals(expected, testAlbum.getPrice(), 0.001);
    }
}