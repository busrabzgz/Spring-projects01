package com.example.springbootresttemplate.model;

import com.example.springbootresttemplate.enums.DepartmentEnum;
import com.example.springbootresttemplate.enums.GenderTypeEnum;
import com.example.springbootresttemplate.enums.LevelTypeEnum;
import com.example.springbootresttemplate.enums.PositionTypeEnum;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {
    private Long id;
    private Long cid;
    private LocalDateTime createDate = LocalDateTime.now();
    private Long version = 0L;

    private String firstName;
    private String lastName;
    private String citizenNumber;
    private Date birthOfDate;
    private BigDecimal salary;
    private LocalDateTime startToWork;

    @Enumerated
    private DepartmentEnum department;
    @Enumerated
    private GenderTypeEnum gender;

    @Enumerated
    private PositionTypeEnum position;

    @Enumerated
    private LevelTypeEnum level;

    private String email;
    private String phoneNumber;
    private String address;
}
