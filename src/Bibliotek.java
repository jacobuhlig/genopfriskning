import java.util.ArrayList;

public class Bibliotek {
    private ArrayList<Bog> boeger = new ArrayList<>();

    public Bibliotek() {
        addBooks();
    }

    public boolean isBookInList(Bog bog){
        for (Bog book : boeger) {
            if(book.getISBN_nummer() == bog.getISBN_nummer())
                return true;
        }
        return false;
    }

    private void addBooks(){
        for (int i = 0; i < 3; i++) {
            boeger.add(new Bog(0010000000001,"Lars Ole",1999));
            boeger.add(new Bog(i,"Kenneth",1999));
        }
        boeger.add(new Bog(5000, "Lars-Allan",1998));
    }

}
