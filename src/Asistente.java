// Clase Asisntente con los atributos nombre, apellidos y email
// con un metodo para comprobar la igualdad entre dos objetos de la clase 
import java.util.Objects;

public class Asistente {
    private String nombre;
    private String apellido;
    private String email;

    public Asistente(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Asistente asistente = (Asistente) o;
        return Objects.equals(nombre, asistente.nombre) && Objects.equals(apellido, asistente.apellido) && Objects.equals(email, asistente.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, email);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
