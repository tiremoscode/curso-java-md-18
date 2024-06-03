package pokemon.priscila_cruz;

public class Pokedex {
    
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 9, 31, 6);
        PokemonAgua psyduck = new PokemonAgua("Psyduck", 5.1, 10, 7);
        PokemonBicho butterfree = new PokemonBicho("Butterfree", 32, 30, 5);
        PokemonTierra sandshrew = new PokemonTierra("Sandshrew", 12, 10, 4);
        PokemonPlanta bulbasaur = new PokemonPlanta("Bulbasaur", 6.9, 10, 5);
        

        charmander.atacar();
        psyduck.atacar();
        butterfree.atacar();
        sandshrew.atacar();
        bulbasaur.atacar();

        // Quiero saber la edad de Charmander
        // y el peso de Psyduck
        // y el nivel de butterfree 

        System.out.println("Edad de mi Charmander: " + charmander.getEdad());
        System.out.println("Peso  de mi Psyduck " + psyduck.getPeso());
        System.out.println("Nivel de Butterfree" + butterfree.getNivel());

    }

    
}
