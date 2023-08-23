public class Ravenclaw extends hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, int powerMagic, int powerTransgression, int smart, int wise, int witty, int creativity) {
        super(name, powerMagic, powerTransgression);

        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }


    public int getSmart() {
        return smart;
    }


    public int getWise() {
        return wise;
    }


    public int getWitty() {
        return witty;
    }


    public int getCreativity() {
        return creativity;
    }

    public static void studentComparison(Ravenclaw student1, Ravenclaw student2) {
        int sumOfTalants = student1.getSmart() + student1.getWise() + student1.getWitty();
        int sumOfTalants1 = student2.getSmart() + student2.getWise() + student2.getWitty();
        if (sumOfTalants > sumOfTalants1) {
            System.out.println("Студент Когтеврана " + student1.getName() +
                    " сильнее, чем " + student2.getName());
        } else {
            System.out.println("Студент Когтеврана " + student2.getName() +
                    " сильнее, чем " + student1.getName());
        }
    }

    @Override
    public void studentDescription() {
        System.out.println("Имя " + getName() + ", Cила колдовства " + getPowerMagic() +
                ", Сила Трансгрессии " + getPowerTransgression() + ", Ум " + getSmart() +
                ", Мудрость " + getWise() + ", Остроумие " +
                getWitty() + ", Креативность " + getCreativity());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Ум " + smart +
                ", Мудрость " + wise +
                ", Остроумие " + witty +
                ", Креативность " + creativity;
    }
}
