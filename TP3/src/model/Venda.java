package model;

public class Venda {
	private String formaPagamento;
	private double valorTotal;

	/**
	 * Cria uma venda
	 * 
	 * @param fp - forma de pagamento
	 * @param p  - valor total
	 */
	public Venda(String fp, double p) {
		this.formaPagamento = fp;
		this.valorTotal = p;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

}
