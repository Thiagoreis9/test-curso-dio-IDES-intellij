package com.dio;

import com.dio.model.Gato;

public class PrimeroPrograma {

	public static void main(String[] args) {

		Gato gato = new Gato("nora","branco",5);
		Livros livros = new Livros("Biblia",2001);
		
		System.out.println(gato);
		System.out.println(livros);
	}
}
	
class Livros{
	public String nome;
	public Integer ano;
	
	public Livros(String nome, Integer ano) {
		this.nome = nome;
		this.ano = ano;
	}
	
}
	

