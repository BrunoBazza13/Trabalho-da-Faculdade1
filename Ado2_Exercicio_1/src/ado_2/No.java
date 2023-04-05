package ado_2;

public class No {

	private int dado;
	private No proximo;
	
	
	public int getDado() { // retorna o valor de dentro do no
		return dado;
	}
	public void setDado(int dado) { // seta o valor do no
		this.dado = dado;
	}
	public No getProximo() { // retorna o obj do tipo no
		return proximo;
	}
	public void setProximo(No proximo) { //  recebe o proximo obj do tipo no
		this.proximo = proximo;
	}
	
	
	
}
