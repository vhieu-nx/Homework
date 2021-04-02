import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên dương");
        int number = scanner.nextInt();
        if (number >= 0){
            System.out.println(number + " là số nguyên dương");
        }else {
            System.out.println(number + " không là số nguyên dương");
        }
    }
}
