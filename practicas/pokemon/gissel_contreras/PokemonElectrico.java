package practicas.pokemon.gissel_contreras;

class PokemonElectrico extends Pokemon implements TipoPokemon {
    public PokemonElectrico(String nombre, double peso, int nivel, int edad) {
        super(nombre, peso, nivel, edad);
    }

    @Override
    public String getTipoPokemon() {
        return "Electrico";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza un rayo!");
    } 
}