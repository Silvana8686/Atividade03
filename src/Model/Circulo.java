
package Model;

public class Circulo extends Figura_Geometrica{
    
    
public  static final  double PI = 3.14;
public  static final  double RAIO = 8.00;
 
public double AREA;
public double perimetro;

    public double getAREA() {
        return AREA;
    }

    public void setAREA(double AREA) {
        this.AREA = AREA;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public void Area() {
        
     AREA = PI*(RAIO*RAIO);
     System.out.println("O valor da Area do Raio é:"+AREA);   
    }

    @Override
    public void Perimetro() {
        
        perimetro =  RAIO * (2* PI);
        System.out.println("O valor do Perimetro do Raio é:"+perimetro);
         
    }   
}
