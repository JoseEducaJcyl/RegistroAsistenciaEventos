import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Asistente> asistentes = new HashSet<>();

        boolean continuar = true;
        while (continuar) {
            //Menu, con opciones sobre el HashSet
            System.out.println("MENU");
            System.out.println("1. Registrar asistente");
            System.out.println("2. Buscar asistente (email)");
            System.out.println("3. Mostrar numero de asistentes");
            System.out.println("4. Mostrar listado de asistentes (email)");
            System.out.println("0. Salir");
            System.out.println("Ingrese opcion:");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese asistentes que desea registrar: (Nombre, Apellido, Email)");
                    System.out.println("ingrese su nombre:");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese su apellido:");
                    String apellido = sc.nextLine();
                    System.out.println("Ingrese su email:");
                    String email = sc.nextLine();
                    Asistente asistente = new Asistente(nombre, apellido, email);
                    asistentes.add(asistente);
                    break;
                case 2:
                    System.out.println("Ingrese email a buscar: ");
                    String emailBuscar = sc.nextLine();
                    for(Asistente a : asistentes) {
                        if(a.getEmail().equals(emailBuscar)) {
                            System.out.println("Asistente encontrado");
                        }else  {
                            System.out.println("Asistente no encontrado");
                        }
                    }
                    break;
                case 3:
                    asistentes.size();
                    break;
                case 4:
                    System.out.println("Listado de asistentes: ");
                    for(Asistente a : asistentes) {
                        System.out.println(a.getEmail());
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        }
        sc.close();
    }
}