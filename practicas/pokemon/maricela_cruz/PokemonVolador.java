package practicas.pokemon.maricela_cruz;

class PokemonVolador extends Pokemon implements TipoPokemon {
    public PokemonVolador(String nombre,double peso,int nivel,int edad){
        super(nombre,peso,nivel,edad);
    }

    @Override
    public String getTipoPokemon() {
        return "Volador";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " Lanza veneno!!");
    }
    
}
