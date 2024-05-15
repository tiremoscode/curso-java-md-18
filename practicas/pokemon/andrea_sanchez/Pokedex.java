package practicas.pokemon.andrea_sanchez;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 8.5, 50, 5);
        PokemonFuego magmortar = new PokemonFuego("Magmortar", 354, 78, 4);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 9.0, 50, 6);
        PokemonPsiquico mesprit = new PokemonPsiquico("Mesprit", 0.300, 105, 3);
        PokemonPsiquico mime = new PokemonPsiquico("Mime-JR", 13, 45, 3);
        PokemonVenenoso croagunt = new PokemonVenenoso("Croagunt", 23, 63, 7);
        PokemonVenenoso stunky = new PokemonVenenoso("Stunky", 19.2, 63, 5);

        charmander.atacar();
        squirtle.atacar();
        magmortar.atacar();
        mesprit.atacar();
        mime.atacar();
        croagunt.atacar();
        stunky.atacar();

        
        System.out.println("Charmander su edad es: " + charmander.getEdad());
        System.out.println("Squirtle su peso es: " + squirtle.getPeso());
        System.out.println("Mesprit su nivel es: " + mesprit.getNivel());
        System.out.println("Magmortar su edad es " + magmortar.getEdad());
        System.out.println("Ese pokemon es:  " + mime.getNombre());
        System.out.println("El pokemon más venenoso es: " + stunky.getNombre());

}
}