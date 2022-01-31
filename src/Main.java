import java.util.ArrayList;

class App {

    public void run() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hey");
        arrayList.add("boi");
        arrayList.add("hello");
        //arrayList.add("string");

        String string = "string";
        boolean booleanValue = doesArrayListContainString(arrayList, string);
        System.out.println(booleanValue);
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
