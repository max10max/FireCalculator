import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int year;


    public static void main(String[] args) throws Exception {
        getYear();
        if (year < 2004 ) System.out.println(0.0);
        else System.out.println(Calculator.calculation(year));
    }


    public static int getYear() throws Exception {
        int input = scanner.nextInt();
        if (input > 2001 && input < 2023){
           return year = input;
        } else {
            throw new Exception("wrong year!");
        }
    }
}
