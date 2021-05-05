
package Model;

public class Circulo extends Figura_Geometrica{
    
    
public  static final  double PI = 3.14;
public  static final  double RAIO = 8.00;
 

public Circulo(){


}



    @Override
    public void Area() {
        
     Area = PI*(RAIO*RAIO);
     System.out.println("O valor da Area do Raio é:"+Area);   
    }

    @Override
    public void Perimetro() {
        
        P =  RAIO * (2* PI);
        System.out.println("O valor do Perimetro do Raio é:"+P);
         
    }   
}
