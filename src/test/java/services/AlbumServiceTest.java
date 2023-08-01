package services;

import static org.junit.jupiter.api.Assertions.*;

import models.Album;
import org.junit.Assert;
import org.junit.Test;

public class AlbumServiceTest {
    @Test
    public void createTest(){
        //Given
        String expectedAlbumName = "Going Seventeen";
        String expectedArtistName = "SVT";
        String[] expectedTrackListing = new String[]{"Boom Boom", "Fast Pace"};
        boolean expectedPC = true;
        int expectedQty = 10;
        float expectedPrice = 22.5f;
        //When
        AlbumService albumService = new AlbumService();
        Album testAlbum = albumService.create(expectedAlbumName, expectedArtistName, expectedTrackListing,
                expectedPC, expectedQty, expectedPrice);
        //Then
        Assert.assertEquals(Integer.class.getName(), new Integer(testAlbum.getID()).getClass().getName());
        Assert.assertEquals(expectedAlbumName, testAlbum.getAlbumName());
        Assert.assertEquals(expectedArtistName, testAlbum.getArtistName());
        Assert.assertEquals(expectedTrackListing, testAlbum.getTrackListing());
        Assert.assertEquals(expectedPC, testAlbum.hasPhotoCards());
        Assert.assertEquals(expectedQty, testAlbum.getQuantity());
        Assert.assertEquals(expectedPrice, testAlbum.getPrice(), 0.001);
    }

    @Test
    public void findAlbumTest(){
        //Given
        String expectedAlbumName = "Going Seventeen";
        String expectedArtistName = "SVT";
        String[] expectedTrackListing = new String[]{"Boom Boom", "Fast Pace"};
        boolean expectedPC = true;
        int expectedQty = 10;
        float expectedPrice = 22.5f;
        //Given
        AlbumService albumService = new AlbumService();
        albumService.create("album", "artist", new String[0], false, 1, .1F);
        Album testAlbum = albumService.create(expectedAlbumName, expectedArtistName, expectedTrackListing,
                expectedPC, expectedQty, expectedPrice);
        int idToGet = testAlbum.getID();
        //When
        Album actualAlbum = albumService.findAlbum(idToGet);
        //Then
        Assert.assertEquals(expectedAlbumName, actualAlbum.getAlbumName());
        Assert.assertEquals(expectedArtistName, actualAlbum.getArtistName());
        Assert.assertEquals(expectedTrackListing, actualAlbum.getTrackListing());
        Assert.assertEquals(expectedPC, actualAlbum.hasPhotoCards());
        Assert.assertEquals(expectedQty, actualAlbum.getQuantity());
        Assert.assertEquals(expectedPrice, actualAlbum.getPrice(), 0.001);
    }

    @Test
    public void findAllTest(){
        //Given
        String expectedAlbumName = "Going Seventeen";
        String expectedArtistName = "SVT";
        String[] expectedTrackListing = new String[]{"Boom Boom", "Fast Pace"};
        boolean expectedPC = true;
        int expectedQty = 10;
        float expectedPrice = 22.5f;
        //Given
        AlbumService albumService = new AlbumService();
        albumService.create("album", "artist", new String[0], false, 1, .1F);
        Album testAlbum = albumService.create(expectedAlbumName, expectedArtistName, expectedTrackListing,
                expectedPC, expectedQty, expectedPrice);
        //When
        Album[] actualArr = albumService.findAll();
        //Then
        Assert.assertEquals(2, actualArr.length);
        Assert.assertEquals("album", actualArr[0].getAlbumName());
        Assert.assertEquals(expectedAlbumName, actualArr[1].getAlbumName());
    }

    @Test
    public void deleteTest(){
        //Given
        String expectedAlbumName = "Going Seventeen";
        String expectedArtistName = "SVT";
        String[] expectedTrackListing = new String[]{"Boom Boom", "Fast Pace"};
        boolean expectedPC = true;
        int expectedQty = 10;
        float expectedPrice = 22.5f;
        //Given
        AlbumService albumService = new AlbumService();
        albumService.create("album", "artist", new String[0], false, 1, .1F);
        Album testAlbum = albumService.create(expectedAlbumName, expectedArtistName, expectedTrackListing,
                expectedPC, expectedQty, expectedPrice);
        int idToGet = testAlbum.getID();
        //When
        boolean actual = albumService.delete(idToGet);
        Album[] actualArr = albumService.findAll();
        //Then
        Assert.assertTrue(actual);
        Assert.assertEquals(1, actualArr.length);
        Assert.assertEquals("album", actualArr[0].getAlbumName());
    }
    @Test
    public void deleteTest1(){
        //Given
        AlbumService albumService = new AlbumService();
        albumService.create("album", "artist", new String[0], false, 1, .1F);
        //When
        boolean actual = albumService.delete(4);
        //Then
        Assert.assertFalse(actual);
    }
}