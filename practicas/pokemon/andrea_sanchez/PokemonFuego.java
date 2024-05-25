package practicas.pokemon.andrea_sanchez;

//public class PokemonFuego {
    class PokemonFuego extends Pokemon implements TipoPokemon {
        public PokemonFuego(String nombre, double peso, int nivel, int edad) {
            super(nombre, peso, nivel, edad);
        }
    
        @Override
        public String getTipoPokemon() {
            return "Fuego";
        }
    
        @Override
        public void atacar(){
            super.atacar();
            System.out.println(getNombre()+ " lanza una llamarada!!");
        }
    
}
