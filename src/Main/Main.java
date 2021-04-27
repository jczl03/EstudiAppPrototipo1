package Main;

import java.time.*;
import Clases.*;
import Estructuras.*;
import java.util.Scanner;
import Modelo.*;
public class Main {
   private static final  ArregloDinamico<Asignatura> asignaturas=new ArregloDinamico<Asignatura>();
   private static final ArregloDinamico<Tarea> tareas=new ArregloDinamico<Tarea>();
   private static final ArregloDinamico<Mazo> mazos=new ArregloDinamico<Mazo>();
   

    public static ArregloDinamico<Asignatura> asignaturas() {
        return asignaturas;
    }

    public static ArregloDinamico<Tarea> tareas() {
        return tareas;
    }

    public static ArregloDinamico<Mazo> mazos() {
        return mazos;
    }
   
  public static void main(String[] args) {
    ModeloPrototipo1.menu();
    
  }
 
}