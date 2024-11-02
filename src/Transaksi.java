class Transaksi {
    private String idAnggota;
    private String kodeBuku;
    private boolean status; // true untuk pinjam, false untuk kembalikan

    public Transaksi(String idAnggota, String kodeBuku, boolean status) {
        this.idAnggota = idAnggota;
        this.kodeBuku = kodeBuku;
        this.status = status;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}