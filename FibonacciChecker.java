// 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

// IMPORTANTE:
// Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

public class FibonacciChecker {

    public static void main(String[] args) {
        int number = 34;

        boolean result = isInFibonacci(number);

        if (result) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isInFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true;
        }

        int previous = 0, current = 1;

        while (current < num) {
            int next = previous + current;
            previous = current;
            current = next;
        }

        return current == num;
    }
}
