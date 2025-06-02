import java.util.Scanner;
import java.util.Locale;
public class parimpar{
public static void main(String[] args){
Locale.setDefault(Locale.US);
Scanner entrada = new Scanner(System.in);
System.out.print("Digite um número inteiro: ");
int num = entrada.nextInt();
if(num % 2 == 0)
System.out.println("Seu número é par.");
else
System.out.println("Seu número é ímpar.");

}
}