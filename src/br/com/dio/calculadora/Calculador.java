package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		 int soma = soma(a, b);
		 int sub = sub(a, b);
		 int mult = mult(a, b);
		 double div = div(a, b);
		 
		 System.out.println(soma);
		 System.out.println(sub);
		 System.out.println(mult);
		 System.out.println(div);
	}

	public static int soma(int a, int b) {
		return a+b;
	}
	
	public static int sub(int a, int b) {
		return a-b;
	}
	
	public static int mult(int a, int b) {
		return a*b;
	}
	
	public static double div(int a, int b) {
		return a/b;
	}
	
}
