package practicas.pokemon.gissel_contreras;

class PokemonAire extends Pokemon implements TipoPokemon {
    public PokemonAire(String nombre, double peso, int nivel, int edad) {
        super(nombre, peso, nivel, edad);
    }

    @Override
    public String getTipoPokemon() {
        return "Aire";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza un tornado!!");
    } 
}