package practicas.pokemon.linz_melchor;

class PokemonAgua extends Pokemon implements TipoPokemon{
    public PokemonAgua(String nombre, double peso, int nivel, int edad){
        super(nombre, peso, nivel, edad); 
    }
    
    @Override 
    public String getTipoPokemon(){
        return "Agua";
    }

    @Override
    public void atacar(){
        super.atacar(); 
     System.out.println(getNombre() + " lanza un chorro de agua!!!");   
    }

}
