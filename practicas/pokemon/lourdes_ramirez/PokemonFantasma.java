package practicas.pokemon.lourdes_ramirez;

class PokemonFantasma extends Pokemon implements TipoPokemon {
    public PokemonFantasma(String nombre, double peso, int nivel, int edad) {
        super(nombre, peso, nivel, edad);
    }

    @Override
    public String getTipoPokemon() {
        return "Fantasma";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza una maldición!!");
    }
}
