import java.util.Scanner;

/**
 * sınıfatlama
 */
public class sınıfatlama {

    public static void main(String[] args) {
        // Türkçe,Matematik,Fen bilgisi,Sosyal bilgisi,Beden egitimi notları girilsin
        // Notların ortalaması hesaplansın
        // ortalama 50'den aşagı ise sınıfta kalsın, degilse sınıfı geçsin.

        int turkce, matematik, fenBilgisi, sosyalBilgisi, bedenEgitimi;
        double ortalama = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Türkçe notunu giriniz : ");
        turkce = scan.nextInt();
        System.out.println("\nFen bilgisi notunu giriniz : ");
        fenBilgisi = scan.nextInt();
        System.out.println("\nMatematik notunu giriniz : ");
        matematik = scan.nextInt();
        System.out.println("\nSosyal bilgisi notunu giriniz : ");
        sosyalBilgisi = scan.nextInt();
        System.out.println("\nBeden egitimi notunu giriniz : ");
        bedenEgitimi = scan.nextInt();
        ortalama = (turkce + fenBilgisi + matematik + sosyalBilgisi + bedenEgitimi) / 5;
        if (ortalama < 50) {
            System.out.println("\nSınıfta kaldınız seneye görüşmek üzere...");
        }

        else if (ortalama > 50) {
            System.out.println("\nTebrikler sınıfı başarılı bir şekilde geçtiniz.   ");
        }
        System.out.println("\nSınıf ortalamanız " + ortalama);

    }

}
