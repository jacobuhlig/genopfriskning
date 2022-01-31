public class Bog {
    private long ISBN_nummer;
    private String titel;
    private int udgivelsesaar;

    public Bog(long ISBN, String titel, int udgivelsesaar){
        this.ISBN_nummer = ISBN;
        this.titel = titel;
        this.udgivelsesaar = udgivelsesaar;
    }

    //Getters
    public long getISBN_nummer() {
        return ISBN_nummer;
    }

    public String getTitel() {
        return titel;
    }

    public int getUdgivelsesaar() {
        return udgivelsesaar;
    }

    //Setters
    public void setISBN_nummer(long ISBN_nummer) {
        this.ISBN_nummer = ISBN_nummer;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setUdgivelsesaar(int udgivelsesaar) {
        this.udgivelsesaar = udgivelsesaar;
    }


    @Override
    public String toString() {
        return "Bog{" +
                "ISBN_nummer=" + ISBN_nummer +
                ", titel='" + titel + '\'' +
                ", udgivelsesaar=" + udgivelsesaar +
                '}';
    }
}
