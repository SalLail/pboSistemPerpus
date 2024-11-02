class BukuFiksi extends Buku {
    private String genre;

    public BukuFiksi(String kodeBuku, String judul, int stok, String genre) {
        super(kodeBuku, judul, stok);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return super.toString() + ", Genre: " + genre + " (Fiksi)";
    }
}