package com.hasl.tracket.controller.dto.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hasl.tracket.controller.dto.AdministradorDTO;
import com.hasl.tracket.controller.dto.mapper.IAdministradorMapper;
import com.hasl.tracket.controller.dto.mapper.factory.MapperType;
import com.hasl.tracket.model.entity.Administrador;

// TODO: Auto-generated Javadoc
/**
 * The Class AdministradorMapperImpl.
 */
@Component
public class AdministradorMapperImpl implements IAdministradorMapper {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hasl.tracket.controller.dto.mapper.IAdministradorMapper#
	 * fromAdministradorDTOListToAdministradorList(java.util.List)
	 */
	@Override
	public List<Administrador> fromAdministradorDTOListToAdministradorList(
			List<AdministradorDTO> administradoresDTO) {
		Administrador administrador;
		List<Administrador> administradores = new ArrayList<Administrador>();
		for (AdministradorDTO administradorDTO : administradoresDTO) {
			administrador = this
					.fromAdministradorDTOToAdministrador(administradorDTO);
			administradores.add(administrador);
		}
		return administradores;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hasl.tracket.controller.dto.mapper.IAdministradorMapper#
	 * fromAdministradorDTOToAdministrador
	 * (com.hasl.tracket.controller.dto.AdministradorDTO)
	 */
	@Override
	public Administrador fromAdministradorDTOToAdministrador(
			AdministradorDTO administradorDTO) {
		Administrador administrador = new Administrador();
		administrador.setApellidos(administradorDTO.getApellidos());
		administrador.setDireccion(administradorDTO.getDireccion());
		administrador.setEmail(administradorDTO.getEmail());
		administrador.setId(administradorDTO.getId());
		administrador.setNombre(administradorDTO.getNombre());
		administrador.setPassword(administradorDTO.getPassword());
		administrador.setTelefono(administradorDTO.getTelefono());
		administrador.setWeb(administradorDTO.getWeb());
		return administrador;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hasl.tracket.controller.dto.mapper.IAdministradorMapper#
	 * fromAdministradorListToAdministradorDTOList(java.util.List)
	 */
	@Override
	public List<AdministradorDTO> fromAdministradorListToAdministradorDTOList(
			List<Administrador> administradores) {
		AdministradorDTO administradorDTO;
		List<AdministradorDTO> administradoresDTO = new ArrayList<AdministradorDTO>();
		for (Administrador administrador : administradores) {
			administradorDTO = this
					.fromAdministradorToAdministradorDTO(administrador);
			administradoresDTO.add(administradorDTO);
		}
		return administradoresDTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hasl.tracket.controller.dto.mapper.IAdministradorMapper#
	 * fromAdministradorToAdministradorDTO
	 * (com.hasl.tracket.model.entity.Administrador)
	 */
	@Override
	public AdministradorDTO fromAdministradorToAdministradorDTO(
			Administrador administrador) {
		AdministradorDTO administradorDTO = new AdministradorDTO();
		administradorDTO.setApellidos(administrador.getApellidos());
		administradorDTO.setDireccion(administrador.getDireccion());
		administradorDTO.setEmail(administrador.getEmail());
		administradorDTO.setId(administrador.getId());
		administradorDTO.setNombre(administrador.getNombre());
		administradorDTO.setPassword(administrador.getPassword());
		administradorDTO.setTelefono(administrador.getTelefono());
		administradorDTO.setWeb(administrador.getWeb());
		return administradorDTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hasl.tracket.controller.dto.mapper.IMapper#getMapperType()
	 */
	@Override
	public MapperType getMapperType() {
		return MapperType.ADMINISTRADOR_MAPPER;
	}

}
