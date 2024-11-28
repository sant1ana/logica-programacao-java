
public class ReutilizandoVariavel
{
	public static void main(String[] args) {
	   double salario = 5000;
	   double porcentagem1 = 30;
	   double porcentagem2 = 15;
	   double porcentagem3 = 5;
	   
	   double resultado1 = salario * (porcentagem1 / 100);
	   double resultado2 = salario * (porcentagem2 / 100);
	   double resultado3 = salario * (porcentagem3 / 100);
	    
	    
		System.out.println("Primeiro salario " + resultado1);
		System.out.println("Segundo salario " + resultado2);
		System.out.println("Terceiro salario " + resultado3);
	}
}
