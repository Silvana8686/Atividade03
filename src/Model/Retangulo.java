
package Model;

public abstract class Retangulo extends Figura_Geometrica {
    
public  static final  double ALTURA =  5.00;
public  static final  double BASE  =   8.00; 

    public double AreaR;
    public double P;

    public double getAreaR() {
        return AreaR;
    }

    public void setAreaR(double AreaR) {
        this.AreaR = AreaR;
    }

    public double getP() {
        return P;
    }

    public void setP(double P) {
        this.P = P;
    }
    
    @Override
    public void Area() {
     AreaR = ALTURA * BASE; 
     System.out.println("A area do Retangulo é: "+AreaR);
    }

    @Override
    public void Perimetro() {
     P = 2*(ALTURA + BASE);
     System.out.println("O Perimetro de um Retangulo é:"+P);
    
        
    }
          
}
