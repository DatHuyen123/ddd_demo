package com.datdv.lms.domains.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class UserDTO {
    private String email;
    private String userName;
    private String password;
    private String address;
    private Integer status;
}
