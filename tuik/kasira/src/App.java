import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Barang barang01 = new Barang(
            "Spidol",
            "7907907801",
            3500,
            3250,
            6
        );
        Barang barang02 = new Barang(
            "Indomie",
            "749234790",
            2500,
            2000,
            6
        );

        KeranjangBelanja kb = new KeranjangBelanja();
        kb.tambahBarang(barang01, 2);
        kb.tambahBarang(barang02, 3);
        kb.hapusBarang(barang01);
        System.out.println(
            kb.hitungTotalBelanja()
            );
    }
}
