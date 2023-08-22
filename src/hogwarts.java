public class hogwarts {
    private String name;
    private int powerMagic;
    private int powerTransgression;

    public hogwarts(String name, int powerMagic, int powerTransgression) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.powerTransgression = powerTransgression;
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
}
