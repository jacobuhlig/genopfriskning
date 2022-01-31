import java.util.ArrayList;

class App {

    public void run() {
        // Arraylist Opgave
        /*
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hey");
        arrayList.add("boi");
        arrayList.add("hello");
        //arrayList.add("string");

        String string = "string";
        boolean booleanValue = doesArrayListContainString(arrayList, string);
        System.out.println(booleanValue);*/
        // Bog Opgave
        /*
        Bibliotek biblio = new Bibliotek();

        Bog bog1 = new Bog(0010000000001,"Lars Ole",1999);
        Bog bog2 = new Bog(001000001,"Lars Henrik",1996);

        System.out.println(biblio.isBookInList(bog2));*/
    }


    public boolean doesArrayListContainString(ArrayList<String> arrayList, String string) {
            if (arrayList.contains(string)) {
                System.out.println("The String has been found");
                return true;
            }
    return false;
    }
}

public class Main {

    public static void main(String[] args) {
            new App().run();
    }
}
