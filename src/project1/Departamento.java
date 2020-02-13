package project1;

import java.util.ArrayList;
import java.util.Scanner;

public class Departamento extends Empresa{

		private static int Codigo;
		private String Nome;
		
		public static void main (String [] args) {
			Scanner emp = new Scanner(System.in);
			System.out.printf("Informe o ID: ");
			Codigo = emp.nextInt();
			
			ArrayList<Integer> dep = new ArrayList<Integer>();
			
			dep.add(Codigo);
			
			 for (Integer obj : dep) {
		         System.out.println("ID = " + obj);
		      }
		}

		
		public Departamento(int codigo, String nome, int Codigo, String Nome) {
			this.Codigo = Codigo;
			this.Nome = Nome;
		}
		
		public int getCodigo() {
			return Codigo;
		}
		
		public void setCodigo(int Codigo) {
			Departamento.Codigo = Codigo;
		}
		
		public String getNome() {
			return Nome;
		}
		
		public void setNome(String Nome) {
			this.Nome = Nome;
		}
		
		}
		
