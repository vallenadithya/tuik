class Barang{

    public String nama;
    public String sku;
    public int harga;
    public int modal;
    private int jumlah; //tidak pernah -

    public Barang(String nama, String sku, int harga, int modal, int jumlah) {
        this.nama = nama;
        this.sku = sku;
        this.harga = harga;
        this.modal = modal;
        this.jumlah = jumlah;
    }

    public Barang() {
    }

    public Barang(String nama, String sku) {
        this.nama = nama;
        this.sku = sku;
    }

    

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void restok(int jumlah){
        this.jumlah = this.jumlah + jumlah;
    }

    public void tampilDetail(){
        System.out.println("Nama : " + nama);
        System.out.println("Kode : " + sku);
        System.out.println("Harga : " + harga);
        System.out.println("Modal : " + modal);
        System.out.println("JUmlah : " + jumlah);
    }

}
