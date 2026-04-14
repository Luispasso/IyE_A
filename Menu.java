import java.util.LinkedList;
import java.util.Scanner;

public class Menu
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos met = new Metodos();
        boolean continuar = true;
        LinkedList<Datos> Lista = new LinkedList<>();
        System.out.println("BIENVENDIO");
        while (continuar) {
             System.out.println("ELIJA UNA OPCIÓN");
             System.out.println("1. INGRESAR EL ESTUDIANTE");
             System.out.println("2. CONSULTAR ESTUDIANTE");
             System.out.println("3. MODIFICAR ESTUDIANTE");
             System.out.println("4. ELIMINAR ESTUDIANTE");
             System.out.println("5. MOSTRAR ESTUDIANTES");
             System.out.println("6. EXPORTAR");
             System.out.println("7. IMPORTAR");
             System.out.println("8. SALIR");
             int opc = sc.nextInt();

             switch (opc) {
                case 1:
                    Lista = met.LlenarLista(Lista);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    met.MostrarLista(Lista);
                    break;
                case 6:
                    Exportar e = new Exportar();
                    
                    break;
                case 7:
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
