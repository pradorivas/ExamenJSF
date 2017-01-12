package pe.edu.cibertec.managed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import pe.edu.cibertec.bean.Vehiculo;

@ManagedBean(name = "memo")
@SessionScoped

public class vehiculoMemoria {

    public vehiculoBean veh;
    public Map<String, Vehiculo> vehiculos;

    public vehiculoMemoria() {
        veh = new vehiculoBean();
        vehiculos = new HashMap<>();
        //productos.put("10", new Vehiculo(10, "pantalon", 2, 2.3, 100));

    }

    public List<Vehiculo> getProducto() {
        return new ArrayList<>(vehiculos.values());
    }

    public Vehiculo getVehiculoPorCodigo(String codigo) {
        return vehiculos.get(codigo);
    }

    public void obtenerVehiculo() {
        vehiculos.put(veh.getVehiculo().getPlaca().toString(),veh.getVehiculo());

    }
}
