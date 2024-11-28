import Perbankan.*;

public class TesLatihan {
    public static void main(String[] args) {
        int tmp;
        boolean status;

        // Membuat objek Nasabah
        Nasabah nasabah = new Nasabah("Agus", "Daryanto");
        System.out.println("Nasabah atas nama: " + nasabah.getNamaAwal() + " " + nasabah.getNamaAkhir());

        // Mengatur tabungan untuk nasabah
        nasabah.setTabungan(new Tabungan(5000));
        tmp = nasabah.getTabungan().getSaldo();
        System.out.println("Saldo awal: " + tmp);

        // Menyimpan uang
        nasabah.getTabungan().simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan: 3000");

        // Mengambil uang
        status = nasabah.getTabungan().ambilUang(6000);
        System.out.println("Jumlah uang yang diambil: 6000");
        if (status) {
            System.out.println("OK");
        } else {
            System.out.println("Gagal");
        }

        // Simpan dan ambil uang lagi
        nasabah.getTabungan().simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan: 3500");

        status = nasabah.getTabungan().ambilUang(4000);
        System.out.println("Jumlah uang yang diambil: 4000");
        if (status) {
            System.out.println("OK");
        } else {
            System.out.println("Gagal");
        }

        status = nasabah.getTabungan().ambilUang(1600);
        System.out.println("Jumlah uang yang diambil: 1600");
        if (status) {
            System.out.println("OK");
        } else {
            System.out.println("Gagal");
        }

        // Menyimpan uang lagi
        nasabah.getTabungan().simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan: 2000");

        // Menampilkan saldo akhir
        tmp = nasabah.getTabungan().getSaldo();
        System.out.println("Saldo sekarang = " + tmp);
    }
}
