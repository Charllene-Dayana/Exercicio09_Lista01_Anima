
//Faça um Programa que peça a temperatura em graus Fahrenheit, 
//transforme e mostre a temperatura em graus Celsius.
//C = 5 * ((F-32) / 9).

//F - 32 / 18 
// - sub + soma * multiplicação / divisão
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double fahrenheit;
        double celsius;
        double calculadora;
        Scanner teclado = new Scanner(System.in);
        System.out.println("qual é a temperatura em fahrnheit");

        fahrenheit = teclado.nextDouble();
        celsius = (fahrenheit - 32) / 1.8;

        System.out.println("a temperatuta em celsius é " + celsius);
        teclado.close();
    }

}
