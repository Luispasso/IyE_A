import java.util.LinkedList;
import java.util.Scanner;

public class Menu
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos met = new Metodos();
        Validaciones v = new Validaciones();
        boolean continuar = true;
        LinkedList<Datos> Lista = new LinkedList<>();
        Importar i = new Importar();
        Lista = i.Importar();
        System.out.println("BIENVENDIO");
        while (continuar) {
             System.out.println("ELIJA UNA OPCIÓN");
             System.out.println("1. INGRESAR EL ESTUDIANTE");
             System.out.println("2. CONSULTAR ESTUDIANTE");
             System.out.println("3. MODIFICAR ESTUDIANTE");
             System.out.println("4. ELIMINAR ESTUDIANTE");
             System.out.println("5. MOSTRAR ESTUDIANTES");
             System.out.println("6. SALIR");
             int opc = v.ValidarEntero(sc);

             switch (opc) {
                case 1:
                    Lista = met.LlenarLista(Lista);
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("INGRESE EL NUMERO DE CEDULA");
                    int cedula = sc.nextInt();
                    Lista = met.Modificar(cedula, Lista);
                    break;
                case 4:
                    System.out.println("INGRESE EL NUMERO DE CEDULA");
                    int ced = sc.nextInt();
                    Lista = met.Eliminar(ced, Lista);
                    break;
                case 5:
                    met.MostrarLista(Lista);
                    break;
                case 6:
                    System.out.println("GRACIAS");
                      continuar = false;
                    break;
                default:
                    System.out.println("OPCIÓN INVALIDA");
                    break;
             }
        }
    }
}
