/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;
import java.io.*;
import java.util.*;
/**
 *
 * @author Meybe
 */

public class UserManagement {
    private static final String FILE_NAME = "Usuarios";
    private static Map<String, Usuario> usuarios = new HashMap<>();
    private static Usuario usuarioActual = null;
    
    public UserManagement(){
        cargarUsuarios();
    }
    
    public static boolean iniciarSesion(String nickname, String contraseña){
        Usuario usuario = usuarios.get(nickname);
        
        if(usuario != null && usuario.getContra().equals(contraseña)){
            usuarioActual = usuario;
            //System.out.println("Inicio de sesión exitoso.");
            return true;
        } else {
            //System.out.println("Error: Credenciales incorrectas.");
            return false;
        }
    }
    
    public static boolean crearUsuario(String nombre, String nickname, String contra){
        if(usuarios.containsKey(nickname)){
            
            return false;
        }
        
        Usuario nuevo = new Usuario(nombre, nickname, contra);
        usuarios.put(nickname, nuevo);
        guardarUsuarios();
        return true;
    }
    
    public static String modificarUsuario(String contra, String nombre) {
        if (usuarioActual == null) {
            return "Error: No hay usuario autenticado.";
        }

        if (!nombre.isEmpty()) usuarioActual.setNombre(nombre);
        if (!contra.isEmpty()) usuarioActual.setContra(contra);
        
        return guardarUsuarios();
    }

    public static String verUsuarioActual() {
        if (usuarioActual == null) {
            return "No hay usuario autenticado.";
        }
        return usuarioActual.toString();
    }
    
    public Usuario getUsuarioActual(){
        return usuarioActual;
    }
    
    public static String guardarUsuarios() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(usuarios);
            return "Usuarios guardados exitosamente.";
        } catch (IOException e) {
            return "Error al guardar usuarios: " + e.getMessage();
        }
    }

    @SuppressWarnings("unchecked")
    public static String cargarUsuarios() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                Object obj = ois.readObject();
                if (obj instanceof Map) {
                    usuarios = (Map<String, Usuario>) obj;
                    return "Usuarios cargados exitosamente.";
                } else {
                    return "El archivo contiene datos en un formato incorrecto.";
                }
            } catch (IOException e) {
                return "Error al cargar usuarios: " + e.getMessage();
            } catch (ClassNotFoundException e) {
                return "Error al cargar clase: " + e.getMessage();
            } catch (ClassCastException e) {
                return "Error de conversión de tipo al cargar usuarios: " + e.getMessage();
            }
        } else {
            return "El archivo no existe. Se creará un nuevo mapa de usuarios.";
        }
    }
}
