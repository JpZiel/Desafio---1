package desafio4;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < a; i++) {
            String linha = scanner.nextLine();
            String linhaDecifrada = decifrarLinha(linha);
            System.out.println(linhaDecifrada);
        }
    }

    private static String decifrarLinha(String linha) {
        int tamanho = linha.length();
        int metade = tamanho / 2;
        StringBuilder linhaDecifrada = new StringBuilder(tamanho);

        for (int i = 0; i < metade; i++) {
            linhaDecifrada.append(linha.charAt(metade - 1 - i));
        }

        for (int i = metade; i < tamanho; i++) {
            linhaDecifrada.append(linha.charAt(tamanho - 1 - i + metade));
        }

        return linhaDecifrada.toString();
    }
}
