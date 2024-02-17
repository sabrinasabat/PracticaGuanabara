public class ComString {
    public static void main(String[] args) {
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String ("Gustavo");
        String res;
        res = (nome1.equals(nome3))? "igual":"diferente"; // usando o equals ele compara o que tem dentro da variavel
        // usando os == compara o tipo da variave, e considerando que um new string é diferente de um string, nao reconheceria o mesmo nome.
        System.out.println(res);
    }
}
