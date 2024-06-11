package practicas.pokemon.Evelin_Mondragon;

class PokemonHielo extends Pokemon implements TipoPokemon {
    public PokemonHielo(String nombre, double peso, int nivel, int edad){
        super(nombre, peso,nivel,edad);
    }

    //sobreescribimos sobre el metodo
    @Override
    public String getTipoPokemon() {
        return "Hielo";
    }

    @Override
    public void atacar(){
        super.atacar();
        System.out.println(getNombre()+" lanza helada!!");
    }
}