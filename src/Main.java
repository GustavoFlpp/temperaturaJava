import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua temperatura em celsius:" );
        double temperatura = scanner.nextDouble();
        double conversao = (temperatura * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + conversao);
        }
    }
