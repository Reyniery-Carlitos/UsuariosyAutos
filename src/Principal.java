// Programa que mediante clases designa informacion de usuarios con sus coches y cus caracteristicas.
import java.util.ArrayList;
import java.util.List;

public class Principal{
    public static void main(String[] args) {
        // Crear Usuarios
        //USUARIO 1
        Usuario u1 = new Usuario();
        u1.dni = "101";
        u1.nombre = "Carlos";
        u1.apellido = "Rubio";
        u1.sexo = "Masculino";

        //USUARIO 2
        Usuario u2 = new Usuario();
        u2.dni = "102";
        u2.nombre = "Karen";
        u2.apellido = "Dominguez";
        u2.sexo = "Femenino";

        // USUARIO 3
        Usuario u3 = new Usuario();
        u3.dni = "103";
        u3.nombre = "Antony";
        u3.apellido = "Rubio";
        u3.sexo = "Masculino";

        // Crear los Carros
        // CARRO 1
        Carros c1 = new Carros();
        c1.usuario = u1;
        c1.color = "Blanco";
        c1.marca = "Ferrari";
        c1.tipo = "Deportivo";

        // CARRO 2
        Carros c2 = new Carros();
        c2.usuario = u1;
        c2.color = "Rojo";
        c2.marca = "Mustang";
        c2.tipo = "Clasico";

        // CARRO 3
        Carros c3 = new Carros();
        c3.usuario = u2;
        c3.color = "Azul con negro";
        c3.marca = "Camaro";
        c3.tipo = "Deportivo";

        // CARRO 4
        Carros c4 = new Carros();
        c4.usuario = u2;
        c4.color = "Gris";
        c4.marca = "Honda civic";
        c4.tipo = "Turismo";

        // CARRO 5
        Carros c5 = new Carros();
        c5.usuario = u3;
        c5.color = "Negro";
        c5.marca = "Toyota";
        c5.tipo = "4x4";

        // Almacenando los carros en un arreglo.
        Carros[] mis_carros = new Carros[5];
        mis_carros[0] = c1;
        mis_carros[1] = c2;
        mis_carros[2] = c3;
        mis_carros[3] = c4;
        mis_carros[4] = c5;

        // Caracteristicas de los carros.
        for( int i = 0 ; i < mis_carros.length ; i++ ){
            System.out.println( mis_carros[i].Caracteristicas());
        }

        // Asignar vehiculos al usuario 1
        u1.vehiculos.add(c1);
        u1.vehiculos.add(c2);
        u1.vehiculos.get(0);
        u1.vehiculos.get(1);

        // Imprimir los datos del usuario 1 y sus coches.
        for (Carros g: u1.vehiculos) {
            System.out.println(g.salida());
        }

        // Asignar vehiculos al usuario 2
        u2.vehiculos.add(c3);
        u2.vehiculos.add(c4);
        u2.vehiculos.get(0);
        u2.vehiculos.get(1);

        // Imprimir los datos del usuario 2 y sus coches.
        for (Carros j: u2.vehiculos){
            System.out.println(j.salida());
        }

        // Asignar vehiculos al usuario 3
        u3.vehiculos.add(c5);
        u3.vehiculos.get(0);

        // Imprimir los datos del  usuario 3 y sus coches.
        for (Carros h: u3.vehiculos){
            System.out.println(h.salida());
        }
    }
}

// Inicio de la clase carros.
class Carros{
    Usuario usuario;
    String color, marca, tipo;
    double likelihood_die;

    // Constructor de la clase Carros.
    public Carros(){

    }

    // Caracteristicas de los vehiculos
    public String Caracteristicas(){
        String carac = new String();
        System.out.println("CARACTERISTICAS DEL COCHE: ");
        carac = ("El coche: " + marca + " " + tipo + " es color: " + color + "\n ---------------------------------------------------");
        return carac;
    }

    // Mostrar datos de salida
    public String salida(){
        String misalida = new String();
        System.out.println("USUARIO Y SUS COCHES: ");
        misalida = "El nombre del usuario es: " + this.usuario.nombre + " " + this.usuario.apellido+ " y tiene el/los carro/os: " + marca + " " + tipo + " color: " + color;
        return misalida;
    }

    // Inicio del likelihood
    public void  compute_die_likelihood(){
        this.likelihood_die = 0.1;
    }
}

// Inicio de la clase usuario
class Usuario{
    String nombre, apellido, sexo, dni;
    List<Carros> vehiculos;

    // Constructor de usuario
    public Usuario(){
        this.vehiculos = new ArrayList<Carros>();
    }
}
