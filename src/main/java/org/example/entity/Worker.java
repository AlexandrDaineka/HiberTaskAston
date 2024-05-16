package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Workers", schema = "homework_crud")
public class Worker {
    @Id
    @Basic
    private Integer id;
    @Basic
    @Column(length = 50, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
}
