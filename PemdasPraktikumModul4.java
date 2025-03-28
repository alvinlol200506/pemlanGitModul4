import java.util.Scanner;

public class PemdasPraktikumModul4 {
    public static void main(String[] args) {
        InformasiAkun info = new InformasiAkun();
        Scanner input = new Scanner(System.in);
        String nomorBca;

        System.out.println("Masukkan nomor BCA anda: \n(3825180005 atau 5623300207 atau 7420400510)");
        nomorBca = input.nextLine();
        if (nomorBca.equals("3825180005")){
            System.out.println("Masukkan Pin kahanda: ");
            info.checkNomorPelanggan();
        } else if (nomorBca.equals("5623300207")){
            System.out.println("Masukkan Pin kahanda: ");
        } else if (nomorBca.equals("7420400510")){
            System.out.println("Masukkan Pin kahanda: ");
        } else {
            System.out.println("\nTypo bruh, also masukkan nomor yang sudah disediakan aja");
        }

    }
}
