package Componentes.Instrucciones;

import Componentes.Compilador;
import Componentes.Pila;

public class Mul implements Instruccion {

	@Override
	public void ejecutar(Compilador compilador) {
		Pila pila = compilador.getPila();
		pila.push(pila.pop() * pila.pop());
		pila.aumentarPila();
	}
}
