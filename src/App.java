import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double cir, area;
        System.out.print("Digite o raio do círculo: ");
        cir = input.nextDouble();
        area = Math.PI * (Math.pow(cir, 2));
        System.out.print("A área do círculo é: " + area);
        input.close();
    }
}
