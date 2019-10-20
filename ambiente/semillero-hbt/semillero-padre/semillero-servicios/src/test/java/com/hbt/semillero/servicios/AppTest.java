package com.hbt.semillero.servicios;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test unitario del semillero HBT
 * @author ccastano
 *
 */
public class AppTest 
{
    
	/**
	 * Metodo que permite validar si dada la suma de dos numero el resultado es el correcto
	 */
    @Test
    public void primeraPU(){
    	Long resultadoEsperado=2159L;
    	Long sumando1= 1500L;
    	Long sumando2=659L;
    	Long resultado=sumando1 + sumando2;
        Assert.assertEquals(resultado, resultadoEsperado);
    }
}
