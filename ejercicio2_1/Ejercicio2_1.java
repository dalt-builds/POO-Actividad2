package ejercicio2_1.ejercicio2_1;

public class Ejercicio2_1 {

    public static void main(String[] args) {
        Persona per1 = new Persona("Andrea", "Gómez", "1023456789", 1995, "Femenino", "Colombiana", "Calle 45 #23-10, Cali", "3124567890", "andrea.gomez@email.com", "Soltera", "Doctora");
        Persona per2 = new Persona("Carlos", "Ramírez", "1098765432", 1988, "Masculino", "Colombiana", "Carrera 12 #56-78, Barranquilla", "3109876543", "carlos.ramirez@email.com", "Casado", "Profesor");
        Persona per3 = new Persona("Mariana", "Torres", "1045678912", 2000, "Femenino", "Colombiana", "Avenida 30 #40-22, Bogotá", "3201239876", "mariana.torres@email.com", "Soltera", "Estudiante de Ingeniería");

        per1.imprimir();
        per2.imprimir();
        per3.imprimir();
    }
}
