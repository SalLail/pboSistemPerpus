import java.util.ArrayList;

class Perpustakaan {
    private String nama;
    private ArrayList<Buku> daftarBuku;
    private ArrayList<Anggota> daftarAnggota;
    private ArrayList<Transaksi> daftarTransaksi;

    public Perpustakaan(String nama) {
        this.nama = nama;
        this.daftarBuku = new ArrayList<>();
        this.daftarAnggota = new ArrayList<>();
        this.daftarTransaksi = new ArrayList<>();
    }
//overload
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
    }



    public void pinjamBuku(String idAnggota, String kodeBuku) {
        for (Buku buku : daftarBuku) {
            if (buku.getKodeBuku().equals(kodeBuku) && buku.getStok() > 0) {
                buku.setStok(buku.getStok() - 1);
                daftarTransaksi.add(new Transaksi(idAnggota, kodeBuku, true));
                System.out.println("Buku '" + buku.getJudul() + "' berhasil dipinjam oleh " + idAnggota);
                return;
            }
        }
        System.out.println("Buku tidak tersedia atau stok habis.");
    }

    public void kembalikanBuku(String idAnggota, String kodeBuku) {
        for (Transaksi transaksi : daftarTransaksi) {
            if (transaksi.getIdAnggota().equals(idAnggota) && transaksi.getKodeBuku().equals(kodeBuku) && transaksi.isStatus()) {
                for (Buku buku : daftarBuku) {
                    if (buku.getKodeBuku().equals(kodeBuku)) {
                        buku.setStok(buku.getStok() + 1);
                        transaksi.setStatus(false);
                        System.out.println("Buku '" + buku.getJudul() + "' berhasil dikembalikan oleh " + idAnggota);
                        return;
                    }
                }
            }
        }
        System.out.println("Transaksi tidak ditemukan.");
    }

    public void tampilkanStatusBuku() {
        for (Buku buku : daftarBuku) {
            System.out.println("Buku '" + buku.getJudul() + "' - Stok: " + buku.getStok());
        }
    }
}