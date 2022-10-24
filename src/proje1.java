import java.util.Scanner;
//Not Ortalaması Hesaplayan Program
//Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
// ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
public class proje1 {
    public static  void main(String[] args) {
       //değişken oluştur
       int mat,fizik,kimya,turkce,tarih,muzik;

       //scanner sınıfını tanımla (inp istdigini kullan)
       Scanner inp = new Scanner(System.in);

       //kullanıcıdan degerleri al
        System.out.print("Matematik Notunuz: ");
        mat= inp.nextInt();


        System.out.print("Fizik notunuz: ");
        fizik= inp.nextInt();


        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();


        System.out.print("Turkce notunuzu: ");
        turkce = inp.nextInt();


        System.out.print("Tarih notunuz: ");
        tarih = inp.nextInt();


        System.out.print("Muzik notunuz : ");
        muzik =inp.nextInt();

        int toplam =(mat+fizik+kimya+tarih+turkce+muzik);
        double ortalama = toplam / 6.0 ;

        System.out.println(ortalama);
        System.out.println("Ortalamanız : "+ ortalama);


        String str= ortalama>60 ? "sınıfı gectiniz" : "sınıfta kaldınız";
        System.out.println(str);




    }
}
