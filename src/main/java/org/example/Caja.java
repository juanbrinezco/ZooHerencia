public class Caja<T> {
    private T objeto;

    public Caja() {
        this.objeto = null;
    }

    public Caja(T objeto) {
        this.objeto = objeto;
    }

    public void set(T objeto) {
        this.objeto = objeto;
    }

    public T get() {
        return objeto;
    }
}
