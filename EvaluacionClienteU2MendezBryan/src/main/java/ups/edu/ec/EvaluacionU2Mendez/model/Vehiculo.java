package ups.edu.ec.EvaluacionU2Mendez.model;

import java.io.Serializable;



public class Vehiculo implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String placa;
	
	private String marca;
	
	private String color;
	
	private String modelo;
	
	private String dueno;
	
	
	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}
	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the dueno
	 */
	public String getDueno() {
		return dueno;
	}
	/**
	 * @param dueno the dueno to set
	 */
	public void setDueno(String dueno) {
		this.dueno = dueno;
	}
	
	
	
	
	
}
