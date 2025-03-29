import org.w3c.dom.html.HTMLAreaElement;

import java.util.Scanner;

public class InformasiAkun {
    Scanner input = new Scanner(System.in);

    private int saldoUcil = 100000, saldoMiko = 200000, saldoJojo = 1000000;
    private String nomorPelanggan;
    private String nama;
    private boolean bolehBeli = true;

    public void setNomorPelanggan(String nomor){
        nomorPelanggan = nomor;
    }

    public void checkNomorPelanggan(){
        switch (nomorPelanggan) {
            case "3825180005" -> { // Enhanced switch case agar setiap di akhir case ndak perlu "break;"
                setNama("Mang Ucil");
                System.out.println("Selamat siang " + nama + " saldo pada rekening anda saat ini: Rp" + saldoUcil);
                System.out.println("Masukkan jenis transaksi yang anda kehendaki:\n1. Pembelian\n2. Top up\n(masukkan angka 1 / 2):  ");
                int niat = input.nextInt();

                switch (niat) {
                    case 1:
                        System.out.println("Apa yang ingin anda beli:");
                        System.out.println("1. Iphone 19 Pro Max Ultra [Rp30.000.000,00]");
                        System.out.println("2. Kipas Angin Miko 3000rpm [Rp700.000,00]");
                        System.out.println("3. Kotak Pensil Kalkulator otomatis [Rp100.000,00]");
                        System.out.println("4. Literal mobil [Rp300.000.000,00]");
                        System.out.println("5. Literal mobil tapi alphard [Rp1.000.000.000,00]");

                        int beliApa = input.nextInt();
                        switch (beliApa) {
                            case 1:
                                if (saldoUcil >= 30000000) {
                                    saldoUcil -= 30000000;
                                    checkIfBroke(saldoUcil, 30000000, 1);
                                    if(bolehBeli){
                                        System.out.println("Iphone 19 Pro Max Ultra Berhasil dibeli :D");
                                    }
                                    int cashback = 30000000 * 5 / 100;
                                    saldoUcil += cashback;
                                    System.out.println("Selain itu, Anda mendapatkan cashback sebesar Rp" + cashback + " atas pembelian Iphone Max Ultra :D");
                                    bolehBeli = true;
                                    break;
                                } else {
                                    System.out.println("Uangmu kurang dawg!");
                                    break;
                                }
                            case 2:
                                if (saldoUcil >= 700000) {
                                    saldoUcil -= 700000;
                                    checkIfBroke(saldoUcil, 700000, 1);
                                    if(bolehBeli){
                                        System.out.println("Kipas Angin Miko 3000rpm berhasil dibeli :D");
                                    }
                                    bolehBeli = true;
                                    break;
                                } else {
                                    System.out.println("Uangmu kurang dawg!");
                                    break;
                                }
                            case 3:
                                if (saldoUcil >= 100000) {
                                    saldoUcil -= 100000;
                                    checkIfBroke(saldoUcil, 100000, 1);
                                    if(bolehBeli){
                                        System.out.println("Kotak Pensil Kalkulator otomatis berhasil dibeli :D");
                                    }
                                    bolehBeli = true;
                                    break;
                                } else {
                                    System.out.println("Uangmu kurang dawg!");
                                    break;
                                }
                            case 4:
                                if (saldoUcil >= 300000000) {
                                    saldoUcil -= 300000000;
                                    checkIfBroke(saldoUcil, 300000000, 1);
                                    if(bolehBeli){
                                        System.out.println("Literal mobil berhasil dibeli :D");
                                    }
                                    bolehBeli = true;
                                    break;
                                } else {
                                    System.out.println("!!CARD DECLINED!! ");
                                    break;
                                }
                            case 5:
                                if (saldoUcil >= 1000000000) {
                                    saldoUcil -= 1000000000;
                                    checkIfBroke(saldoUcil, 1000000000, 1);
                                    if(bolehBeli){
                                        System.out.println("Literal mobil tapi alphard");
                                    }
                                    bolehBeli = true;
                                    break;
                                } else {
                                    System.out.println("Uangmu kurang dawg!");
                                    break;
                                }
                        }
                        break;
                    case 2:
                        System.out.println("Ingin topup berapa: ");
                        int topup = input.nextInt();
                        if (topup > 1000000000) {
                            System.out.println("Maksimal topup adalah Rp1.000.000.000,00");
                        } else {
                            saldoUcil += topup;
                            System.out.println("Anda berhasil topup sebesar " + topup);
                            break;
                        }
                }

            }
            case "5623300207" -> {
                setNama("Hatsune Miko");
                System.out.println("Selamat siang " + nama + " saldo pada rekening anda saat ini: Rp" + saldoMiko);
                System.out.println("Masukkan jenis transaksi yang anda kehendaki:\n1. Pembelian\n2. Top up\n(masukkan angka 1 / 2:  ");
                int niat = input.nextInt();

                switch (niat) {
                    case 1:
                        System.out.println("Apa yang ingin anda beli:");
                        System.out.println("1. Iphone 19 Pro Max Ultra [Rp30.000.000,00]");
                        System.out.println("2. Kipas Angin Miko 3000rpm [Rp700.000,00]");
                        System.out.println("3. Kotak Pensil Kalkulator otomatis [Rp100.000,00]");
                        System.out.println("4. Literal mobil [Rp300.000.000,00]");
                        System.out.println("5. Literal mobil tapi alphard [Rp1.000.000.000,00]");

                        int beliApa = input.nextInt();
                        switch (beliApa) {
                            case 1:
                                if (saldoMiko >= 30000000) {
                                    saldoMiko -= 30000000;
                                    checkIfBroke(saldoMiko, 30000000, 2);
                                    if(bolehBeli){
                                        System.out.println("Iphone 19 Pro Max Ultra Berhasil dibeli :D");
                                    }
                                    bolehBeli = true;
                                    break;
                                } else {
                                    System.out.println("Uangmu kurang dawg!");
                                    break;
                                }
                            case 2:
                                if (saldoMiko >= 700000) {
                                    saldoMiko -= 700000;
                                    checkIfBroke(saldoMiko, 700000, 2);
                                    if(bolehBeli){
                                        System.out.println("Kipas Angin Miko 3000rpm berhasil dibeli :D");
                                    }
                                    bolehBeli = true;
                                    break;
                                } else {
                                    System.out.println("Uangmu kurang dawg!");
                                    break;
                                }
                            case 3:
                                if (saldoMiko >= 100000) {
                                    saldoMiko -= 100000;
                                    checkIfBroke(saldoMiko, 100000, 2);
                                    if(bolehBeli){
                                        System.out.println("Kotak Pensil Kalkulator otomatis berhasil dibeli :D");
                                    }
                                    bolehBeli = true;
                                    break;
                                } else {
                                    System.out.println("Uangmu kurang dawg!");
                                    break;
                                }
                            case 4:
                                if (saldoMiko >= 300000000) {
                                    saldoMiko -= 300000000;
                                    checkIfBroke(saldoMiko, 300000000, 2);
                                    if(bolehBeli){
                                        System.out.println("Literal mobil berhasil dibeli :D");
                                    }
                                    bolehBeli = true;
                                    break;
                                } else {
                                    System.out.println("Uangmu kurang dawg!");
                                    break;
                                }
                            case 5:
                                if (saldoMiko >= 1000000000) {
                                    saldoMiko -= 1000000000;
                                    checkIfBroke(saldoMiko, 1000000000, 2);
                                    if(bolehBeli){
                                        System.out.println("Literal mobil tapi alphard");
                                    }
                                    bolehBeli = true;
                                    break;
                                } else {
                                    System.out.println("Uangmu kurang dawg!");
                                    break;
                                }
                        }
                        break;
                    case 2:
                        System.out.println("Ingin topup berapa: ");
                        int topup = input.nextInt();
                        saldoMiko += topup;
                        System.out.println("Anda berhasil topup sebesar " + topup);
                        break;
                }

            }
            case "7420400510" -> {
                setNama("Jonathan Joestar");
                System.out.println("Selamat siang " + nama + " saldo pada rekening anda saat ini: Rp" + saldoJojo);
                System.out.println("Masukkan jenis transaksi yang anda kehendaki:\n1. Pembelian\n2. Top up\n(masukkan angka 1 / 2:  ");
                int niat = input.nextInt();

                switch (niat) {
                    case 1:
                        System.out.println("Apa yang ingin anda beli:");
                        System.out.println("1. Iphone 19 Pro Max Ultra [Rp30.000.000,00]");
                        System.out.println("2. Kipas Angin Miko 3000rpm [Rp700.000,00]");
                        System.out.println("3. Kotak Pensil Kalkulator otomatis [Rp100.000,00]");
                        System.out.println("4. Literal mobil [Rp300.000.000,00]");
                        System.out.println("5. Literal mobil tapi alphard [Rp1.000.000.000,00]");

                        int beliApa = input.nextInt();
                        switch (beliApa) {
                            case 1:
                                if (saldoJojo >= 30000000) {
                                    saldoJojo -= 30000000;
                                    checkIfBroke(saldoJojo, 30000000, 3);
                                    if(bolehBeli){
                                        System.out.println("Iphone 19 Pro Max Ultra Berhasil dibeli :D");
                                    }
                                    bolehBeli = true;
                                    break;
                                } else {
                                    System.out.println("Uangmu kurang dawg!");
                                    break;
                                }
                            case 2:
                                if (saldoJojo >= 700000) {
                                    saldoJojo -= 700000;
                                    checkIfBroke(saldoJojo, 700000, 3);
                                    if(bolehBeli){
                                        System.out.println("Kipas Angin Miko 3000rpm berhasil dibeli :D");
                                    }
                                    bolehBeli = true;
                                    break;
                                } else {
                                    System.out.println("Uangmu kurang dawg!");
                                    break;
                                }
                            case 3:
                                if (saldoJojo >= 100000) {
                                    saldoJojo -= 100000;
                                    checkIfBroke(saldoJojo, 100000, 3);
                                    if(bolehBeli){
                                        System.out.println("Kotak Pensil Kalkulator otomatis berhasil dibeli :D");
                                    }
                                    bolehBeli = true;
                                    break;
                                } else {
                                    System.out.println("Uangmu kurang dawg!");
                                    break;
                                }
                            case 4:
                                if (saldoJojo >= 300000000) {
                                    saldoJojo -= 300000000;
                                    checkIfBroke(saldoJojo, 300000000, 3);
                                    if(bolehBeli){
                                        System.out.println("Literal mobil berhasil dibeli :D");
                                    }
                                    bolehBeli = true;
                                    break;
                                } else {
                                    System.out.println("Uangmu kurang dawg!");
                                    break;
                                }
                            case 5:
                                if (saldoJojo >= 1000000000) {
                                    saldoJojo -= 1000000000;
                                    checkIfBroke(saldoJojo, 1000000000, 3);
                                    if(bolehBeli){
                                        System.out.println("Literal mobil tapi alphard");
                                    }
                                    bolehBeli = true;
                                    break;
                                } else {
                                    System.out.println("Uangmu kurang dawg!");
                                    break;
                                }
                        }
                        break;
                    case 2:
                        System.out.println("Ingin topup berapa: ");
                        int topup = input.nextInt();
                        saldoJojo += topup;
                        System.out.println("Anda berhasil topup sebesar " + topup);
                        break;
                }

            }
            default -> System.out.println("\nNomor anda tidak terdaftar di server kami");
        }
    }

    private void setNama(String name){
        this.nama = name;
    }

    private int checkIfBroke(int saldo, int hargaBarang, int who) {
        if (saldo < 10000) {
            System.out.println("!!CARD DECLINED!! Pastikan saldo Rp10.000 lebih dari harga barang yang ingin anda beli");
            switch(who){
                case 1:
                    saldoUcil += hargaBarang;
                case 2:
                    saldoMiko += hargaBarang;
                case 3:
                    saldoJojo += hargaBarang;
            }
            bolehBeli = false;
        }
        return saldo;
    }

}
