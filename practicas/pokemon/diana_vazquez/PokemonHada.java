package practicas.pokemon.diana_vazquez;

class PokemonHada extends Pokemon implements TipoPokemon {
    public PokemonHada(String nombre, double peso, int nivel, int edad){
        super(nombre, peso, nivel, edad);
    }
    
    @Override
    public String getTipoPokemon(){
        return "Hada";
    }

    @Override
    public void atacar(){
        super.atacar();
        System.out.println(getNombre() + " lanza Brillo Mágico!!!");
    } 
}
