package Kata5;

import java.util.Objects;

public class Ordinador {
	private String marca;
	private String modelo;
	private String procesador;
	private int ram;
	private int hdd;
	
	public Ordinador(String marca, String modelo) {
		this.marca  = marca;
		this.modelo = modelo;
	}
	
	public Ordinador(String marca, String modelo, String procesador, int ram, int hdd) {
		this.marca      = marca;
		this.modelo     = modelo;
		this.procesador = procesador;
		this.ram        = ram;
		this.hdd        = hdd;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ordinador other = (Ordinador) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo);
	}

	public String ejecutando(String programa) {
		return "Se está ejecutando " + programa;
	}

	@Override
	public String toString() {
		return "Ordinador --> marca: " + marca + ", modelo: " + modelo + ", procesador: " + procesador + ", ram: " + ram
				+ ", hdd: " + hdd + "]";
	}

	
	
	
}
