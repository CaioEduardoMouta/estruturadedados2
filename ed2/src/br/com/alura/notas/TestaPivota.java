package br.com.alura.notas;

public class TestaPivota {
	
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
	
	int novaPosicao = particiona(notas,0, notas.length);
	
	System.out.println(novaPosicao);
	
	for(int atual = 0; atual < notas.length; atual++) {
		Nota nota = notas[atual];
		System.out.println(nota.getAluno() + " " +nota.getValor());
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
