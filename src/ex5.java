import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a = ");
        float a = scanner.nextFloat();
        System.out.println("Nhập hệ số b =  ");
        float b = scanner.nextFloat();
        System.out.println("Nhập hệ số c = ");
        float c = scanner.nextFloat();
        ex5.giaiPTBac2(a,b,c);

    }
    static  void giaiPTBac2(float a, float b, float c){
        if (a == 0){
            if (b == 0){
                System.out.println("Phương trình vô nghiệm");
            }else {
                System.out.println("Phương trình có 1 nghiệm" + "x = " + (-c/b));
            }
            return;
        }
        double delta = b*b - 4*a*c;
        double x1;
        double x2;
        if (delta > 0){
            x1 = ((-b + Math.sqrt(delta)) / (2*a));
            x2 = ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        }else if (delta == 0){
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
