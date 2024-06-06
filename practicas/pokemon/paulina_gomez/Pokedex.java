package practicas.pokemon.paulina_gomez;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 8.5, 50, 5);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 9.0, 50, 6);
        PokemonElectrico pikachu = new PokemonElectrico("Pikachu", 10.0, 20, 6);
        PokemonAire pidgey = new PokemonAire("Pidgey", 1.8, 30, 4);
        PokemonFuego charizard = new PokemonFuego("Charizard", 90.5, 60, 8);


       // PokemonElectrico pikachu = new PokemonElectrico(nombre: "Pikachu", peso:10.0, nivel:20, edad:6);
        //PokemonAire pidgey = new PokemonAire(nombre:"Pidgey", peso:1.8, nivel:30, edad:4);
        
        charmander.atacar();
        squirtle.atacar();
        pikachu.atacar();
        pidgey.atacar();
        charizard.atacar();

        // Quiero saber la edad de Charmander
        // y el peso de Squirtle
        System.out.println("Edad de mi Charmander: " + charmander.getEdad());
        System.out.println("Peso  de mi Squirtle " + squirtle.getPeso());

        // Devolver la informacion de la edad y el nivel de Pikachu, Pidgey y Charizard
        System.out.println(" La edad de Pikachu: " + pikachu.getEdad() + " años " + " Y su nivel es de: " + pikachu.getNivel());
        System.out.println(" La edad de Pidgey es: " + pidgey.getEdad() + " años " + " Y su nivel es de: " + pidgey.getNivel());
        System.out.println(" La edad de Charizard es: " + charizard.getEdad() + " años " + " Y su nivel es de: " + charizard.getNivel());
        


    }
}
