import drink.AlcoholDrinkType;
import drink.AlcoholFreeDrinkType;
import drink.Drink;

public class Main {

    public static void main(String[] args) {

        Bartender alcoholDrinkFactory = new DrinkFactory();
        Bartender alcoholFreeDrinkFactory = new DrinkFactory();

        Drink forDriver = alcoholFreeDrinkFactory.makeAlcoholFreeDrink(AlcoholFreeDrinkType.ORANGE_JUICE);
        Drink forMe = alcoholDrinkFactory.makeAlcoholDrink(AlcoholDrinkType.POLISH_VODKA);
        Drink forMyFriend = alcoholDrinkFactory.makeAlcoholDrink(AlcoholDrinkType.DIRTY_HARRY);



        System.out.println("a drink for a driver contain : " + forDriver.getComponent1() + ", " + forDriver.getAmount1());
        System.out.println("a drink for me contain " + forMe.getComponent1() + ", " + forMe.getAmount1());
        System.out.println("a drink for my friend contain " + forMyFriend.getComponent1() + ", " + forMyFriend.getAmount1()
                                                    + ", " + forMyFriend.getComponent2() + ", " + forMyFriend.getAmount2()
                                                    + ", " + forMyFriend.getComponent3() + ", " + forMyFriend.getAmount3()
                                                    + ". Calkowita pojemnosc drinka: " + (forMyFriend.getAmount1()+ forMyFriend.getAmount2()+ forMyFriend.getAmount3()));



    }
}
