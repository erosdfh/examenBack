package com.javatechie.crud.example.dto;

public class UsuarioDto {

	private Integer cod_usuario;
	private String nombre;
	private String user;
	private String password;

	public Integer getCod_usuario() {
		return cod_usuario;
	}

	public void setCod_usuario(Integer cod_usuario) {
		this.cod_usuario = cod_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public UsuarioDto() {
		super();
	}

	

	public UsuarioDto(Integer cod_usuario, String nombre, String user, String password) {
		super();
		this.cod_usuario = cod_usuario;
		this.nombre = nombre;
		this.user = user;
		this.password = password;
	}
}
