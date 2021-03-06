package com.hasl.tracket.model.repository.impl;

import org.springframework.stereotype.Repository;

import com.hasl.tracket.model.entity.Usuario;
import com.hasl.tracket.model.repository.IUsuarioDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class UsuarioDAO.
 */
@Repository
class UsuarioDAO extends AbstractRepositoryDAO<Usuario> implements
		IUsuarioDAO {

	/* (non-Javadoc)
	 * @see com.hasl.tracket.model.repository.IRepositoryDAO#getEntityModelClass()
	 */
	@Override
	public Class<Usuario> getEntityModelClass() {
		return Usuario.class;
	}

}
