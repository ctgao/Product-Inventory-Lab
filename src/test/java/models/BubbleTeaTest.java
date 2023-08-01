package models;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleTeaTest {
    @Test
    public void constructorTest(){
        //Given
        int expectedId = 30;
        String expectedTea = "Going Seventeen";
        float expectedIce = .25F;
        int expectedSugar = 50;
        boolean expectedMilk = false;
        boolean expectedBubbles = false;
        int expectedQty = 3;
        float expectedPrice = 5.45f;
        //When
        BubbleTea testTeaing = new BubbleTea(expectedId, expectedTea, expectedIce, expectedSugar, expectedBubbles,
                expectedMilk, expectedQty, expectedPrice);
        //Then
        Assert.assertEquals(expectedId, testTeaing.getId());
        Assert.assertEquals(expectedTea, testTeaing.getTeaBase());
        Assert.assertEquals(expectedIce, testTeaing.getIceLevel(), 0.001);
        Assert.assertEquals(expectedSugar, testTeaing.getSugarLevel());
        Assert.assertEquals(expectedBubbles, testTeaing.hasBubbles());
        Assert.assertEquals(expectedMilk, testTeaing.hasMilk());
        Assert.assertEquals(expectedQty, testTeaing.getQuantity());
        Assert.assertEquals(expectedPrice, testTeaing.getPrice(), 0.001);
    }

    @Test
    public void setIDTest() {
        //Given
        int expected = 17;
        BubbleTea testTeaing = new BubbleTea();
        //When
        testTeaing.setId(expected);
        //Then
        Assert.assertEquals(expected, testTeaing.getId());
    }

    @Test
    public void setTeaBaseTest() {
        //Given
        String expected = "Oolong";
        BubbleTea testTeaing = new BubbleTea();
        //When
        testTeaing.setTeaBase(expected);
        //Then
        Assert.assertEquals(expected, testTeaing.getTeaBase());
    }

    @Test
    public void setIceLevelTest() {
        //Given
        float expected = 0.5F;
        BubbleTea testTeaing = new BubbleTea();
        //When
        testTeaing.setIceLevel(expected);
        //Then
        Assert.assertEquals(expected, testTeaing.getIceLevel(), 0.001);
    }

    @Test
    public void setSugarLevelTest() {
        //Given
        int expected = 50;
        BubbleTea testTeaing = new BubbleTea();
        //When
        testTeaing.setSugarLevel(expected);
        //Then
        Assert.assertEquals(expected, testTeaing.getSugarLevel());
    }

    @Test
    public void setHasBubblesTest() {
        //Given
        boolean expected = true;
        BubbleTea testTeaing = new BubbleTea();
        //When
        testTeaing.setHasBubbles(expected);
        //Then
        Assert.assertEquals(expected, testTeaing.hasBubbles());
    }

    @Test
    public void setHasMilkTest() {
        //Given
        boolean expected = true;
        BubbleTea testTeaing = new BubbleTea();
        //When
        testTeaing.setHasMilk(expected);
        //Then
        Assert.assertEquals(expected, testTeaing.hasMilk());
    }

    @Test
    public void setQuantityTest() {
        //Given
        int expected = 2;
        BubbleTea testTeaing = new BubbleTea();
        //When
        testTeaing.setQuantity(expected);
        //Then
        Assert.assertEquals(expected, testTeaing.getQuantity());
    }

    @Test
    public void setPriceTest() {
        //Given
        float expected = 5.65F;
        BubbleTea testTeaing = new BubbleTea();
        //When
        testTeaing.setPrice(expected);
        //Then
        Assert.assertEquals(expected, testTeaing.getPrice(), 0.001);
    }
}