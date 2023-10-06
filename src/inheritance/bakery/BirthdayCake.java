package inheritance.bakery;

public class BirthdayCake extends Cake{
    public boolean candles;

    BirthdayCake(){
        super.setFlavor("chocolate");
    }

    public void setCandles(boolean candles) {
        this.candles = candles;
    }

    public boolean getCandles(){
        return this.candles;
    }
}
