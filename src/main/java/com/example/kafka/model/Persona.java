package com.example.kafka.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Persona implements Serializable {
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String correo;
}
