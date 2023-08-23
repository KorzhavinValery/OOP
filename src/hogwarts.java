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


    @Override
    public String toString() {
        return
                "Имя " + name + '\'' +
                ", Сила  " + powerMagic +
                ", Сила Трансгрессии " + powerTransgression;
    }
}
