package domain.model;

import domain.enums.EstadoFogata;
import domain.enums.Repetidor;
import domain.enums.TipoHabitacion;
import domain.enums.TipoAc;

public class Suite extends Habitacion {
	
	private final TipoAc tipoAc;
	private final Repetidor repetidor;
        private EstadoFogata fogata;

	public Suite(int numeroHabitacion, int numeroOcupantes       ) {
		super(numeroHabitacion, numeroOcupantes, TipoHabitacion.SUITE);
		this.repetidor = Repetidor.HUB;
                this.tipoAc = TipoAc.CONDUCTO;
                this.fogata = EstadoFogata.APAGADO;
	}

        public EstadoFogata getFogata()
          {
        return fogata;
        }

	
	public TipoAc getTipoAc() {
		return tipoAc;
	}
	
	public Repetidor getRepetidor() {
		return repetidor;
	}
            
        public void encenderFogata() {
            asegurarEstadoFuego(EstadoFogata.APAGADO,
                    "Prender fuego");
            this.fogata = EstadoFogata.ENCENDIDO;
        }
        
        public void apagarFogata() {
            asegurarEstadoFuego(EstadoFogata.ENCENDIDO,
                    "Apagar fuego");
            this.fogata = EstadoFogata.APAGADO;
        }
        
        private void asegurarEstadoFuego(EstadoFogata esperado, String accion) {
            if(this.fogata != esperado) {
                System.out.println("No se puede realizar la accion " + accion + 
                        " cuando EstadoFogata = " + this.fogata + " esperado " + esperado);
            }
        }
        
        
}
