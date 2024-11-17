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
            return true;
        }else{
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
    
    private static String modificarUsuario(String contra, String nombre) {
        if (!nombre.isEmpty()) usuarioActual.setNombre(nombre);

        if (!contra.isEmpty()) usuarioActual.setContra(contra);
        
        guardarUsuarios();
        
        return "Perfil actualizado exitosamente.";
    }

    private static String verUsuarioActual() {
        return usuarioActual.toString();
    }
    
    private static String guardarUsuarios() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(usuarios);
            return "Usuarios guardados exitosamente.";
        } catch (IOException e) {
            String a = "Error al guardar usuarios: " + e.getMessage();
            return a;
        }
    }

    @SuppressWarnings("unchecked")
    private static String cargarUsuarios() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                usuarios = (Map<String, Usuario>) ois.readObject();
                return "Usuarios cargados exitosamente.";
            } catch (IOException | ClassNotFoundException e) {
                String a = "Error al cargar usuarios: " + e.getMessage();
                return a;
            }
        } else {
            return "El archivo no existe. Se creará un nuevo mapa de usuarios.";
        }
    }
    
}

    