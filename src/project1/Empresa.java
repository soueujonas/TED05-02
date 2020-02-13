package project1;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {

			private static int CNPJ;
			private static Scanner emp;
			
			public static void main (String [] args) {
				emp = new Scanner(System.in);
				System.out.printf("Informe o CNPJ da Empresa: ");
				setCNPJ((char) emp.nextInt());
				
				ArrayList<Integer> empresa = new ArrayList<Integer>();
				
				empresa.add((int) getCNPJ());
				
				 for (Integer obj : empresa) {
			         System.out.println("CNPJ da Empresa= " + obj);
			      }
			}
			
			public Empresa() {
				
			}
			
			public Empresa(char CNPJ, String nome, String Nome) {
				Empresa.CNPJ= CNPJ;
				
			}

			public static int getCNPJ() {
				return CNPJ;
			}

			public static void setCNPJ(int cNPJ) {
				CNPJ = cNPJ;
			}
			
}