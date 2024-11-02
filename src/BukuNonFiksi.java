class BukuNonFiksi extends Buku {
    private String kategori;

    public BukuNonFiksi(String kodeBuku, String judul, int stok, String kategori) {
        super(kodeBuku, judul, stok);
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }

    @Override
    public String toString() {
        return super.toString() + ", Kategori: " + kategori + " (Non-Fiksi)";
    }
}