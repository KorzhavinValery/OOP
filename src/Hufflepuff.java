public class Hufflepuff extends hogwarts {

    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int powerMagic, int powerTransgression, int hardworking, int loyal, int honest) {
        super(name, powerMagic, powerTransgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

}
