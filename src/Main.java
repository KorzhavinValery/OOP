import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.ServiceUIFactory;
import javax.print.attribute.Attribute;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.PrintServiceAttribute;
import javax.print.attribute.PrintServiceAttributeSet;
import javax.print.event.PrintServiceAttributeListener;

public class Main {
    public static void main(String[] args) {
        hogwarts[] students = {
                new hogwarts("Гарри Поттер", 35, 50),
                new hogwarts("Гермиона Грейнджер", 45, 60),
                new hogwarts("Рон Уизли ", 30, 45),
                new hogwarts("Драко Малфой", 35, 50),
                new hogwarts("Грэхэм Монтегю", 30, 40),
                new hogwarts("Грегори Гойл", 33, 43),
                new hogwarts("Захария Смит", 39, 55),
                new hogwarts("Седрик Диггори", 42, 54),
                new hogwarts("Джастин Финч-Флетчли", 50, 58),
                new hogwarts("Чжоу Чанг", 37, 50),
                new hogwarts("Падма Патил", 49, 70),
                new hogwarts("Маркус Белби", 25, 30)

        };

        Gryffindor [] griffindors = {
                new Gryffindor ("Гарри Поттер", 35, 50, 4,3,7),
                new Gryffindor("Гермиона Грейнджер", 45, 60, 5, 4, 6),
                new Gryffindor("Рон Уизли ", 30, 45, 5, 6, 4)

        };

        Ravenclaw [] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 37, 50, 8, 7, 5, 10),
                new Ravenclaw("Падма Патил", 49, 70, 12, 10, 7, 13),
                new Ravenclaw("Маркус Белби", 25, 30, 15, 10, 9, 10)
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 39, 55, 15, 10, 10),
                new Hufflepuff("Седрик Диггори", 42, 54, 16, 12, 10),
                new Hufflepuff("Джастин Финч-Флетчли", 50, 58, 20, 12, 15),
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 35, 50, 4, 5, 7, 4, 10),
                new Slytherin("Грэхэм Монтегю", 30, 40, 5, 3, 5, 3, 5),
                new Slytherin("Грегори Гойл", 33, 43, 3, 5, 6, 4, 5)

        };


        PrintStudent printStudent = new PrintStudent();
        printStudent.print(students);
        printStudent.print(griffindors);
        printStudent.print(ravenclaws);
        printStudent.print(slytherins);
        printStudent.print(hufflepuffs);
    }
}