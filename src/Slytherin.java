public class Slytherin extends hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int powerMagic, int powerTransgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, powerMagic, powerTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }


    public int getCunning() {
        return cunning;
    }


    public int getDetermination() {
        return determination;
    }


    public int getAmbition() {
        return ambition;
    }


    public int getResourcefulness() {
        return resourcefulness;
    }


    public int getThirstForPower() {
        return thirstForPower;
    }

}
