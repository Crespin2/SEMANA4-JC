
package rectangulo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PruebaRectangulo {
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo();
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        valores:
        try{
            System.out.println("Ingrese el valor de la Longitud del rectangulo:");
            float _longitud=Float.parseFloat(leer.readLine());
            System.out.println("Ingrese el valor de la Anchura del rectangulo:");
            float _anchura=Float.parseFloat(leer.readLine());
            
            if((_longitud>0.0 && _longitud<20.0) && (_anchura>0.0 && _anchura<20.0)){
                rec.setLongitud(_longitud);
                rec.setAnchura(_anchura);
                
                System.out.println("--------RESULTADO----------");

                rec.perimetro(_longitud, _anchura);
                rec.area(_longitud, _anchura);
            }
            else{
                System.out.println("Valores no validos ingrese valores >0 y <20!");
            
            }
            
            
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
