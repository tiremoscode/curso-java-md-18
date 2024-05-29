package pokemon.priscila_cruz;
class PokemonPlanta extends Pokemon implements TipoPokemon {
    public PokemonPlanta(String nombre, double peso, int nivel, int edad) {
        super(nombre, peso, nivel, edad);
    }

    @Override
    public String getTipoPokemon() {
        return "Planta";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " látigo cepa!!");
    }
}