import java.util.Scanner;

public class PowerOf4And5 {
    public static void main(String[] args) {
        int a = 2, times4 = -1, times5 = -1;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        a = input.nextInt();
        for (int i = 1; i <= a; i *= 4) {
            times4++;
            System.out.println("4 Üssü " + times4 + "= " + i);
        }
        for (int z = 1; z <= a; z *= 5) {
            times5++;
            System.out.println("5 Üssü " + times5 + "= " + z);
        }
    }
}
