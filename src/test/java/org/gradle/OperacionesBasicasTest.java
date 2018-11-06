package org.gradle;

import static org.junit.Assert.assertEquals;

import org.gradle.OperacionesBase;
import org.junit.Before;
import org.junit.Test;
public class OperacionesBasicasTest {
		
	OperacionesBase operacionesBase;

		@Before
		public void SetUp() {
			operacionesBase = new OperacionesBase();

		}
		
		@Test
		public void Ingreso3Y5Recibo8(){
			//Arrange
			int variable1 = 3;
			int variable2 = 5;
			//Act
			int resultado = operacionesBase.suma(variable1, variable2);
			//Assert
			
			assertEquals(8, resultado);
		}

}
