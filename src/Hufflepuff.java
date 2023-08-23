public class Hufflepuff extends hogwarts {

    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int powerMagic, int powerTransgression, int hardworking, int loyal, int honest) {
        super(name, powerMagic, powerTransgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }
    public static void studentComparison(Hufflepuff student1, Hufflepuff student2) {
        int sumOfTalants = student1.getHardworking() + student1.getHonest() + student1.getLoyal();
        int sumOfTalants1 = student2.getHardworking() + student2.getHonest() + student2.getLoyal();
        if (sumOfTalants > sumOfTalants1) {
            System.out.println("Студент Пуффендуй " + student1.getName() +
                    " сильнее, чем " + student2.getName());
        } else {
            System.out.println("Студент Пуффендуй " + student2.getName() +
                    " сильнее, чем " + student1.getName());
        }
    }

    public void studentDescription() {
        System.out.println("Имя " + getName() + ", Cила колдовства " + getPowerMagic() +
                ", Сила Трансгрессии " + getPowerTransgression()+ ", Трудолюбие " + getHardworking() +
                ", Верность "+ getLoyal() + ", Честность "+ getHonest());
    }


}
