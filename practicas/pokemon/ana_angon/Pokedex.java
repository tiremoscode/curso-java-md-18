package practicas.pokemon.ana_angon;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 8.5, 50, 5);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 9.0, 50, 6);
        PokemonElectrico ampharos= new PokemonElectrico("Ampharos", 7.8, 40, 8);
        PokemonElectrico zebtriska= new PokemonElectrico("Zebtriska", 10.5, 35, 11);
        PokemonFuego volcarona = new PokemonFuego("Volcarona", 7.5, 70, 15);

        charmander.atacar();
        squirtle.atacar();
        ampharos.atacar();
        zebtriska.atacar();
        volcarona.atacar();

        // Quiero saber la edad de Charmander
        // y el peso de Squirtle
        System.out.println("Edad de mi Charmander: " + charmander.getEdad());
        System.out.println("Peso  de mi Squirtle " + squirtle.getPeso());
        System.out.println("edad de ampharos"+ampharos.getEdad()+ "y su nivel de ataque es "+ampharos.getNivel());
        System.out.println("edad de zebtriska"+zebtriska.getEdad()+ "y su nivel de ataque es "+zebtriska.getNivel());
        System.out.println("edad de Volcarona"+volcarona.getEdad()+ "y su nivel de ataque es "+volcarona.getNivel());

    }
}
