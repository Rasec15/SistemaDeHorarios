
package Administrador.horarios;


public class profesor {

    public String nombre;
    public int horas;
    public String dias;

    public profesor(String nombre, int horas, String dias) {
        this.nombre = nombre;
        this.horas = horas;
        this.dias = dias;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
