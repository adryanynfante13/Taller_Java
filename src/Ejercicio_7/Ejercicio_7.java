package Ejercicio_7;

//Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
// si no lo es lo volverá a pedir (do while), después muestra ese número por consola.

import java.util.Scanner;

public class Ejercicio_7 {
    Scanner sc = new Scanner(System.in);
    int number;

    public void Practica_7() {
        do {
            System.out.println("Please, input your number: ");
            number = sc.nextInt();
            if (number >= 0) {
                System.out.println("Number is: " + number);
            }
        } while (number<0);
    }
}
