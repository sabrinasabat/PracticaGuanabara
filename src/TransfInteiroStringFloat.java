public class TransfInteiroStringFloat {
    public static void main(String[] args) {
        int idade = 30;
        String valor = Integer.toString(idade); // transforma inteiro para string
        System.out.println(valor);

        String outroValor = "70";
        int idade2 = Integer.parseInt(outroValor); // transforma string para inteiro
        System.out.println(idade2);

        String terceiroValor = "50.5";
        float idade3 = Float.parseFloat(terceiroValor); // transforma string para float
        System.out.println(idade3);




    }
}
