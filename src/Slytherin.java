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
    public static void studentComparison(Slytherin student1, Slytherin student2) {
        int sumOfTalants = student1.getAmbition() + student1.getResourcefulness() + student1.getCunning() + student1.getDetermination() + student1.getThirstForPower();
        int sumOfTalants1 = student2.getAmbition() + student2.getResourcefulness() + student2.getCunning() + student2.getDetermination() + student2.getThirstForPower();
        if (sumOfTalants > sumOfTalants1) {
            System.out.println("Студент Слизерин " + student1.getName() +
                    " сильнее, чем " + student2.getName());
        } else {
            System.out.println("Студент Слизерин " + student2.getName() +
                    " сильнее, чем " + student1.getName());
        }
    }
    public void studentDescription() {
        System.out.println("Имя " + getName() + ", Cила колдовства " + getPowerMagic() +
                ", сила трансгрессии " + getPowerTransgression() +", хитрость " + getCunning() +
                ", решительность " + getDetermination() + ", Амбициозность " + getAmbition() +
                ", находчивость " + getResourcefulness() + ", Жажда власти " + getThirstForPower());
    }
}
