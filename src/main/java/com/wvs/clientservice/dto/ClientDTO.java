package com.wvs.clientservice.dto;

import com.wvs.clientservice.enumeration.GenderType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClientDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 6060967475610309408L;

    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String address;
    @NotNull
    private Date birthDate;
    @NotNull
    private String document;
    @NotNull
    private BigDecimal income;
    @NotNull
    private GenderType gender;

}
