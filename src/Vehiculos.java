import java.util.Scanner;
public class Vehiculos {
    String modelo, marca;
    int anio;
    double kilometraje;

    /*
    // Constructor vacio
    public Vehiculos() {
    }
    */


    // Constructor
    public Vehiculos(String modelo, String marca, int anio, double kilometraje){
        this.modelo = modelo;
        this.marca = marca;
        this.anio = anio;
        this.kilometraje = kilometraje;
    }

    // Metodo
    public void Imprimir(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + anio);
        System.out.println("Kilometraje: " + kilometraje);
    }





// CLASE COCHE QUE HEREDA DEL PADRE VEHICULOS CON EXTENDS
   static class Coche extends Vehiculos{
        String color;
        public Coche(String modelo, String marca, int anio, double kilometraje, String color){
            super(modelo, marca, anio, kilometraje); // CON SUPER LE HEREDA A LA CLASE PADRE LOS ATRIBUTOS
            this.color = color; // PARA QUE INICIALICE EL ATRIBUTO
            System.out.println("Color: " + color); // no vale

        }
   }

   static class Motocicleta extends Vehiculos{
       public Motocicleta(String modelo, String marca, int anio, double kilometraje){
           super(modelo, marca, anio, kilometraje); // CON SUPER LE HEREDA A LA CLASE PADRE LOS ATRIBUTOS
       }
   }

   static class Camion extends Vehiculos{
       public Camion(String modelo, String marca, int anio, double kilometraje){
           super(modelo, marca, anio, kilometraje); // CON SUPER LE HEREDA A LA CLASE PADRE LOS ATRIBUTOS
       }
   }


    public static void main(String[] args) {
        /*
        Scanner ingresar = new Scanner(System. in);

        // objeto
        Vehiculos coche = new Vehiculos();

        System.out.println("--- COCHE ---");
        System.out.println("Ingrese el modelo del coche:  ");
        coche.modelo = ingresar.nextLine();

        System.out.println("Ingrese la marca del coche:  ");
        coche.marca = ingresar.nextLine();

        System.out.println("Ingrese el año del coche:  ");
        coche.anio = ingresar.nextInt();

        System.out.println("Ingrese el kilometraje:  ");
        coche.kilometraje = ingresar.nextDouble();
        ingresar.nextLine();

        coche.Imprimir();

        Vehiculos motocicleta = new Vehiculos();


        System.out.println("--- MOTOCICLETA ---");
        System.out.println("Ingrese el modelo de la motocicleta:  ");
        motocicleta.modelo = ingresar.nextLine();

        System.out.println("Ingrese la marca de la motocicleta:  ");
        motocicleta.marca = ingresar.nextLine();

        System.out.println("Ingrese el año de la motocicleta:  ");
        motocicleta.anio = ingresar.nextInt();

        System.out.println("Ingrese el kilometraje:  ");
        motocicleta.kilometraje = ingresar.nextDouble();
        ingresar.nextLine();


        motocicleta.Imprimir();


        Vehiculos camion = new Vehiculos();


        System.out.println("--- CAMION ---");
        System.out.println("Ingrese el modelo del camion:  ");
        camion.modelo = ingresar.nextLine();

        System.out.println("Ingrese la marca del camion:  ");
        camion.marca = ingresar.nextLine();

        System.out.println("Ingrese el año del camion:  ");
        camion.anio = ingresar.nextInt();

        System.out.println("Ingrese el kilometraje:  ");
        camion.kilometraje = ingresar.nextDouble();
        ingresar.nextLine();

        camion.Imprimir();

        ingresar.close();
        */


        Coche coche = new Coche("coche1", "ferrari", 2024, 15.5,"Negro");
        Motocicleta motocicleta = new Motocicleta("motocicleta1", "yamaha", 2020, 10.5);
        Camion camion = new Camion("camion1", "mercedes", 2021, 12.5);

        coche.Imprimir();
        motocicleta.Imprimir();
        camion.Imprimir();


        // DEBER DE UN JUGADOR DONDE DEBE SER INGRESADO SI ES DELANTERO O DEFENSA Y IMPRIMIR LOS DATOS CON SCANNER
    }
}