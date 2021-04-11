package br.com.tinnova;

import java.util.Arrays;

public class AlgoritmoOrdenacaoBubbleSort {
	

	public static void main(String[] args) {
		
		int[] vetor = {5,3,2,4,7,1,0,6};

        for (int i = 0; i < vetor.length; i++) {
            for (int cont = 1; cont < vetor.length - i; cont++) {
                int left = vetor[cont - 1];
                int rigth = vetor[cont];

                if (left > rigth) {
                    vetor[cont - 1] = rigth;
                    vetor[cont] = left;
                }
            }
        }

        System.out.println(Arrays.toString(vetor));

	}

}