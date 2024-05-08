class Animal {
    void hablar() {
        System.out.println("Este animal hace un sonido");
    }
}

// Clase para definir un Perrito
class Perro extends Animal {
    void hablar() {
        System.out.println("El perro ladra!");
    }
}

class Gato extends Animal {
    void hablar() {
        System.out.println("El gato maulla!");
    }
}

class Leon extends Animal {
    void hablar() {
        System.out.println("El León ruge!");
    }
}

public class Poliformismo {
    public static void main(String args[]) {
        // Crear instancias para mostrar mi Perro y mi Gato.
        Animal miPerro = new Perro();
        Animal miGato = new Gato();
        Animal miLeon = new Leon();

        // Mandaremos llamar al método hablar de cada uno de ellos.
        miPerro.hablar();
        miGato.hablar();
        miLeon.hablar();
    }
}
