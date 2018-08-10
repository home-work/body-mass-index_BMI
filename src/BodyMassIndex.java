import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        //Nhập vào khối lượng và chiều cao của cơ thể
        double height;
        double weight;
        double bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t CHỈ SỐ CÂN NẶNG CỦA CƠ THỂ - BMI");
        System.out.println("Nhập vào chiều cao của cơ thể(m): ");
        height = scanner.nextDouble();
        System.out.println("Nhập vào cân nặng của cơ thể(kg): ");
        weight = scanner.nextDouble();
    }
}
