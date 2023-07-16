package desafio3;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("QUAL SERÁ O TAMANHO DA LISTA: ");
        int n = scanner.nextInt();

        System.out.print("QUAL O VALOR DESEJADO: ");
        int k = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("QUAIS SERÃO OS NÚMEROS DA LISTA:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = countPairsWithDifference(arr, k);
        System.out.println("A QUANTIDADE DE PARES COM A DIFERENÇA DA SUBTRAÇÃO IGUAL A " + k + " É: " + count);
    }

    private static int countPairsWithDifference(int[] arr, int k) {
        Arrays.sort(arr);

        int count = 0;
        int i = 0;
        int j = 1;

        while (j < arr.length) {
            int diff = arr[j] - arr[i];

            if (diff == k) {
                count++;
                i++;
                j++;
            } else if (diff < k) {
                j++;
            } else {
                i++;
            }

            if (i == j) {
                j++;
            }
        }

        return count;
    }
}
