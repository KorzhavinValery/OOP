public class Hufflepuff {
    private String name;
    private int powerMagic;
    private int powerTransgression;
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int powerMagic, int powerTransgression, int hardworking, int loyal, int honest) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.powerTransgression = powerTransgression;
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getPowerTransgression() {
        return powerTransgression;
    }

    public void setPowerTransgression(int powerTransgression) {
        this.powerTransgression = powerTransgression;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
}
