import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int vi=2;
        double vd=2.3;
        char vc='A';
        String cad="hola";

        //Mostrando variables por pantalla
        //+ actúa como operador de concatenación
        System.out.println("vi: " + vi + " vd: " + vd);


        //Leyendo datos de teclado
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca un valor entero...");
        vi= sc.nextInt();
        System.out.println("Valor entero leido: " + vi);

        if (vi%2 == 0){
            System.out.println("El nmero: " + vi + " es un número par");
        }else{
            System.out.println("El nmero: " + vi + " es un número impar");
        }

    }
}