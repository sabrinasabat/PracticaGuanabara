import java.util.Scanner;
public class Pratica06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano do seu nascimento: ");
        int nasc = teclado.nextInt();
        int i = 2015 - nasc;

        if (i>=18){
            System.out.println("Maior!");
        } else{
            System.out.println("Menor!");
        }

    }
}
