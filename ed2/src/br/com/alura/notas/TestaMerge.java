package br.com.alura.notas;

public class TestaMerge {

	public static void main(String[] args) {
		Nota[] notasDoMouta = {
				new Nota("Mariana", 5),
				new Nota("Caio", 8),
				new Nota("Maya", 9),
				new Nota("Marlene", 10),
				new Nota("Carlos", 10)
		};
		
		Nota[] notasDoCarrazedo = {
				new Nota("Juliana", 5),
				new Nota("Jonas", 3),
				new Nota("Lucia", 9),
				new Nota("Ana", 10),
				new Nota("Guilherme", 7)
		};
		
		Nota[] rank = intercala(notasDoMouta, notasDoCarrazedo);
		for(Nota nota: rank) {
			System.out.println(nota.getAluno() + " " + nota.getValor());
		}
		
 	}

	private static Nota[] intercala(Nota[] notasDoMouta, Nota[] notasDoCarrazedo) {
		int total = notasDoMouta.length + notasDoCarrazedo.length;
		Nota[] resultado = new Nota[total];
		
		int atualDoMouta = 0;
		int atualDoCarrazedo = 0;
		int atual = 0;
		
		while(atualDoMouta < notasDoCarrazedo.length && 
				atualDoCarrazedo < notasDoMouta.length) {
			Nota nota1 = notasDoMouta[atualDoMouta];
			Nota nota2 = notasDoCarrazedo[atualDoCarrazedo];
			System.out.println(" " + nota1.getAluno() + " " + nota2.getAluno());
			
			if(nota1.getValor() < nota2.getValor()) {
				resultado[atual] = nota1;
				atualDoMouta++;
			}else {
				resultado[atual] = nota1;
				atualDoCarrazedo++;
			}
			
			atual++;
		}
		
		System.out.println("Estou saindo");
		while(atualDoMouta < notasDoMouta.length) {
			resultado[atual] = notasDoMouta[atualDoMouta];
			atual++;
			atualDoMouta++;
		}
		while(atualDoCarrazedo < notasDoCarrazedo.length) {
			resultado[atual] = notasDoCarrazedo[atualDoCarrazedo];
			atual++;
			atualDoCarrazedo++;
		}
		return resultado;
	}
}

