package practicas.pokemon.elizabeth_calderon;

public class Pokedex {
    /**
     * @param args
     */
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 8.5, 50, 5);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 9.0, 50, 6);
        PokemonTierra sandslash = new PokemonTierra("sandslash", 29.5, 50, 7);
        PokemonTierra dugtrio = new PokemonTierra("dugtrio", 33.3, 40, 8);
        PokemonElectrico raichu = new PokemonElectrico("raichu", 30.0, 60, 4);
        PokemonAgua poliwag = new PokemonAgua("poliwag", 12.4, 30, 3);

        charmander.atacar();
        squirtle.atacar();
        sandslash.atacar();
        dugtrio.atacar();
        raichu.atacar();
        poliwag.atacar();

        // Quiero saber la edad de Charmander
        // y el peso de Squirtle
        System.out.println("Edad de mi Charmander: " + charmander.getEdad());
        System.out.println("Peso  de mi Squirtle " + squirtle.getPeso());
        System.out.println("nivel de mi Dugtrio: " + dugtrio.getNivel());
        System.out.println("Peso de mi raichu: " + raichu.getPeso());
        System.out.println( "Edad de mi sandslash: " + sandslash.getEdad());
        System.out.println("nivel de mi poliwag: " + poliwag.getNivel());

    }
}
