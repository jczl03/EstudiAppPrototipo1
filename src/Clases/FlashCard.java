package Clases;
import java.time.*;
import java.util.Scanner;
public class FlashCard extends MiniTarea{
  private static Scanner input=new Scanner(System.in);
  private String pregunta;
  private String respuesta;
  private int coeficienteFrecuencia;
  private LocalDate fecha;
  private LocalTime hora;

  public FlashCard(String pregunta,String respuesta,int id){
    super.id=id;
    coeficienteFrecuencia=0;
    this.pregunta=pregunta;
    this.respuesta=respuesta;

  }
  public FlashCard(String pregunta,String respuesta){
    this(pregunta,respuesta,-1);

  }
  public void preguntar(){
    System.out.println("-----------");
    System.out.println(pregunta);
    System.out.println("Ingrese la palabra 'next' para saltar la pregunta");
    String respuesta1;
    boolean x=true;
    do{
      respuesta1=input.nextLine();
      if(respuesta1.equals("next")){
        System.out.println("Pregunta saltada");
        x=false;
        coeficienteFrecuencia--;
      }else if(respuesta1.equals(respuesta)){
        System.out.println("Respuesta correcta! :D");
        x=false;
        coeficienteFrecuencia++;
      }else{
        System.out.println("Respuesta incorrecta! D:");
        System.out.println("Intentalo nuevamente");
        coeficienteFrecuencia--;
      }
    }while(x);
    

    System.out.println("-----------");


  }

    public String getPregunta() {
        return pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setCoeficienteFrecuencia(int coeficiente_frecuencia) {
        this.coeficienteFrecuencia = coeficienteFrecuencia;
    }
    public void respuestaIncorrecta(){
    coeficienteFrecuencia--;
    }
    public void respuestaCorrecta(){
    coeficienteFrecuencia++;
    }
  
  public void print(){
    System.out.println("____________");
    System.out.println("Pregunta:");
    System.out.println(pregunta);
    System.out.println("Respuesta:");
    
    System.out.println(respuesta);
    System.out.println("___________");
  }
}
