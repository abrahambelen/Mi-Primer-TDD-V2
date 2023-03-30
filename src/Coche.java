
public class Coche {

	public int velocidad;


	public void acelerar_Abraham_Belen_Duran(int aceleracion) {
		velocidad = velocidad + aceleracion;
		
	}


	public void decelerar_Abraham_Belen_Duran(int deceleracion) {
		velocidad = velocidad - deceleracion;
		if (velocidad <0) {
			velocidad = 0;
		}
		
	}

}
