import java.util.Scanner;
import java.util.Locale;

public class Perfil{
public static void main(String[] args){
Locale.setDefault(Locale.US);
Scanner entrada = new Scanner(System.in);
System.out.print("Digite seu nome: ");
String nome = entrada.nextLine();
System.out.print("Digite sua idade: ");
int idade = entrada.nextInt();
System.out.print("Digite sua altura: ");
double altura = entrada.nextDouble();

System.out.print("Gosta de programar? (true/false):  ");
boolean gosta = entrada.nextBoolean();


System.out.println("----------------");
System.out.println("SEUS DADOS:");
System.out.println("Seu nome: " + nome);
System.out.println("Sua idade: " + idade);
System.out.println("Sua altura: " + altura +"m");

if(idade<18)
System.out.println("Ainda jovem aproveite para estudar bastante.");
else
System.out.println("Boa sorte no mundo profissional! ");
if(gosta==true)
System.out.println("Você tem futuro na programação. ;) ");
else
System.out.println("Tudo bem, a programação não é para todos. :( ");

}
}