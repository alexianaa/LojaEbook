package model;

public class Venda {
	private String formaPagamento;

	public Venda(String fp, double p) {
		this.formaPagamento = fp;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

}
