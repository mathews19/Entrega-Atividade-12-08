package PacoteJavaExec;

import java.util.Scanner;

public class ExeArray22 {

	public static void main(String[] args) {
		int somap=0,somai=0, i=0;
		int[] num = new int[6];
		int[] par= new int[6] ;
		int[] impar= new int[6];
		Scanner entrada = new Scanner(System.in);
		for(i = 0;i<6;i++) {
			System.out.print("Entre com um número: ");
			
			num[i]= entrada.nextInt();
			
		}
		for( i=0;i<6;i++) {
			
			if(num[i]%2==0) {
				par[i] = num[i];
				somap= somap + par[i];
				System.out.print(" "+par[i]);
				
			}
			}
			System.out.print(" --> Esse(s) número(s) é/são par(es): \n");
			System.out.printf("\n E a soma é de: "+somap+"\n");
		
			for(int i1=0;i1<6;i1++){
				if(num[i1]%2!=0) {
				impar[i1] = num[i1];
				somai= somai + impar[i1];
				System.out.print(" "+impar[i1]);				
		}
		}
				System.out.print(" --> Esse(s) número(s) é/são ímpar(es): \n");
				System.out.printf("\n E a soma é de: "+somai);
		
			}
		}
	


