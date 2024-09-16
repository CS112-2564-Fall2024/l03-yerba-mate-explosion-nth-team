public class Tea extends CaffeinatedBeverage {
    private int brewTemp;

    public Tea() {
        super("", 0, 0.0);
    }

    public Tea(String name, int ounce, double price, int brewTemp) {
        super(name, ounce, price);
        setBrewTemp(brewTemp);
    }

    public void setBrewTemp(int brewTemp) {
        this.brewTemp = brewTemp;
    }

    public int getBrewTemp() {
        return this.brewTemp;
    }

    @Override
    public String toString() {
        return super.toString() + "Brew temp: " + getBrewTemp();
    }

    public boolean equals(Tea obj) {
        return super.equals(obj) && this.brewTemp == obj.getBrewTemp();
    }
}