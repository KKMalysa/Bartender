package drink;

public class Drink {
    private String component1;
    private String component2;
    private String component3;
    private double amount1;
    private double amount2;
    private double amount3;

    public Drink(String component1, String component2, String component3, double amount1, double amount2, double amount3) {
        this.component1 = component1;
        this.component2 = component2;
        this.component3 = component3;
        this.amount1 = amount1;
        this.amount2 = amount2;
        this.amount3 = amount3;
    }

    public Drink(String component1, String component2, double amount1, double amount2) {
        this.component1 = component1;
        this.component2 = component2;
        this.amount1 = amount1;
        this.amount2 = amount2;
    }

    public Drink(String component1, double amount1) {
        this.component1 = component1;
        this.amount1 = amount1;
    }

    public String getComponent1() {
        return component1;
    }

    public String getComponent2() {
        return component2;
    }

    public String getComponent3() {
        return component3;
    }

    public double getAmount1() {
        return amount1;
    }

    public double getAmount2() {
        return amount2;
    }

    public double getAmount3() {
        return amount3;
    }
}
