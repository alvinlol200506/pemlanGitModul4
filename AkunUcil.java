public class AkunUcil {
    private int saldo;
    private String nomorPelanggan;
    private String nama;

    public void setNomorPelanggan(String nomor){
        nomorPelanggan = nomor;
    }

    public void checkNomorPelanggan(){
        if (nomorPelanggan.equals("3825180005")){
            setNama("Mang Ucil");
            setSaldo(saldo);
        } else if (nomorPelanggan.equals("5623300207")){
            setNama("Hatsune Miko");
        } else if (nomorPelanggan.equals("7420400510")){
            setNama("Jonathan Joestar");
        } else {
            System.out.println("\nTypo bruh, also masukkan nomor yang sudah disediakan aja");
        }
    }

    private void setNama(String nama){
        this.nama = nama;
    }

    private void setSaldo(int saldo){
        this.saldo = saldo;
    }
}
