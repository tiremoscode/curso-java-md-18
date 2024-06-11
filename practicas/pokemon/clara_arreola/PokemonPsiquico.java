package practicas.pokemon.clara_arreola;

class PokemonPsiquico extends Pokemon implements TipoPokemon {
    public PokemonPsiquico( String nombre, double peso, int nivel, int edad){
        super(nombre, peso, nivel, edad);
    }
    
    @Override
    public String getTipoPokemon() {
        return "Fuego" ;
    }

    @Override
    public void atacar(){
        super.atacar();
        System.out.println(getNombre()+ "lanza ataque psiquico!!");
    }
}
