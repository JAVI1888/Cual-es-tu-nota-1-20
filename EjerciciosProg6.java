
package ejerciciosprog1;

import javax.swing.JOptionPane;

public class EjerciciosProg6 {
    public static void main(String args[]){
        byte nota=0;
        nota=Byte.parseByte(JOptionPane.showInputDialog("Ingresa el valor de tu calificacion"));
        if (nota==19||nota==20){
            System.out.println("Tu nota es A");
        }else 
            if(nota==16||nota==17||nota==18){
        System.out.println("Tu nota es B");
        }else 
                if(nota==13||nota==14||nota==15){
            System.out.println("Tu nota es C");
            
        }else 
                    if(nota==10||nota==11||nota==12){
            System.out.println("Tu nota es D");
            
        }else 
                        if(nota==1||nota==2||nota==3|nota==4||nota==5||nota==6||nota==7||nota==8||nota==9){
            System.out.println("Tu nota es E");
        }
    }
    
}
