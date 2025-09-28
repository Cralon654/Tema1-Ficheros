import java.io.File;
import java.util.Date;

public class Fichero {
    public static void main(String[] args) {
            File archivo = new File("/Users/carloscanocastrillon/");
            File [] ficheros = archivo.listFiles();
            Date diaMs = new Date();


            for (File f: ficheros) {
                if (f.isFile()) {
                    System.out.println(f.getName() + " es un fichero");
                    //Tamaño del archivo
                    System.out.println(f.length() + " bytes");
                    //Fecha de la ultima modificacion
                    diaMs.setTime(f.lastModified());
                    System.out.println(diaMs+ " fecha de la ultima modificación");
                }

                if (f.isDirectory()) {
                    System.out.println(f.getName() + " es un directorio");
                }
            }
    }
}
