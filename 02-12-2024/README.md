# Controle de fluxo if-else pt 02

Este 
exercício verifica se uma pessoa é **"Adulto"** ou **"Ainda não é adulto"** com base na idade informada.
<br>

### Objetivo:
O objetivo deste exercício é criar um programa que receba uma idade como entrada e, com base no valor, determine se a pessoa é adulto ou não.
<br>

## 🧠 O que foi abordado

1. **Estruturas Condicionais (`if-else`)**: Utilizadas para verificar se a condição (idade maior ou igual a 18) é verdadeira ou falsa e imprimir a resposta adequada.  
2. **Operadores Relacionais**: O operador `>=` foi utilizado para comparar a idade e verificar se é maior ou igual a 18. 

<br>

## 📄 Código do exercício

```java
public class VerificaIdade {
    public static void main(String[] args) {
        int idade = 20; // A idade a ser verificada
        if (idade >= 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Ainda não é adulto");
        }
    }
}