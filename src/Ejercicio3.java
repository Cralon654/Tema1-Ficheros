import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Definir la ruta y el nombre del archivo
        String nombreArchivo = "src/resources/notas.txt";

        // Crear un objeto File con la ruta del archivo
        File f = new File(nombreArchivo);

        try {
            // Intentar crear el archivo
            if (f.createNewFile()) {
                System.out.println("Archivo creado con éxito: " + f.getAbsolutePath());
            } else {
                System.out.println("El archivo ya existe: " + f.getAbsolutePath());
            }
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
            e.printStackTrace();
        }

        f.setReadable(true);
        f.setReadable(true);

        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Sobrescribir el archivo");
        System.out.println("2. Añadir texto al final");
        System.out.println("3. Volver al menú principal");

        int opcion = teclado.nextInt();
        while (opcion != 3)
        {
            switch (opcion) {
                case 1:
                    System.out.println("22");
                    break;
                case 2:
                    System.out.println("22");
                    break;
                case 3:
                    System.out.println("22");
                    break;
                default:
                    System.out.println("Opcion no valida");

                    break;

            // if (opcion < 1 || opcion > 3) {
            //     break;
            // }
            }
        }

    }
}
