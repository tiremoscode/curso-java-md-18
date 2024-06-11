package practicas.pokemon.Evelin_Mondragon;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 8.5, 50,5);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 5.5, 20, 2);
        PokemonPlanta leafeon = new PokemonPlanta("Leafeon", 25.5, 80, 4);
        PokemonHielo glaceon = new PokemonHielo("Glaceon",25.9,35,6);
        PokemonPlanta bulbasaur = new PokemonPlanta("Bulbasaur",6.9, 15, 8);

        System.out.println("::::::::::::::::::::::::::::::::::::::::");
        charmander.atacar();
        squirtle.atacar();
        System.out.println("::::::::::::::::::::::::::::::::::::::::");
        System.out.println("\n** Nuevo combate **\n");
        System.out.println("::::::::::::::::::::::::::::::::::::::::");
        leafeon.atacar();
        glaceon.atacar();
        System.out.println("::::::::::::::::::::::::::::::::::::::::");

        //sobre los pokemones existentes
        System.out.println("\n\n++ Edad Charmander: "+charmander.getEdad());
        System.out.println("++ Peso de Squirtle: "+squirtle.getPeso());
        System.out.println("++ Nivel de Glaceon: "+glaceon.getEdad());
        System.out.println("++ Nombre del tipo Planta: "+leafeon.getNombre());
        System.out.println("++ Edad de Bulbasaur: "+bulbasaur.getEdad());
    }   
}