
package Model;

public abstract class Retangulo extends Figura_Geometrica {
    
public  static final  double ALTURA =  5.00;
public  static final  double BASE  =   8.00; 

    public Retangulo (){
    
    
    }
    
    @Override
    public void Area() {
     Area = ALTURA * BASE; 
     System.out.println("A area do Retangulo é: "+Area);
    }

    @Override
    public void Perimetro() {
     P = 2*(ALTURA + BASE);
     System.out.println("O Perimetro de um Retangulo é:"+P);
    
        
    }
          
}
