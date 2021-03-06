import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class App {

    Scanner scan = new Scanner(System.in);

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

        // Hvor tit skal græsset slås Opgave
       /* System.out.print("Nuværende græshøjde: ");
        int currentHeight = scan.nextInt() * 10;
        System.out.print("Græshøjde maksimum: ");
        int allowedHeight = scan.nextInt() * 10;

        Graes graes = new Graes();
        System.out.println(graes.howManyDaysUntilTheGrassNeedsToBeCut(currentHeight, allowedHeight));*/

        // Kvadrat Opgave
        /*
        tegnKvadrat(6, '#');
         */

        // Proper case
        /*
        Proper proper = new Proper();
        System.out.println(proper.properCase("Hello my frieNd HALLLO"));
         */

        // Sortering
        //printAlphabetically("abekat","musefælde","ananas","slut","solskin");

        //Søgning
        /*String[] arrayWithStrings = {"hallo", "baby", "boi"};
        String stringToCheck = "boi";
        System.out.println(isStringInArray(arrayWithStrings, stringToCheck));*/

    }

    public int isStringInArray(String[] stringArray, String string) {
        for (int i = 0; i < stringArray.length; i++) {
            if(stringArray[i].equals(string)) {
                return i;
            }
        }
        return -1;
    }

    public void printAlphabetically(String... args){
        ArrayList<String> listOfWords = new ArrayList<>();

        for (String word : args){
            listOfWords.add(word);
        }

        Collections.sort(listOfWords, Collections.reverseOrder());

        for (String word : listOfWords) {
            System.out.println(word);
        }
    }

    public boolean doesArrayListContainString(ArrayList<String> arrayList, String string) {
            if (arrayList.contains(string)) {
                System.out.println("The String has been found");
                return true;
            }
    return false;
    }

    public void tegnKvadrat(int tal, char tegn){

        for (int i = 0; i < tal; i++) {
            for (int j = 0; j < tal; j++) {
                System.out.print(tegn + " ");
            }
            System.out.println();
        }
    }

}

public class Main {

    public static void main(String[] args) {
            new App().run();
    }
}
