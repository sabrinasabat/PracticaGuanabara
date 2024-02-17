import java.util.Scanner;
public class Repeat {
    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);
        //System.out.println("Digite quantas cambalhotas você quer? ");
        //int camb = teclado.nextInt();
        //int cc = 0;
        //do {
            //cc=cc+1;
            //System.out.println("cambalhota "+(cc));
        //} while (cc<camb);


        int n, s=0;
        String resp;
        Scanner teclado0 = new Scanner(System.in);
        do {
            System.out.println("Digite um número: ");
            n = teclado0.nextInt();
            s = s + n;
            System.out.println("Quer Continuar? [S/N] ");
            resp = teclado0.next();
        } while (resp.equals("S"));
        System.out.println("A soma dos valores é " + s);






    }
}


