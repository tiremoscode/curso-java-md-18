package practicas.pokemon.maricela_cruz;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 8.5, 50, 5);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 9.0, 50, 6);
        PokemonVolador zubat= new PokemonVolador("Zubat", 7.8, 40, 8);
        PokemonVolador golbat= new PokemonVolador("Golbat", 10.5, 35, 11);
        PokemonFuego psyduck = new PokemonFuego("Psyduck", 7.5, 70, 15);

        charmander.atacar();
        squirtle.atacar();
        zubat.atacar();
        golbat.atacar();
        psyduck.atacar();

        // Quiero saber la edad de Charmander
        // y el peso de Squirtle
        System.out.println("Edad de mi Charmander: " + charmander.getEdad());
        System.out.println("Peso  de mi Squirtle " + squirtle.getPeso());
        System.out.println("edad de zubat"+zubat.getEdad()+ "y su nivel de ataque es "+zubat.getNivel());
        System.out.println("edad de golbat"+golbat.getEdad()+ "y su nivel de ataque es "+golbat.getNivel());
        System.out.println("edad de psyduck"+psyduck.getEdad()+ "y su nivel de ataque es "+psyduck.getNivel());

    }
}

