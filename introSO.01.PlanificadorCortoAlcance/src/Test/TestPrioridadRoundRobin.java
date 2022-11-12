/*---------------------- Algoritmo PrioridadRoundRobin ---------------------*/

package Test;

import Model.admProcesamiento;
import Model.admTablaProcesos;
import Model.Prioridad;

public class TestPrioridadRoundRobin {

	public static void main(String[] args) {

		admProcesamiento admP1 = new admProcesamiento(20, 50);

		admP1.agregarProceso("P1", 1, 3, 9, 6, Prioridad.Alta);
		admP1.agregarProceso("P2", 2, 3, 8, 8, Prioridad.Media);
		admP1.agregarProceso("P3", 2, 4, 2, 6, Prioridad.Alta);
		admP1.agregarProceso("P4", 3, 3, 9, 4, Prioridad.Baja);

		System.out.println("----------- Planificador PrioridadRoundRobin q=3 -----------");
		System.out.println(admP1.mostrarPlanificador(admP1.planificarPrioridadRoundRobin(3)));
		System.out.println(admP1.mostrarProcesos() + "\n-> hay 1 procesador" + "\n-> E/S Se realiza en paralelo\n");
		
		System.out.println("----------- Resultados PrioridadRoundRobin q=3 -----------");
		admTablaProcesos admTP1 = new admTablaProcesos(admP1);
		System.out.println(admTP1.mostrarResultados(admP1.planificarPrioridadRoundRobin(3)));

	}

}
