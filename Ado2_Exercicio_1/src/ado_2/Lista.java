package ado_2;



public class Lista {

	private No inicio;
	private int tamanho;

	public void geraLista() {

		this.inicio = null;

	}

	public void adiciona(int num) {

		No novo = new No(); // criando obj do tipo no

		novo.setDado(num); // insere o valor dentro do 1° no
		novo.setProximo(inicio); // gera o proximo elemento apontando para null
		inicio = novo; // recebe os valores do obj criado apontando para o novo NO

		tamanho++;
		
	}
	
	public void imprimeLista() {

		for (No n = inicio; n != null; n = n.getProximo()) {
			System.out.println(n.getDado());

		}

	}

	public int obterTamanho() {

		return this.tamanho;
	}

	public boolean estaVazia() { // verifica se a lista esta vazia

		return inicio == null;

	}

	public void removeInicio() { // remove o NO onde o inicio esta apontando

		if (!estaVazia()) {

			this.inicio = inicio.getProximo();

		} else {

			System.out.println("Não a elemrntos na lista");
		}

	}

	public void free() {

		while (inicio != null) { // se inicio nao estiver null entrara no laço de onde TMP
									// recebe o proximo NO "forçando" inico a ser null

			No tmp = inicio.getProximo(); // crindo variavel do tipo NO recebendo o prox
			inicio = null; // inicio da lista recebe null
			inicio = tmp; // como inicio recebeu null no laço seguinte o prox aponta para null
							// fzd inicio receber null novamente

		}

	}

	public void adicionaOrdenado(int elemento) {

		No anterior = null;
		No n;

		// verifica se a lista esta vazia a partir do INICIO e se o valor do dado
		// apontado é
		// menor que o elemento
		for (n = inicio; n != null && n.getDado() < elemento; n = n.getProximo()) {
			anterior = n; // armazena o proximo em anterior

		}

		No novo = new No();
		novo.setDado(elemento); // add o elemento

		if (anterior == null) { // se o anterior for null
			novo.setProximo(inicio); // cria um novo inicio apontando para null
			inicio = novo; // inicio passa a apontar para o novo NO

		} else { // se não for null
			novo.setProximo(anterior.getProximo()); // add o menor elemento que foi encontrado
			anterior.setProximo(novo); //

		}
		
		tamanho++;

	}

	public void remover(int elemento) {

		No anterior = null;
		No n = inicio;

		while (n != null && n.getDado() != elemento) {
			anterior = n;
			n = n.getProximo();

		}

		if (n == null) {
			return;
		}

		if (anterior == null) {
			inicio = n.getProximo();

		} else {
			anterior.setProximo(n.getProximo());

		}

	}

	public No busca(int elemento) { // outro exemplo de busca

		for (No no = inicio; no != null; no = no.getProximo()) {

			if (elemento == no.getDado()) {// se o elemento for igual ao dado do nó
				return no; // encontrou o elemento
			}

		}
		return null;

	}
	
	
	
}
