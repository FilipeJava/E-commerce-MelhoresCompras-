package br.com.br.fiap.melhoresCompras.view;


import java.util.ArrayList;
import java.util.List;

// Projeto de e-commerce simples


import java.util.Scanner;

import br.com.fiap.melhoresCompras.model.Eletronico;
import br.com.fiap.melhoresCompras.model.Eletroportateis;
import br.com.fiap.melhoresCompras.model.Moveis;
import br.com.fiap.melhoresCompras.model.Pedido;
import br.com.fiap.melhoresCompras.model.Perfumes;
import br.com.fiap.melhoresCompras.model.Produto;

public class Play {

	public static void main(String[] args) {

		
	// Lista de Produtos que serão Ofertados	
	List <Produto> prodList  = new ArrayList<>();
	Scanner entrada = new Scanner(System.in);
	entrada.useDelimiter("[\r\n]+");
		
	int continuaCadastro=1;
	// Criação dos Produtos que serão ofertados no site Melhores compras
	
	do {
		
		System.out.println("Digite a Categoria(ID) de produto que voce quer criar:");
		System.out.println("1-Eletronico\n2-Eletroportatil\n3-Movel\n4-Perfume");
		int id=entrada.nextInt();
		
		switch (id) {
		case 1:
			Produto eletronico = new Eletronico(1454,"IPAD", "Apple", 10, 3500.00);
			prodList.add(eletronico);
			break;
		case 2:
			Eletroportateis eletroportatil = new Eletroportateis(2454,"Cafeteira Nesspresso", "Arno", 50,350.00,"Cozinha" ,"110V");
			prodList.add(eletroportatil);
			break;
		case 3:
			Moveis movel = new Moveis(3452,"Cama Queen Size","Castor",5,2220.20,"Madeira/algodao",30);
			prodList.add(movel);
			break;
		case 4:
			Perfumes perfume = new Perfumes(4545,"Sauvage","DIOR",15,349.50,50,"amadeirado");
			prodList.add(perfume);
			break;
		default:
			break;
		}
		
		System.out.println("Deseja incluir mais itens para Oferta : 1-sim ou 0-não");
		continuaCadastro=entrada.nextInt();
		
	} while (continuaCadastro==1);
	
			
	System.out.println("---------------Bem vindo as Melhores Compras--------------------------------------------------------");
	System.out.println("Digite seu nome para Comecar:");
	String cliente= entrada.next();
	System.out.println("=========================ESTAS S�O AS OFERTAS QUE SEPARAMOS PARA VOCE "+ cliente.toUpperCase()+" ======================================================");
						for (Produto produto : prodList) {
							System.out.println(produto);
						}
	System.out.println("-----------------------------------------------------------------------------------------------------");

	



entrada.close();
	
	
	
	
	}//main

	 
	

	
	

}//class
