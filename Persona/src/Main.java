package ObjetoCostructor;
//El mismo constructor
import ObjetosConstructor.Persona;
//Clase main
public class Main {
    public static void main(String[]argms){
        //Justo aqui mando a llamar al objeto y le doy los datos String y int
        Persona p1= new Persona("Javier",19,"Mexicana","Fes aragon", 9);
        //Aqui lo que hago es que me convine p1 con los print que le di en la clase persona
        System.out.println("\n\n\tLa primera persona es: ");
        p1.MostrarDatos();

            System.out.println("\n\n\tLa segunda es persona: ");
        Persona p2 = new Persona("Daniela",21, "Colombiana","UNAM",8);
            p2.MostrarDatos();
        }

 }
