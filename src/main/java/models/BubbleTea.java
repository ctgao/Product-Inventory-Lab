package models;

public class BubbleTea extends InventoryItem{
    // my variables here
    private String tea_base;
    private float iceLevel;
    private int sugarLevel;
    private boolean hasBubbles;
    private boolean hasMilk;

    // constructors
    public BubbleTea(){
        this(-1, "green", 1F, 100, true, true, 0, 0F);
    }
    public BubbleTea(int id, String tea_base, float iceLevel, int sugarLevel, boolean hasBubbles, boolean hasMilk, int quantity, float price) {
        this.id = id;
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

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(tea_base.charAt(0)));
        sb.append(tea_base.toLowerCase().substring(1));
        if(hasMilk){
            sb.append(" Milk");
        }
        if(hasBubbles){
            sb.append(" Bubble");
        }
        sb.append(" Tea");

        return sb.toString();
    }
}
