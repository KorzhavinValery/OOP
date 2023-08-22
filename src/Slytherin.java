public class Slytherin {
    private String name;
    private int powerMagic;
    private int powerTransgression;
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int powerMagic, int powerTransgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.powerTransgression = powerTransgression;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
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

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
}
