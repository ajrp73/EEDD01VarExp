import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int vi=2;
        double vd=2.3;
        char vc='A';
        String cad="hola";
        boolean vb= false;

        //Mostrando variables por pantalla
        //+ actúa como operador de concatenación
        System.out.println("vi: " + vi + " vd: " + vd);

        //Conversión de tipos de datos
        vi = (int)2.9 + (int)1.1;
        System.out.println("vi: " + vi );
        vi = (int)(2.9 + 1.1);
        System.out.println("vi: " + vi );
        //vi = (int)vb + vb; hay tipos que no son convertibles
        vi = vc + 1;
        System.out.println("vi (entero): " + vi + " vi (char): " + (char)vi);
        System.exit(0);

        //Leyendo datos de teclado
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca un valor entero...");
        vi= sc.nextInt();
        System.out.println("Valor entero leido: " + vi);

        //Sentencia de bifuración
        if (vi%2 == 0){
            System.out.println("El nmero: " + vi + " es un número par");
        }else{
            System.out.println("El nmero: " + vi + " es un número impar");
        }

        //Sentencias de bifuración anidadas
        if(vi < 50){
            System.out.println("El número: " + vi + " es < 50");
        }else if (vi > 50){
            System.out.println("El número: " + vi + " es > 50");
        }else{
            System.out.println("El número: " + vi + " es == 50");
        }

        //sentencias swith-case
        System.out.println("Introduzca color (R/r, V/v, A/a): ");
        cad= sc.next();
        vc=cad.charAt(0);

        switch(vc){
            case 'R':
            case 'r':
                System.out.println("Color Rojo");
                break;

            case 'V':
            case 'v':
                System.out.println("Color Verde");
                break;

            case 'A':
            case 'a':
                System.out.println("Color Azul");
                break;

              default:
                  System.out.println("Color erróneo");
        }

        //Bucles for cuando se conoce a priori el número de iteraciones
        int suma1=0, suma2=0;
        for(int i=0; i<10; i++){
            suma1=suma1 + i;
            suma2+=i;
        }
        System.out.println("Suma1: " + suma1 + " suma2: " + suma2);

        //Bucles while cuando no es conocido a priori el número de iteraciones
        //bucle que solicite valores al usuario hasta que introduzca un número par


        //Bucles while cuando no es conocido a priori el número de iteraciones
        //bucle que solicite valores al usuario hasta que introduzca dos números
        // pares consecutivos




    }
}