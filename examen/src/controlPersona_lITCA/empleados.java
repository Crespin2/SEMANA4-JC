
package controlPersona_lITCA;

public class empleados {
    private String nombre;
    private String codigoEmpleado;
    private long edad;
    private String direccion;
    private String area;
    private String cargo;
    private double sueldoBase;
    private String fechaIngreso;
    private long tipoEmpleado;

    public long getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(long tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
    
    //constructor

    public empleados() {
    }
    //setter and getter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public long getEdad() {
        return edad;
    }

    public void setEdad(long edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    public void datos(String _nombre, String _codigoEmpleado, Long _edad,String _direccion, String _area){
        System.out.println("---DATOS EMPLEADO---");
        System.out.println("Nombre: "+_nombre);    
        System.out.println("Direccion:"+_direccion );
        System.out.println("Codigo Empleado: " + _codigoEmpleado);
        System.out.println("Edad: " + _edad);
        System.out.println("Pertenece al area de: "+ _area);
        

    }
}
