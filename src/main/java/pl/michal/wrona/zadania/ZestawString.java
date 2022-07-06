package pl.michal.wrona.zadania;

public class ZestawString {

    public static void zadanie25(String word, int n) {
        int str_size = word.length();
        int part_size;
        if (str_size % n != 0) {
            System.out.print("String cannot be divided in " + n + " equal parts");
            return;
        }

        part_size = str_size / n;
        for (int i = 0; i < str_size; i++) {
            if (i % part_size == 0)
                System.out.println();
            System.out.print(word.charAt(i));
        }
    }
//split("\\s") will split the string into string of array with separator as space or multiple spaces
    // \\s is regular expresion used when in those patters when space is needed -> it is single whitespace character
    public static void zadanie26(String word){
        String words[] = word.split("\\s");
        String reverseWords ="";

        for(int i =0; i <words.length; i++){
                reverseWords = words[i]+" " + reverseWords;
        }

        System.out.print("\n"+ reverseWords);


    }

    // tworzysz nową zmienną, dzięki której podwajasz każdy char w String.
    public String zadanie27(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            result = result + c + c;

        }
        return result;
    }
// Stringbuilder pozwala nam na zmianę zawartości tego samego Stringa. Stringa tego samego nie możemy zmienić.
    // String builder nam to umożliwia
    public static void zadanie28(String word) {
        String result = "";
        int sum = 0;
        StringBuilder specialCharacters = new StringBuilder();
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                char c = word.charAt(i);
                result = result + c;

            } else if (Character.isDigit(word.charAt(i))) {
                char c = word.charAt(i);
                int d = Integer.parseInt(String.valueOf(c));
                sum += d;

            } else if (specialCharactersString.contains(Character.toString(word.charAt(i)))) {
                char f = word.charAt(i);
                specialCharacters.append(f);
            }

        }
        System.out.println(result + " " + sum + " " + specialCharacters);

    }

    public static String zadanie29(String word, int n) {
        String newStr = "";
        for (int i = n; i < word.length(); i++) {
            newStr += word.charAt(i);
        }
        for (int i = 0; i < n; i++) {
            newStr += word.charAt(i);

        }
        return newStr;


    }

    public static boolean zadanie30(int number) {
        int r, sum = 0;
        int temp = number;
        while (number > 0) {
            r = number % 10;
            sum = (sum * 10) + r;
            number = number / 10;

        }
        return temp == sum;

    }

    public static boolean zadanie30a(String word){
        String clean = word.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }
}
