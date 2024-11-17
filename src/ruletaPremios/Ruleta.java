/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruletaPremios;
import java.util.*;
/**
 *
 * @author Meybe
 */
public class Ruleta {
    private static final String[] Premios = {
        "Ferrari 488 GTB",
        "Mercedez-Benz Clase S",
        "Bicicleta Trek X-Caliber",  
        "Televisor 4K OLED LG 55 pulgadas",  
        "Viaje a Cancún (incluyendo vuelo y 5 noches de hotel)",  
        "$10,500 MXN",  
        "$1,050 MXN",  
        "Sorpresa",  
        "iPad",  
        "Cámara fotográfica Canon EOS Rebel",  
        "Tarjeta de regalo de Amazon de $1,500 MXN",  
        "Apple Watch Series",  
        "Un año de suscripción a Netflix",
        "Suerte para la proxima :("
    };
    
    public static String Girar(){
        Scanner scanner = new Scanner(System.in);  
        Random random = new Random();  
        
        /*System.out.println("¡Bienvenido a la ruleta de premios!");  
        System.out.println("Presiona Enter para girar la ruleta...");  
        scanner.nextLine();*/
        
        //System.out.println("La ruleta está girando...");  
        for (int i = 0; i < 10; i++) {  
            try {  
                Thread.sleep(300); 
                //System.out.print("Ruleta girando... ");  
            } catch (InterruptedException e) {  
                System.out.println("¡Error inesperado! No se pudo completar el giro de la ruleta.");   
            }  
        }
        int indicePremio = random.nextInt(Premios.length); 
        String premioGanado;
        if(indicePremio == 13){
            premioGanado = "Mejor " + Premios[indicePremio];
        }else{
           premioGanado = "\n¡Felicidades! Has ganado: " + Premios[indicePremio]; 
        }
        return  premioGanado; 
        
    }
}
