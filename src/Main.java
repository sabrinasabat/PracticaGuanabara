import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine(); // para string
        System.out.println("Digite a nota do aluno: ");
        float nota = teclado.nextFloat(); // para float
        System.out.println("A nota do " + nome + " é: " + nota);
    }
}
