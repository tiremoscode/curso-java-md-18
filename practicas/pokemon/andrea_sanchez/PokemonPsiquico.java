package practicas.pokemon.andrea_sanchez;

//public class PokemonPsiquico {
    class PokemonPsiquico extends Pokemon implements TipoPokemon {
        public PokemonPsiquico(String nombre, double peso, int nivel, int edad) {
            super(nombre, peso, nivel, edad);
        }
    
        @Override
        public String getTipoPokemon() {
            return "Psquico";
        }
    
        @Override
        public void atacar() {
            super.atacar();
            System.out.println(getNombre() + " Ataque Psicocorte");
        }
    
}
