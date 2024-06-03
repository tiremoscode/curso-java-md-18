package practicas.pokemon.diana_vazquez;

class PokemonSiniestro extends Pokemon implements TipoPokemon {
    public PokemonSiniestro(String nombre, double peso, int nivel, int edad){
        super(nombre, peso, nivel, edad); 
    }
    
    @Override
    public String getTipoPokemon(){
        return "Siniestro";
    }

    @Override
    public void atacar(){
        super.atacar();
        System.out.println(getNombre() + " lanza calamidad!!!");
    }
}
