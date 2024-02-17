import java.util.Scanner;
public class WHILE {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas cambalhotas você quer dar? ");
        int camb = teclado.nextInt();
        int cc=0;

        while (cc<camb){
            cc++;
            if (cc == 2 || cc == 3 || cc == 4){ // se o contador chegar nesses numeros
                continue; // vai dar continue. Nao vai executar o resto do comando e voltara para o inicio da repeticao
            }
            if (cc == 7){
                break; // interrompe a repeticao indo pro final da estrutura.
            }
            System.out.println("cambalhota " + (cc));
        }
    }
}
