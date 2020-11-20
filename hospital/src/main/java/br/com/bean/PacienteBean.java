package br.com.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.dao.DaoGeneric;
import br.com.model.Paciente;

@ViewScoped
@ManagedBean(name = "pacienteBean")
public class PacienteBean {

	private Paciente paciente = new Paciente();
	private DaoGeneric<Paciente> daoGeneric = new DaoGeneric<Paciente>();
	private List<Paciente> pacientes = new ArrayList<Paciente>();
		
	public String salvar() {
		paciente = daoGeneric.UpdateMerge(paciente);
		carregarPacientes();
		return "";
	}
	
	public String novo(){
		paciente = new Paciente();
		return "";
	}
	
	public String remove(){
		daoGeneric.deletarProId(paciente);
		paciente = new Paciente();
		carregarPacientes();
		return "";
	}
	
	@PostConstruct
	public void carregarPacientes(){
		pacientes = daoGeneric.getListEntity(Paciente.class);
	}
	
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public DaoGeneric<Paciente> getDaoGeneric() {
		return daoGeneric;
	}

	public void setDaoGeneric(DaoGeneric<Paciente> daoGeneric) {
		this.daoGeneric = daoGeneric;
	}
	
	public List<Paciente> getPacientes() {
		return pacientes;
	}
	
}
