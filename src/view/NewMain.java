
package view;

import Model.Circulo;
import Model.Figura_Geometrica;
import Model.Quadrado;
import Model.Retangulo;


public class NewMain {

    public static void main(String[] args) {
        
       Quadrado Q = new Quadrado();
       Q.Perimetro();
       Q.Area();
       
       Circulo C = new Circulo();
       C.Area();
       C.Perimetro();
       
       Retangulo R = new Retangulo() {};
       R.Area();R.Perimetro();
          
        }      
    }
    

