import java.util.Scanner;
import java.util.Locale;

public class IMC{
public static void main(String[] args){
Locale.setDefault(Locale.US);
Scanner entrada = new Scanner(System.in);
System.out.print("Digite seu peso, em kg: ");
double peso = entrada.nextDouble();
System.out.print("Digite sua altura, em metros: ");
double altura = entrada.nextDouble();

double imc = peso/(altura*altura);
if(imc < 18.5)
System.out.println("Abaixo do peso");
else if(imc < 25)
System.out.println("Peso ideal");
else
System.out.println("Acima do peso");
entrada.close();
}
}