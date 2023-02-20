//Ejemplos de string
public class Main {
    public static void main(String[] args) {

        String s = "Hola";
        int x = s.length();
        System.out.println("El numero de caracteres es :" + x);
//Aqui acaba el  length

        String s1 = "Hola";
        boolean b1 = s1.isEmpty();
        //retorna FALSE
        System.out.println(b1);

        String s2 = "";
        boolean b2 = s2.isEmpty();
        System.out.println(b2);
        //retorna TRUE

//Aqui acaba el isEmpty

        String t = "Hola";
        for (int i=0; i<t.length(); i++)
        {
            char c= t.charAt(i);
            System.out.println(c);
        }

//Aqui acaba el for con un length

        String a = "Hola";
        String c = "Hola";
        if(a.equals(c));
        {
            System.out.println("\"Si pasa por aqui\"");
        }
//Aqui acaba el equals

        String s3 = "Hola, como estas?";
        int p1 = s3.indexOf('a');
        System.out.println(p1);

        int p2 = s3.lastIndexOf('a');
        System.out.println(p2);
//Aqui acaba el indexIn e lastIndexOf para retornar caracteres

        String m4 = "Hola, como estas? Estas como querias?";
        int m = m4.indexOf("como");
        System.out.println(m);
        int m2 = m4.indexOf("estas");
        System.out.println(m2);
        int m3 = m4.lastIndexOf("como");
        System.out.println(m3);
//Aqui acaba los index para retornar cadenas de caracteres

        String w = "Hola, como estas?";
        String may = w.toUpperCase();
        System.out.println(may);
        String min = w.toLowerCase();
        System.out.println(min);


//Aqui acaba el toUpperCase y toLowerCase = Mayusculas y minusculas

        String z = "Hola, como estas?";
        String z1 = z.substring(0,4);
        System.out.println(z1);
        String z2 = z.substring(6,10);
        System.out.println(z2);
        String z3 = z.substring(11);
        System.out.println(z3);

//Aqui acaba el substring


        //Empiezo a uzar apartir de aqui Integer

        //enteros
        String d1 = "1234";
        int i = Integer.parseInt(d1);
        System.out.println(i);
        String r = Integer.toString(i);
        System.out.println(r);

        //flotantes
        String d2 = "1234.56";
        double g = Double.parseDouble(d2);
        System.out.println(g);
        String t1 = Double.toString(g);
        System.out.println(t1);

// Termina el Integer parseInt y parseDouble

        StringBuilder sb = new StringBuilder();
        sb.append("Hola, ");
        sb.append("Chau");
        System.out.println(sb);
//Termina el StringBuilder


        //Mi ejemplo de StringBuilder
        StringBuilder xd = new StringBuilder();
        xd.append("Soy, ");
        xd.append("un ingeniero :) ");
        System.out.println(xd);
    }
}