import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n, contador = 0;
        double soma = 0, porcentagem = 0;

        n = sc.nextInt();
        double[] notas = new double[n];

        for(int i = 0; i < n; i++) notas[i] = sc.nextDouble();
        for (int i = 0; i < n; i++) soma += notas[i];

        double media = soma / n;

        for (int i = 0; i < n; i++){
            if(notas[i] >= media){
                contador++;
            }
        }
        porcentagem = 100 * contador / n;
        System.out.println(porcentagem + "%");

    }
}
