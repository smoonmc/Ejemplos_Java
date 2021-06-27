package com.codewithmosh;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		System.out.println("Ejemplo de Matriz en java!");
		int[] numbers = {2, 1, 4, 3, 9};
		System.out.println(numbers.length); //saber el largo;
		Arrays.sort(numbers);//Ordenar
		System.out.println(Arrays.toString(numbers));

		System.out.println("-------------------------------------");
		System.out.println("Ejemplo de matriz multidimensional!");
		int[][] numbers2 = {{1, 2, 3}, {4, 5, 6}}; //se inicializa
		numbers2[0][0] = 1;
		System.out.println(Arrays.deepToString(numbers2));

		System.out.println("-------------------------------------");
		System.out.println("Ejemplo de declaración de Constantes!");
		final float pi = 3.14F; // así se declara la constante
		System.out.println(pi);

		System.out.println("-------------------------------------");
		System.out.println("Ejemplo operadores Aritméticos!");
		int result = 10 + 3;
		System.out.println("El resultado de la suma es:" + result);

		double result2 = (double) 10 / (double) 3;
		System.out.println("El resultado de la division es:" + result2);

		int x = 1;
		x += x;
		System.out.println("El valor de incremento es:" + x);

		System.out.println("-------------------------------------");
		System.out.println("Ejemplo de castear!");
		String a = "1";
		int b = Integer.parseInt(a) + 2;
		System.out.println("Valor casteado de String a Int es:" + b);

		String c = "1.1";
		Double d = Double.parseDouble(c) + 2;
		System.out.println("Valor casteado de String a Double es:" + d);

		System.out.println("-------------------------------------");
		System.out.println("Ejemplo Currency!");
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String resultado = currency.format(1234567.891);
		System.out.println("Formato Moneda:" + resultado);

		System.out.println("Ejemplo Porcentaje!");
		NumberFormat porcentaje = NumberFormat.getPercentInstance();
		String resultado2 = porcentaje.format(0.1);
		System.out.println("Formato Porcentaje:" + resultado2);

		System.out.println("-------------------------------------");
		System.out.println("Ejemplo Leer entrada de un usuario");

		Scanner scanner = new Scanner(System.in); //Entrada desde terminar windows
		System.out.print("Ingrese su edad:");
		byte age = scanner.nextByte();
		System.out.println("You are:" + age);

		Scanner scanner2 = new Scanner(System.in); //Entrada desde terminar windows
		System.out.print("Ingrese su nombre:");
		String name = scanner2.nextLine().trim();
		System.out.println("You are:" + name);

		System.out.println("-------------------------------------");
		System.out.println("Ejemplo Operador Ternario");
		int income = 120_000;
		String className = income > 100_000? "First" : "Economy";
		System.out.println(className);

		System.out.println("-------------------------------------");
		System.out.println("Ejemplo operador SWITCH");
		String role = "admin";

		switch (role){
			case "admin":
				System.out.println("Eres Administrador");
				break;
			case "moderator":
				System.out.println("Eres Moderador");
				break;
			default:
				System.out.println("Eres Invitado");

		}

		System.out.println("-------------------------------------");
		System.out.println("Ejemplo operador FOR");

        for (int i=0; i<5; i++){
			System.out.println("Hola Mundo!!");
		}

		System.out.println("-------------------------------------");
		System.out.println("Ejemplo operador WHILE");
		int i=5;
		while (i>0){
			System.out.println("Hola Mundo en while!!"+i);
			i--;
		}
		System.out.println("Otro ejemplo con WHILE");
		Scanner scanner3 = new Scanner(System.in);
		String input= "";
		while (!input.equals("quit")){
			System.out.println("Input: ");
			input = scanner3.next().toLowerCase();
			System.out.println(input);
		}
		//Una forma profesionar de hacer, seria la siguiente:
		while (true){
			System.out.println("Input: ");
			input = scanner3.next().toLowerCase();
			if (input.equals("pass"))
				continue;
			if (input.equals("quit"))
				break;
			System.out.println(input);
		}


		System.out.println("-------------------------------------");
		System.out.println("Ejemplo operador DO-WHILE - NO es frecuente el uso");

		do{
			System.out.println("Input: ");
			input = scanner3.next().toLowerCase();
			System.out.println(input);

		}while (!input.equals("quit"));


		System.out.println("-------------------------------------");
		System.out.println("Ejemplo operador FOR-EACH-LOOP");
		String[] fruits = {"Apple", "Mango", "Orange"};

		//Ejemplo con For
		for (int h = 0; h < fruits.length; h++)
			System.out.println(fruits[h]);

		//for-each
		for (String fruit:fruits)
			System.out.println(fruit);

	}
}





