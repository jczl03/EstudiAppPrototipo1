package Clases;
import java.time.*;
public class Recordatorio extends MiniTarea{
  
  LocalDate fecha;
  LocalTime hora;
  String nombre;
  String descripcion;

    public Recordatorio(LocalDate fecha, LocalTime hora, String nombre, String descripcion) {
        this.fecha = fecha;
        this.hora = hora;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
  
  public void print(){
    System.out.println("__Recordatorio: "+nombre+"__");
    System.out.print(fecha+"  ");
    if(hora==null){
        System.out.print(hora);
    }
    System.out.println("");
    System.out.println(descripcion);
  }
}