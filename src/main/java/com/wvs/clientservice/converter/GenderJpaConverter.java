package com.wvs.clientservice.converter;

import com.wvs.clientservice.enumeration.GenderType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class GenderJpaConverter implements AttributeConverter<GenderType, String> {

    @Override
    public String convertToDatabaseColumn(GenderType priority) {
        if (priority == null) {
            return null;
        }
        return priority.getInitial();
    }

    @Override
    public GenderType convertToEntityAttribute(String string) {
        if (string == null) {
            return null;
        }
        try {
            return GenderType.get(string);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

}
