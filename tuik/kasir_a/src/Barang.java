
public class Barang{
    //Properti
    public String nama;
    public String sku;
    public int harga;
    public int modal;
    private int jumlah; //Tidak cocok di barang
    
    public Barang(String nama, String sku) {
        this.nama = nama;
        this.sku = sku;
    }

    public Barang(String nama) {
        this.nama = nama;
    }

    public Barang() {
        nama = "-";
        sku = "Unknown";
    }

    //Method
    public void restok(int tambahanBarang){
        jumlah += tambahanBarang; // => jumlah = jumlah + tambahanBarang;
    }

    public void restok(double tambahanBarang){
        jumlah += tambahanBarang;
    }

    public void tampilInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Kode : " + sku);
        System.out.println("Harga Jual : " + harga);
        System.out.println("Harga Beli : " + modal);
        System.out.println("Jumlah : " + jumlah);
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        if(jumlah > 0){
            this.jumlah = jumlah;
        }
    }
    
    public String toString(){
        String info = "";
        info += "Nama\t: " + nama + "\n\r";
        info += "SKU\t: " + sku + "\n\r";
        info += "Harga\t: " + harga + "\n\r";
        info += "Jumlah\t: " + jumlah + "\n\r";
        return info;
    }
}