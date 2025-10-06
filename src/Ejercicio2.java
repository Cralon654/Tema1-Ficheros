import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        String texto = "src/resources/articulo.txt";
        try (BufferedReader lector = new BufferedReader(new FileReader(texto))) {
            String linea;

            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        }
        catch (IOException e){
            System.err.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}
