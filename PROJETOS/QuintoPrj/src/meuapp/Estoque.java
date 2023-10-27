package meuapp;

public class Estoque {
	private int codProduto;
	private int qtdeEstoque;

	public Estoque() {
	}

	public Estoque(int codProduto, int qtdeEstoque) {
		super();
		this.codProduto = codProduto;
		this.qtdeEstoque = qtdeEstoque;
	}

	public void decrementaEstoque(int qtde) throws EIException {
		if (qtdeEstoque >= qtde)
			qtdeEstoque = qtdeEstoque - qtde;
		else
			throw new EIException(codProduto, qtdeEstoque);
	}
}