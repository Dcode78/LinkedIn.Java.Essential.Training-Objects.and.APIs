package inheritance.bakery;

public class WeddingCake extends Cake{
    public int tiers;

    WeddingCake(){
       super.setFlavor("Almond");
    }

    public void setTiers(int tiers){
        this.tiers = tiers;
    }

    public int getTiers(){
     return this.tiers;
    }
}
