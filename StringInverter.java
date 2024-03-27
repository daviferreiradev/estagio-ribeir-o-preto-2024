// 5) Escreva um programa que inverta os caracteres de um string.

// IMPORTANTE:
// a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

// b) Evite usar funções prontas, como, por exemplo, reverse;

public class StringInverter {

    public static void main(String[] args) {
        String originalString = "Exemplo";
        String invertedString = invertString(originalString);

        System.out.println("String original: " + originalString);
        System.out.println("String invertida: " + invertedString);
    }

    public static String invertString(String str) {
        StringBuilder inverted = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            inverted.append(str.charAt(i));
        }
        return inverted.toString();
    }
}
