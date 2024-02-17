import java.util.Scanner;
public class VotoObrigatorio {
    public static void main(String[] args) {
        int anoatual = 2024;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano do seu nascimento: ");
        int nasc = teclado.nextInt();

        int idade = anoatual - nasc;

        if (idade<16){
            System.out.println("Idade: " + idade);
            System.out.println("Você não vota!");
        } else if ((idade>=16 && idade<18) || idade>70){
            System.out.println("Idade: " + idade);
            System.out.println("Seu voto é opcional!");
        } else {
            System.out.println("Idade: " + idade);
            System.out.println("Seu voto é obrigatório!");
        }
    }
}
