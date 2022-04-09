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
		insertionSort(produtos, produtos.length);
		
	
		
	}

	private static void imprime(Produto[] produtos) {
		for(Produto produto : produtos) {
			System.out.println(produto.getNome() + " Custo " + produto.getPreco());
		}
	}
		
		private static void insertionSort(Produto[] produtos, int quantidadeElementos) {
			for(int atual = 1; atual < quantidadeElementos; atual++) {
				System.out.println("Estou na casa" + atual );
				
				int analise = atual;
				while(analise > 0 && produtos[analise].getPreco() < produtos[analise-1].getPreco()) {
					System.out.println("Trocando " + analise + "Com " + (analise - 1));
					
					troca(produtos, analise, analise - 1);
					
					
					analise--;
				}
				
				imprime(produtos);
				System.out.println();
				System.out.println();
				System.out.println();
			}
		
	}

		private static void troca(Produto[] produtos, int primeiro, int segundo) {
			System.out.println("Estou trocando " + primeiro + " com " + segundo);
			
			Produto primeiroProduto = produtos[primeiro];
			Produto segundoProduto = produtos[segundo];
			System.out.println("Trocando " + primeiroProduto.getNome() 
								+ "Com " + segundoProduto.getNome());
			produtos[primeiro] = segundoProduto;
			produtos[segundo] = primeiroProduto;
			
		}

		private static void selectionSort(Produto[] produtos, int quantidadeDeElementos) {
			for(int atual = 0; atual < quantidadeDeElementos - 1; atual++) {
				System.out.println("Estou na casinha" + atual);
				
				
				int menor = buscaMenor(produtos,atual,quantidadeDeElementos -1);
				troca(produtos, atual, menor);
				
				
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
