package Planner;

import java.util.*;

public class Estudiantes {

	
	
	
	//-----------------------------------------
	//Attributes
	
	String nombre;
	String login;
	int codigo;
	ArrayList<Curso> cursosInscritos;
	ArrayList<Semestre> historicoSemestres;
	Boolean candidatoAGrado;
	double pormedioAcumulado;
	ArrayList<Plan> planes;
	
	
	
	//-------------------------------------------------------------
	//methods
	
	public void validarCandidatoAGrado(){

		//TODO
	}
	
	
	public void darPromedioAcumulado() {
		//TODO
	}
	
	public void crearPlan() {
		//TODO
	}
	
	
	public void modificarPlan() {
		//TODO
	}
	
	
	
	
	//----------------------------------------------------------------
	public String darNombre() {
		return nombre;
	}
	
	public String darLogin() {
		return login;
	}
	
	public int darCodigo() {
		return codigo;
	}
	
	public ArrayList<Curso> darCursosInscritos(){
		return cursosInscritos;
	}
	
	public ArrayList<Semestre> darHistoricoSemestres(){
		return historicoSemestres;
	}
	
}
