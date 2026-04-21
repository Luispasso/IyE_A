import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Importar {
    public LinkedList<Datos> Importar()
    {
        String RutaArchivo = "Estudiantes.txt";
        LinkedList<Datos> Lista = new LinkedList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(RutaArchivo)))
        {
            String Linea;
            Datos d = null;

            while ((Linea = br.readLine()) != null) {
                if(Linea.startsWith("NOMBRE:"))
                {
                    if(d != null)
                    {
                        Lista.add(d);
                    }
                    d = new Datos();
                    d.setNombre(Linea.substring(0));
                }
                else if(Linea.startsWith("CARNET:"))
                {
                    if(d != null)
                    {
                        d.setCarnet(Linea.substring(0));
                    }
                }
                else if(Linea.startsWith("CEDULA:"))
                {
                    if(d != null) 
                    {
                        d.setCedula();
                    }
                }
            }
        }
         catch(IOException e)
            {
                e.printStackTrace();
            }
         return Lista;
    }
}
