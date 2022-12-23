public class Coche {

    int capacidad;
    String color;
    String marca;
    int caballos;

    public Coche() {
    }

    public Coche(int capacidad, String color, String marca, int caballos) {
        this.capacidad = capacidad;
        this.color = color;
        this.marca = marca;
        this.caballos = caballos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "capacidad=" + capacidad +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", caballos=" + caballos +
                '}';
    }
}
