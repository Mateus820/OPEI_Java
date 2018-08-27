import java.util.Scanner;

public class Java_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int l;
        double area, volume, altura;

        l = sc.nextInt();
        area = (Math.pow(l, 2.0) * Math.sqrt(3.0));
        altura = (l * Math.sqrt(6)) / 3;
        volume = (Math.pow(l, 3) * Math.sqrt(2)) / 12;

        System.out.printf("Altura: %.2f , Area: %.2f , Volume: %.2f .", altura, area, volume);
    }
}
