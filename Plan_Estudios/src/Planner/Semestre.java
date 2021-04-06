package Planner;

public class Semestre {

	
	
	
	//-----------------------------------------
	//Attributes

	Curso cursoInscrito;
	Curso cursoAprobado; //TODO revisar, puede que esto toque modelar como contenedores
	String periodo;
	Boolean probacionAcademica;
	int creditosmax;
	double promedio;
	
	//-------------------------------------------------------------
	//methods
	
	
	
	public Curso darInscritos() {
		return cursoInscrito;
	}
	
	public Curso darAprobado() {
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
