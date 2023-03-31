import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class tests {

	@Test
	void test_al_crear_un_coche_su_velocidad_es_cero_Abraham_Belen_Duran() {
		Coche nuevoCoche = new Coche();
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}

	@Test
	void test_al_acelerar_un_coche_su_velocidad_aumenta_Abraham_Belen_Duran() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.acelerar_Abraham_Belen_Duran(30);
		Assertions.assertEquals(30, nuevoCoche.velocidad);
	}
	
	@Test
	void test_al_decelerar_un_coche_su_velocidad_disminuye_Abraham_Belen_Duran() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad=50;
		nuevoCoche.decelerar_Abraham_Belen_Duran(20);
		Assertions.assertEquals(30, nuevoCoche.velocidad);
	}
	
	@Test
	void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_de_cero_Abraham_Belen_Duran() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad=50;
		nuevoCoche.decelerar_Abraham_Belen_Duran(80);
		Assertions.assertEquals(0, nuevoCoche.velocidad);
	}


}
