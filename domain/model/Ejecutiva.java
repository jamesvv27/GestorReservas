package domain.model;

import domain.enums.Repetidor;
import domain.enums.TipoHabitacion;

public class Ejecutiva extends Habitacion
{
    private int tamanoEscritorioCm;
    private Repetidor repetidor;
    
    public Ejecutiva(int numeroHabitacion, int numeroOcupantes,
    		int tamanoEscritorioCm, Repetidor repetidor){
        super(numeroHabitacion, numeroOcupantes, TipoHabitacion.EJECUTIVA);
        this.tamanoEscritorioCm = tamanoEscritorioCm;
        this.repetidor = Repetidor.SWITCH;
    }
    
    public int getTamanoEscritorio() {
    	return tamanoEscritorioCm;
    }
    
    public Repetidor getRepetidor() {
    	return repetidor;
    }
}
