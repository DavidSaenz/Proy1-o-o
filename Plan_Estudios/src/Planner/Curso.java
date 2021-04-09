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


	//int crn;
	//int periodo;
	//String horario;
	
	double nota=0.0;





	//-------------------------------------------------------------
	//methods



	public Curso(String pNombre, String pCodigo, String pPre, String pCoreq, String pTipo, String pCiclo, int pCreditos ) {


		nombre= pNombre;
		codigo= pCodigo;
		prereq = pPre;
		coreq= pCoreq;
		tipo= pTipo;
		ciclo = pCiclo;
		creditos = pCreditos;
	}
	
	
	
	
	
	public void cambiarNota(double pNota) {
		
		this.nota= pNota;
	}
	
	
	
	
	//---------------------------------------------------------------------------------------------

	public String darciclo() {
		return ciclo;
	}


	public int darCreditos() {
		return creditos;
	}

	public String darNombre() {
		return nombre;
	}

//	public int darCRN() {
//		return crn	}

	public String darCodigo() {
		return codigo;
	}

	public String darTipo() {
		return tipo;
	}

	//public String darHorario() {
	//	return horario;	}


	public double darNota(){
		return nota;
	}

	public String darPreRequ() {
		return  prereq;
	}

	public String darCoRequ() {
		return coreq;
	}

//	public int darPeriodo() {
//		return periodo;	}

}
