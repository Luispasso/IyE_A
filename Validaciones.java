import java.util.LinkedList;
import java.util.Scanner;

public class Validaciones {
    Scanner sc = new Scanner(System.in);
    public int ValidarEntero(Scanner sc)
    {
        while (sc.hasNextInt()) {
            System.out.println("POR FAVOR INGRESE UN DIGITO NUMERICO");
            sc.next();
        }
        return sc.nextInt();
    }

    public int ValidarRango(int n1, int n2, int opc)
    {
         while (opc < n1 || opc > n2) {
            System.out.println("INGRESE UNA OPCIÓN ENTRE EL RENGO " + n1 + " y " + n2);
            opc = ValidarEntero(sc);
         }
         return opc;
    }
    
    public boolean ValidarCedula(int cedula, LinkedList<Datos> Lista)
    {
        for (Datos o : Lista) {
            if(o.getCedula() == cedula)
            {
                return true;
            }
        }
        return false;
    }

    public boolean ValidarRangoNombre(String Nombre)
    {
        
    }

}
