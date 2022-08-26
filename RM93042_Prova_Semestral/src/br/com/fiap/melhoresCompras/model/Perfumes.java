package br.com.fiap.melhoresCompras.model;

public class Perfumes extends Produto {

	private int litragem; // definida em mililitros 
	private String aroma;

	
	public Perfumes() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	public Perfumes(int id, String nome, String marca, int estoque, double valor,int litragem , String aroma) {
		super(id, nome, marca, estoque, valor);
		this.litragem = litragem;
		this.aroma = aroma;
		
	}




	// Getters and Setters
	public int getLitragem() {
		return litragem;
	}

	public void setLitragem(int litragem) {
		this.litragem = litragem;
	}

	public String getAroma() {
		return aroma;
	}

	public void setAroma(String aroma) {
		this.aroma = aroma;
	}

	
	@Override
	public String toString() {
		return "Codigo: "+id +" - "+ nome ;
	}
}
