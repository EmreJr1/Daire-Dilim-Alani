import java.util.Scanner;

public class Dilim_Alani {
    public static void main(String[] args) {
        /*kullanıcıdan alacağımız değişkenleri tanımlıyoruz*/
        int r , alfa ;
        double pi = 3.14;


        /*kullanıcıdan verileri alıyoruz*/
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin Yarıçapını Giriniz =");
        r= input.nextInt();

        System.out.println("Dairenin Merkez AÇı Ölçüsünü Gİriniz =");
        alfa= input.nextInt();


        /*kullanıcıya çıktı sonucunu veriyoruz*/
        System.out.println("Dairenin Dilim Alanı ="+(pi*(r*r)*alfa)/360);

    }
}
