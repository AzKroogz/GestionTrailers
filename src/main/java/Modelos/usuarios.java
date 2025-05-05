package Modelos;

public class usuarios {
    int id_usuario;
    String nombre;
    String rol;
    String usuario;
    String contraseña;
    boolean activo;

    public usuarios(int id_usuario, String nombre, String rol, String usuario, String contraseña, boolean activo) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.rol = rol;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.activo = activo;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
