package domain.model;

import domain.enums.EstadoHabitacion;
import domain.enums.TipoHabitacion;

public class Habitacion
{
    private final int numeroHabitacion;
    private int numeroOcupantes;
    private final TipoHabitacion tipoHabitacion;
    private EstadoHabitacion estadoHabitacion;
    
    public Habitacion(int numeroHabitacion, int numeroOcupantes, TipoHabitacion tipoHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.numeroOcupantes = 0;
        this.estadoHabitacion = EstadoHabitacion.DISPONIBLE;
        this.tipoHabitacion = tipoHabitacion;
    }

    
    public TipoHabitacion getTipoHabitacion() {
    	return tipoHabitacion;
    }
    
    public int getNumeroHabitacion()
    {
        return numeroHabitacion;
    }

    public int getNumeroOcupantes()
    {
        return numeroOcupantes;
    }
    
    public void reservar(){
        asegurarEstado(EstadoHabitacion.DISPONIBLE , "reservar");
        this.estadoHabitacion = EstadoHabitacion.RESERVADA;
    }
    
    public void ocupar(int ocupantes){
        asegurarEstado(EstadoHabitacion.RESERVADA, "ocupar");
        this.numeroOcupantes = ocupantes;
        this.estadoHabitacion = EstadoHabitacion.OCUPADA;
    }
    
    public void desocupar() {
        asegurarEstado(EstadoHabitacion.OCUPADA, "desocupar");
        this.numeroOcupantes = 0;
        this.estadoHabitacion = EstadoHabitacion.LIMPIEZA;
    }
    
    public void limpiar(){
        asegurarEstado(EstadoHabitacion.LIMPIEZA, "limpiar");
        this.estadoHabitacion = EstadoHabitacion.DISPONIBLE;
    }
    
    public void enviarAMantenimiento(){
        this.estadoHabitacion = EstadoHabitacion.MANTENIMIENTO;
    }
    
    public void finalizarMantenimiento(){
        asegurarEstado(EstadoHabitacion.MANTENIMIENTO, "finalizar mantenimiento");
        this.estadoHabitacion = EstadoHabitacion.DISPONIBLE;
    }
    
    private void asegurarEstado(EstadoHabitacion esperado, String operacion){
        if (this.estadoHabitacion != esperado){
            System.out.println("No se puede realizar " + operacion +
                    "cuando estadoHabitacion = " + this.estadoHabitacion + " esperado " +
                    esperado);
        }
    }
    
   @Override
   public String toString() {
       return "Habitacion{ \nNumero habitacion: " + numeroHabitacion +
               "\nNumero ocupantes: " + numeroOcupantes +
               "\nEstado habitacion: " + estadoHabitacion +
               "\nTipo Habitacion: " + tipoHabitacion +"\n}";
   }
    
}
