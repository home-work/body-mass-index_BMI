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

        //Tính chỉ số BMI và đưa ra kết luận
        bmi = weight / Math.pow(height,2);
        if (bmi < 18.5){
            System.out.println("BMI = " + bmi + "\t\t\t UnderWeight");
        }else if (18.5 <= bmi && bmi < 25.0){
            System.out.println("BMI = " + bmi + "\t\t\t Normal");
        }
        else if (25 <= bmi && bmi < 30.0){
            System.out.println("BMI = " + bmi + "\t\t\t Overweight");
        }else {
            System.out.println("BMI = " + bmi + "\t\t\t Obese");
        }
    }
}
