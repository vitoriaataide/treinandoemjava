import java.util.Scanner;
import java.util.Locale;

public class Entradinha{
public static void main(String [] args){
Locale.setDefault(Locale.US);
Scanner entrada = new Scanner(System.in);
System.out.println("Digite seu nome: ");
String nome = entrada.nextLine();

System.out.println("Digite sua idade: ");
int idade = entrada.nextInt();
entrada.nextLine();

System.out.println("Digite sua altura: ");
double altura = entrada.nextDouble();
entrada.nextLine();

System.out.println("Você gosta de programar? ");
boolean gosta = entrada.nextBoolean();

System.out.println("Olá, " + nome + "! Você tem " + idade + " anos. Você tem" + altura + "m. Você gosta de programar? " + gosta);
entrada.close();
}
}