package project1;

import java.util.ArrayList;
import java.util.Scanner;

public class Endereço extends Funcionario {
	
		public Endereço(int codigo, String nome, int Codigo, String Nome) {
		super(codigo, nome, Codigo, Nome);
		// TODO Auto-generated constructor stub
	}
		private String endereco;
		private int numero;
		private static Scanner end;
		
		public static void main (String [] args) {
			end = new Scanner(System.in);
			System.out.printf("Informe o ID: ");
			setID(end.nextInt());
			
			ArrayList<Integer> Endereço = new ArrayList<Integer>();
			
			Endereço.add(getID());
			
			 for (Integer obj : Endereço) {
		         System.out.println("ID = " + obj);
		      }
		}
		
		
			public String getEndereco() {
				return endereco;
			}
			public void setEndereco(String endereco) {
				this.endereco = endereco;
			}
			public int getNumero() {
				return numero;
			}
			public void setNumero(int numero) {
				this.numero = numero;
			}
	}

