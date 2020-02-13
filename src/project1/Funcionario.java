package project1;

import java.util.ArrayList;
import java.util.Scanner;
	
public class Funcionario extends Departamento{
	

	public Funcionario(int codigo, String nome, int Codigo, String Nome) {
		super(codigo, nome, Codigo, Nome);
		// TODO Auto-generated constructor stub
	}

	private static int ID;
	
	public int Funcionario(int ID) {
		return this.ID = ID;
	}
	
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe o ID: ");
		setID(ler.nextInt());
		
		ArrayList<Integer> Funcionarios = new ArrayList<Integer>();
		
		Funcionarios.add(getID());
		
		 for (Integer obj : Funcionarios) {
	         System.out.println("ID = " + obj);
	      }
	}

	public static int getID() {
		return ID;
	}

	public static void setID(int iD) {
		ID = iD;
	}
}

	
		
		
		