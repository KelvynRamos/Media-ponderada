package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		float notaA = sc.nextFloat();
		float notaB = sc.nextFloat();
		float notaC = sc.nextFloat();

		float mediaPonderada = (notaA * 2 + notaB * 3 + notaC * 5) / (2 + 3 + 5);

		System.out.println("MEDIA = " + mediaPonderada);

		sc.close();

	}

}
