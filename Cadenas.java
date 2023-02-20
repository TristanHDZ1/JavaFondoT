import java.util.Scanner;
public class Cadenas{
    public static void main(String[] args){
        Scanner scanner = new Scanner(String.in);
        System.out.print("Ingrese una cadena que contenga un nombre, una profesión y una nacionalidad: ");
        String cadena = scanner.nextLine();

        int x = cadena.indexOf(' ');
        int y = cadena.indexOf(' ' ,x + 1);

        String nombre = cadena.substring(0, x);
        String profesion = cadena.substring(x + 1, y);
        String pais = cadena.substring(y + 1);

        nombre = nombre.toUpperCase();
        profesion = profesion.toUpperCase();
        pais = pais.toUpperCase();

        System.out.println("Nombre: " + nombre);
        System.out.println("Profesión: " + profesion);
        System.out.println("País: " + pais);






    }

}