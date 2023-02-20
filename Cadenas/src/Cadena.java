import java.util.Scanner;
    public class Cadena {
       public static void main(String[] args) {

//Creo el scanner
           Scanner sc = new Scanner(System.in);
           System.out.println("Dame \n Nombre : \n Profesión :  \n País : \n En ese orden.Ejemplo: Javier Estudiante México");
           String cadena = sc.nextLine();

           int x = cadena.indexOf(' ');
           int y = cadena.indexOf(' ', x + 1);

//le asigne valores a x,y para dividir las cadenas

           String nombre = cadena.substring(0, x);
           String profesion = cadena.substring(x + 1, y);
           String pais = cadena.substring(y + 1);


//Basicamente aqui solo lo puse en mayusculas
           nombre = nombre.toUpperCase();
           profesion = profesion.toUpperCase();
           pais = pais.toUpperCase();

//Aqui ya solo mande a imprimir
           System.out.println("Nombre: " + nombre);
           System.out.println("Profesión: " + profesion);
           System.out.println("País: " + pais);




       }
    }