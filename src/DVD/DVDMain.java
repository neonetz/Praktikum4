
package DVD;
import java.util.Scanner;


public class DVDMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data untuk DVD Film
        System.out.println("Masukkan data untuk DVD Film:");
        System.out.print("Judul: ");
        String judulFilm = scanner.nextLine();
        System.out.print("Pemeran: ");
        String pemeran = scanner.nextLine();
        System.out.print("Sutradara: ");
        String sutradara = scanner.nextLine();
        System.out.print("Publisher: ");
        String publisherFilm = scanner.nextLine();
        System.out.print("Kategori (SU/D/R/A): ");
        char kategoriFilm = scanner.nextLine().charAt(0);
        System.out.print("Stok: ");
        int stokFilm = scanner.nextInt();

        // Input data untuk DVD Musik
        scanner.nextLine(); // membersihkan buffer
        System.out.println("\nMasukkan data untuk DVD Musik:");
        System.out.print("Judul: ");
        String judulMusik = scanner.nextLine();
        System.out.print("Penyanyi: ");
        String penyanyi = scanner.nextLine();
        System.out.print("Produser: ");
        String produser = scanner.nextLine();
        System.out.print("Publisher: ");
        String publisherMusik = scanner.nextLine();
        System.out.print("Kategori (C/J/P/R/O): ");
        char kategoriMusik = scanner.nextLine().charAt(0);
        System.out.print("Top Hits (pisahkan dengan koma): ");
        String[] topHits = scanner.nextLine().split(",");
        System.out.print("Stok: ");
        int stokMusik = scanner.nextInt();

        // Membuat objek DVD Film
        DVDFilm dvdFilm = new DVDFilm(judulFilm, pemeran, sutradara, publisherFilm, kategoriFilm, stokFilm);

        // Membuat objek DVD Musik
        DVDMusik dvdMusik = new DVDMusik(judulMusik, penyanyi, produser, publisherMusik, kategoriMusik, topHits, stokMusik);

        // Menampilkan data DVD Film
        System.out.println("\nData DVD Film:");
        System.out.println("Judul: " + dvdFilm.getJudul());
        System.out.println("Pemeran: " + dvdFilm.getPemeran());
        System.out.println("Sutradara: " + dvdFilm.getSutradara());
        System.out.println("Publisher: " + dvdFilm.getPublisher());
        System.out.println("Kategori: " + dvdFilm.getKategori());
        System.out.println("Stok: " + dvdFilm.getStok());

        // Menampilkan data DVD Musik
        System.out.println("\nData DVD Musik:");
        System.out.println("Judul: " + dvdMusik.getJudul());
        System.out.println("Penyanyi: " + dvdMusik.getPenyanyi());
        System.out.println("Produser: " + dvdMusik.getProduser());
        System.out.println("Publisher: " + dvdMusik.getPublisher());
        System.out.println("Kategori: " + dvdMusik.getKategori());
        System.out.println("Top Hits: " + String.join(", ", dvdMusik.getTopHits()));
        System.out.println("Stok: " + dvdMusik.getStok());

        scanner.close();
    }
}
