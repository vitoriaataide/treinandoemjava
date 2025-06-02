import java.util.Scanner;
import java.util.Locale;

public class contador{
public static void main(String[] args){
Locale.setDefault(Locale.US);
Scanner entrada = new Scanner(System.in);

System.out.print("Digite um número inteiro para verificar sua tabuada: ");
int num = entrada.nextInt();
for (int valor = 1; valor <=10; valor++){
int result = num*valor;
System.out.println(num + " x " + valor + " = " + result);
}
}
}