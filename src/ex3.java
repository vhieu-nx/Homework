import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number%3==0 && number%5==0){
            System.out.println("FIZZBUZZ");
        }else if (number % 3 == 0){
            System.out.println("FIZZ");
        }else if (number % 5 == 0){
            System.out.println("BUZZ");
        }
    }
}
