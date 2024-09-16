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

    /* EQUALS */

}