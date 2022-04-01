package com.project1.mapper;

import com.project1.dto.ContactDto;
import com.project1.model.InternalContactModal;
import org.mapstruct.factory.Mappers;

@org.mapstruct.Mapper
public interface Mapper {

    Mapper INSTANCE = Mappers.getMapper(Mapper.class);

    InternalContactModal entityToDto(ContactDto contactDto);
    ContactDto dtoToEntity(InternalContactModal internalContactModal);

}
