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

        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 35, 50, 5, 8, 7);
        Gryffindor germionaGreindzher = new Gryffindor("Гермиона Грейнджер", 45, 60, 5, 6, 6);
        Gryffindor ronYizli = new Gryffindor("Рон Уизли ", 30, 45, 5, 6, 4);

        Ravenclaw chzouChang = new Ravenclaw("Чжоу Чанг", 37, 50, 8, 7, 5, 10);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 49, 70, 12, 10, 7, 13);
        Ravenclaw markusBelbi = new Ravenclaw("Маркус Белби", 25, 30, 15, 10, 9, 10);

        Hufflepuff zahariyaSmit = new Hufflepuff("Захария Смит", 39, 55, 15, 10, 10);
        Hufflepuff sedrickDiggori = new Hufflepuff("Седрик Диггори", 42, 54, 16, 12, 10);
        Hufflepuff justinFinchFletchli = new Hufflepuff("Джастин Финч-Флетчли", 50, 58, 20, 12, 15);

        Slytherin dracoMalfoi = new Slytherin("Драко Малфой", 35, 50, 4, 5, 7, 4, 10);
        Slytherin grahamMontegu = new Slytherin("Грэхэм Монтегю", 30, 40, 5, 3, 5, 3, 5);
        Slytherin gregoriGoil = new Slytherin("Грегори Гойл", 33, 43, 3, 5, 6, 4, 5);
        Gryffindor.studentComparison(harryPotter, ronYizli);
        hogwarts.studentComparison(dracoMalfoi, markusBelbi);
        System.out.println(harryPotter.toString());

    }
}