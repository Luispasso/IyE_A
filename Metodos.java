import java.util.LinkedList;
import java.util.Scanner;

public class Metodos {
    public LinkedList<Datos> LlenarLista(LinkedList<Datos> Lista)
    {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            Datos o = new Datos();
            System.out.println("INGRESE EL NOMBRE DEL ESTUDIANTE");
            o.setNombre(sc.nextLine());
            System.out.println("INGRESE EL CARNET DEL ESTUDIANTE");
            o.setCarnet(sc.next());
            System.out.println("INGRESE LA CEDULA");
            o.setCedula(sc.nextInt());
            Lista.add(o);

            System.out.println("DESEA CONTINUAR");
            System.out.println("1. SI");
            System.out.println("2. NO");
            int opc = sc.nextInt();
            sc.nextLine();
            if(opc == 2)
                continuar = false;
        }
        return Lista;
    }

    public void MostrarLista(LinkedList<Datos> Lista)
    {
        
        for (Datos o : Lista) {
            System.out.println("NOMBRE :"  + o.getNombre());
            System.out.println("CARNET :"  + o.getCarnet());
            System.out.println("CEDULA :"  + o.getCedula());
            System.out.println("---------------------------------------");
        }
    }

}
