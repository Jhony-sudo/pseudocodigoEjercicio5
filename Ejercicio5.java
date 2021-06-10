import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int seleccion;
        int MujerMayor = 0;
        int HombreMenor = 0;
        do {

            int Edad;
            System.out.println("1. Ingresar edad Hombre");
            System.out.println("2. Ingresar edad Mujer");
            System.out.println("3. Ver Estadistica de Edades");
            System.out.println("4. Salir");
            seleccion = src.nextInt();
            switch (seleccion) {
                case 1:
                    System.out.println("Ingrese la edad ");
                    Edad = src.nextInt();
                    if (Edad < 18) {
                        HombreMenor++;
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la edad ");
                    Edad = src.nextInt();
                    if (Edad >= 18) {
                        MujerMayor++;
                    }
                    break;
                case 3:
                    System.out.println("Hay un total de " + HombreMenor + " hombres menores de edad");
                    System.out.println(MujerMayor + " mujeres son mayores de edad ");
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;
            }
        } while (seleccion != 4);

    }

}
