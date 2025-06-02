import java.util.Scanner;
import java.util.Locale;

public class Comparar{
public static void main(String [] args){
Locale.setDefault(Locale.US);
Scanner entrada = new Scanner(System.in);
System.out.println("Digite a idade da primeira pessoa: ");
int idade1 = entrada.nextInt();
System.out.println("Digite a idade da segunda pessoa: ");
int idade2 = entrada.nextInt();
if(idade1 > idade2){
System.out.println("A primeira pessoa é mais velha que a segunda.");
}
else if(idade1==idade2){
System.out.println("As pessoas têm a mesma idade.");
}
else
System.out.println("A segunda pessoa é mais velha que a primeira.");
entrada.close();
}
}