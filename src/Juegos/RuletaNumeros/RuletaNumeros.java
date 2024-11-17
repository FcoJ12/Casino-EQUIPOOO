/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RuletaNumeros;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author arely
 */
public class RuletaNumeros {
    private int fichas = 10;
    
    
    ArrayList<UtileriasRuleta> casilleros = new ArrayList<>();
    /*UtileriasRuleta pares = new UtileriasRuleta();
    UtileriasRuleta impares = new UtileriasRuleta();*/
    UtileriasRuleta pares = new Pares();
    UtileriasRuleta impares = new Impares();
    UtileriasRuleta negros = new Negro();
    UtileriasRuleta rojos = new Rojo();
    UtileriasRuleta docena1 = new Docenas();
    UtileriasRuleta docena2 = new Docenas();
    UtileriasRuleta docena3 = new Docenas();
    UtileriasRuleta columna1 = new Columna();
    UtileriasRuleta columna2 = new Columna();
    UtileriasRuleta columna3 = new Columna();
    UtileriasRuleta falta = new FaltaPasa();
    UtileriasRuleta pasa = new FaltaPasa();
    
    
    public void girar(){
        //num aleatorio entre 0 y 36
        int result = (int) (Math.random() * 37);
        JOptionPane.showMessageDialog(null, "Resultado " + result);
        
        boolean par = (result % 2 == 0);
        if (result == 0){
            // No se gana nada si es 0
        }else if (par){
            fichas = fichas + pares.calcularGanancia();
        } else {
            fichas = fichas + impares.calcularGanancia();
            
        }
        
        if (result >= 1 && result <= 12) {
            fichas = fichas + docena1.calcularGanancia();
        } else if (result >= 13 && result <= 24) {
            fichas = fichas + docena2.calcularGanancia();
        } else if (result >= 25 && result <= 36) {
            fichas = fichas + docena3.calcularGanancia();
        }
        
        if (result >= 1 && result <= 18) {
            fichas = fichas + falta.calcularGanancia();
        } else if (result >= 19 && result <= 36) {
            fichas = fichas + pasa.calcularGanancia();
        }
        
        if (result % 3 == 1) {
            fichas = fichas + columna1.calcularGanancia();
        } else if (result % 3 == 2) {
            fichas = fichas + columna2.calcularGanancia();
        } else if (result % 3 == 0 && result != 0) {
            fichas = fichas + columna3.calcularGanancia();
        }
        
        for (UtileriasRuleta casillero : casilleros){
            
            if (casillero instanceof Pleno){
                Pleno pleno = (Pleno) casillero;
                if(pleno.getNum() == result){
                    fichas = fichas + pleno.calcularGanancia();
                }
            }
            
            //casillero.limpiar();
        }
        
        for (UtileriasRuleta casillero : casilleros) {
            if (casillero instanceof Pleno) {
                Pleno pleno = (Pleno) casillero;
                if (pleno.getNum() == result) {
                    // Si el color es "Negro", aplicar ganancia del objeto negros
                    if ("Negro".equalsIgnoreCase(pleno.getColor())) {
                        fichas += negros.calcularGanancia();
                    }
                    // Si el color es "Rojo", aplicar ganancia del objeto rojos
                    else if ("Rojo".equalsIgnoreCase(pleno.getColor())) {
                        fichas += rojos.calcularGanancia();
                    }
                }
            }
        }
        
        for (UtileriasRuleta casillero : casilleros) {
            casillero.limpiar();
        }
        
    }
    
    public RuletaNumeros(){
        casilleros.add(pares);
        casilleros.add(impares);
        
        casilleros.add(new Pleno(1, "Rojo"));
        casilleros.add(new Pleno(2, "Negro"));
        casilleros.add(new Pleno(3, "Rojo"));
        casilleros.add(new Pleno(4, "Negro"));
        casilleros.add(new Pleno(5, "Rojo"));
        casilleros.add(new Pleno(6, "Negro"));
        casilleros.add(new Pleno(7, "Rojo"));
        casilleros.add(new Pleno(8, "Negro"));
        casilleros.add(new Pleno(9, "Rojo"));
        casilleros.add(new Pleno(10, "Negro"));
        casilleros.add(new Pleno(11, "Negro"));
        casilleros.add(new Pleno(12, "Rojo"));
        casilleros.add(new Pleno(13, "Negro"));
        casilleros.add(new Pleno(14, "Rojo"));
        casilleros.add(new Pleno(15, "Negro"));
        casilleros.add(new Pleno(16, "Rojo"));
        casilleros.add(new Pleno(17, "Negro"));
        casilleros.add(new Pleno(18, "Rojo"));
        casilleros.add(new Pleno(19, "Rojo"));
        casilleros.add(new Pleno(20, "Negro"));
        casilleros.add(new Pleno(21, "Rojo"));
        casilleros.add(new Pleno(22, "Negro"));
        casilleros.add(new Pleno(23, "Rojo"));
        casilleros.add(new Pleno(24, "Negro"));
        casilleros.add(new Pleno(25, "Rojo"));
        casilleros.add(new Pleno(26, "Negro"));
        casilleros.add(new Pleno(27, "Rojo"));
        casilleros.add(new Pleno(28, "Negro"));
        casilleros.add(new Pleno(29, "Negro"));
        casilleros.add(new Pleno(30, "Rojo"));
        casilleros.add(new Pleno(31, "Negro"));
        casilleros.add(new Pleno(32, "Rojo"));
        casilleros.add(new Pleno(33, "Negro"));
        casilleros.add(new Pleno(34, "Rojo"));
        casilleros.add(new Pleno(35, "Negro"));
        casilleros.add(new Pleno(36, "Rojo"));
        
        casilleros.add(negros);
        casilleros.add(rojos);
        casilleros.add(docena1);
        casilleros.add(docena2);
        casilleros.add(docena3);
        casilleros.add(columna1);
        casilleros.add(columna2);
        casilleros.add(columna3);
        casilleros.add(falta);
        casilleros.add(pasa);
    }
    
    public void mostrar(){
        for (UtileriasRuleta casillero: casilleros){
            System.out.println(casillero);
        }
    }
    
    public void calApuesta(int x, int y){
        //0
        if (x >= 20 && x <= 86){
            if (y >= 11 && y <= 273) {
                System.out.println("Apuesta al 0");
            }
        }
        //1ra columna
        if (y >= 165 && y <= 236){
            if (x >= 88 && x <= 132) {
                System.out.println("Apuesta al numero 1");
                casilleros.get(2).sumarFicha();
            }
            if (x >= 138 && x <= 180) {
                System.out.println("Apuesta al numero 4");
                casilleros.get(5).sumarFicha();
            }
            if (x >= 184 && x <= 228) {
                System.out.println("Apuesta al numero 7");
                casilleros.get(8).sumarFicha();
               
            }
            if (x >= 230 && x <= 276) {
                System.out.println("Apuesta al numero 10");
                casilleros.get(11).sumarFicha();
                
            }
            if (x >= 280 && x <= 321) {
                System.out.println("Apuesta al numero 13");
                casilleros.get(14).sumarFicha();
            }
            if (x >= 324 && x <= 369) {
                System.out.println("Apuesta al numero 16");
                casilleros.get(17).sumarFicha();
            }
            if (x >= 373 && x <= 416) {
                System.out.println("Apuesta al numero 19");
                casilleros.get(20).sumarFicha();
            }
            if (x >= 422 && x <= 463) {
                System.out.println("Apuesta al numero 22");
                casilleros.get(23).sumarFicha();
            }
            if (x >= 468 && x <= 511) {
                System.out.println("Apuesta al numero 25");
                casilleros.get(26).sumarFicha();
            }
            if (x >= 517 && x <= 560) {
                System.out.println("Apuesta al numero 28");
                casilleros.get(29).sumarFicha();
            }
            if (x >= 563 && x <= 606) {
                System.out.println("Apuesta al numero 31");
                casilleros.get(32).sumarFicha();
            }
            if (x >= 610 && x <= 653) {
                System.out.println("Apuesta al numero 34");
                casilleros.get(35).sumarFicha();
            }
            if (x >= 660 && x <= 701) {
                System.out.println("Apuesta a la 1ra columna");
                columna1.sumarFicha();
            }
        }
        //2da columna
        if (y >= 86 && y <= 161){
            if (x >= 88 && x <= 132) {
                System.out.println("Apuesta al numero 2");
                casilleros.get(3).sumarFicha();
            }
            if (x >= 138 && x <= 180) {
                System.out.println("Apuesta al numero 5");
                casilleros.get(6).sumarFicha();
            }
            if (x >= 184 && x <= 228) {
                System.out.println("Apuesta al numero 8");
                casilleros.get(9).sumarFicha();
            }
            if (x >= 230 && x <= 276) {
                System.out.println("Apuesta al numero 11");
                casilleros.get(12).sumarFicha();
            }
            if (x >= 280 && x <= 321) {
                System.out.println("Apuesta al numero 14");
                casilleros.get(15).sumarFicha();
            }
            if (x >= 324 && x <= 369) {
                System.out.println("Apuesta al numero 17");
                casilleros.get(18).sumarFicha();
            }
            if (x >= 373 && x <= 416) {
                System.out.println("Apuesta al numero 20");
                casilleros.get(21).sumarFicha();
            }
            if (x >= 422 && x <= 463) {
                System.out.println("Apuesta al numero 23");
                casilleros.get(24).sumarFicha();
            }
            if (x >= 468 && x <= 511) {
                System.out.println("Apuesta al numero 26");
                casilleros.get(27).sumarFicha();
            }
            if (x >= 517 && x <= 560) {
                System.out.println("Apuesta al numero 29");
                casilleros.get(30).sumarFicha();
            }
            if (x >= 563 && x <= 606) {
                System.out.println("Apuesta al numero 32");
                casilleros.get(33).sumarFicha();
            }
            if (x >= 610 && x <= 653) {
                System.out.println("Apuesta al numero 35");
                casilleros.get(36).sumarFicha();
            }
            if (x >= 660 && x <= 701) {
                System.out.println("Apuesta a la 2da columna");
                columna2.sumarFicha();
            }
        }
        //3ra columna
        if (y >= 11 && y <= 83){
            if (x >= 88 && x <= 132) {
                System.out.println("Apuesta al numero 3");
                casilleros.get(4).sumarFicha();
            }
            if (x >= 138 && x <= 180) {
                System.out.println("Apuesta al numero 6");
                casilleros.get(7).sumarFicha();
            }
            if (x >= 184 && x <= 228) {
                System.out.println("Apuesta al numero 9");
                casilleros.get(10).sumarFicha();
            }
            if (x >= 230 && x <= 276) {
                System.out.println("Apuesta al numero 12");
                casilleros.get(13).sumarFicha();
            }
            if (x >= 280 && x <= 321) {
                System.out.println("Apuesta al numero 15");
                casilleros.get(16).sumarFicha();
            }
            if (x >= 324 && x <= 369) {
                System.out.println("Apuesta al numero 18");
                casilleros.get(19).sumarFicha();
            }
            if (x >= 373 && x <= 416) {
                System.out.println("Apuesta al numero 21");
                casilleros.get(22).sumarFicha();
            }
            if (x >= 422 && x <= 463) {
                System.out.println("Apuesta al numero 24");
                casilleros.get(25).sumarFicha();
            }
            if (x >= 468 && x <= 511) {
                System.out.println("Apuesta al numero 27");
                casilleros.get(28).sumarFicha();
            }
            if (x >= 517 && x <= 560) {
                System.out.println("Apuesta al numero 30");
                casilleros.get(31).sumarFicha();
            }
            if (x >= 563 && x <= 606) {
                System.out.println("Apuesta al numero 33");
                casilleros.get(34).sumarFicha();
            }
            if (x >= 610 && x <= 653) {
                System.out.println("Apuesta al numero 36");
                casilleros.get(37).sumarFicha();
            }
            if (x >= 660 && x <= 701) {
                System.out.println("Apuesta a la 3ra columna");
                columna3.sumarFicha();
            }
        }
        //cuarta columna
        if (y >= 240 && y <= 311){
            if (x >= 89 && x <= 276) {
                System.out.println("Apuesta a la 1ra docena");
                docena1.sumarFicha();
            }
            if (x >= 280 && x <= 464) {
                System.out.println("Apuesta a la 2da docena");
                docena2.sumarFicha();
            }
            if (x >= 468 && x <= 655) {
                System.out.println("Apuesta a la 3ra docena");
                docena3.sumarFicha();
            }
        }
        //quinta columna
        if (y >= 316 && y <= 385){
            if (x >= 280 && x <= 370) {
                System.out.println("Apuesta al rojo");
                rojos.sumarFicha();
            }
            if (x >= 374 && x <= 464) {
                System.out.println("Apuesta al negro");
                negros.sumarFicha();
            }
            if (x >= 89 && x <= 183) {
                System.out.println("Apuesta a los numeros del 1 a 18");
                falta.sumarFicha();
            }
            if (x >= 185 && x <= 276) {
                System.out.println("Apuesta a los numeros pares");//borrar linea
                pares.sumarFicha();
            }
            if (x >= 468 && x <= 560) {
                System.out.println("Apuesta a los numeros impares");//borrar linea
                impares.sumarFicha();
            }
            if (x >= 566 && x <= 655) {
                System.out.println("Apuesta a los numeros del 19 al 36");
                falta.sumarFicha();
            }
        }
       fichas--;    
    }
    

    public int getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }
}
