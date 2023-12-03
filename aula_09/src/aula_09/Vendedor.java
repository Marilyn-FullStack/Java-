package aula_09;

public class Vendedor extends Fucionario{
	private float comissao;	
	public Vendedor(String nome, int cargo, float salario, float comissao) {
		super(nome, cargo, salario);
		this.comissao = comissao;
	}


	public float getComissao() {
		return comissao;
	}


	public void setComissao(float comissao) {
		this.comissao = comissao;
	}


	@Override
	public float calSalario() {
		return 0;
	}
	

}
