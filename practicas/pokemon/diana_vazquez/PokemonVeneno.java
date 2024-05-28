package practicas.pokemon.diana_vazquez;

class PokemonVeneno extends Pokemon implements TipoPokemon {
    public PokemonVeneno(String nombre, double peso, int nivel, int edad){
        super(nombre, peso, nivel, edad);
    }
    
    
    @Override
    public String getTipoPokemon(){
        return "Veneno";
    }

    @Override
    public void atacar(){
        super.atacar();
        System.out.println(getNombre() + " lanza Ácido!!!");
    }
}
