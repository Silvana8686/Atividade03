
package Model;

public class Quadrado extends Figura_Geometrica {
    
public  static final  double ALTURA = 5.00;
public  static final  double BASE  =  5.00;

public Quadrado(){


}


    @Override
  public void Area() {
        
  Area = ALTURA*BASE;
  
        System.out.println("A area de um Quadrado é:"+Area);
         
    }
  

    @Override
    public void Perimetro() {
      P =  4* BASE;
         System.out.println("O Perimetro de um Quadrado é:"+P);
      
    }
    
}
