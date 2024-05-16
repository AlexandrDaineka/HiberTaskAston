package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Salaries", schema = "homework_crud")
public class Salary {
    @Id
    @Basic
    private Integer id;
    @Basic
    @Column(nullable = false)
    private Integer amount;

    @ManyToOne
    @JoinColumn(name = "worker_id")
    private Worker worker;
}