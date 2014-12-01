package com.hasl.tracket.controller.dto.mapper.impl;

import org.springframework.stereotype.Component;

import com.hasl.tracket.controller.dto.MinoristaDTO;
import com.hasl.tracket.controller.dto.mapper.IMinoristaMapper;
import com.hasl.tracket.controller.dto.mapper.factory.MapperType;
import com.hasl.tracket.model.entity.Minorista;

// TODO: Auto-generated Javadoc
/**
 * The Class MinoristaMapperImpl.
 */
@Component
public class MinoristaMapperImpl implements IMinoristaMapper {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hasl.tracket.controller.dto.mapper.IMinoristaMapper#
	 * fromMinoristaDTOToMinorista(com.hasl.tracket.controller.dto.MinoristaDTO)
	 */
	@Override
	public Minorista fromMinoristaDTOToMinorista(MinoristaDTO minoristaDTO) {
		Minorista minorista = new Minorista();
		minorista.setApellidos(minoristaDTO.getApellidos());
		minorista.setDireccion(minoristaDTO.getDireccion());
		minorista.setEmail(minoristaDTO.getEmail());
		minorista.setId(minoristaDTO.getId());
		minorista.setNombre(minoristaDTO.getNombre());
		minorista.setPassword(minoristaDTO.getPassword());
		minorista.setTelefono(minoristaDTO.getTelefono());
		minorista.setWeb(minoristaDTO.getWeb());
		return minorista;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hasl.tracket.controller.dto.mapper.IMinoristaMapper#
	 * fromMinoristaToMinoristaDTO(com.hasl.tracket.model.entity.Minorista)
	 */
	@Override
	public MinoristaDTO fromMinoristaToMinoristaDTO(Minorista minorista) {
		MinoristaDTO minoristaDTO = new MinoristaDTO();
		minoristaDTO.setApellidos(minorista.getApellidos());
		minoristaDTO.setDireccion(minorista.getDireccion());
		minoristaDTO.setEmail(minorista.getEmail());
		minoristaDTO.setId(minorista.getId());
		minoristaDTO.setNombre(minorista.getNombre());
		minoristaDTO.setPassword(minorista.getPassword());
		minoristaDTO.setTelefono(minorista.getTelefono());
		minoristaDTO.setWeb(minorista.getWeb());
		return minoristaDTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hasl.tracket.controller.dto.mapper.IMapper#getMapperType()
	 */
	@Override
	public MapperType getMapperType() {
		return MapperType.MINORISTA_MAPPER;
	}

}
