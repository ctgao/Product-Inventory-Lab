package models;

public class BubbleTea {
    // my variables here
    private String tea_base;
    private float iceLevel;
    private int sugarLevel;
    private boolean hasBubbles;
    private boolean hasMilk;
    private int quantity;
    private float price;

    // constructors
    public BubbleTea(){
        this("green", 1F, 100, true, true, 0, 0F);
    }
    public BubbleTea(String tea_base, float iceLevel, int sugarLevel, boolean hasBubbles, boolean hasMilk, int quantity, float price) {
        this.tea_base = tea_base;
        this.iceLevel = iceLevel;
        this.sugarLevel = sugarLevel;
        this.hasBubbles = hasBubbles;
        this.hasMilk = hasMilk;
        this.quantity = quantity;
        this.price = price;
    }

    public String getTeaBase() {
        return tea_base;
    }

    public void setTeaBase(String tea_base) {
        this.tea_base = tea_base;
    }

    public float getIceLevel() {
        return iceLevel;
    }

    public void setIceLevel(float iceLevel) {
        this.iceLevel = iceLevel;
    }

    public int getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(int sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    public boolean hasBubbles() {
        return hasBubbles;
    }

    public void setHasBubbles(boolean hasBubbles) {
        this.hasBubbles = hasBubbles;
    }

    public boolean hasMilk() {
        return hasMilk;
    }

    public void setHasMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
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
