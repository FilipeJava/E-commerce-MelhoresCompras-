package br.com.fiap.melhoresCompras.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	
	private String cliente;
	
	private List<Produto> listProduto = new ArrayList<>();
	
	private String formapgto;
	private int quantidade; 

	



	public Pedido(String cliente, List<Produto> produto, String formapgto, int quantidade) {
		super();
		this.cliente = cliente;
		this.listProduto = produto;
		this.formapgto = formapgto;
		this.quantidade = quantidade;
	}



	public Pedido() {
		
	}

	
	public void addProduto(Produto produto) {
		
		listProduto.add(produto);
			
	}	
	
	
	//Setters and getters
	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}




	public List<Produto> getProduto() {
		return listProduto;
	}



	public void setProduto(List<Produto> produto) {
		this.listProduto = produto;
	}



	public String getFormapgto() {
		return formapgto;
	}


	public void setFormapgto(String formapgto) {
		this.formapgto = formapgto;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	

	
	
	
	
	

}






	
