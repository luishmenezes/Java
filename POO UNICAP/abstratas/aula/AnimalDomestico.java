public abstract class AnimalDomestico {
    protected String race;
    protected String name;

    public AnimalDomestico() {

    }

    public AnimalDomestico(String race, String name) {
        this.race = race;
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void emitirSom();

}
