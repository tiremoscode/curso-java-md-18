package practicas.pokemon.nancy_martinez;

interface TipoPokemon {
    String getTipoPokemon();
}

class Pokemon {
    // Nombre
    // Peso
    // Nivel
    // edad
    // Tipo

    private String nombre;
    private double peso;
    private int nivel;
    private int edad;

    public Pokemon(String nombre, double peso, int nivel, int edad) {
        this.nombre = nombre;
        this.peso = peso;
        this.nivel = nivel;
        this.edad = edad;
    }

    public void atacar() {
        System.out.println(nombre + " esta atacando!!");
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public int getNivel() {
        return nivel;
    }

    public int getEdad() {
        return edad;
    }
}
