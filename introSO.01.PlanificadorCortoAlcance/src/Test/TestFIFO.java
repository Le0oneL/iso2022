/*------------------------- Algoritmo FIFO ------------------------*/
//  Planificador de corto alcance (PCA)
//
// Es el principal planificador del Sistema Operativo, est? continuamente 
// funcionando, es quien decide que proceso pasa a ejecutado, usa distintas 
// pol?ticas o algoritmos, brinda cierta equidad.
// v1.2
// Autor: Jos? Victor Ib??ez
/*------------------------- ------------- -------------------------*/

package Test;

import Model.admProcesamiento;
import Model.admTablaProcesos;
import Model.Prioridad;

public class TestFIFO {

	public static void main(String[] args) {

		admProcesamiento admP1 = new admProcesamiento(20, 50);

		admP1.agregarProceso("P1", 1, 3, 9, 6, Prioridad.Alta);
		admP1.agregarProceso("P2", 2, 3, 8, 8, Prioridad.Media);
		admP1.agregarProceso("P3", 2, 4, 2, 6, Prioridad.Alta);
		admP1.agregarProceso("P4", 3, 3, 9, 4, Prioridad.Baja);
		
		System.out.println("----------- Planificador FIFO -----------");
		System.out.println(admP1.mostrarPlanificador(admP1.planificarFIFO()));
		System.out.println(admP1.mostrarProcesos() + "\n-> hay 1 procesador" + "\n-> E/S Se realiza en paralelo\n");
		
		System.out.println("----------- Resultados FIFO -----------");
		admTablaProcesos admTP = new admTablaProcesos(admP1);
		System.out.println(admTP.mostrarResultados(admP1.planificarFIFO()));

	}

}
