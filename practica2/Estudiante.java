/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02.ejercicio2;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String email;
    private String comision;
    private String direccion;

    public Estudiante(String nombre, String apellido, String email, String comision, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.comision = comision;
        this.direccion = direccion;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComision() {
        return comision;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String tusDatos(){
        return "Nombre: "+ this.getNombre() +"- Apellido: "+ this.getApellido() +"- Email: "+this.getEmail()+"-  Comision: "+ this.getComision()+"- Direccion:"+ this.getDireccion()+"\n";
    }
    
}
