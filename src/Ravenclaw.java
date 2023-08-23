public class Ravenclaw extends hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, int powerMagic, int powerTransgression, int smart, int wise, int witty, int creativity) {
        super(name, powerMagic, powerTransgression);

        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }


    public int getSmart() {
        return smart;
    }


    public int getWise() {
        return wise;
    }


    public int getWitty() {
        return witty;
    }


    public int getCreativity() {
        return creativity;
    }

}
