import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik, totalLesson = 5;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        if (mat < 0 || mat > 100) {
            mat = 0;
            totalLesson--;
        }
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
            totalLesson--;
        }
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
            totalLesson--;
        }
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
            totalLesson--;
        }
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
            totalLesson--;
        }
        double avarage = (mat + turkce + fizik + kimya + muzik) / totalLesson;

        if (avarage >= 55) {
            System.out.println("Tebrikler, Sınıfı Geçtiniz");
        } else {
            System.out.println("Sınıfta Kaldınız, Seneye Yine Bekleriz");
        }
        System.out.println("Ortalamanız : " + avarage);
    }
}