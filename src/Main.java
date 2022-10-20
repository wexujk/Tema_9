public class Main {

    public static void main(String[] args) {

        System.out.println("------CLIENTE---------");

        Cliente cliente = new Cliente();
        cliente.nombre="Kalu Tatyisavi";
        cliente.edad=28;
        cliente.telefono = "5587465987";
        cliente.credito = 14500;

        System.out.println("Nombre: "+ cliente.nombre);
        System.out.println("Edad: "+ cliente.edad);
        System.out.println("Telefono: "+ cliente.telefono);
        System.out.println("Credito: "+ cliente.credito);

        System.out.println("------Trabajador---------");

        Trabajador trabajador = new Trabajador();
        trabajador.nombre= "Nute";
        trabajador.edad=21;
        trabajador.telefono="554128745698";
        trabajador.salario= 15256;

        System.out.println("Nombre: "+ trabajador.nombre);
        System.out.println("Edad: "+ trabajador.edad);
        System.out.println("Telefono: "+ trabajador.telefono);
        System.out.println("Salario: "+ trabajador.salario);


    }
}

class Persona{
     int edad;
     String nombre;
     String telefono;


}

class Cliente extends Persona{

    int credito;
}

class Trabajador extends Persona{
    int salario ;
}