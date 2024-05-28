package practicas.pokemon.Cecilia_ortega;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("charmander", 8.5, 50, 5);
        PokemonAgua squirtle = new PokemonAgua("squirtle", 9.0, 50, 6);
        PokemonElectrico pikachu =new PokemonElectrico("pikachu", 9.0, 60, 6);
        PokemonPsiquico cresselia =new PokemonPsiquico("cresselia", 8.0, 70, 5);
        PokemonFuego charizard =new PokemonFuego("charizard", 7.0, 80, 7);


        charmander.atacar();
        squirtle.atacar();
        pikachu.atacar();
        cresselia.atacar();
        charizard.atacar();

        // Quiero saber la edad de Charmander
        // y el peso de Squirtle
        System.out.println("Edad de mi Charmander: " + charmander.getEdad());
        System.out.println("Peso  de mi Squirtle " + squirtle.getPeso());
        System.out.println("Nivel de mi pikachu " + pikachu.getNivel());
        System.out.println("Edad de mi cresselia " + cresselia.getEdad());
        System.out.println("nivel de mi charizard " + squirtle.getPeso());

    }
}