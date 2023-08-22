public class Ravenclaw {
    private String name;
    private int powerMagic;
    private int powerTransgression;
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, int powerMagic, int powerTransgression, int smart, int wise, int witty, int creativity) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.powerTransgression = powerTransgression;
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
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

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}
