package domain.model;

import domain.enums.Repetidor;
import domain.enums.TipoHabitacion;
import domain.enums.TipoAc;

public class Suite extends Habitacion {
	
	private TipoAc tipoAc;
	private Repetidor repetidor;

	public Suite(int numeroHabitacion, int numeroOcupantes,
			Repetidor repetidor, TipoAc tipoAc) {
		super(numeroHabitacion, numeroOcupantes, TipoHabitacion.SUITE);
		this.repetidor = Repetidor.HUB;
	}

	
	public TipoAc getTipoAc() {
		return tipoAc;
	}
	
	public Repetidor getRepetidor() {
		return repetidor;
	}
}
