import java.util.Scanner;
import java.util.Locale;

public class arrays{
public static void main(String[] args){
Locale.setDefault(Locale.US);
Scanner entrada = new Scanner(System.in);
int[] numeros = new int[5];
int soma = 0;
for(int i =0; i<numeros.length; i++){
System.out.println("Digite o numero " + (i+1) + ": ");
numeros[i] = entrada.nextInt();
soma += numeros[i];

}
double media = (double) soma/numeros.length;
System.out.println("Soma dos números: " + soma);
System.out.printf("Média dos números: %.2f\n", media);
entrada.close();
}
}