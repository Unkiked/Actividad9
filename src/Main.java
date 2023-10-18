import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del perro: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce la raza del perro: ");
        String raza = sc.nextLine();
        int edad = 0;

        boolean exception = false;

        while(!exception) {
            try {
                System.out.print("Introduce la edad del perro: ");
                edad = sc.nextInt();
                exception = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce una edad valida");
                sc.next();
            }
        }

        Perro miPerro = new Perro(nombre, raza, edad);

        miPerro.comer("croquetas");
        
        String ladrido = miPerro.ladrar();

        System.out.println("Mi " + miPerro.getRaza() + " "+ miPerro.getNombre() + " ladra: " + ladrido);
    }
}
