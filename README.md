import java.util.Scanner;

public class Jugador {
    String equipo;
    int numero_jugador;
    String genero;

    public Jugador() {
    }

    // método
    public void biografia() {
        System.out.println("Nombre del equipo: " + equipo);
        System.out.println("Numero del jugador: " + numero_jugador);
        System.out.println("Genero: " + genero);
    }

    static class Delantero extends Jugador {
        public Delantero() {
            super();
        }
    }

    static class Defensa extends Jugador {
        public Defensa() {
            super();
        }
    }

        public static void main(String[] args) {

            Scanner ingresar = new Scanner(System.in);

            System.out.println("Usted es: \n" +
                    "1.- Delantero\n" +
                    "2.- Defensa\n" +
                    "Escoga solo una: ");
            int opcion = ingresar.nextInt();

            // Consumir el salto de línea pendiente después de nextInt()
            ingresar.nextLine();

            if (opcion == 1) {
                Delantero delantero = new Delantero();

                System.out.println("--- DELANTERO ---");
                System.out.println("Ingrese el equipo: ");
                delantero.equipo = ingresar.nextLine();

                System.out.println("Ingrese el numero del jugador: ");
                delantero.numero_jugador = ingresar.nextInt();

                // Consumir el salto de línea después de nextInt()
                ingresar.nextLine();

                System.out.println("Ingrese el genero: ");
                delantero.genero = ingresar.nextLine();

                delantero.biografia();

            } else if (opcion == 2) {
                Defensa defensa = new Defensa();

                System.out.println("--- DEFENSA ---");
                System.out.println("Ingrese el equipo: ");
                defensa.equipo = ingresar.nextLine();

                System.out.println("Ingrese el numero del jugador: ");
                defensa.numero_jugador = ingresar.nextInt();

                // Consumir el salto de línea después de nextInt()
                ingresar.nextLine();

                System.out.println("Ingrese el genero: ");
                defensa.genero = ingresar.nextLine();

                defensa.biografia();

            }
        }

}

