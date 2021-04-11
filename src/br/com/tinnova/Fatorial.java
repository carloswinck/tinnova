package br.com.tinnova;

public class Fatorial {
	
	public long calculo(long valor) {
		
		if(valor == 1 || valor == 0) {
			return valor;
		}else {
			return calculo(valor -1) * valor;
		}
	}
	
	public static void main(String[] args) {
		
		Fatorial fatorial = new Fatorial();

		System.out.println(fatorial.calculo(0));
		System.out.println(fatorial.calculo(1));
		System.out.println(fatorial.calculo(2));
		System.out.println(fatorial.calculo(3));
		System.out.println(fatorial.calculo(4));
		System.out.println(fatorial.calculo(5));
		System.out.println(fatorial.calculo(6));
		
	}

}