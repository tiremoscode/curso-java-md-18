package pokemon.yaretzy_ramirez;

class PokemonHielo extends Pokemon implements TipoPokemon {
    public PokemonHielo(String nombre, double peso, int nivel, int edad) {
        super(nombre, peso, nivel, edad);
    }

    @Override
    public String getTipoPokemon() {
        return "Hielo";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " está lanzando bolas de hielo!");
    }
}
