package Baraja;

public class Carta {
// Se creo la carta con los 3 atributos siguientes://
    private String palo;
    private String color;
    private int valor;

// Se creo el constructor que recibiria los atributos especificos de las cartas a almacenar en la baraja//
    public Carta (String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = Integer.parseInt(valor);
    }
    // Muestra los atributos de cada carta que se almacena en la baraja//
    public String toString(){
        return "Palo: " + palo + " | " + "Color " + color + " | " + "Valor " +valor;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
