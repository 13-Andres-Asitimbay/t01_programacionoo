package t01_programacionoo;

public class Persona {
	
	//Encapsulaci�n
	private String nombre;
	private String apellido;
	
	//Abstracci�n
	void comer(String dia, String hora) {
		int cantidad = 4;
		String valor = dia + hora;
	}
	
	//Polimorfismo
	void comer(String noche) {
		int cantidad = 2;
	}
	
	//Herencia

}
