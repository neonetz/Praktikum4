package DVD;
//Subclass dari superclass (DVD)
public class DVDMusik extends DVD {
    //Attribut Attribut
    private String penyanyi;
    private String produser;
    private String[] topHits;
    private char kategori;

    //Subclass untuk DVD Musik
    public DVDMusik(String judul, String penyanyi, String produser, String publisher, char kategori, String[] topHits, int stok) {
        super(judul, publisher, stok);//Memanggil Konstruktor Superclass DVD
        this.penyanyi = penyanyi;
        this.produser = produser;
        this.topHits = topHits;
        this.kategori = kategori;
    }
    //Metode getter
    public String getPenyanyi() {
        return penyanyi;
    }

    public String getProduser() {
        return produser;
    }

    public String[] getTopHits() {
        return topHits;
    }

    public char getKategori() {
        return kategori;
    }
}
