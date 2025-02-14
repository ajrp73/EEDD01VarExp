import java.util.Arrays;
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


        //Operadores
        int a=1, b=2;
        System.out.println(("a: " + a + " b: " + b));
        a++; //postincremento
        ++b; //preincremento
        System.out.println(("a: " + a + " b: " + b));
        int c = a++ * ++b;
        System.out.println(("a: " + a + "-b: " + b + "-c: " + c));

        //precedencia de operadores: () ++ -- */% +- << = ==!= > >=    || && !
        boolean bo= (2+8) < ++a || 2+5*9 == a++ + 43;
                   //10 < ++a || 2+5*9 == a++ + 43;
                   //10 < 4 || 2+5*9 == 4 + 43;  (a vale 5)
                   //10 < 4 || 2+45  == 4 + 43
                   //10 < 4 ||  47   ==  47
                   // false || true
                   // true
        System.out.println("bo: " + bo + " a: " + a);
        bo = ++a < 10 || ++a == 6 && true; //Con un solo | se evalúan los dos lados
        System.out.println("bo: " + bo + " a: " + a);

        cad="Hola";
        //sobrecarga de operadores: El operador se comporta de forma diferente
        //según sus operandos
        a= 1 + 1; //+ es suma algebraica
        cad = "1" + "1" + 2 + 3 + 4 + 2.3 + true; //+ es concatenación   incluir otro tipo se denomina wrapping
        System.out.println("cad: " + cad);
        String cad1= cad.substring(2,4);
        System.out.println("cad1: " + cad1);

        bo= "hola".equals("Hola");
        System.out.println("bo: " + bo );

        bo= cad1.equals("23");
        System.out.println("bo: " + bo );


        int []arrInt1 = new int[5];
        int []arrInt2 = {0, 1, 2, 3, 4};

        System.out.println("arrInt1: " + Arrays.toString(arrInt1));
        System.out.println("arrInt2: " + Arrays.toString(arrInt2));

        int [][]matriz1= new int[5][5];
        int [][]matriz2= { {0, 1, 2, 3, 4},
                           {0, 1, 2, 3, 4} };
        System.out.println("matriz1: \n" + Arrays.toString(matriz1[0]) + "\n" + Arrays.toString(matriz1[1]));
        System.out.println("matriz2: \n" + Arrays.toString(matriz2[0]) + "\n" + Arrays.toString(matriz2[1]));

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