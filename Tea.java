public class Tea extends CaffeinatedBeverage {
    private int brewTemp;

    public Tea() {
        super("", 0, 0.0);
    }

    public Tea(String name, int ounce, double price, int brewTemp) {
        super(name, ounce, price);
        setBrewTemp(brewTemp);
    }

    public boolean setBrewTemp(int brewTemp) {
        if (brewTemp >= Integer.MIN_VALUE && brewTemp <= Integer.MAX_VALUE) {
            this.brewTemp = brewTemp;
            return true;
        }
        else {
            System.out.println("you turd!");
            return false;
        }
    }

    public boolean setAll(String name, int ounce, double price, int brewTemp) {
        if (super.setAll(name, ounce, price) & setBrewTemp(brewTemp)) {
            super.setAll(name, ounce, price);
            setBrewTemp(brewTemp);
            return true;
        } else {
            return false;
        }
    }

    public int getBrewTemp() {
        return this.brewTemp;
    }

    @Override
    public String toString() {
        return super.toString() + ", Brew temp: " + getBrewTemp() + "\u00B0";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Tea && super.equals(obj)) {
            Tea tha = (Tea) obj;
            if (this.brewTemp == tha.getBrewTemp()) {
                return true;
                
            }
            return false;
        }
        return false;
       
    }
}