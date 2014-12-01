package com.hasl.tracket.controller.dto.mapper.impl;

import org.springframework.stereotype.Component;

import com.hasl.tracket.controller.dto.UsuarioDTO;
import com.hasl.tracket.controller.dto.mapper.IUsuarioMapper;
import com.hasl.tracket.controller.dto.mapper.factory.MapperType;
import com.hasl.tracket.model.entity.Usuario;

// TODO: Auto-generated Javadoc
/**
 * The Class UsuarioMapperImpl.
 */
@Component
public class UsuarioMapperImpl implements IUsuarioMapper {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hasl.tracket.controller.dto.mapper.IUsuarioMapper#fromUsuarioDTOToUsuario
	 * (com.hasl.tracket.controller.dto.UsuarioDTO)
	 */
	@Override
	public Usuario fromUsuarioDTOToUsuario(UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario();
		usuario.setApellidos(usuarioDTO.getApellidos());
		usuario.setDireccion(usuarioDTO.getDireccion());
		usuario.setEmail(usuarioDTO.getEmail());
		usuario.setId(usuarioDTO.getId());
		usuario.setNombre(usuarioDTO.getNombre());
		usuario.setPassword(usuarioDTO.getPassword());
		usuario.setTelefono(usuarioDTO.getTelefono());
		usuario.setWeb(usuarioDTO.getWeb());
		return usuario;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hasl.tracket.controller.dto.mapper.IUsuarioMapper#fromUsuarioToUsuarioDTO
	 * (com.hasl.tracket.model.entity.Usuario)
	 */
	@Override
	public UsuarioDTO fromUsuarioToUsuarioDTO(Usuario usuario) {
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		usuarioDTO.setApellidos(usuario.getApellidos());
		usuarioDTO.setDireccion(usuario.getDireccion());
		usuarioDTO.setEmail(usuario.getEmail());
		usuarioDTO.setId(usuario.getId());
		usuarioDTO.setNombre(usuario.getNombre());
		usuarioDTO.setPassword(usuario.getPassword());
		usuarioDTO.setTelefono(usuario.getTelefono());
		usuarioDTO.setWeb(usuario.getWeb());
		return usuarioDTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hasl.tracket.controller.dto.mapper.IMapper#getMapperType()
	 */
	@Override
	public MapperType getMapperType() {
		return MapperType.USUARIO_MAPPER;
	}

}
