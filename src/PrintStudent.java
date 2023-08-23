public class PrintStudent {
    public void print(hogwarts[] students) {
        System.out.println("Количество учеников в школе " + students.length);
        for (int i = 0; i < students.length; i++) {
            hogwarts student = students[i];
            System.out.println("Имя " + student.getName() + ", Cила колдовства " + student.getPowerMagic() +
                    ", сила трансгрессии " + student.getPowerTransgression());
        }
        System.out.println("=====");
    }

    public void print(Gryffindor[] gryffindors) {
        System.out.println("Ученики Гриффиндора: ");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя " + gryffindor.getName() + ", Cила колдовства " + gryffindor.getPowerMagic() +
                    ", сила трансгрессии " + gryffindor.getPowerTransgression() + ", храбрость " +
                    gryffindor.getBravery() + ", честь " + gryffindor.getHonor() + ", благородство " + gryffindor.getNobility());
        }
        System.out.println("=====");
    }

    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("Ученики Когтеврана: ");
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Имя " + ravenclaw.getName() + ", Cила колдовства " + ravenclaw.getPowerMagic() +
                    ", сила трансгрессии " + ravenclaw.getPowerTransgression() + ", ум " + ravenclaw.getSmart() +
                    ", мудрость " +  ravenclaw.getWise() + ", остроумие " +
                    ravenclaw.getWitty() +", креативность " + ravenclaw.getCreativity());

        }
        System.out.println("=====");
    }

    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Ученики Пуффендуй: ");
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Имя " + hufflepuff.getName() + ", Cила колдовства " + hufflepuff.getPowerMagic() +
                    ", сила трансгрессии " + hufflepuff.getPowerTransgression()+ ", Трудолюбие " + hufflepuff.getHardworking() +
                    ", верность "+ hufflepuff.getLoyal() + ", честность "+ hufflepuff.getHonest());
        }
        System.out.println("=====");
    }

    public void print(Slytherin[] slytherins) {
        System.out.println("Ученики Слизерин: ");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя " + slytherin.getName() + ", Cила колдовства " + slytherin.getPowerMagic() +
                    ", сила трансгрессии " + slytherin.getPowerTransgression() +", хитрость " + slytherin.getCunning() +
                    ", решительность " + slytherin.getDetermination() + ", Амбициозность " + slytherin.getAmbition() +
                    ", находчивость " + slytherin.getResourcefulness() + ", Жажда власти " + slytherin.getThirstForPower());
        }
        System.out.println("=====");
    }
}
