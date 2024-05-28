package practicas.pokemon.jessica_hernandez;

class PokemonVenenoso extends Pokemon implements TipoPokemon{
    public PokemonVenenoso (String nombre, double peso, int nivel, int edad){
        super(nombre, peso, nivel, edad);
    }

    @Override
    public String getTipoPokemon() {
        return "veneno";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza veneno!!");
    }
    
}
