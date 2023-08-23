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

    public static void studentComparison(Gryffindor student1, Gryffindor student2) {
        int sumOfTalants = student1.getBravery() + student1.getNobility() + student1.getHonor();
        int sumOfTalants1 = student2.getBravery() + student2.getNobility() + student2.getHonor();
        if (sumOfTalants > sumOfTalants1) {
            System.out.println("Студент Гриффиндора " + student1.getName() +
                    " сильнее, чем " + student2.getName());
        } else {
            System.out.println("Студент Гриффиндора " + student2.getName() +
                    " сильнее, чем " + student1.getName());
        }
    }

    @Override
    public void studentDescription() {
        System.out.println("Имя - " + getName() + ", Сила Колдовства " + getPowerMagic() +
                ", Сила Трансгрессии " + getPowerTransgression() + ", Благородство " + getNobility() + ", Честь "
                + getHonor() + ", Храбрость " + getBravery());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Благородство " + nobility +
                ", Честь " + honor +
                ", Храбрость " + bravery;
    }
}

