import java.util.ArrayList;

public class Proper {

    public Proper() {
    }

    public String properCase(String sentence) {
        ArrayList<String> listOfWords = new ArrayList<>();
        String[] listOfWordArray = sentence.split(" ");

        for (int i = 0; i < listOfWordArray.length; i++) {
            String string = checkCase(listOfWordArray[i]);
            listOfWords.add(string);
        }


        return listOfWords.toString();
    }

    public String checkCase(String stringToCheck) {
        int length = stringToCheck.length();
            if (stringToCheck.matches("[A-Z]{" + length + "}")) {
                return stringToCheck;
            } else if (stringToCheck.length() > 3) {
                String newString = "";
                newString += stringToCheck.substring(0, 1).toUpperCase() + stringToCheck.substring(1).toLowerCase();
                return newString;
            } else {
                return stringToCheck.toLowerCase();
            }
    }
}
