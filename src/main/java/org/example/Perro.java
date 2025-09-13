public class Perro extends Animal {
    private Collar collar;

    public Perro(String nombre, Collar collar) {
        super(nombre);
        this.collar = collar;
    }

    public void sonido() {
        System.out.println(nombre + " dice: Guau Guau");
    }

    public Collar getCollar() {
        return collar;
    }

    public void setCollar(Collar collar) {
        this.collar = collar;
    }
}