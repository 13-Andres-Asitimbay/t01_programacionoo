package tareaDiagramas;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Por favor ingrese dos n�meros: ");
		Scanner teclado = new Scanner(System.in);
		int A = teclado.nextInt();
		int B = teclado.nextInt();
		int M = A % B;
		
		if(M == 0) {
			System.out.println(A + " es m�ltiplo de " + B);
		} else {
			System.out.println(A + " no es m�ltiplo de " + B);
		}
	}

}
