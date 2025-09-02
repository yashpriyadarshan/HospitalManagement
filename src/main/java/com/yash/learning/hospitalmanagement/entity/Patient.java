package com.yash.learning.hospitalmanagement.entity;

import com.yash.learning.hospitalmanagement.type.BloodGroupEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "patient_name", nullable = false)
    private String name;
    private LocalDate birthDate;

    @Column(unique = true)
    private String email;
    private String gender;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private BloodGroupEnum bloodGroup;
}
