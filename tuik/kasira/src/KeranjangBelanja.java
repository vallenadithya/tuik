public class KeranjangBelanja{

    private Barang[] barangs; 
    private int[] jumlahBarangs;
    private int indexBarang;

    public KeranjangBelanja(){
        barangs = new Barang[20];
        jumlahBarangs = new int[20];
        indexBarang = 0;
    }

    public void tambahBarang(Barang barangDibeli, int jumlahDibeli){
        barangs[indexBarang] = barangDibeli;
        jumlahBarangs[indexBarang] = jumlahDibeli;
        indexBarang++;
    }

    public void hapusBarang(Barang barangDibeli){
        for(int i = 0 ; i < 20; i++){
            if(barangs[i] == barangDibeli){
                barangs[i] = null;
                jumlahBarangs[i] = 0;
            }
        }
    }

    public void hapusBarang(int indexHapus){
        barangs[indexHapus] = null;
        jumlahBarangs[indexHapus] = 0;
    }

    public int hitungTotalBelanja(){
        int totalBelanja = 0;
        for(int i = 0; i < indexBarang; i++){
            Barang barang = barangs[i];
            if(barang != null){
                int jumlah = jumlahBarangs[i];
                int subTotal = jumlah * barang.harga; // jumlah x harga
                totalBelanja = totalBelanja + subTotal;
            }
        }

        return totalBelanja;
    } 
}