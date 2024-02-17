import java.util.Arrays;
public class ForEACH {
    public static void main(String[] args) {
       /* int num[] = {3, 5, 1, 8, 4};
        int pos = Arrays.binarySearch(num, 1); // vai dizer que numero esta na posicao 1
        System.out.println("Encontramos na posição: "+pos);
        for (int valor:num){
            System.out.println(valor);
        }
        System.out.println("");
        double v[] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(v); // ordenando o vetor em ordem.
        for (double valor2:v){ // outra forma de fazer o mesmo de cima
            System.out.println(valor2);
        }
        System.out.println("-----------------------");
        int vett[]={3, 7, 6, 1, 9, 4, 2};
        for (int c:vett) {
            System.out.print(c + " "); // imprimindo o vetor
        }
        System.out.println("");
        int posi = Arrays.binarySearch(vett, 1); // vai dizer em que posicao esta o numero 1
        System.out.println("Encontrei o valor na posição " + posi);
*/
        int num3[] = new int[20]; // vetor com 20 posiçoes
        Arrays.fill(num3, 0); // vai preencher todos os elementos do vetor com 8
        for (int exvalor:num3){
            System.out.print(exvalor+ " ");
        }
    }
}
