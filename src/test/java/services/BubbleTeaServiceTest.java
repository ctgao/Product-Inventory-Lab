package services;

import models.BubbleTea;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleTeaServiceTest {
    @Test
    public void createTest() {
        //Given
        String expectedTea = "Going Seventeen";
        float expectedIce = .25F;
        int expectedSugar = 50;
        boolean expectedMilk = true;
        boolean expectedBubbles = false;
        int expectedQty = 3;
        float expectedPrice = 5.45f;
        //When
        BubbleTeaService bobaService = new BubbleTeaService();
        BubbleTea testTeaing = bobaService.create(expectedTea, expectedIce, expectedSugar, expectedBubbles,
                expectedMilk, expectedQty, expectedPrice);
        //Then
        Assert.assertEquals(Integer.class.getName(), new Integer(testTeaing.getId()).getClass().getName());
        Assert.assertEquals(expectedTea, testTeaing.getTeaBase());
        Assert.assertEquals(expectedIce, testTeaing.getIceLevel(), 0.001);
        Assert.assertEquals(expectedSugar, testTeaing.getSugarLevel());
        Assert.assertEquals(expectedBubbles, testTeaing.hasBubbles());
        Assert.assertEquals(expectedMilk, testTeaing.hasMilk());
        Assert.assertEquals(expectedQty, testTeaing.getQuantity());
        Assert.assertEquals(expectedPrice, testTeaing.getPrice(), 0.001);
    }

    @Test
    public void findBubbleTea() {
        //Given
        String expectedTea = "green";
        float expectedIce = .25F;
        int expectedSugar = 50;
        boolean expectedMilk = true;
        boolean expectedBubbles = false;
        int expectedQty = 3;
        float expectedPrice = 5.45f;
        //Given
        BubbleTeaService bobaService = new BubbleTeaService();
        bobaService.create("just tea", 0F, 0, false, true, 1, .1F);
        BubbleTea testTeaing = bobaService.create(expectedTea, expectedIce, expectedSugar, expectedBubbles,
                expectedMilk, expectedQty, expectedPrice);
        int idToGet = testTeaing.getId();
        //When
        BubbleTea actualBubbleTea = bobaService.findBubbleTea(idToGet);
        //Then
        Assert.assertEquals(expectedTea, actualBubbleTea.getTeaBase());
        Assert.assertEquals(expectedIce, actualBubbleTea.getIceLevel(), 0.001);
        Assert.assertEquals(expectedSugar, actualBubbleTea.getSugarLevel());
        Assert.assertEquals(expectedBubbles, actualBubbleTea.hasBubbles());
        Assert.assertEquals(expectedMilk, actualBubbleTea.hasMilk());
        Assert.assertEquals(expectedQty, actualBubbleTea.getQuantity());
        Assert.assertEquals(expectedPrice, actualBubbleTea.getPrice(), 0.001);
    }

    @Test
    public void findAllTest() {
        //Given
        String expectedTea = "chai";
        float expectedIce = .25F;
        int expectedSugar = 50;
        boolean expectedMilk = true;
        boolean expectedBubbles = false;
        int expectedQty = 3;
        float expectedPrice = 5.45f;
        //Given
        BubbleTeaService bobaService = new BubbleTeaService();
        bobaService.create("just tea", 0F, 0, false, true, 1, .1F);
        BubbleTea testTeaing = bobaService.create(expectedTea, expectedIce, expectedSugar, expectedBubbles,
                expectedMilk, expectedQty, expectedPrice);
        //When
        BubbleTea[] actualArr = bobaService.findAll();
        //Then
        Assert.assertEquals(2, actualArr.length);
        Assert.assertEquals("just tea", actualArr[0].getTeaBase());
        Assert.assertEquals(expectedTea, actualArr[1].getTeaBase());
    }

    @Test
    public void deleteTest() {
        //Given
        String expectedTea = "jasmine green";
        float expectedIce = .25F;
        int expectedSugar = 50;
        boolean expectedMilk = true;
        boolean expectedBubbles = false;
        int expectedQty = 3;
        float expectedPrice = 5.45f;
        //Given
        BubbleTeaService bobaService = new BubbleTeaService();
        bobaService.create("just tea", 0F, 0, false, true, 1, .1F);
        BubbleTea testAlbum = bobaService.create(expectedTea, expectedIce, expectedSugar, expectedBubbles,
                expectedMilk, expectedQty, expectedPrice);
        int idToGet = testAlbum.getId();
        //When
        boolean actual = bobaService.delete(idToGet);
        BubbleTea[] actualArr = bobaService.findAll();
        //Then
        Assert.assertTrue(actual);
        Assert.assertEquals(1, actualArr.length);
        Assert.assertEquals("just tea", actualArr[0].getTeaBase());
    }

    @Test
    public void deleteTest1() {
        //Given
        BubbleTeaService bobaService = new BubbleTeaService();
        BubbleTea boba = bobaService.create("just tea", 0F, 0, false, true, 1, .1F);
        //When
        boolean actual = bobaService.delete(30);
        //Then
        Assert.assertFalse(actual);
    }
}