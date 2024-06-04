package practicas.pokemon.lourdes_ramirez;

public class Pokedex {
    /**
     * @param args
     */
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 8.5, 50, 5);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 9.0, 50, 6);
        PokemonFantasma gengar = new PokemonFantasma("Gengar", 40.5, 70, 7);
        PokemonFantasma mimikyu = new PokemonFantasma("Mimikyu", 1.0, 80, 1);
        PokemonHada jigglypuff = new PokemonHada("Jigglypuff", 5.5, 50, 3);

        charmander.atacar();
        squirtle.atacar();
        gengar.atacar();
        mimikyu.atacar();
        jigglypuff.atacar();

        // Quiero saber la edad de Charmander
        // y el peso de Squirtle
        System.out.println("Edad de mi Charmander: " + charmander.getEdad());
        System.out.println("Peso  de mi Squirtle " + squirtle.getPeso());
        System.out.println("Peso  de mi Gengar " + gengar.getPeso());
        System.out.println("Edad de mi Mimikyu: " + mimikyu.getEdad());
        System.out.println("Nivel de mi Jigglypuff: " + jigglypuff.getNivel());
    }
}
