import java.util.Scanner;
public class OperadoresLogicos {
    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        r = (x < y ^ y < z) ? true : false; // exclusivamente um OU outro. se os dois cumprirem a condiçao será falso.
        System.out.println(r);

        r = (x < y || y < z) ? true : false; // um ou outro, aceita os dois
        System.out.println(r);

        r = (x < y && y == z) ? true : false; // E. tem que cumprir as duas condiçoes para ser verdadeiro
        System.out.println(r);

        System.out.println("-----------------------------------");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano que voce nasceu: ");
        String inputAno = teclado.nextLine();

        int ano = Integer.parseInt(inputAno);
        int anoatual = 2024 - ano;

        String sit = (anoatual >= 16 && anoatual < 18) || (anoatual > 70) ? "Seu voto é opcional!" : "Seu voto NÃO é opcional!";
        System.out.println(sit);

    }
}

