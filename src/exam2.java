import java.util.Scanner;

public class exam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh góc vuông thứ 1");
        int number1 = scanner.nextInt();
        System.out.println("Nhập cạnh góc vuông thứ 2");
        int number2 = scanner.nextInt();
        System.out.println("Nhập cạnh góc vuông thứ 3");
        int number3 = scanner.nextInt();
        if (number3*number3 == ((number1*number1)+(number2*number2)) || number2*number2 == ((number1*number1)+(number3*number3)) || number1*number1 == ((number2*number2)+(number3*number3)) ){
            System.out.println("This is tam giac vuong");
        }else {
            System.out.println("this is not tam giac vuong");
        }


    }
}
