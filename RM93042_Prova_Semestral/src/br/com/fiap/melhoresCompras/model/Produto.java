package br.com.fiap.melhoresCompras.model;

public class Produto {

	protected int id;
	protected String nome;
	private String marca;
	private int estoque;
	private double valor;

	// Costrutor classe Pai Produto

	
	public Produto(int id,String nome, String marca, int estoque, double valor) {
		
		this.id=id;
		this.nome = nome;
		this.marca = marca;
		this.estoque = estoque;
		this.valor = valor;
	}


	public Produto() {
		
	}
	

	//Getters and Setters
	
	

	public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}


	public int getEstoque() {
		return estoque;
	}


	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
	
	

}
