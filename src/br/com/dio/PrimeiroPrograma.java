package br.com.dio;

import br.com.dio.model.Pessoa;

public class PrimeiroPrograma {
	
	public static void main(String[] args) {
		
		//criando um objeto de uma classe
		Pessoa pessoa = new Pessoa();
		Livros livros = new Livros();
		
		System.out.println(pessoa);
		
		System.out.println(livros);
	}
}
class Livros {
	private String nome;
	private String npag;
	
	
}