package practicas.pokemon.diana_vazquez;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego flareon = new PokemonFuego("Flareon", 24.8, 50, 3);
        PokemonSiniestro persian = new PokemonSiniestro("Persian", 75.6, 60, 5);
        PokemonHada aromatisse = new PokemonHada("Aromatisse", 15.6, 90, 8);
        PokemonVeneno okidogi = new PokemonVeneno("Okidogi", 60.2, 40, 10);


        flareon.atacar();
        persian.atacar();
        aromatisse.atacar();
        okidogi.atacar();

        System.out.println("Nivel de ataque de Flareon es:" + flareon.getNivel());
        System.out.println("Edad de Persian es: " + persian.getEdad());
        System.out.println("Nivel de Ataque de Aromatisse: " + aromatisse.getNivel());
        System.out.println("El peso de Okidogi es: " + okidogi.getPeso());


    }
}
