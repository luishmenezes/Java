public class Gato extends AnimalDomestico {

    public Gato(String race, String name) {
        super(race, name);
    };

    @Override
    public void emitirSom() {
        System.out.println("miau");
    }
}
