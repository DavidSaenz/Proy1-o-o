package Planner;

import java.util.*;
import java.io.*; 

public class PlanDeEstudios {



	//-----------------------------------------
	//Attributes

	String planSugerido;
	String requisitos;
	File source = new File ("docs/data cursos.txt");

	//-------------------------------------------------------------
	//methods

	public void guardarenTXT() {

	}


	public void cargarInfoBanner() {

	}

	public void escaneardoc() throws FileNotFoundException {

		try {
			Scanner fScn = new Scanner(source);
			String data;

			while( fScn.hasNextLine() ){
				data = fScn.nextLine();

				String[] token = data.split(";");
				// NUM_BUZONES_P = Integer.parseInt(token[0]);
				System.out.println(token[1]);

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
			consola.escaneardoc();   
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	} 



}
