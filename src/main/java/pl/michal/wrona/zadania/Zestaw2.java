package pl.michal.wrona.zadania;

public class Zestaw2 {

    public static int zadanie1(int num1, int num2, int num3){
        int sumfirst=0;
        int sumlast=0;
        String s1 = String.valueOf(num1);
        String s2 = String.valueOf(num2);
        String s3 = String.valueOf(num3);
        char firstnum1 = s1.charAt(0);
        char firstnum2 = s2.charAt(0);
        char firstnum3 = s3.charAt(0);
        char lastnum1 = s1.charAt(0);
        char lastnum2 = s2.charAt(0);
        char lastnum3 = s3.charAt(0);
        sumfirst = Character.getNumericValue(firstnum1) + Character.getNumericValue(firstnum2) +
                Character.getNumericValue(firstnum3);
        sumlast = Character.getNumericValue(lastnum1) + Character.getNumericValue(firstnum2) +
                Character.getNumericValue(firstnum3);

        return sumfirst;

    }

}


