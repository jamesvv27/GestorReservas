

package gestor;

import domain.enums.EstadoFogata;
import domain.enums.Repetidor;
import domain.enums.TipoAc;
import domain.model.*;
/**
 *
 * @author Usuario
 */
public class main
{
    public static void main(String[] args)
    {
        Suite suite = new Suite(1, 8);
        
        suite.encenderFogata();
        System.out.println(suite);
        suite.apagarFogata();
        System.out.println(suite);
    }
}
