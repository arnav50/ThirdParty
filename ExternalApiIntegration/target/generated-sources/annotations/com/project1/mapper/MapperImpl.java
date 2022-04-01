package com.project1.mapper;

import com.project1.dto.ContactDto;
import com.project1.model.InternalContactModal;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-01T14:58:50+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11 (Oracle Corporation)"
)
public class MapperImpl implements Mapper {

    @Override
    public InternalContactModal entityToDto(ContactDto contactDto) {
        if ( contactDto == null ) {
            return null;
        }

        InternalContactModal internalContactModal = new InternalContactModal();

        internalContactModal.setContactId( contactDto.getContactId() );
        internalContactModal.setFirstName( contactDto.getFirstName() );
        internalContactModal.setLastName( contactDto.getLastName() );
        internalContactModal.setEmailAddress( contactDto.getEmailAddress() );
        internalContactModal.setCreatedBy( contactDto.getCreatedBy() );
        internalContactModal.setCreatedDate( contactDto.getCreatedDate() );
        internalContactModal.setUpdatedBy( contactDto.getUpdatedBy() );
        internalContactModal.setUpdatedDate( contactDto.getUpdatedDate() );
        internalContactModal.setIsActive( contactDto.getIsActive() );

        return internalContactModal;
    }

    @Override
    public ContactDto dtoToEntity(InternalContactModal internalContactModal) {
        if ( internalContactModal == null ) {
            return null;
        }

        ContactDto contactDto = new ContactDto();

        contactDto.setContactId( internalContactModal.getContactId() );
        contactDto.setFirstName( internalContactModal.getFirstName() );
        contactDto.setLastName( internalContactModal.getLastName() );
        contactDto.setEmailAddress( internalContactModal.getEmailAddress() );
        contactDto.setCreatedBy( internalContactModal.getCreatedBy() );
        contactDto.setCreatedDate( internalContactModal.getCreatedDate() );
        contactDto.setUpdatedBy( internalContactModal.getUpdatedBy() );
        contactDto.setUpdatedDate( internalContactModal.getUpdatedDate() );
        contactDto.setIsActive( internalContactModal.getIsActive() );

        return contactDto;
    }
}
