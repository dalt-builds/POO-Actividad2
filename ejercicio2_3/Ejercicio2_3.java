package ejercicio2_1.ejercicio2_3;

public class Ejercicio2_3 {
    public static void main(String[] args) {

        Automovil miAuto = new Automovil("Toyota", 2023, 2.0, TipoCombustible.GASOLINA, TipoAutomovil.COMPACTO, 4, 5, 180.0, Color.ROJO);

        System.out.println("Caracteristicas del auto: ");
        miAuto.mostrarCaracteristicas();

        System.out.println("Acelerando 60 km/h:");
        miAuto.acelerar(60);
        System.out.println();

        System.out.println("Desacelerando 50 km/h:");
        miAuto.desacelerar(50);
        System.out.println();

        System.out.println("Frenando:");
        miAuto.frenar();
        System.out.println();

        miAuto.setVelocidadActual(100);
        double tiempo = miAuto.calcularTiempoLlegada(250);
        System.out.println("Tiempo estimado para recorrer 250 km a " + miAuto.getVelocidadActual() + " km/h: " + tiempo + " horas");
    }
}