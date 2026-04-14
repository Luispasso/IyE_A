public class Datos {
    private String nombre, carnet;
    private int cedula;
    public Datos(String nombre, String carnet, int cedula) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.cedula = cedula;
    }
    public Datos() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCarnet() {
        return carnet;
    }
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    
}
