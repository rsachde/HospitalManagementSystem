package com.ria.developer.doctor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Doctor {

    @Id
    private int id; // usage of embedded id //PRimary Key

    private String name;
    private String specialist;
}
