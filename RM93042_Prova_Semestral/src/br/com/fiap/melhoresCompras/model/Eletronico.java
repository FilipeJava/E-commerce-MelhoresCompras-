package br.com.fiap.melhoresCompras.model;

public class Eletronico extends Produto {

	private String tipo;

	

	public Eletronico(int id, String nome, String marca, int estoque, double valor) {
		super(id, nome, marca, estoque, valor);
		// TODO Auto-generated constructor stub
	}

	public Eletronico() {

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Codigo: "+id +" - "+ nome ;
	}

}
