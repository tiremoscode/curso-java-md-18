package practicas.pokemon.andrea_sanchez;

//public class PokemonVenenoso {
    class PokemonVenenoso extends Pokemon implements TipoPokemon {
        public PokemonVenenoso(String nombre, double peso, int nivel, int edad) {
            super(nombre, peso, nivel, edad);
        }
    
        @Override
        public String getTipoPokemon() {
            return "Venenoso";
        }
    
        @Override
        public void atacar() {
            super.atacar();
            System.out.println(getNombre() + " Ataque de onda toxica");
        }
}
