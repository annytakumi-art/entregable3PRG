package aplicacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjercicioArrayList {
	//Declarando el arrayList e  iniciandolo
	ArrayList<String> alumnos = new ArrayList<>(List.of("Sakura", "Naruto", "Sasuke", "Shikamaru", "Ino"));
	
	
	public void mostrarNombres() {
		
		System.out.println("Mostrando nombres de los alumnos: \n");
		
		for(int i = 0; i < alumnos.size(); i++) {
			
			System.out.println(i + ". " + alumnos.get(i));
		}System.out.println("\n");
		 
		
		
	}public void ordenarAlfabeticamente() {
		
		Collections.sort(alumnos);
		System.out.println("Ordenando lista alfabéticamente: \n");
		
		mostrarNombres();			
	}
		
	public void añadirNuevoNombre() {
		
		alumnos.add("Hinata");
		
		System.out.println("Añadiendo nuevo alumno: \n");
		
		mostrarNombres();
	}
	public void mostrarNombrePosicionConcreta() {
		
		System.out.println("Mostrando al alumno de la posición 3: \n");
		
		System.out.println("3. " + alumnos.get(3));
	    
	    System.out.println("\n");
	    
	
	}
	public void modificarNombrePosicion() {
		
		System.out.println("Modificando alumno de la posición 2: \n");
		alumnos.set(2, "Gaara");
		
		mostrarNombres();
		
	}
	public void eliminandoNombreAlumno() {
		
		alumnos.remove(3);
		
		System.out.println("Eliminando alumno de la posición 3: \n");
		
		mostrarNombres();
		
	}
}
