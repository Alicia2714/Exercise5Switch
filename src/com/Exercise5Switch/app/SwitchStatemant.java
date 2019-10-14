package com.Exercise5Switch.app;

import java.util.Scanner;

public class SwitchStatemant {

	public static void main(String[] args) {
		
		//Declaracion de variables
		int nMes=0;
		char answer= 'y';
		//Declaracion de objetos
		Scanner input= new Scanner(System.in);
		
		
		
		//Input data validation
		
		do {
			int nMes=0;
			while (nMes<=0 || nMes>12){
				System.out.println("Dame el numero del mes");
				nMes= input.nextInt();
				
				if(nMes<=0){
					System.out.println("Valor no valido");
				}
				
				if(nMes>12) {
					System.out.println("Valor no valido");
				}	
			}
			
			switch (nMes){
			case 1: System.out.print("El mes es Enero");
			break;
			case 2: System.out.print("El mes es Febrero");
			break;
			case 3: System.out.print("El mes es Marzo");
			break;
			case 4: System.out.print("El mes es Abril");
			break;
			case 5: System.out.print("El mes es Mayo");
			break;
			case 6: System.out.print("El mes es Junio");
			break;
			case 7: System.out.print("El mes es Julio");
			break;
			case 8: System.out.print("El mes es Agosto");
			break;
			case 9: System.out.print("El mes es Septiembre");
			break;
			case 10: System.out.print("El mes es Octubre");
			break;
			case 11: System.out.print("El mes es Noviembre");
			break;
			case 12: System.out.print("El mes es Diciembre");
			break;
			
			}
			
			System.out.println("Do you want to visualize another month?");
			answer= input.next();
		}while(answer=y);
		
		

	}

}
