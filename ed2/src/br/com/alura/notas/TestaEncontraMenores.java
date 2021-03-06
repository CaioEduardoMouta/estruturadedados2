package br.com.alura.notas;

public class TestaEncontraMenores {

	public static void main(String[] args) {
		Nota Caio = new Nota("Caio",7);
		Nota[] notas = {
				new Nota("Mariana", 4),
				
				new Nota("Maya", 8.7),
				new Nota("Marlene", 9),
				new Nota("Carlos", 3),
				Caio,
				new Nota("Juliana", 6.7),
				new Nota("Jonas", 7),
				new Nota("Lucia", 9.3),
				new Nota("Ana", 10),
				
		};
		
		int menores = encontraMenores(Caio, notas);
		System.out.println("Numero de menores " + menores);
	}
	
	private static int encontraMenores(Nota Caio, Nota[] notas) {
		int menores = 0;
		for(int atual = 0; atual < notas.length; atual++) {
			Nota nota = notas[atual];
			if(nota.getValor() < Caio.getValor()) {
				menores++;
			}
		}
		return menores;
	}
	
}

