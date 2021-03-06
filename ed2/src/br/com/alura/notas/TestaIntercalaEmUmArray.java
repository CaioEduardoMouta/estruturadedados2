package br.com.alura.notas;

public class TestaIntercalaEmUmArray {

	public static void main(String[] args) {
		Nota[] notas = {
				new Nota("Mariana", 2),
				new Nota("Caio", 10),
				new Nota("Maya", 8.7),
				new Nota("Marlene", 1),
				new Nota("Carlos", 3.4),
				new Nota("Juliana", 6.7),
				new Nota("Jonas", 0.4),
				new Nota("Lucia", 9.3),
				new Nota("Ana", 5)
				
		};
		
		intercala(notas,0, 4, notas.length);
		for(Nota nota: notas) {
			System.out.println(nota.getAluno() + " " + nota.getValor());
		}		
	}

	private static void  intercala(Nota[] notas, int inicial, int miolo, int termino) {
		Nota[] resultado = new Nota[termino - inicial];
		
		int atual = 0;
		int atual1 = inicial;
		int atual2 = miolo;
		while(atual1 < miolo &&
				atual2 < termino) {
			Nota nota1 = notas[atual1];
			Nota nota2 = notas[atual2];
			
			if(nota1.getValor() < nota2.getValor()) {
				resultado[atual] = nota1;
				atual++;
			} else {
				resultado[atual] = nota2;
				atual2++;
			}
			atual++;
		}
		while(atual1 < miolo) {
			resultado[atual] = notas[atual1];
			atual1++;
			atual++;
		}
		while(atual2 < miolo) {
			resultado[atual] = notas[atual2];
			atual2++;
			atual++;
		}
		
		
 		
		for(int contador = 0; contador < atual; contador++) {
			notas[inicial + contador] = resultado[contador];
		}
		
		
	}
}

