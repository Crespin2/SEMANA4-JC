
package controlPersona_lITCA;

public class area extends empleados{
    private String codigoArea;
    private String nombreArea;
    private long catidadEmpleados;
    private long numEdificios; 

    public area() {
    }
    
    
    //setter and getter

    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public long getCatidadEmpleados() {
        return catidadEmpleados;
    }

    public void setCatidadEmpleados(long catidadEmpleados) {
        this.catidadEmpleados = catidadEmpleados;
    }

    public long getNumEdificios() {
        return numEdificios;
    }

    public void setNumEdificios(long numEdificios) {
        this.numEdificios = numEdificios;
    }
    
}
