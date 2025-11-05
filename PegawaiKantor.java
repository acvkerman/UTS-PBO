
class Pegawai {
    String nama;
    double gaji;

    void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("Gaji: " + gaji);
    }
}

class Manajer extends Pegawai {
    String departemen;

    void aturProyek() {
        System.out.println("Manajer " + nama + " mengatur proyek di departemen " + departemen);
    }
}

class Direktur extends Manajer {
    double bonusTahunan;

    void rapatDewan() {
        System.out.println("Direktur " + nama + " memimpin rapat dewan direksi.");
    }

    // menampilkan semua method dan atribut dari hirarki
    void tampilkanSemua() {
        tampilkanInfo();  // dari pegawai
        aturProyek();     // dari manajer
        System.out.println("Bonus Tahunan: " + bonusTahunan);
        rapatDewan();     // method sendiri
    }
}

public class PegawaiKantor {
    public static void main(String[] args) {
        Direktur direktur = new Direktur();
        direktur.nama = "Andi";
        direktur.gaji = 20000000;
        direktur.departemen = "Keuangan";
        direktur.bonusTahunan = 5000000;

        direktur.tampilkanSemua();
    }
}
