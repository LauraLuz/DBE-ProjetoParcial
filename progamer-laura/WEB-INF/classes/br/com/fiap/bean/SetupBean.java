package br.com.fiap.bean;

import javax.faces.bean.ManagedBean;

import br.com.fiap.model.Setup;

@ManagedBean
public class SetupBean {

	private Setup setup = new setup();

	public void save() {
		System.out.println(this.setup);
	}

	public Setup getSetup() {
		return setup;
	}

	public void setSetup(Setup setup) {
		this.setup = setup;
	}

}
