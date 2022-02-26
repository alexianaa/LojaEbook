import java.util.Date;

public class Editora extends Entidade {
	private int cnpj;
	private Date dataAfiliação;
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public Date getDataAfiliação() {
		return dataAfiliação;
	}
	public void setDataAfiliação(Date dataAfiliação) {
		this.dataAfiliação = dataAfiliação;
	}
}
