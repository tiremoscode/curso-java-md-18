package pokemon.yaretzy_ramirez;

class PokemonAgua extends Pokemon implements TipoPokemon {
    public PokemonAgua(String nombre, double peso, int nivel, int edad) {
        super(nombre, peso, nivel, edad);
    }

    @Override
    public String getTipoPokemon() {
        return "Agua";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " está lanzando un chorro de agua!");
    }
}