package practicas.pokemon.Evelin_Mondragon;

class PokemonPlanta extends Pokemon implements TipoPokemon {
    public PokemonPlanta(String nombre, double peso, int nivel, int edad){
        super(nombre, peso,nivel,edad);
    }

    //sobreescribimos sobre el metodo
    @Override
    public String getTipoPokemon() {
        return "Planta";
    }

    @Override
    public void atacar(){
        super.atacar();
        System.out.println(getNombre()+" hoja afilada!!");
    }
}