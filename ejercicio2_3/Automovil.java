package ejercicio2_1.ejercicio2_3;
enum TipoCombustible {GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL}

enum TipoAutomovil {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV}

enum Color {BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA}

public class Automovil {
    String marca;
    int modelo, numeroPuertas, cantidadAsientos;
    double motor,velocidadActual,velocidadMaxima;
    TipoCombustible tipoCombustible;
    TipoAutomovil tipoAutomovil;
    Color color;

    public Automovil(String marca, int modelo, double motor, TipoCombustible tipoCombustible, TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsientos, double velocidadMaxima, Color color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = 0;
    }


    public double getVelocidadActual() { return velocidadActual; }

    public void setVelocidadActual(double velocidadActual) { this.velocidadActual = velocidadActual; }


    public void acelerar(double incremento) {
        if (velocidadActual + incremento > velocidadMaxima) {
            System.out.println("No se puede acelerar mas alla de la velocidad maxima");
            velocidadActual = velocidadMaxima;
        } else {
            velocidadActual += incremento;
        }
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
    }

    public void desacelerar(double decremento) {
        if (velocidadActual - decremento < 0) {
            System.out.println("No se puede desacelerar a velocidad negativa");
            velocidadActual = 0;
        } else {
            velocidadActual -= decremento;
        }
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
    }

    public void frenar() {
        velocidadActual = 0;
        System.out.println("Vehiculo detenido. Velocidad actual: " + velocidadActual + " km/h");
    }

    public double calcularTiempoLlegada(double distancia) {
        if (velocidadActual == 0) return 0;
        return distancia / velocidadActual;
    }

    public void mostrarCaracteristicas() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + " L");
        System.out.println("Combustible: " + tipoCombustible);
        System.out.println("Tipo: " + tipoAutomovil);
        System.out.println("Puertas: " + numeroPuertas);
        System.out.println("Asientos: " + cantidadAsientos);
        System.out.println("Velocidad Maxima: " + velocidadMaxima + " km/h");
        System.out.println("Color: " + color);
        System.out.println("\nVelocidad Actual: " + velocidadActual + " km/h\n");
    }
}