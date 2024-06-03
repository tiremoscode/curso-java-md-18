package pokemon.priscila_cruz;

public class PokemonTierra extends Pokemon implements TipoPokemon {
    public PokemonTierra(String nombre, double peso, int nivel, int edad) {
        super(nombre, peso, nivel, edad);
    }

    @Override
    public String getTipoPokemon() {
        return "Tierra";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " arañazo doble!!");
    }
}
