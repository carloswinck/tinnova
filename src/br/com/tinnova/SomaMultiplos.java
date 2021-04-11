package br.com.tinnova;

public class SomaMultiplos {
	
	private int tres = 3;
	private int cinco = 5;
	private int soma = 0;
	
	public int calculo(int valor) {
		
		for (int i = valor - 1; i > 0; i--) {
			if(i % tres == 0 || i % cinco == 0) {
				soma += i;
			}
		}
		return soma;
	}
	
	public static void main(String[] args) {
		
		SomaMultiplos soma = new SomaMultiplos();

		System.out.println(soma.calculo(10));
		System.out.println(soma.calculo(100));
		System.out.println(soma.calculo(1000));
		
	}

}
