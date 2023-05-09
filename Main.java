import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mat, turkce, fizik, kimya, tarih, muzik;
        Scanner notAl= new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat= notAl.nextInt();
        System.out.print("Türkçe notunuz: ");
        turkce= notAl.nextInt();
        System.out.print("Fizik notunuz: ");
        fizik= notAl.nextInt();
        System.out.print("Kimya notunuz: ");
        kimya= notAl.nextInt();
        System.out.print("Tarih notunuz: ");
        tarih= notAl.nextInt();
        System.out.print("Müzik notunuz: ");
        muzik= notAl.nextInt();

        double sonuc, notBolumu= mat+turkce+fizik+kimya+tarih+muzik;
        sonuc =notBolumu/6.0;
        System.out.println("Ortalamanız: "+sonuc+(sonuc>=60?" Sınıfı geçtiniz..":" Sınıfta kaldınız.."));
    }
}