package DVD;
//Subclass dari Superclass (DVD)
public class DVDFilm extends DVD{
    //Attribut attribut
    private String pemeran;
    private String sutradara;
    private char kategori;
    //Konstruktor untuk inisiasi
    public DVDFilm(String judul, String pemeran, String sutradara, String publisher, char kategori, int stok) {
        super(judul, publisher, stok);//Memanggil konstruktor kelas DVD
        this.pemeran = pemeran;
        this.sutradara = sutradara;
        this.kategori = kategori;
    }
    //Metode Getter
    public String getPemeran() {
        return pemeran;
    }

    public String getSutradara() {
        return sutradara;
    }

    public char getKategori() {
        return kategori;
    }
}
