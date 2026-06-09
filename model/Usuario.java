package com.example.NebulaMusic.model;

public class Usuario {
    private String nombre;
    private String correo;
    private String contrasenia;
    private String txt_pseudonimo;
    private String rad_genero;
    private String sel_subscripcion;
    private String fecha_nacimiento;
    private String chk_terminos;
    private String comentarios;

    public Usuario() {
    }

    public Usuario(String nombre, String correo, String contrasenia, String txt_pseudonimo, String rad_genero, String sel_subscripcion, String fecha_nacimiento, String chk_terminos, String comentarios) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.txt_pseudonimo = txt_pseudonimo;
        this.rad_genero = rad_genero;
        this.sel_subscripcion = sel_subscripcion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.chk_terminos = chk_terminos;
        this.comentarios = comentarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTxt_pseudonimo() {
        return txt_pseudonimo;
    }

    public void setTxt_pseudonimo(String txt_pseudonimo) {
        this.txt_pseudonimo = txt_pseudonimo;
    }

    public String getRad_genero() {
        return rad_genero;
    }

    public void setRad_genero(String rad_genero) {
        this.rad_genero = rad_genero;
    }

    public String getSel_subscripcion() {
        return sel_subscripcion;
    }

    public void setSel_subscripcion(String sel_subscripcion) {
        this.sel_subscripcion = sel_subscripcion;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getChk_terminos() {
        return chk_terminos;
    }

    public void setChk_terminos(String chk_terminos) {
        this.chk_terminos = chk_terminos;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                ", txt_pseudonimo='" + txt_pseudonimo + '\'' +
                ", rad_genero='" + rad_genero + '\'' +
                ", sel_subscripcion='" + sel_subscripcion + '\'' +
                ", fecha_nacimiento='" + fecha_nacimiento + '\'' +
                ", chk_terminos='" + chk_terminos + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}

