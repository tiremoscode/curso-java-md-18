package practicas.pokemon.gissel_contreras;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 8.5, 50, 5);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 9.0, 50, 6);
        PokemonAire pidgeot = new PokemonAire("Pidgeot", 39.5, 50, 7);
        PokemonElectrico pikachu = new PokemonElectrico("Pikachu", 6.0, 50, 5);
        PokemonAgua psyduck = new PokemonAgua("Psyduck", 19.6, 50, 7);

        charmander.atacar();
        squirtle.atacar();
        pidgeot.atacar();
        pikachu.atacar();
        psyduck.atacar();

        // Quiero saber la edad de Charmander
        // y el peso de Squirtle
        System.out.println("Edad de mi Charmander: " + charmander.getEdad());
        System.out.println("Peso  de mi Squirtle " + squirtle.getPeso());

        //Aire
        System.out.println("Edad de mi Pidgeot: " + pidgeot.getEdad());
        System.out.println("Nivel de mi Pidgeot: " + pidgeot.getNivel());

        //Electrico
        System.out.println("Edad de mi Pikachu: " + pikachu.getEdad());
        System.out.println("Nivel de mi Pikachu: " + pikachu.getNivel());

        //Agua
        System.out.println("Edad de mi Psyduck: " + psyduck.getEdad());
        System.out.println("Nivel de mi Psyduck: " + psyduck.getNivel());


    }
    
}
