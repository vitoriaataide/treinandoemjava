import java.util.Scanner;
import java.util.Locale;

public class caixinha{
public static void main(String[] args){
Locale.setDefault(Locale.US);
Scanner entrada = new Scanner(System.in);
double saldo = 1000.00;
int num=0;
while(num!=4){
System.out.println("-----------------");
System.out.println("Bem vindo, cliente.");
System.out.println("1 - Ver saldo.");
System.out.println("2 - Depositar.");
System.out.println("3 - Sacar.");
System.out.println("4 - Sair.");
System.out.println("-----------------");
System.out.println("O que deseja? Digite o número");
num = entrada.nextInt();

switch(num){
case 1:
System.out.printf("Seu saldo é %.2f\n ", saldo);
break;

case 2:
System.out.println("Quanto gostaria de depositar? ");
double deposito = entrada.nextDouble();
saldo += deposito;
System.out.println("Depósito feito! Seu novo saldo é " + saldo);
break;

case 3:
System.out.println("Quanto gostaria de sacar? ");
double saque = entrada.nextDouble();
if(saque <= saldo){
saldo -= saque;
System.out.printf("Saque feito. Seu saldo agora é de %.2f\n", saldo);
}
else{
System.out.println("Saldo insuficiente.");}
break;
case 4:
System.out.println("Encerrando o atendimento.\nAgradecemos a preferência.");
break;
default:
System.out.println("Opção inválida.");
}
System.out.println();
}
}
}