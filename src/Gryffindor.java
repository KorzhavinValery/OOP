public class Gryffindor extends hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerMagic, int powerTransgression, int nobility, int honor, int bravery) {
        super(name, powerMagic, powerTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public int getNobility() {
        return nobility;
    }


    public int getHonor() {
        return honor;
    }


    public int getBravery() {
        return bravery;
    }

}
