package Perbankan;

public class Bank {
    private Nasabah[] nasabahList;
    private int jumlahNasabah;

    public Bank() {
        nasabahList = new Nasabah[100];
        jumlahNasabah = 0;
    }

    public void tambahNasabah(String namaAwal, String namaAkhir) {
        Nasabah nasabahBaru = new Nasabah(namaAwal, namaAkhir);
        if (jumlahNasabah < nasabahList.length) {
            nasabahList[jumlahNasabah] = nasabahBaru;
            jumlahNasabah++;
        } else {
            System.out.println("Bank is full, cannot add more customers.");
        }
    }

    public int getJumlahNasabah() {
        return jumlahNasabah;
    }

    public Nasabah getNasabah(int indeks) {
        if (indeks >= 0 && indeks < jumlahNasabah) {
            return nasabahList[indeks];
        } else {
            return null;
        }
    }
}