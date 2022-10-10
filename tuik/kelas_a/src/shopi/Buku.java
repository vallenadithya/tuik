package shopi;

public class Buku{

    //Properti
    public String judul;       // [access modifier] <tipe data> <nama properti>;
    protected String penulis;
    int tahunProduksi;
    private int harga;

    public Publisher penerbit;

    //method
    public int getHarga(){     // [access modifier] <tipe data> <nama method>([list parameter]){ }
        return this.harga;
    }

    public void displayInfo(){
        System.out.println("Judul Buku : " + this.judul);
        System.out.println(this.penulis);
        System.out.println(this.tahunProduksi);
        System.out.println(this.harga);
    }

}