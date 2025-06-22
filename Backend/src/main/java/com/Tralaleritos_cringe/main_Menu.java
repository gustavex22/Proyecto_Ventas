package com.Tralaleritos_cringe;

import java.util.Scanner;

public class main_Menu {
    public static void main(String[] args) {
        System.out.println("Welcome to the Tralaleritos Cringe Main Menu!");
        // Here you can add more functionality or methods to handle user input, etc.
        Menu_print();
    }

    public static void Menu_print(){
            Scanner sc = new Scanner(System.in);
			int Opcion = 0;
			System.out.println("--MENU INVENTARIO");
			System.out.println("""
					1.STOCKS
					2.VENTAS Y DEVOLUCIONES
					3.PEDIDOS
					""");
                    
            System.out.println("SELECCIONE UNA OPCION:");
            Opcion = sc.nextInt();

					switch (Opcion) {
						case 1:
							System.out.println("Selecciono STOCKS");
							break;
						case 2:
							System.out.println("Selecciono VENTAS Y DEVOLUCIONES");
							break;
						case 3:
							System.out.println("Selecciono PEDIDOS");
							break;
						default:
							System.out.println("Elija una Opcion Valida");
							break;
					}
		}
}
