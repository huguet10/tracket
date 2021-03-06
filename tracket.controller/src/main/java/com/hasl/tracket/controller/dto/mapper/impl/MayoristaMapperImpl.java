package com.hasl.tracket.controller.dto.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hasl.tracket.controller.dto.MayoristaDTO;
import com.hasl.tracket.controller.dto.mapper.IMayoristaMapper;
import com.hasl.tracket.controller.dto.mapper.factory.MapperType;
import com.hasl.tracket.model.entity.Mayorista;

// TODO: Auto-generated Javadoc
/**
 * The Class MayoristaMapperImpl.
 */
@Component
public class MayoristaMapperImpl implements IMayoristaMapper {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hasl.tracket.controller.dto.mapper.IMayoristaMapper#
	 * fromMayoristaDTOListToMayoristaList(java.util.List)
	 */
	@Override
	public List<Mayorista> fromMayoristaDTOListToMayoristaList(
			List<MayoristaDTO> mayoristasDTO) {
		Mayorista mayorista;
		List<Mayorista> mayoristas = new ArrayList<Mayorista>();
		for (MayoristaDTO mayoristaDTO : mayoristasDTO) {
			mayorista = this.fromMayoristaDTOToMayorista(mayoristaDTO);
			mayoristas.add(mayorista);
		}
		return mayoristas;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hasl.tracket.controller.dto.mapper.IMayoristaMapper#
	 * fromMayoristaDTOToMayorista(com.hasl.tracket.controller.dto.MayoristaDTO)
	 */
	@Override
	public Mayorista fromMayoristaDTOToMayorista(MayoristaDTO mayoristaDTO) {
		Mayorista mayorista = new Mayorista();
		mayorista.setApellidos(mayoristaDTO.getApellidos());
		mayorista.setDireccion(mayoristaDTO.getDireccion());
		mayorista.setEmail(mayoristaDTO.getEmail());
		mayorista.setId(mayoristaDTO.getId());
		mayorista.setNombre(mayoristaDTO.getNombre());
		mayorista.setPassword(mayoristaDTO.getPassword());
		mayorista.setTelefono(mayoristaDTO.getTelefono());
		mayorista.setWeb(mayoristaDTO.getWeb());
		return mayorista;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hasl.tracket.controller.dto.mapper.IMayoristaMapper#
	 * fromMayoristaListToMayoristaDTOList(java.util.List)
	 */
	@Override
	public List<MayoristaDTO> fromMayoristaListToMayoristaDTOList(
			List<Mayorista> mayoristas) {
		MayoristaDTO mayoristaDTO;
		List<MayoristaDTO> mayoristasDTO = new ArrayList<MayoristaDTO>();
		for (Mayorista mayorista : mayoristas) {
			mayoristaDTO = this.fromMayoristaToMayoristaDTO(mayorista);
			mayoristasDTO.add(mayoristaDTO);
		}
		return mayoristasDTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hasl.tracket.controller.dto.mapper.IMayoristaMapper#
	 * fromMayoristaToMayoristaDTO(com.hasl.tracket.model.entity.Mayorista)
	 */
	@Override
	public MayoristaDTO fromMayoristaToMayoristaDTO(Mayorista mayorista) {
		MayoristaDTO mayoristaDTO = new MayoristaDTO();
		mayoristaDTO.setApellidos(mayorista.getApellidos());
		mayoristaDTO.setDireccion(mayorista.getDireccion());
		mayoristaDTO.setEmail(mayorista.getEmail());
		mayoristaDTO.setId(mayorista.getId());
		mayoristaDTO.setNombre(mayorista.getNombre());
		mayoristaDTO.setPassword(mayorista.getPassword());
		mayoristaDTO.setTelefono(mayorista.getTelefono());
		mayoristaDTO.setWeb(mayorista.getWeb());
		return mayoristaDTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hasl.tracket.controller.dto.mapper.IMapper#getMapperType()
	 */
	@Override
	public MapperType getMapperType() {
		return MapperType.MAYORISTA_MAPPER;
	}

}
