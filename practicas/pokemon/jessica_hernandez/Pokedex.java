package practicas.pokemon.jessica_hernandez;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 8.5, 50, 5);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 7.0, 50, 6);
        PokemonVenenoso gengar= new PokemonVenenoso("gengar", 9.8, 60, 9);
        PokemonElectrico ampharos= new PokemonElectrico("ampharos", 11.5, 33, 21);
        PokemonFuego charizard = new PokemonFuego("charizard", 70.5, 80, 14);

        charmander.atacar();
        squirtle.atacar();
        gengar.atacar();
        ampharos.atacar();
        charizard.atacar();

        // Quiero saber la edad de Charmander
        // y el peso de Squirtle
        System.out.println("Edad de mi Charmander: " + charmander.getEdad());
        System.out.println("Peso  de mi Squirtle " + squirtle.getPeso());
        
        // Devolver la informacion de la edad y el nivel de Pikachu, Pidgey y Charizard
        System.out.println("edad de gengar"+ gengar.getEdad()+ "y su nivel de ataque es "+ gengar.getNivel());
        System.out.println("edad de ampharos"+ ampharos.getEdad()+ "y su nivel de ataque es "+ ampharos.getNivel());
        System.out.println("edad de charizard"+charizard.getEdad()+ "y su nivel de ataque es "+charizard.getNivel());

    }
}
