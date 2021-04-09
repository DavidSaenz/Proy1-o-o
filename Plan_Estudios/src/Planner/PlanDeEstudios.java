package Planner;

import java.util.*;
import java.io.*; 

public class PlanDeEstudios {



	//-----------------------------------------
	//Attributes

	String planSugerido;
	String requisitos;
	File source = new File ("docs/data cursos.txt");
	ArrayList<Curso> cursosCargados;  //TODO esta shit nos lamacena todos los cursos

	//-------------------------------------------------------------
	//methods

	public void guardarenTXT() {

	}


	public void cargarInfoBanner()  throws FileNotFoundException {

		try {
			Scanner fScn = new Scanner(source);
			String data;

			while( fScn.hasNextLine() ){
				data = fScn.nextLine();
				
				
				//Nombre materia; Código materia; prerrequisito; coreq; créditos; TipoDeCurso; Creditos;
				
				String[] token = data.split(";");
				
				
				
				 String inputNombre = token[0];
				
				//System.out.println(token[1]);

				 
				 
			 Curso c = new Curso(inputNombre, inputCod, inputPrereq, inputCoreq, inputCreditos, inputTipo, inputCreditos)
				cursosCargados.add(c);
			}
			fScn.close(); 
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args){         
		PlanDeEstudios consola = new PlanDeEstudios();   
		try{
			consola.cargarInfoBanner();   
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	} 



}
