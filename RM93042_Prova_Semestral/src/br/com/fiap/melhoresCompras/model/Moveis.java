package br.com.fiap.melhoresCompras.model;

public class Moveis extends Produto {
	
	
	private String material; 
	private double peso;
	
	
	


	
		
	public Moveis() {
		
	}

	

	public Moveis(int id, String nome, String marca, int estoque, double valor,String material , double peso) {
		super(id, nome, marca, estoque, valor);
		this.material = material;
		this.peso=peso;
	}



	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	@Override
	public String toString() {
		return "Codigo: "+id +" - "+ nome ;
	}
	
	
	
	
	
	
	
}
