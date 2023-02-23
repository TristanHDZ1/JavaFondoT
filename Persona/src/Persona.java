package ObjetosConstructor;
public class Persona {
    //atributos
    String nombre;
    int edad;
    String nacionalidad;
    String escuela;
    int promedio;
    //Metodos
        //Metodo contructor
    public Persona(String _nombre, int _edad, String _nacionalidad, String _escuela, int _promedio){
        nombre = _nombre;
        edad = _edad;
        nacionalidad = _nacionalidad;
        escuela = _escuela;
        promedio = _promedio;
    }
    //Muestrame los datos
    public void MostrarDatos(){
        System.out.println(" \nEl nombre es : "+ nombre);
        System.out.println("La edad es : "+ edad);
        System.out.println("La naciolanidad es : "+ nacionalidad);
        System.out.println("La escuela en la que estudias es : "+escuela);
        System.out.println("El promedio del estudiante es : "+ promedio);

    }

}
