class Buku {
    private String kodeBuku; //encapsulation
    private String judul;
    private int stok;

    public Buku(String kodeBuku, String judul, int stok) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.stok = stok;
    }
    //getter
    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public int getStok() {
        return stok;
    }
//setter
    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "Buku [Kode: " + kodeBuku + ", Judul: " + judul + ", Stok: " + stok + "]";
    }
}