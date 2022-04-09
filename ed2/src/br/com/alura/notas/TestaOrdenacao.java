package br.com.alura.notas;

public class TestaOrdenacao {
	
	public static void main(String[] args) {
		
		Produto produtos[] = {
				new Produto("Lamborghini", 100000),
				new Produto("Jipe", 46000),
				new Produto("Brasilia", 16000),
				new Produto("Smart", 46000),
				 new Produto("Fusca", 17000)
		 };
		
		
		//selectionSort(produtos, produtos.length);
		novoSort(produtos, produtos.length);
		
	
		
	}

	private static void imprime(Produto[] produtos) {
		for(Produto produto : produtos) {
			System.out.println(produto.getNome() + " Custo " + produto.getPreco());
		}
	}
		
		private static void novoSort(Produto[] produtos, int quantidadeElementos) {
			for(int atual = 0; atual < quantidadeElementos; atual++) {
				System.out.println("Estou na casa" + atual );
				
				int analise = atual;
				while(analise > 0 && produtos[analise].getPreco() < produtos[analise-1].getPreco()) {
					System.out.println("Trocando " + analise + "Com " + (analise - 1));
					
					Produto produtoAnalise = produtos[analise];
					Produto produtoAnaliseMenos1 = produtos[analise -1];
					System.out.println("Trocando " + produtoAnalise.getNome() 
										+ "Com " + produtoAnaliseMenos1.getNome());
					produtos[analise] = produtoAnaliseMenos1;
					produtos[analise - 1] = produtoAnalise;
					analise--;
				}
				
				imprime(produtos);
				System.out.println();
				System.out.println();
				System.out.println();
			}
		
	}

		private static void selectionSort(Produto[] produtos, int quantidadeDeElementos) {
			for(int atual = 0; atual < quantidadeDeElementos - 1; atual++) {
				int menor = buscaMenor(produtos,atual,quantidadeDeElementos -1);
				
				System.out.println("Trocando " + atual + "Com o " + menor);
				Produto  produtoAtual = produtos[atual];
				Produto produtoMenor = produtos[menor];
				
				System.out.println("Trocando "+ produtoAtual.getNome() + " " + produtoMenor.getNome());
				
				produtos[atual] = produtoMenor;
				produtos[menor] = produtoAtual;
				
				
			}
		
	}

		private static int buscaMenor(Produto[] produtos,int inicio, int termino) {
			int maisBarato = inicio;
		
			for(int atual = 0; atual <= 4; atual++) {
				if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
					maisBarato = atual;
				}
			}
			return maisBarato;
		
	}

}