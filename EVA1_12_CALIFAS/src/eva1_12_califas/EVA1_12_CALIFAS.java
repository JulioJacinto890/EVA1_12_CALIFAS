/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_califas;

/**
 *
 * @author hp
 */
public class EVA1_12_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String calificasion;
        calificasion=califa(94);
        
        System.out.println("Calificaion :" +calificasion);
        System.out.println("Calificaion 70:" + califa(70));
                califa(100);
    }
    public static String califa(int calf){
        String c ;
        if (calf>=91 && calf <=100){
            c="A";
        }else if (calf>=81 && calf <=90){
            c="B";
        }else if (calf>=71 && calf <=80){
            c="C";
        }else if (calf>=0 && calf <=70){
            c="D";
        }else{
            c="no hay";
        }
        
        return c;
    }
}
