package practicas.pokemon.clara_arreola;

public class Pokedex {
    /**
     * @param args
     */
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 8.5, 50, 5);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 9.0, 50, 6);
        PokemonPsiquico psyduck = new PokemonPsiquico("Psiduck", 13, 80, 4);
        PokemonElectrico pikachu = new PokemonElectrico("Pikachu", 5, 90, 5);
        PokemonAgua vaporeon = new PokemonAgua("Vaporeon", 4, 85, 6);
        PokemonTierra dugtrio = new PokemonTierra("dugtrio", 33.3, 40, 8);

        charmander.atacar();
        squirtle.atacar();
        psyduck.atacar();
        pikachu.atacar();
        vaporeon.atacar();
        dugtrio.atacar();

        // Quiero saber la edad de Charmander
        // y el peso de Squirtle
        System.out.println("Edad de mi Charmander: " + charmander.getEdad()+ " años " + " Y su nivel es de: " + charmander.getNivel());
        System.out.println("Peso  de mi Squirtle " + squirtle.getPeso()+ " años " + " Y su nivel es de: " + squirtle.getNivel());
        System.out.println(" La edad de Psiduck: " + psyduck.getEdad() + " años " + " Y su nivel es de: " + psyduck.getNivel());
        System.out.println(" La edad de Pikachu: " + pikachu.getEdad() + " años " + " Y su nivel es de: " + pikachu.getNivel());
        System.out.println(" La edad de Vaporeon: " + vaporeon.getEdad() + " años " + " Y su nivel es de: " + vaporeon.getNivel());
        System.out.println("La edad de Dugtrio: " +dugtrio.getEdad()+ " años "+ " Y su nivel es de: "+ dugtrio.getNivel());
    }
}
