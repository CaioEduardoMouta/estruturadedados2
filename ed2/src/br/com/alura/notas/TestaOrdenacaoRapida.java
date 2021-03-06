package br.com.alura.notas;

public class TestaOrdenacaoRapida {

	public static void main(String[] args) {
		Nota Caio = new Nota("Caio",7);
		Nota[] notas = {
				new Nota("Mariana", 4),
				
				new Nota("Maya", 8.7),
				new Nota("Marlene", 9),
				new Nota("Carlos", 3),
				
				new Nota("Juliana", 6.7),
				new Nota("Jonas", 7),
				new Nota("Lucia", 9.3),
				new Nota("Ana", 10),
				Caio
			
		};
		
		ordena(notas, 0, notas.length);
		int encontrei = busca(notas, 0, notas.length,9.3);
		if(encontrei >= 0) {
		System.out.println(" "+ encontrei + " ");
		} else { 
			System.out.println("N?o encontrei a nota");
		}

		for(int atual = 0; atual < notas.length; atual++) {
			Nota nota = notas[atual];
			System.out.println(nota.getAluno() + " " +nota.getValor());
		}
	}
		private static int busca(Nota[] notas, int de, int ate, double buscando) {
			System.out.println("Buscando" + buscando + " Entre " + de + " e " + ate);
			if(de > ate) {
				return - 1;
			}
			
			int meio = (de+ate)/2;
			Nota nota = notas[meio];
			if(buscando == nota.getValor()) {
				return meio;
			}
			
			if(buscando < nota.getValor()) {
				return busca(notas, de, meio -1, buscando);
				
			}
			return busca(notas,meio + 1, ate, buscando);
			}
				
		
		private static void ordena(Nota[] notas, int de, int ate) {
			int elementos = ate - de;
			if(elementos > 1) {
				int posicaoDoPivo = particiona(notas, de, ate);
				ordena(notas, de, posicaoDoPivo);
				ordena(notas, posicaoDoPivo + 1, ate);
			}	
	}
		
		private static int particiona(Nota[] notas, int inicial, int termino) {
			int menoresEncontrados = 0;
			Nota pivo = notas[termino - 1];
			for(int analisando = 0; analisando < termino - 1; analisando++) {
				Nota atual = notas[analisando];
				if(atual.getValor() <= pivo.getValor()) {
					menoresEncontrados++;
				}
			}
			troca(notas,termino -1, menoresEncontrados);
			return menoresEncontrados;
		}

		private static void troca(Nota[] notas, int de, int para) {
			Nota nota1 = notas[de];
			Nota nota2 = notas[para];
			notas[para] = nota1;
			notas[de] = nota2;
			
		}
}
