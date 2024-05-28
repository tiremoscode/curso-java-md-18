package pokemon.yaretzy_ramirez;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 8.5, 50, 5);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 9.0, 50, 6);
        PokemonHada sylveon = new PokemonHada("Sylveon", 23.5, 56, 12);
        PokemonHada carbink = new PokemonHada("Carbink", 5.7, 53, 3);
        PokemonHielo abomasnow = new PokemonHielo("Abomasnow", 135.5, 58, 16);
         

        charmander.atacar();
        squirtle.atacar();
        sylveon.atacar();
        carbink.atacar();
        abomasnow.atacar();

        // Quiero saber la edad de Charmander
        // y el peso de Squirtle
        System.out.println("Edad de mi Charmander: " + charmander.getEdad());
        System.out.println("Peso  de mi Squirtle " + squirtle.getPeso());
        System.out.println("Edad de Sylveon: " + sylveon.getEdad());
        System.out.println("Nivel de Sylveon: " + sylveon.getNivel());
        System.out.println("Edad de Carbink: " + carbink.getEdad());
        System.out.println("Nivel de Carbink: " + carbink.getNivel());
        System.out.println("Edad de Abomasnow: " + abomasnow.getEdad());
        System.out.println("Nivel de Abomasnow: " + abomasnow.getNivel());
    }   
}
