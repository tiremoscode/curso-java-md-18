package practicas.pokemon.linz_melchor;

public class Pokedex {
    
    public static void main(String[] args) {
        PokemonFuego charmander  = new PokemonFuego("Charmander ", 8.5, 50, 5);
        PokemonAgua squirtle  = new PokemonAgua("Squirtle ", 7.0, 50, 6);
        PokemonPlanta bayleef = new PokemonPlanta("Bayleef ", 15.8, 50, 2);
        PokemonPsiquico mew  = new PokemonPsiquico("Mew ", 4, 50, 1000);
        PokemonPsiquico mewtwo = new PokemonPsiquico("Mewtwo ", 122, 50, 4);

        charmander.atacar();
        squirtle.atacar();
        bayleef.atacar();
        mew.atacar();
        mewtwo.atacar();
     
    // Quiero saber la edad de Charmander 
    //y el peso de Squirtle
        System.out.println("Edad de mi Charmander: " + charmander.getEdad());
        System.out.println("Peso  de mi Squirtle " + squirtle.getPeso());

    // Devolver la informacion de la edad y el nivel de Pikachu, Pidgey y Charizard
    System.out.println("edad de bayleef "+ bayleef.getEdad()+ " y su nivel de ataque es "+ bayleef.getNivel());
    System.out.println("edad de ampharos "+ mew.getEdad()+ " y su nivel de ataque es "+ mew.getNivel());
    System.out.println("edad de charizard "+ mewtwo.getEdad()+ " y su nivel de ataque es "+mewtwo.getNivel());

    }
}
