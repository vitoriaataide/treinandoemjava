import java.util.Scanner;
import java.util.Locale;

public class reais{
public static void main(String[] args){
Locale.setDefault(Locale.US);
Scanner entrada = new Scanner(System.in);
double[] numeros = new double[7];
int soma=0;
int estaonamedia=0;
System.out.println("Digite sete números reais.");
for(int i=0; i<numeros.length;i++){
System.out.print("Digite o número "+(i+1)+": ");
numeros[i] = entrada.nextDouble();
soma += numeros[i];
}
double media = ((double) soma)/numeros.length;
for(int i=0; i<numeros.length; i++){
if(numeros[i] >= media){
estaonamedia++;
}
}
System.out.println("Média: " + media);
System.out.println("Quantos números que estão na média: " + estaonamedia);

}
}