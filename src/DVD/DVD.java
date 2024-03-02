package DVD;

// Superclass
public class DVD {
    //Attribut attribut
    private String judul;
    private String publisher;
    private int stok;

    //Konstruktor
    public DVD(String judul, String publisher, int stok) {
        this.judul = judul;
        this.publisher = publisher;
        this.stok = stok;
    }
    //Metode getter
    public String getJudul() {
        return judul;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getStok() {
        return stok;
    }
}