package pl.michal.wrona.zadania;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Zestaw2 {

    public static void zadanie1(int num1, int num2, int num3) {
        int sumfirst = 0;
        int sumlast = 0;
        String s1 = String.valueOf(num1);
        String s2 = String.valueOf(num2);
        String s3 = String.valueOf(num3);
        char firstnum1 = s1.charAt(0);
        char firstnum2 = s2.charAt(0);
        char firstnum3 = s3.charAt(0);
        char lastnum1 = s1.charAt(s1.length() - 1);
        char lastnum2 = s2.charAt(s2.length() - 1);
        char lastnum3 = s3.charAt(s3.length() - 1);
        sumfirst = Character.getNumericValue(firstnum1) + Character.getNumericValue(firstnum2) +
                Character.getNumericValue(firstnum3);
        sumlast = Character.getNumericValue(lastnum1) + Character.getNumericValue(lastnum2) +
                Character.getNumericValue(lastnum3);

        System.out.println("Sum of first " + sumfirst + " Sum of last " + sumlast);


    }

    public static void zadanie2(int number) throws ParseException {
        String time1 = "00:00:00";
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        Date date1 = timeFormat.parse(time1);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        cal.add(Calendar.SECOND, number);
        String newTime = timeFormat.format(cal.getTime());
        System.out.println(newTime);


    }

    public static void zadanie3(int num1, int num2) {
        int gcd = 1;
        int lcm = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;

            }

        }
        if (num1 > num2) {
            lcm = num1 / gcd * num2;
        } else {
            lcm = num2 / gcd * num1;
        }

        System.out.println(gcd + " " + lcm);
    }

    public static boolean zadanie4(int a, int b, int c) {
        if (a + b > c && b + c > a && a + c > b) {
            return true;
        } else {
            return false;
        }

    }

    //transpose matrix
    public static void zadanie5(int column, int row) {
        int[][] matrix = {{2, 3, 4}, {5, 6, 4}};


        int[][] transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
                System.out.print(transpose[j][i] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static void zadanie6() {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        int i, j, x, y, z, determinant = 0;

        System.out.println("\n Please Enter the Matrix Items :  ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        x = (arr[1][1] * arr[2][2]) - (arr[2][1] * arr[1][2]);
        y = (arr[1][0] * arr[2][2]) - (arr[2][0] * arr[1][2]);
        z = (arr[1][0] * arr[2][1]) - (arr[2][0] * arr[1][1]);

        determinant = (arr[0][0] * x) - (arr[0][1] * y) + (arr[0][2] * z);

        System.out.println("The Determinant of 3 * 3 Matrix = " + determinant);

    }

    public static void zadanie7(int b) {
        System.out.println("Please enter number of rows and columns");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        System.out.println("Enter matrix elements");
        int matrix[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = matrix[i][j] * b;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();


        }
    }

    public static void zadanie8(int[][] matrix1, int[][] matrix2) {
        int size1 = matrix1.length;
        int size2 = matrix2[0].length;
        int matrix3[][] = new int[size1][size2];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void zadanie9(int[][] matrix1, int[][] matrix2) {
        int size1 = matrix1.length;
        int size2 = matrix2[0].length;
        int matrix3[][] = new int[size1][size2];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void zadanie10(int[][] matrix1, int[][] matrix2) {
        int size1 = matrix1.length;
        int size2 = matrix2[0].length;
        int matrix3[][] = new int[size1][size2];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix3[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }

        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }

    // nie wiem jak dobrze posortować ArraList, dlatego użyłem funkcji sort z Collections
    public static void zadanie11(int matrix[][], int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                list.add(matrix[i][j]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    int temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
            }
        }

//        Collections.sort(list, Collections.reverseOrder());
        List<Integer> list_n = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list_n.add(list.get(i));

        }
        System.out.println(n + " highest elements of the list are " + list_n);
    }

    public static void zadanie12(int matrix[][]) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int average;
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                list.add(matrix[i][j]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        average = sum / list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > average) {
                newList.add(list.get(i));
            }

        }
        System.out.println("Elements larger than average " + newList);

    }

    public static void zadanie13(int matrix[][]) {
        List<Integer> list = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                list.add(matrix[i][j]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j) == list.get(j + 1) + 1) {
                    ;
                    newList.add(j + 1);
                    if (list.get(j + 1) == list.size()) {
                        break;
                    }
                }
            }
        }

        System.out.println(newList);
    }
}


