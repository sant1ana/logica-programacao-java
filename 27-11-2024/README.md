# Reutilizando Variáveis no Cálculo de Porcentagem de Salário

Este exercício contém duas versões de um código em Java que realiza cálculos de porcentagem sobre um salário:

- **Feito por mim**: Utiliza variáveis separadas para armazenar cada resultado de porcentagem.
- **Feito pelo Professor**: Demonstra a reutilização de uma única variável para armazenar os diferentes resultados.

## Objetivo

Demonstrar duas abordagens para trabalhar com variáveis em cálculos, incentivando o entendimento de boas práticas de reaproveitamento de variáveis e organização de código.

## Como Funciona

1. **Entrada Fixa**: O valor do salário está fixado como `5000` no código.
2. **Cálculos de Porcentagem**:
   - 30% do salário.
   - 15% do salário.
   - 5% do salário.
3. **Impressão no Console**: Os resultados de cada cálculo são exibidos no terminal.

## Código - Feito por mim

Foi utilizado variáveis diferentes para armazenar cada resultado de porcentagem.

```java
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
```
<br>

## Código - Feito pelo Professor

 Foi utilizado uma única variável para armazenar os diferentes resultados.

```java
public class ReutilizandoVariavel
{
    public static void main(String[] args) {
        double salario = 5000;
        double resultado = salario * 0.3;
        System.out.println("30% é " + resultado);
        resultado = salario * 0.15;
        System.out.println("15% é " + resultado);
        resultado = salario * 0.05;
        System.out.println("5% é " + resultado);
    }
}
```
<br>


## Comparação Entre as Versões

Feito por mim:

- Maior uso de memória devido a múltiplas variáveis.
- Fácil de entender e rastrear os valores intermediários.


Feito pelo Professor:

- Menor uso de memória, pois reutiliza a variável.
- Código mais compacto e eficiente.