
package Model;

public abstract class Figura_Geometrica {
    
      public double Area;
      public double P;
      
      
      public Figura_Geometrica(){
      
      
      }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public double getP() {
        return P;
    }

    public void setP(double P) {
        this.P = P;
    }
      
      
      
    
 public abstract void Area();
  
public abstract void Perimetro();

     
}
