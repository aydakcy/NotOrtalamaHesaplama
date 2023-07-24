//Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin
// //sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımlıyoruz
        String basariDurumu;
        int mat, fizik, kimya,turkce, tarih, muzik;

        //Scanner sınıfı tanımlanır.
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        //Ortalama hesaplama
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc  = toplam / 6.0;
        basariDurumu = sonuc >= 60 ?
                "Sınıfı Geçtiniz":"Sınıfta Kaldınız";
        System.out.println(basariDurumu);



    }
}
