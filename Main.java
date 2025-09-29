//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        System.out.println(" Bienvenidos a la aventura de la  gran araña viajera!");
        System.out.println(" ¿cual es tu nombre?");
        String nombre = entrada.nextLine();
        System.out.println(" bienvenid@ " + nombre);
        System.out.println(" tu aventura comienza");
        System.out.println(" buena suerte " + nombre);
        int recorrido = 0;
        boolean sobrevivio = true;
        int recorrido2 =recorrido +3;
        int recorrido3 = recorrido2 +2;
        System.out.println(nombre + " abre sus ocho ojos en un pliege de la cortina a la altura del techo ");
        System.out.println(nombre + " mira hacia los lados pensando que hacer");
        //decision1//
        System.out.println(nombre + "1. se mueve hacia la derecha " + recorrido + "metros");
        System.out.println(nombre + "2. se descuelga por la cortina hasta el suelo");
        System.out.println(nombre + "3. no hace nada");
        System.out.println("escoje una de ellas");


        int decision1 = entrada.nextInt();
        if (decision1 == 1) {
            recorrido += 4;
            System.out.println(nombre + "sigue avanzando");
        } else if (decision1 == 2) {
            recorrido += 2;
            System.out.println(nombre + "baja hasta el suelo");
        } else {
            recorrido += 0;
            System.out.println(nombre + "vaguea y no hace nada");
        }


        //decision 2//

        int decision2 = entrada.nextInt();
        recorrido1
        if (decision2 == 1) {
            System.out.println(nombre + "llega hacia el proyector");
        } else if (decision2 == 2) {
            System.out.println(nombre + "se mete en la mochila de un alumno");
        }
        else
            System.out.println(nombre + ""


    }
}

