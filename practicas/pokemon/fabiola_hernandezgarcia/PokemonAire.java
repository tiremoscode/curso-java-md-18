package practicas.pokemon.fabiola_hernandezgarcia;

class PokemonAire extends Pokemon implements TipoPokemon {
    public PokemonAire(String nombre, double peso, int nivel, int edad) {
        super(nombre, peso, nivel, edad);
    }

    @Override
    public String getTipoPokemon() {
        return "Tornado y Ataque de Arena";
    }

    @Override
    public void atacar(){
        super.atacar();
        System.out.println(getNombre()+ " lanza un tornado o un ataque de arena!!");
    }
}