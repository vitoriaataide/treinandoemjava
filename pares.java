import java.util.Scanner;
import java.util.Locale;

public class pares{
public static void main(String[] args){
Locale.setDefault(Locale.US);
Scanner entrada = new Scanner(System.in);

int[] numeros = new int[6];
System.out.println("Digite 6 números inteiros: ");
for(int i=0; i<numeros.length; i++){
System.out.print("Digite o número " + (i+1) +": ");
numeros[i] = entrada.nextInt();
}

int maior = numeros[0];
int menor = numeros[0];
for(int i=0; i<numeros.length; i++){
if(numeros[i] > menor){
maior = numeros[i];
}
if(numeros[i] < menor){
menor = numeros[i];
}

}
System.out.println("O maior número é " + maior "e o menor número é " + menor);
entrada.close();

    }
}