package pokemon.priscila_cruz;
class PokemonBicho extends Pokemon implements TipoPokemon {
    public PokemonBicho(String nombre, double peso, int nivel, int edad) {
        super(nombre, peso, nivel, edad);
    }

    @Override
    public String getTipoPokemon() {
        return "Bicho";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " rayo psi!!");
    }
}