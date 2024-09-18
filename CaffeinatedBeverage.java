public class CaffeinatedBeverage
{
    private String name;
    private int ounces;
    private double price;

    public CaffeinatedBeverage(String name, int ounces, double price) {
        this.name = name;
        this.ounces = ounces;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOunces() {
        return this.ounces;
    }

    public boolean setOunces(int ounces) {
        if (ounces >= 0) {
            this.ounces = ounces;
            return true;
        } else {
            return false;
        }
    }

    public double getPrice() {
        return this.price;
    }

    public boolean setPrice(double price) {
        if (price >= 0.0) {
            this.price = price;
            return true;
        } else {
            return false;
        }
    }

    public boolean setAll(String name, int ounces, double price) {
        if (setOunces(ounces) && setPrice(price)) {
            setName(name);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("$%.2f", getPrice()) + ", " + getOunces() + " ounces";
    }

    public boolean sip(int ounces) {
        if (getOunces() - ounces >= 0) {
            setOunces(getOunces() - ounces);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        CaffeinatedBeverage that = (CaffeinatedBeverage) o;
        return this.ounces == that.ounces &&
                Double.compare(this.price, that.price) == 0 &&
               this.name.equals(that.name);
    }
}