package services;

import models.BubbleTea;

import java.util.ArrayList;

public final class BubbleTeaService {
    private static int nextID = 1;
    private ArrayList<BubbleTea> inventory = new ArrayList<>();

    public BubbleTea create(String expectedTea, float expectedIce, int expectedSugar, boolean expectedBubbles,
                            boolean expectedMilk, int expectedQty, float expectedPrice) {
        BubbleTea createdBoba = new BubbleTea(nextID++, expectedTea, expectedIce, expectedSugar, expectedBubbles,
                expectedMilk, expectedQty, expectedPrice);
        inventory.add(createdBoba);
        return createdBoba;
    }

    public BubbleTea findBubbleTea(int idToGet) {
        for(BubbleTea bt : inventory){
            if(idToGet == bt.getId()){
                return bt;
            }
        }
        return null;
    }

    public BubbleTea[] findAll() {
        return inventory.toArray(new BubbleTea[inventory.size()]);
    }

    public boolean delete(int idToGet) {
        BubbleTea thisAlbum = findBubbleTea(idToGet);
        if(thisAlbum != null){
            return inventory.remove(thisAlbum);
        }
        return false;
    }
}
