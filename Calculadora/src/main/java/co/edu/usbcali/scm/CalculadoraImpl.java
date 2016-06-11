package co.edu.usbcali.scm;

import java.util.HashMap;
import java.util.Map;

public class CalculadoraImpl implements Calculadora {
	Map<String, Long> resultados = new HashMap<String, Long>(0);
	int i = 0;
	public void operacion(String operacion, Long valor1, Long valor2) {
		Long resultado = new Long(0);
		if ("suma".equals(operacion)){
			resultado = Long.sum(valor1, valor2);
		}else if ("resta".equals(operacion)){
			resultado = Long.sum(valor1, valor2.longValue()*-1);
		}else{
			System.out.println("Operacion no soportada");
		}
		resultados.put(String.valueOf(i++), resultado);
		resultados();
	}
	public void resultados() {
		for (Long item : resultados.values()) {
			System.out.println("Resultado = "+item.toString());
		}
	}

}
