class Veterinaria {
    private Consultorio consultorio;

    public Veterinaria(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public void atender(Animal animal) {
        System.out.println("Atendiendo en consultorio " + consultorio.getNumero() + " a: " + animal.getNombre());
        animal.sonido();
    }
}
