package Baraja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Baraja {
    //Atributos de cada carta//
    //Se hicieron arreglos de tipo String que almacenan los atributos que recibiran las cartas//

    private final String[] PALO = {"Treboles", "Picas", "Corazones", "Diamantes"};
    private final String[] COLOR = {"Rojo", "Negro"};
    private final String[] VALOR = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "11","12","13","14"};

/* Se creo la ArrayLIst que contiene los objectos, en este caso cartas.
* A la carta que ya habiamos creado en la clase Carta, se le asigna un palo, color y valor
* para posteriormente ser guardada en el ArrayList que almacenara todas las cartas
*
* Esto se hace mediante un bucle que crea las cartas dependiendo los atributos que requieran
* El primer bucle crea cartas negras como su indice lo indica, las cuales seran del tipo treboles y Picas
* ya que inicia en cero y va hasta 1 y en el arreglo estas dos posiciones corresponden a los treboles y las picas
* El segundo bucle creara las correspondeintes cartas rojas (Corazones y diamantes) */

    private ArrayList<Carta> deck;
    public Baraja(){
        deck = new ArrayList<Carta>();
        for(int palo = 0; palo < 2; palo++)
            for(int valor= 0; valor < VALOR.length; valor++)
                deck.add(new Carta(PALO[palo], COLOR[1],VALOR[valor] ));



        for(int palo = 2; palo < 4; palo++ )
            for(int valor= 0; valor < VALOR.length; valor++)
                deck.add(new Carta(PALO[palo],COLOR[0],VALOR[valor] ));


    }
    public int getSize(){
        return deck.size();
    }
    //Se creo el metodo que revuelve la baraja, esto mediante un Collections.shuffle//
    public void mezclarBaraja(){
        Collections.shuffle(deck);
        System.out.println("Se mezclo el deck");

    }
    /* Para el metodo de mostrar la primera carta simplemente se uso la funcion de la ArrayList que nos
    * permite conseguir cualquier posicion del arreglo. En este caso la primera carta  se encuentra en
    * la posicion 0
    * Ademas se removio esta misma carta y posteriormente esto se reflejo en el numero de cartas
    * restantes */

    public void MostrarPrimeraCarta(){
        System.out.println(deck.get(0));
        deck.remove(0);
        System.out.println("Quedan " + deck.size() + " cartas");

    }
    /* Para la carta seleccionada al azar, se genero un objeto random
    * que seleccionaria una carta de forma aleatoria y despues la removeria, indicandole el tamaño de
    * la baraja */
    public void SeleccionAlAZar() {
        Random random = new Random();
        System.out.println(deck.get(random.nextInt(deck.size())));
        deck.remove(random.nextInt(deck.size()));
        System.out.println("Quedan " + deck.size() + " cartas");
    }
    /*Para este ultimo metodo se creo un bucle que extraeria las primeras 5 cartas del arreglo, aquellas que van desde
    * 0 a 4 y a su vez se removerian para obtener un nuevo tamaño de la baraja */
    public void hand() {
        for(int i=0; i<=4; i++){
            System.out.println(deck.get(i));
        }
        for(int i=0; i<=4; i++){
            deck.remove(i);
        }
        System.out.println("Quedan " + deck.size()+ " cartas");
    }

}
