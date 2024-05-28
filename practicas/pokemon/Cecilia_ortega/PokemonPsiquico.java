package practicas.pokemon.Cecilia_ortega;

class PokemonPsiquico extends Pokemon implements TipoPokemon {
    public PokemonPsiquico(String nombre, double peso, int nivel, int edad) {
        super(nombre, peso, nivel, edad);
    }

    @Override
    public String getTipoPokemon() {
        return "Psiquico";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " prever acciones futuras");
    }
}
