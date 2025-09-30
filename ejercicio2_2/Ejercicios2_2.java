package ejercicio2_1.ejercicio2_2;

public class Ejercicios2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Planeta mercurio = new Planeta("Mercurio", 0, 3.3011E23, 6.083E10, 4879, 57900000, Planeta.TipoPlaneta.TERRESTRE, true);
        mercurio.imprimir();
        System.out.println("Densidad del planeta = " + mercurio.calcularDensidad());
        System.out.println("Es planeta exterior = " + mercurio.esPlanetaExterior());
        System.out.println();

        Planeta venus = new Planeta("Venus", 0, 4.8675E24, 9.2843E11, 12104, 108000000, Planeta.TipoPlaneta.TERRESTRE, true);
        venus.imprimir();
        System.out.println("Densidad del planeta = " + venus.calcularDensidad());
        System.out.println("Es planeta exterior = " + venus.esPlanetaExterior());
        System.out.println();

        Planeta marte = new Planeta("Marte", 2, 6.4171E23, 1.6318E11, 6779, 228000000, Planeta.TipoPlaneta.TERRESTRE, true);
        marte.imprimir();
        System.out.println("Densidad del planeta = " + marte.calcularDensidad());
        System.out.println("Es planeta exterior = " + marte.esPlanetaExterior());
        System.out.println();

        Planeta saturno = new Planeta("Saturno", 82, 5.683E26, 8.2713E14, 116460, 1430000000, Planeta.TipoPlaneta.GASEOSO, true);
        saturno.imprimir();
        System.out.println("Densidad del planeta = " + saturno.calcularDensidad());
        System.out.println("Es planeta exterior = " + saturno.esPlanetaExterior());
        System.out.println();

        Planeta neptuno = new Planeta("Neptuno", 14, 1.024E26, 6.254E13, 49244, 449500000, Planeta.TipoPlaneta.GASEOSO, true);
        neptuno.imprimir();
        System.out.println("Densidad del planeta = " + neptuno.calcularDensidad());
        System.out.println("Es planeta exterior = " + neptuno.esPlanetaExterior());
        System.out.println();
    }
}
