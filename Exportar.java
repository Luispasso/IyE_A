import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Exportar {
    public void ExportarArchivo(LinkedList<Datos> Lista)
    {
         if(Lista.isEmpty())
         {
            System.out.println("LA LISTA ESTA VACIA NO SE PUEDE EXPORTAR EL ARCHIVO");
            return;
         } else{
            try(FileWriter e = new FileWriter("Estudiantes.txt"))
            {
                for (Datos o : Lista) {
                    e.write("NOMNRE: " + o.getNombre() + "\n");
                    e.write("CARNET: : " + o.getCarnet() + "\n");
                    e.write("CEDULA: " + o.getCedula() + "\n");
                    e.write("------------------------------\n");
                }
                System.out.println("ARCHIVO EXPORTADO CORRECTAMENTE ");
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
         }
    }
}
