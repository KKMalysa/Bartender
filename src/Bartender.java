import drink.AlcoholDrinkType;
import drink.AlcoholFreeDrinkType;
import drink.Drink;

public abstract  class Bartender {

    abstract Drink makeAlcoholDrink(AlcoholDrinkType alcoDrink);
    abstract Drink makeAlcoholFreeDrink(AlcoholFreeDrinkType alcoFreeDrink);

}
