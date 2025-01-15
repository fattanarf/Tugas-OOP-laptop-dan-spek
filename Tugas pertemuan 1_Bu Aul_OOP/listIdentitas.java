import java.util.Scanner;
public class listIdentitas {

    Scanner input = new Scanner(System.in);
    String merek;
    String warna;
    String spek;

    void tampilSpek(){
        System.out.print("Masukan merek laptop kamu: ");
        merek = input.nextLine();

        System.out.print("Masukan warna laptop kamu: ");
        warna = input.nextLine();

        System.out.print("Masukan spek laptop kamu: ");
        spek = input.nextLine();

        System.out.println("===========================================================");
        System.out.println("Laptop Fattan bermerek: " + merek);
        System.out.println("karena saya suka " + warna + ", jadi saya pilih warna: " + warna);
        System.out.println("dan ber spek: " + spek);
    }

}
