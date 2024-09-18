public class YerbaMate extends Tea {
    /* INSTACES */
    final static int DEFAULT_NUMPASSES = 99999;

    /* VARABLIES */
    private int numPasses;

    /* CONSTRUCTORES */
    public YerbaMate() {
        super();
    }

    public YerbaMate(String name, int ounces, double price, int brewTemp, int numPasses) {
        super(name, ounces, price, brewTemp);
        setNumPasses(numPasses);
    }

    public YerbaMate(YerbaMate obj) {
        super(obj.getName(), obj.getOunces(), obj.getPrice(), obj.getBrewTemp());

        this.setNumPasses(obj.getNumPasses());
    }

    /* SETTERS */
    public void setNumPasses(int num) {
        this.numPasses = num;
    }

    /* GETTERS */
    public int getNumPasses() {
        return this.numPasses;
    }

    // Methods
    public void refill(int ounces) {
        this.setOunces(this.getOunces() + ounces);
    }
    // obj.getOunces()

    public void passMate() {
        setNumPasses(getNumPasses() + 1);
        System.out.println("Num Passes: " + getNumPasses());
    }
    /* EQUALS */
    public boolean equals(Object obj) {
        if (obj instanceof YerbaMate && super.equals(obj)) {
            YerbaMate tha = (YerbaMate) obj;
            if (this.numPasses == tha.getNumPasses()) {
                return true;
            }
            return false;
        }
        return false;

    }
    @Override
    public String toString() {
        return super.toString() + " Numpasses: " + getNumPasses();
    }
}