package drink;

public class AlcoholDrink extends Drink{
    public AlcoholDrink(String component1, double amount1, String component2, double amount2, String component3, double amount3){
        super(component1, amount1, component2, amount2, component3, amount3);
    }
    public AlcoholDrink(String component1, double amount1){
        super(component1, amount1);
    }
}
