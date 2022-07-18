package pl.michal.wrona;

import pl.michal.wrona.zadania.Zestaw1;
import pl.michal.wrona.zadania.Zestaw2;
import pl.michal.wrona.zadania.ZestawString;

import java.text.ParseException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ParseException {
        ZestawString.zadanie28("wo1r5-.ss,,d");
        System.out.println(ZestawString.zadanie29("Programowanie", 4));
        System.out.println(ZestawString.zadanie30(454));
        ZestawString.zadanie25("asdaaw",2);
        ZestawString.zadanie26("Moje oko jest male");
        //Zestaw1.zadanie1a(1, 3);
        //Zestaw1.zadanie2(2.3);
        Zestaw1.zadanie3(4);
        Zestaw1.zadanie4(4);
        Zestaw1.zadanie5("Moje", "Bylo");
        System.out.println(Zestaw1.zadanie6(3));
        System.out.println(Zestaw1.zadanie6a("MCMIV"));
        System.out.println(Zestaw1.zadanie7(1011110000));
        System.out.println(Zestaw1.zadanie7a(50));
        System.out.println(Zestaw1.zadanie7b(96));
        System.out.println(Zestaw1.zadanie7c(275));
        System.out.println(Zestaw1.zadanie7d(1128));
        System.out.println(Zestaw1.zadanie7e(468));
        System.out.println(Zestaw1.zadanie8(357));
        System.out.println(Zestaw1.zadanie8a(357));
        System.out.println(Zestaw1.zadanie9(1, 2,4,6));
        System.out.println(Zestaw1.zadanie10("Ble"));
        Zestaw1.zadanie11(" ,.ole");
        Zestaw1.zadanie12(5);
        Zestaw1.zadanie13();
        Zestaw1.zadanie14();
//        Zestaw1.zadanie15(100);
//        Zestaw1.zadanie16(200);
        Zestaw2.zadanie1(13,156,3490);
        Zestaw2.zadanie2(240);
        Zestaw2.zadanie3(15,5);
        System.out.println(Zestaw2.zadanie4(3,2,4));
        Zestaw2.zadanie5(3,2);
//        Zestaw2.zadanie6();
//        Zestaw2.zadanie7(5);
        int matrix1[][]  = {{2,5,4,6},{5,1,7,8}};
        int matrix2[][]  = {{8,3,10,9},{11,6,12,8}};
        Zestaw2.zadanie8(matrix1,matrix2);
        Zestaw2.zadanie9(matrix1,matrix2);
        Zestaw2.zadanie10(matrix1,matrix2);
        Zestaw2.zadanie11(matrix1,3);
        Zestaw2.zadanie12(matrix1);
        Zestaw2.zadanie13(matrix1);

    }
}
