
package controlPersona_lITCA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class principal {
    public static void main(String[] args) {
        empleados em = new empleados();
        area ar= new area();
        docente doc = new docente();
        edificio edi=new edificio();
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        NumberFormat formato = new DecimalFormat("$#,###.##");
        
        try{
            System.out.println("---DATOS EMPLEADO---");
            System.out.println("Ingrese el nombre del empleado:");
            String _nombre=leer.readLine();
            System.out.println("Codigo de empleado:");
            String _codigoEmpleado=leer.readLine();
            System.out.println("Edad: ");
            Long _edad=Long.parseLong(leer.readLine());
            System.out.println("Direccion:");
            String _direccion=leer.readLine();
            System.out.println("Area a la que pertence:");
            String _area=leer.readLine();

            System.out.println("\n---DATOS AREA---");
            System.out.println("Nombre del area: ");
            String _nombreArea=leer.readLine();
            System.out.println("Codigo del area: ");
            String _codigoArea=leer.readLine();
            System.out.println("Cantidad de empleado: ");
            long _cantidadEmpleados=Long.parseLong(leer.readLine());
            System.out.println("Numero de edifios: ");
            long _numEdificios=Long.parseLong(leer.readLine());
            
            System.out.println("\n---DATOS EDIFICIOS---");
            System.out.println("Ubicacon: ");
            String ubicacion=leer.readLine();
            System.out.println("Nombre: ");
            String _nombreEdificio=leer.readLine();
            System.out.println("Cantidad de Departamentos: ");
            long _cantidadDepartamentos=Long.parseLong(leer.readLine());
            System.out.println("Numero de pisos: ");
            long _cantPisos=Long.parseLong(leer.readLine());
            
            
            em.setNombre(_nombre);
            em.setCodigoEmpleado(_codigoEmpleado);
            em.setEdad(_edad);
            em.setDireccion(_direccion);
            em.setArea(_area);
            
           edi.setCatidadDepartamentos(_cantidadDepartamentos);
           edi.setCantPisos(_cantPisos);
           edi.setNombreEdificio(_nombreEdificio);
           edi.setUbicacion(ubicacion);
           
            
            //area
            ar.setNombreArea(_nombreArea);
            ar.setCodigoArea(_codigoArea);
            ar.setCatidadEmpleados(_cantidadEmpleados);
            ar.setNumEdificios(_numEdificios);
            System.out.println("-TIPO DE EMPLEADO-: ");
            System.out.println("1. Docente: ");
            System.out.println("2. Administrativo: ");
            long _tipoEmpleado=Long.parseLong(leer.readLine());
            em.setTipoEmpleado(_tipoEmpleado);
            System.out.println("Ingesa el salario Devengado del empleado");
            double salarioD=Double.parseDouble(leer.readLine());
            //docente
            if (_tipoEmpleado==1){
                 System.out.println("-DOICENTE-: ");
            System.out.println("1. Permanente: ");
            System.out.println("2. por servicio: ");
            long _tipoDocente=Long.parseLong(leer.readLine());
            doc.setTipoDocente(_tipoDocente);
                if(_tipoDocente==1){
                //ISSS, AFP, ISR
                double isss=salarioD*0.07;
                double afp=salarioD*0.0725;
                double isr=salarioD*0.10;
                double descuentoT=isss+afp+isr;
                double salarioLiquido=salarioD-descuentoT;
                
                em.datos(_nombre, _codigoEmpleado, _edad, _direccion, _area);
                
                System.out.println("Salario Devengado: "+formato.format(salarioD));
                 System.out.println("Empleado permanente");
                 System.out.println("Descuentos: " + formato.format(descuentoT));
                 System.out.println("ISSS " + formato.format(isss ));
                 System.out.println("AFP " + formato.format(afp));
                 System.out.println("ISR " +formato.format(isr));
                 System.out.println("Salario Liquido Total " +formato.format(salarioLiquido));
                 
                 
                }
                else if (_tipoDocente==2) {
                    double renta=salarioD*0.10;
                    double salarioLiquido=salarioD-renta; 
                 em.datos(_nombre, _codigoEmpleado, _edad, _direccion, _area);
                 System.out.println("Salario Devengado: "+formato.format(salarioD));
                 System.out.println("Empleado por servicio");
                 System.out.println("Renta: " + formato.format(renta));
                 System.out.println("Salario Liquido Total" + formato.format(salarioLiquido));
                }
                
            }
            else if (_tipoEmpleado==2) {
                double isss=salarioD*0.07;
                double afp=salarioD*0.0725;
                double isr=salarioD*0.10;
                double descuentoT=isss+afp+isr;
                double salarioLiquido=salarioD-descuentoT;
                
                em.datos(_nombre, _codigoEmpleado, _edad, _direccion, _area);
                System.out.println("Salario Devengado: "+formato.format(salarioD));
                 System.out.println("Descuentos: " +formato.format( descuentoT));
                 System.out.println("ISSS " + formato.format(isss ));
                 System.out.println("AFP " +formato.format( afp));
                 System.out.println("ISR " +formato.format(isr));
                 System.out.println("Salario Liquido Total " +formato.format(salarioLiquido));
            
            }
            

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
       
}
