public class VETORES {
    public static void main(String[] args) {
        int n[] = {3, 2, 8, 7, 5, 4};
        System.out.println("Total de casas de N: " + n.length);

        for (int c=0; c<= n.length-1; c++){
            System.out.println("Na posição "+ c+ " temos o valor: "+n[c]);
        }

        System.out.println("-----------------------------------------------");

        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i=0; i<mes.length; i++){
            System.out.println("O mes " + mes[i] + " tem " + tot[i] + " dias.");
        }
    }
}
