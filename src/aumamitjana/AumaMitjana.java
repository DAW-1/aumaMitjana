package aumamitjana;

import java.util.Scanner;

/**
 *
 * @author xavi_Banús
 */
public class AumaMitjana {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introdueix seguidament quatre enters per calcular la seva suma i la mitjana aritmètica: ");
        int primer = lector.nextInt();
        int segon = lector.nextInt();
        int tercer = lector.nextInt();
        int quart = lector.nextInt();
        System.out.println("suma: " + (primer + segon + tercer + quart));
        int suma = (primer + segon + tercer + quart);
        System.out.println("Mitjana arimètica: " + suma / 4);

    }

}
