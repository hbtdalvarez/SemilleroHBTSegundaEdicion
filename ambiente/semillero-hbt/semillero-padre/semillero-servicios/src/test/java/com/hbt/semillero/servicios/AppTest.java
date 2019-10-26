package com.hbt.semillero.servicios;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test unitario del semillero HBT
 * 
 * @author ccastano
 *
 */
public class AppTest {

	/**
	 * Metodo que permite validar si dada la suma de dos numero el resultado es el
	 * correcto
	 */
	@Test
	public void primeraPU() {
		Long resultadoEsperado = 2159L;
		Long sumando1 = 1500L;
		Long sumando2 = 659L;
		Long resultado = sumando1 + sumando2;
		Assert.assertEquals(resultado, resultadoEsperado);
	}

	/**
	 * 
	 * Metodo encargado de dada una cadena invertir su posicion y retornarla al
	 * revez
	 * 
	 * @param cadena
	 * @return
	 */
	private String invertirCadena(String cadena) {
		String cadenaInvertida = "";
		for (int x = cadena.length() - 1; x >= 0; x--) {
			cadenaInvertida = cadenaInvertida + cadena.charAt(x);
		}
		return cadenaInvertida;
	}
	
	/**
	 * 
	 * Metodo encargado de validar que se invierte la cadena correctamente
	 * Se pone en mayusculas las cadenas
	 * Se quitan espacio al inicio y al fin de la cadena
	 * Se reemplazan espacios para que la validacion se pueda comprobar 
	 * <b>Caso de Uso</b>
	 *
	 */
	@Test
	public void invertirCadenaTest() {
		String resultado = invertirCadena("Yo soy");
		String actual =resultado.toUpperCase().trim();
		String esperado = "Yo soy".toUpperCase().trim();
		Assert.assertEquals(actual.replace(" ",""), esperado.replace(" ",""));
	}
}
