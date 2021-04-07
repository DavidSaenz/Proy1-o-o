package Planner;

import java.util.*;

public class Curso {
	
	
	
	//-----------------------------------------
	//Attributes
	
	String nombre;
	String codigo;
	String prereq;
	String coreq;
	int creditos;
	String tipo;
	String ciclo;
	
	
	int crn;
	int periodo;
	
	String horario;
	double nota;
	String restricciones;
	
	
	
	
	
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
	
	public String darCodigo() {
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
	
	public int darPeriodo() {
		return periodo;
	}
	
}
