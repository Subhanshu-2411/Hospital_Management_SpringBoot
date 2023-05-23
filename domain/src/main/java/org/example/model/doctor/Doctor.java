package org.example.model.doctor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Transactional
@Entity
public class Doctor {
    @Id
    private int id;
    private String name;
    private String specialist;
}
