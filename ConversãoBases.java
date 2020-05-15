package Programas_Gracy;

import java.util.Scanner;

public class Convers�oBases {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("O seu n�mero �: ");
		System.out.println("1- Bin�rio");
		System.out.println("2- Decimal");
		System.out.println("3- Octal");
		System.out.println("4- Hexadecimal");
		int opEntrada = leia.nextInt();

		System.out.println("Voc� quer converter para: ");
		System.out.println("1- Bin�rio");
		System.out.println("2- Decimal");
		System.out.println("3- Octal");
		System.out.println("4- Hexadecimal");
		int opSaida = leia.nextInt();

		int potencia = 0, somaDecimal = 0, naoBinario = 0;
		if (opEntrada == opSaida) {
			System.out.println("A convers�o deve ser entre bases diferentes!");
		} else {

			System.out.print("Informe o n�mero: ");
			String numEntrada = leia.next();

			if (opEntrada == 1) {
				
				//TESTANDO SE O N�MERO � BIN�RIO
				for (int j = 1; j <= numEntrada.length() - 1; j++) {

					naoBinario = 0;
					if (Character.getNumericValue(numEntrada.charAt(j)) == 0
							|| Character.getNumericValue(numEntrada.charAt(j)) == 1) {
						naoBinario = 1;
					}
				} // for

				if (naoBinario == 1) {

					switch (opSaida) {
					case 2:
						for (int i = numEntrada.length() - 1; i >= 0; i--) {
							somaDecimal += Math.pow(2, potencia) * Character.getNumericValue(numEntrada.charAt(i));

							potencia++;
						}
						System.out.println("O n�mero digitado equivale a " + somaDecimal + " em decimal");
						break;
					case 3:
						for (int i = numEntrada.length() - 1; i >= 0; i--) {
							somaDecimal += Math.pow(2, potencia) * Character.getNumericValue(numEntrada.charAt(i));

							potencia++;
						}
						System.out.println(
								"O n�mero digitado equivale a " + Integer.toOctalString(somaDecimal) + " em octal");
						break;
					case 4:
						for (int i = numEntrada.length() - 1; i >= 0; i--) {
							somaDecimal += Math.pow(2, potencia) * Character.getNumericValue(numEntrada.charAt(i));

							potencia++;
						}
						System.out.println(
								"O n�mero digitado equivale a " + Integer.toHexString(somaDecimal) + " em hexadecimal");
						break;
					}
				} else {
					System.out.println("O n�mero digitado n�o � bin�rio!");
				}

			}
			if (opEntrada == 2) {
				try {
					int numEntradaDec = Integer.parseInt(numEntrada);

					switch (opSaida) {

					case 1:
						System.out.println(
								"O n�mero digitado equivale a " + Integer.toBinaryString(numEntradaDec) + " em bin�rio");
						break;

					case 3:
						System.out.println(
								"O n�mero digitado equivale a " + Integer.toOctalString(numEntradaDec) + " em Octal");
						break;

					case 4:
						System.out.println(
								"O n�mero digitado equivale a " + Integer.toHexString(numEntradaDec) + " em hexadecimal");
						break;
					}
				}catch(NumberFormatException e){
					System.out.println("N�o � um n�mero decimal!");
			}
				
			}

			if (opEntrada == 3) {

				try {
					int numEntradaOct = Integer.parseInt(numEntrada, 8);

					switch (opSaida) {

					case 1:
						System.out.println(
								"O n�mero digitado equivale a " + Integer.toBinaryString(numEntradaOct) + " em bin�rio");
						break;

					case 2:
						System.out.println("O n�mero digitado equivale a " + numEntradaOct + " em decimal");
						break;

					case 4:
						System.out.println(
								"O n�mero digitado equivale a " + Integer.toHexString(numEntradaOct) + " em hexadecimal");
						break;
					}
				}catch(NumberFormatException e){
					System.out.println("N�o � um n�mero octal!");
			}
				

			}

			if (opEntrada == 4) {    
				try{
					int numEntradaHex = Integer.parseInt(numEntrada, 16);

					switch (opSaida) {

					case 1:
						System.out.println(
								"O n�mero digitado equivale a " + Integer.toBinaryString(numEntradaHex) + " em bin�rio");
						break;

					case 2:
						System.out.println("O n�mero digitado equivale a " + numEntradaHex + " em decimal");
						break;

					case 3:
						System.out.println(
								"O n�mero digitado equivale a " + Integer.toOctalString(numEntradaHex) + " em Octal");
						break;

					}
						
						
				}catch(NumberFormatException e){
						System.out.println("N�o � um n�mero hexadecimal!");
				}
				
				
			}

		}

	}

}
