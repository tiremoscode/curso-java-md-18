package practicas.pokemon.nancy_martinez;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 8.5, 50, 5);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 9.0, 50, 6);
        PokemonElectrico pikachu = new PokemonElectrico("Pikachu", 6.0, 80, 8);
        PokemonPsiquico azelf = new PokemonPsiquico("Azelf", 5.0, 70, 5);
        PokemonPsiquico jirachi = new PokemonPsiquico("Jirachi", 8.0, 70, 4);

 

        charmander.atacar();
        squirtle.atacar();
        pikachu.atacar();
        azelf.atacar();
        jirachi.atacar();

    

        // Quiero saber la edad de Charmander
        // y el peso de Squirtle
        System.out.println("Edad de mi Charmander: " + charmander.getEdad());
        System.out.println("Peso  de mi Squirtle " + squirtle.getPeso());
        System.out.println("Edad de mi pikachu:" + pikachu.getEdad());
        System.out.println("Nivel de ataque:" + pikachu.getNivel());
        System.out.println("Edad de mi azelf:" + azelf.getEdad());
        System.out.println("Nivel de ataque:" + azelf.getNivel());
        System.out.println("Edad de mi jirachi:" + jirachi.getEdad());
        System.out.println("Nivel de ataque:" + jirachi.getNivel());


    }
}

