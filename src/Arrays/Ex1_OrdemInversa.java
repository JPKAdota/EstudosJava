package Arrays;

import java.util.Scanner;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8 , 4};

        System.out.println("Vetor: ");
        int count =0;
        while (count <= vetor.length) {
            System.out.print(vetor[count] + " ");
            count ++;
        }

        for (int i = (vetor.length-1); i >= 0; i--){
            System.out.println(vetor[i] + " ");
        }
    }
}
