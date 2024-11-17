package Usuario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
import java.io.*;
/**
 *
 * @author Meybe
 */
public class Usuario implements Serializable{  
    private String nom_Usuario;  
    private String nickname;  
    private String contra;  
    private double saldo;  
    private List<String> premios;  

    public Usuario(String nom_Usuario, String nickname, String contra) {  
        this.nom_Usuario = nom_Usuario;  
        this.nickname = nickname;  
        this.contra = contra;  
        this.saldo = 100;  
        this.premios = new ArrayList<>(); 
    }
    
    public Usuario(){
    }

    // Getters  
    public String getNombre() {  
        return nom_Usuario;  
    }  

    public String getNickname() {  
        return nickname;  
    }  

    public String getContra() {  
        return contra;  
    }  

    public double getSaldo() {  
        return saldo;  
    }  

    public List<String> getPremios() {  
        return premios;  
    }  

    // Setters  
    public void setNombre(String nom_Usuario) {  
        this.nom_Usuario = nom_Usuario;  
    }  

    public void setNickname(String nickname) {  
        this.nickname = nickname;  
    }  

    public void setContra(String contra) {  
        this.contra = contra;  
    }  

    public void setSaldo(double saldo) {  
        this.saldo = saldo;  
    }  

    public void setPremios(List<String> premios) {  
        this.premios = premios;  
    }  

    // Método para agregar un premio a la lista  
    public void agregarPremio(String premio) {  
        this.premios.add(premio);  
    } 
    
    @Override
    public String toString(){
        return "Usuario{" +  
                "nom_Usuario='" + nom_Usuario + '\'' +  
                ", nickname='" + nickname + '\'' + 
                ", contraseña=" + contra + 
                ", saldo=" + saldo +  
                ", premios=" + premios +  
                '}';
    }
    
}  