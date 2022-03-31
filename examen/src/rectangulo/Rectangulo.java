
package rectangulo;

public class Rectangulo {
    //atributos
    private float longitud=1;
    private float anchura=1;
    
    //metodo constructor
    public Rectangulo() {
        
    }
    
    //setter and getter
    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public float getAnchura() {
        return anchura;
    }

    public void setAnchura(float anchura) {
        this.anchura = anchura;
    }
    
    //metodo para calcular el perimetro
    public void perimetro(float _longitud, float _anchura){
        float p= 2*(_longitud + _anchura);
        System.out.println("El perimetro del rectangulo es:" +p);
    }
    //metodo para calcular el area
    public void area(float _longitud, float _anchura){
        float a = _anchura*_longitud;
        System.out.println("El area del rectangulo es:" +a);
    }
    
    
    
}
