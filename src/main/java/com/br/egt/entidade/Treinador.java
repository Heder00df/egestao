package com.br.egt.entidade;

import javax.persistence.*;

@Entity
public class Treinador extends PessoaFisica{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_treinador")
	private Long id;
	
}
