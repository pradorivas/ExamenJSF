/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.managed;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;

/**
 *
 * @author portatil
 */
@ManagedBean(name = "reporte")
public class ReporteBean {

    private String tipo;
    private String titulo;

    public void confirmarAccion(ActionEvent ae) {
        tipo = (String) ae.getComponent().getAttributes().get("tipo");
        titulo = (String) ae.getComponent().getAttributes().get("titulo");
    }

    public String consultar() {
        String pag="";
        if (tipo.equals("add") && titulo.equals("add_vehicle")) {
            pag="add";
        }
        if (tipo.equals("show") && titulo.equals("show_vehicle")) {
            pag="show";
        }
        //obtener clientes según tipo
        //clientes=servicio.getClientes(tipo);
        return pag;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private Locale localePeru;

    @PostConstruct
    public void iniciar() {
        localePeru = new Locale("es", "ES");
    }
}
