package br.edu.univas.main;

import java.util.Scanner;

public class startApp {
	public static void main(String[] args) {
		int [] notas = lerNotas();
		adicionarInt(notas);
		contandoAlunos(notas);
	}



	private static int[] lerNotas() {
		Scanner sc = new Scanner(System.in);
		int[] notas =  new int[20];
		for(int i=0; i <notas.length; i= i+2 ) {
			System.out.printf("Digite a nota: ");
			notas[i] = sc.nextInt();
		}
		
		sc.close();
		return notas;
	}
	private static void adicionarInt(int[] notas) {
		for(int i = 0; i<notas.length; i=i+2) {
			if(notas[i] >= 60) {
				notas[ i+1 ] = 1; 
			}else {
				notas[ i+1 ] = 0;
			}
		}
		
	}

	private static void contandoAlunos(int notas[]) {
		int cont = 0;
		for(int i = 1 ; i<notas.length  ; i=i+2) {
			
			if(notas[i]==1) {
				cont++;
			}
			
			
		}
		System.out.println("Os alunos que estão aprovados são:" + cont);	
	}


}