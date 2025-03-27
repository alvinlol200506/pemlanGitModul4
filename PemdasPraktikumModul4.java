import java.util.Scanner;

public class PemdasPraktikumModul4 {
    public static void main(String[] args) {
        InformasiAkun info = new InformasiAkun();
        Scanner input = new Scanner(System.in);
        String nomorBca;

        System.out.println("Masukkan nomor BCA anda: \n(3825180005 atau 5623300207 atau 7420400510)");
        nomorBca = input.nextLine();
        info.setNomorPelanggan(nomorBca);

    }
}
