package tareaDiagramas;

import java.util.Scanner;

public class Divisi�n {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Por favor ingrese dos n�meros: ");
		Scanner teclado = new Scanner(System.in);
		int A = teclado.nextInt();
		int B = teclado.nextInt();
		
		if(B == 0) {
			System.out.println("No es posible realizar la divisi�n.");
		} else {
			int D = A/B;
			System.out.println("La divis�n es: " + D);
		}
	}

}
