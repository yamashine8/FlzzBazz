import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        while (scanner.hasNextInt()){
            int temp = scanner.nextInt();
            if (temp % 3 == 0 && temp % 5 == 0){
                System.out.println("FLZZBAZZ");
            }else if (temp % 3 == 0){
                System.out.println("FLZZ");
            }else if (temp % 5 == 0){
                System.out.println("BAZZ");
            }else {
                System.out.println("Число которое вы ввели ("+ temp +") не делится на 3 и на 5.");
            }
            System.out.print("Введите число: ");
        }
        System.out.println("Цикл закончен.");
        scanner.close();
    }
}