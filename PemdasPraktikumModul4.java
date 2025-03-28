import java.util.Scanner;

public class PemdasPraktikumModul4 {
    public static void main(String[] args) {
        InformasiAkun info = new InformasiAkun();
        Scanner input = new Scanner(System.in);
        String nomorBca;

        while(true){
            System.out.print("Masukkan nomor BCA anda: \n(3825180005 atau 5623300207 atau 7420400510)\n: ");
            nomorBca = input.nextLine();
            switch (nomorBca) {
                case "3825180005":
                {
                    System.out.println("Masukkan Pin kahanda: ");
                    String pin;
                    byte wrongCheck = 0;
                    while(true){
                        pin = input.nextLine();
                        if (pin.equals("200506")){
                            info.setNomorPelanggan("3825180005");
                            info.checkNomorPelanggan();
                            break;
                        } else {
                            System.out.println("pin salahhhhh");
                            wrongCheck++;
                            if(wrongCheck>=3){
                                System.out.println("Nomor anda telah diblokir (reason: gagal autentifikasi 3x)");
                                System.exit(0);
                            }

                        }
                    }

                } break;
                case "5623300207":
                    System.out.println("Masukkan Pin kahanda: ");
                    break;
                case "7420400510":
                    System.out.println("Masukkan Pin kahanda: ");
                    break;
                case "exit":
                    System.exit(0);
                default:
                    System.out.println("\nMaaf nomor anda tidak ada dalam database kami");
                    break;
            }
        }


    }
}
