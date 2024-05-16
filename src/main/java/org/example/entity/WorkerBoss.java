package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "WorkerBoss", schema = "homework_crud")
public class WorkerBoss {
    @Id
    @ManyToOne
    @JoinColumn(name = "worker_id")
    private Worker worker;

    @Id
    @ManyToOne
    @JoinColumn(name = "boss_id")
    private Boss boss;
}
