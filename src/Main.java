public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan("Perpustakaan Digital");

        // Menambahkan anggota
        Anggota anggota1 = new Anggota("A001", "Ali", "08123456");
        perpustakaan.tambahAnggota(anggota1);

        // Menambahkan buku
        Buku buku1 = new BukuNonFiksi("B001", "Bumi", 5, "Fantasi");
        Buku buku2 = new BukuFiksi("B002", "Conan", 3, "Misteri");
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        System.out.println(buku1.toString()); // Memanggil toString() dari BukuFiksi
        System.out.println(buku2.toString());

        // Melakukan transaksi peminjaman
        perpustakaan.pinjamBuku("A001", "B001");
        perpustakaan.pinjamBuku("A002", "B002");

        // Menampilkan status buku
        perpustakaan.tampilkanStatusBuku();

        // Melakukan pengembalian
        perpustakaan.kembalikanBuku("A001", "B001");

        // Menampilkan status buku setelah pengembalian
        perpustakaan.tampilkanStatusBuku();
    }
}