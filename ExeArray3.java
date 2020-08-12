package PacoteJavaExec;

import java.util.Scanner;

public class ExeArray3 {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int cont=0;
		
		Scanner entrada = new Scanner(System.in);
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0;coluna<3; coluna++) {
				System.out.println("Insira um número inteiro: ");
				matriz[linha][coluna] = entrada.nextInt();
			}
		}
		System.out.print(" \n \n");
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0;coluna<3; coluna++) {
				if(matriz[linha][coluna]>10) {
					System.out.print("  "+matriz[linha][coluna]+" ");
					cont++;
				}
		
				
	}
	}
		System.out.print(" Esses números são maiores que 10 e são num total de: "+cont);
	}
	}
