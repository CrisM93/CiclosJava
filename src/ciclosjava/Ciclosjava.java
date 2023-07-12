package ciclosjava;

/**
 *
 * @author crizt
 */
public class Ciclosjava {

    public static void main(String[] args) {
        //HOLA de nuevo
       //HOLA
        //while
        /* var contador = 0;
        while (contador < 3) {
            System.out.println("Contador = " + contador);
            contador++;
        }*/
        //Al menos una vez se ejecuta el do-while
//        var contador = 0;
//        do {
//            System.out.println("Contador " + contador);
//            contador++;
//        } while (contador < 1);
//ciclo for
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                continue;//va la siguiente iteracion
            }
            System.out.println("i = " + i);
        }
    }
}
