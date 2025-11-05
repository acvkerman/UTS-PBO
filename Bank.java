
class AkunBank {
    private String nomorakun;  // hanya bisa diakses di class ini
    protected double saldo;  // bisa diakses oleh subclass
    public String namapemilik;   // bisa diakses di mana saja

    // Konstruktor
    AkunBank(String namapemilik, String nomorakun, double saldo) {
        this.namapemilik = namapemilik;
        this.nomorakun = nomorakun;
        this.saldo = saldo;
    }

    public String getnomorakun() { // untuk mengakses nomorAkun yang private
        return nomorakun;
    }
}

class RekeningTabungan extends AkunBank {
    private double bunga; // hanya bisa diakses di class ini

    RekeningTabungan(String nama, String noakun, double saldo, double bunga) {
        super(nama, noakun, saldo);
        this.bunga = bunga;
    }

    void tampilkanInfo() {
        System.out.println("Nomor Akun: "+getnomorakun()); 
        System.out.println("Nama Pemilik: "+namapemilik);  
        System.out.println("Saldo: "+saldo);                
        System.out.println("Bunga: "+bunga);
    }
}

public class Bank {
    public static void main(String[] args) {
        RekeningTabungan rekening = new RekeningTabungan("Sinta", "123456789", 5000000, 0.05);
        rekening.tampilkanInfo();
    }
}
