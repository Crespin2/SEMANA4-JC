
package controlPersona_lITCA;

public class edificio {
    private String ubicacion;
    private String nombreEdificio;
    private long catidadDepartamentos;
    private long cantPisos;

    public edificio() {
    }
    
    //setter and getter

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }

    public long getCatidadDepartamentos() {
        return catidadDepartamentos;
    }

    public void setCatidadDepartamentos(long catidadDepartamentos) {
        this.catidadDepartamentos = catidadDepartamentos;
    }

    public long getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(long cantPisos) {
        this.cantPisos = cantPisos;
    }
    
}
