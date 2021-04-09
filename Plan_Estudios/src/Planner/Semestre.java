package Planner;

import java.util.ArrayList;

public class Semestre {

	
	
	
	//-----------------------------------------
	//Attributes

	ArrayList<Curso> cursoInscrito;
	ArrayList<Curso> cursoAprobado; 
	String periodo;
	Boolean probacionAcademica;
	int creditosmax;
	double promedio;
	
	//-------------------------------------------------------------
	//methods
	
	
	
	public ArrayList<Curso>  darInscritos() {
		return cursoInscrito;
	}
	
	public ArrayList<Curso>  darAprobado() {
		return cursoAprobado;
	}
	
	public String darPeriodo() {
		return periodo;
	}
	
	public int darCreditosMax() {
		return creditosmax;
		
		//TODO revisar, el valor de creditos max no es estatico, depende del historico, esto hay que calcularlo somehow
		// implementar? calcualrCreditosMax()
	}
	
	public double darPromedio() {
		return promedio;
	}
	
	
}
