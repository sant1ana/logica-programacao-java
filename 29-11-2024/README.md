# Controle de Fluxo em Java  if-else pt 01

 Contém exemplos básicos do uso de controle de fluxo em Java utilizando as estruturas condicionais `if` e `if-else`.

## O que foi abordado?

### Estrutura `if`:
- Executa um bloco de código apenas se a condição for verdadeira.

### Estrutura `if-else`:
- Executa um bloco de código se a condição for verdadeira e outro bloco se a condição for falsa.

## Exemplos de Código

### Exemplo 1: Apenas `if`

```java
public class CondicionaisAula1
{
    public static void main(String[] args) {
        if (true) {
            System.out.println("Dentro do IF");
        }
        System.out.println("Fora do IF");
    }
}
```
<br>
<br>

### Exemplo 2: `if` com uma variável booleana
Aqui, a variável `condicao` é usada para decidir se o bloco do `if` será executado.

```java
public class CondicionaisAula1
{
    public static void main(String[] args) {
        boolean condicao = false;
        if (condicao) {
            System.out.println("Dentro do IF");
        }
        System.out.println("Fora do IF");
    }
}
```
<br>
<br>

### Exemplo 3: `if-else`
Neste exemplo, o bloco do `if` será executado se `condicao` for verdadeira. Caso contrário, o bloco do `else` será executado.

```java
public class CondicionaisAula1
{
    public static void main(String[] args) {
        boolean condicao = true;
        if (condicao) {
            System.out.println("Dentro do IF");
        } else {
            System.out.println("Dentro do ELSE");
        }
        System.out.println("Fora do IF");
    }
}
```
<br>
<br>

# Objetivo

O objetivo deste projeto é explorar o controle de fluxo em Java, abordando os seguintes conceitos:

- Condições simples utilizando a estrutura `if`.
- Alternativas para condições falsas com a estrutura `if-else`.