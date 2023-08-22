public class Gryffindor {
    private String name;
    private int powerMagic;
    private int powerTransgression;
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerMagic, int powerTransgression, int nobility, int honor, int bravery) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.powerTransgression = powerTransgression;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
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

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}
