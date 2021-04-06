package Planner;

public class Curso {
	
	
	
	//-----------------------------------------
	//Attributes
	
	String ciclo;
	String nombre;
	String tipo;
	int crn;
	int codigo;
	int creditos;
	String horario;
	double nota;
	String restricciones;
	String coreq;
	String prereq;
	
	
	
	//-------------------------------------------------------------
	//methods
	
	
	
	public String darciclo() {
		return ciclo;
	}
	
	
	public int darCreditos() {
		return creditos;
	}
	
	public String darNombre() {
		return nombre;
	}
	
	public int darCRN() {
		return crn;
	}
	
	public int darCodigo() {
		return codigo;
	}
	
	public String darTipo() {
		return tipo;
	}
	
	public String darHorario() {
		return horario;
	}
	
	
	public double darNota(){
		return nota;
	}
	
	public String darPreRequ() {
		return  prereq;
	}

	public String darCoRequ() {
		return coreq;
	}
	
	public String darRestr() {
		return restricciones;
	}
	
}
