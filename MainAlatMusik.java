class AlatMusik {    // superclass
    String nama;

    void mainkan() {
        System.out.println(nama + " sedang dimainkan...");
    }
}

class Gitar extends AlatMusik {   // subclass
    int jumlahSenar;

    void stemGitar() {   // method khusus subclass
        System.out.println("Menyetel gitar dengan " + jumlahSenar + " senar");
    }

    @Override
    void mainkan() {  // method override mainkan() untuk perilaku berbeda
        System.out.println("Suara gitar menghasilkan melodi yang indah");
    }
}

public class MainAlatMusik {
    public static void main(String[] args) {
        Gitar gitar = new Gitar();
        gitar.nama = "Gitar Akustik";
        gitar.jumlahSenar = 6;

        gitar.stemGitar();
        gitar.mainkan(); // memanggil method override
    }
}