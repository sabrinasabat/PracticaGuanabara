import java.sql.SQLOutput;
import java.util.Scanner;
public class SWITCH {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas pernas ele tem? ");
        int resp = teclado.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");

        switch (resp) {
            case 1:
                tipo = "SACI";
                break;
            case 2:
                tipo = "BÍPEDE";
                break;
            case 3:
                tipo = "TRIPÉ";
                break;
            case 4:
                tipo = "QUADRÚPEDE";
                break;
            case 6, 8:
                tipo = "ARANHA";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);

    }
}
