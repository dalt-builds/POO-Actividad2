package ejercicio2_1.ejercicio2_1;

public class Persona {
    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    int anioNacimiento;
    String genero;
    String nacionalidad;
    String direccion;
    String telefono;
    String correoElectronico;
    String estadoCivil;
    String ocupacion;

    public Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int anioNacimiento,
                   String genero, String nacionalidad, String direccion, String telefono,
                   String correoElectronico, String estadoCivil, String ocupacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anioNacimiento = anioNacimiento;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
    }

    void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = " + apellidos);
        System.out.println("Número de documento de identidad = " + numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + anioNacimiento);
        System.out.println("Género = " + genero);
        System.out.println("Nacionalidad = " + nacionalidad);
        System.out.println("Dirección = " + direccion);
        System.out.println("Teléfono = " + telefono);
        System.out.println("Correo electrónico = " + correoElectronico);
        System.out.println("Estado civil = " + estadoCivil);
        System.out.println("Ocupación = " + ocupacion);
        System.out.println();
    }
}
