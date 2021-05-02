
package Model;

public class Quadrado extends Figura_Geometrica {
    
public  static final  double ALTURA = 5.00;
public  static final  double BASE  =  5.00;

public double AreaQ;
public double PQ;


    public double getAreaQ() {
        return AreaQ;
    }

    public void setAreaQ(double AreaQ) {
        this.AreaQ = AreaQ;
    }

    public double getPQ() {
        return PQ;
    }

    public void setPQ(double PQ) {
        this.PQ = PQ;
    }

    @Override
  public void Area() {
        
  AreaQ = ALTURA*BASE;
  
        System.out.println("A area de um Quadrado é:"+AreaQ);
         
    }
  

    @Override
    public void Perimetro() {
      PQ =  4* BASE;
         System.out.println("O Perimetro de um Quadrado é:"+PQ);
      
    }
    
}
