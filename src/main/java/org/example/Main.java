public class Main {
    public static void main(String[] args) {
        Collar collarRojo = new Collar("Rojo", "acero inoxidable");
        Perro perro = new Perro("Rocky" +
                "" +
                "", collarRojo);
        Gato gato = new Gato("Misu");

        Consultorio consultorio1 = new Consultorio(21, "Cra14Sur N31a24");
        Veterinaria vet = new Veterinaria(consultorio1);

        perro.sonido();
        System.out.println("El collar de " + perro.getNombre() + " es: " + perro.getCollar());
        gato.sonido();
        vet.atender(perro);
        vet.atender(gato);

        Caja<Animal> cajaAnimales = new Caja<>();
        cajaAnimales.set(perro);
        Animal guardado1 = cajaAnimales.get();
        System.out.println("Objeto en la caja: " + guardado1.getClass().getSimpleName());
        guardado1.sonido();

        cajaAnimales.set(gato);
        Animal guardado2 = cajaAnimales.get();
        System.out.println("Objeto en la caja: " + guardado2.getClass().getSimpleName());
        guardado2.sonido();
        System.out.println("Rocky en la caja da la pata");
    }
}