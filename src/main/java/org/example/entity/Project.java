package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Projects", schema = "homework_crud")
public class Project {
    @Id
    @Basic
    private Integer id;
    @Basic
    @Column(length = 50, nullable = false)
    private String name;
}
