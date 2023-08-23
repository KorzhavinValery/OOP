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

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getPowerTransgression() {
        return powerTransgression;
    }
    public void studentDescription() {
        System.out.println("Имя - " + name + ", Сила Магии " + getPowerMagic() +
                ", Сила Трансгрессии " + getPowerTransgression());
    }
    public static void studentComparison(hogwarts student1, hogwarts student2) {
        int sumOfTalants = student1.getPowerMagic() + student1.getPowerTransgression();
        int sumOfTalants1 = student2.getPowerMagic() + student2.getPowerTransgression();
        if (sumOfTalants > sumOfTalants1) {
            System.out.println("Студент  " + student1.getName() +
                    " сильнее, чем " + student2.getName());
        } else {
            System.out.println("Студент  " + student2.getName() +
                    " сильнее, чем " + student1.getName());
        }
    }

    @Override
    public String toString() {
        return
                "Имя - " + name +
                ", Сила Колдовства  " + powerMagic +
                ", Сила Трансгрессии " + powerTransgression;
    }
}
