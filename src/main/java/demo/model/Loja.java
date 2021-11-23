package demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double despesas;
	
	public Double getDespesas() {
		return despesas;
	}
	public void setDespesas(Double despesas) {
		if(despesas == 0.0) {
			this.despesas = 400.00;
		}else {
			this.despesas = despesas;
		}
	}
	public Long getId() {
		return id;
	}
}
