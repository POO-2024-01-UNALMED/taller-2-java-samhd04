package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;

	int cantidadAsientos() {
		int contador = 0;

		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null) {
				contador = contador + 1;
			}
		}

		return contador;
	}

	String verificarIntegridad() {
		if (this.registro != motor.registro) {
			return "Las piezas no son originales";
		} else if (this.registro == motor.registro) {
			for (int i = 0; i < asientos.length; i++) {
				if (asientos[i] != null) {
					if (asientos[i].registro != this.registro || asientos[i].registro != 					motor.registro) {
						return "Las piezas no son originales";
					}
				}
			}
		}
		
		return "Auto original";
	}
}
