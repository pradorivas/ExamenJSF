
package pe.edu.cibertec.managed;

import javax.faces.bean.ManagedBean;
import pe.edu.cibertec.bean.Vehiculo;

@ManagedBean(name = "vehiculoBean")
public class vehiculoBean {
    public Vehiculo vehiculo = new Vehiculo();
    private String mensaje;

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
