import Baraja.Baraja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Baraja mazo = new Baraja();
        int entrada = 0;

        System.out.println("Mazo construido. Cantidad de cartas: " + mazo.getSize());
        System.out.println("Selecciona una accion a ejecutar");
        System.out.println("Presiona 1 para mezclar baraja");
        System.out.println("Presiona 2 para mostrar la primera carta");
        System.out.println("Presiona 3 para seleccionar una carta al azar");
        System.out.println("Presiona 4 para tomar una mano de 4 cartas");

      do{
         entrada = parseInt(read.readLine());
        switch (entrada) {
            case 1:
                mazo.mezclarBaraja();
                mostrarMenu();
                break;
            case 2:
                mazo.MostrarPrimeraCarta();
                mostrarMenu();
                break;
            case 3:
                mazo.SeleccionAlAZar();
                mostrarMenu();
                break;
            case 4:
                mazo.hand();
                mostrarMenu();
                break;
          }
        }while(entrada < 5);

    }


    public static void mostrarMenu(){
            System.out.println("Presiona 1 para mezclar baraja");
            System.out.println("Presiona 2 para mostrar la primera carta");
            System.out.println("Presiona 3 para seleccionar una carta al azar");
            System.out.println("Presiona 4 para tomar una mano de 4 cartas");
}
}