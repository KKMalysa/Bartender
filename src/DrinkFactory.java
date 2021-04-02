import drink.*;

public class DrinkFactory extends Bartender{


    @Override
    Drink makeAlcoholDrink(AlcoholDrinkType alcoDrink) {
        switch (alcoDrink){
            case JEGERBOMB:
                return new AlcoholDrink("Jegermeister", 0.4, "vodka", 0.05, "water", 0.0);
            case BLOODY_MARY:
                return new AlcoholDrink("Tomato juice", 0.33, "vodka", 0.1, "chili spice", 0.1);
            case DIRTY_HARRY:
                return new AlcoholDrink("Scotch", 0.2, "vodka", 0.1, "Red Bull", 0.25);
            case POLISH_VODKA:
                return new AlcoholDrink("Polish Vodka", 0.05);
            case RUSSIAN_VODKA:
                return new AlcoholDrink("Russian Vodka", 0.05);
            default:
                throw new IllegalArgumentException("U're to drunk to order correctly, pls go home");
        }
    }

    @Override
    Drink makeAlcoholFreeDrink(AlcoholFreeDrinkType alcoFreeDrink) {
        switch (alcoFreeDrink){
            case WATER:
                return new AlcoholFreeDrink("Water", 0.4);
            case APPLE_JUICE:
                return new AlcoholFreeDrink("Apple juice", 0.4);
            case ORANGE_JUICE:
                return new AlcoholFreeDrink("Orange juice", 0.4);
            case ENERGY_DRINK:
                return new AlcoholFreeDrink("Energy Drink", 0.25);
            case COKE:
                return new AlcoholFreeDrink("COKE", 0.4);
            default:
                throw new IllegalArgumentException("U're to drunk to order correctly, pls go home");

        }
    }
}
