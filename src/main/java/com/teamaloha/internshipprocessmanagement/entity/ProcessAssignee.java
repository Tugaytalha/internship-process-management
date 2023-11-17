package com.teamaloha.internshipprocessmanagement.entity;

import com.teamaloha.internshipprocessmanagement.entity.embeddable.LogDates;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "process_assignee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcessAssignee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    @Embedded
    LogDates logDates;

    @Column(name = "process_id", nullable = false)
    private Integer processId;

    @Column(name = "assignee_id", nullable = false)
    private Integer assigneeId;
}
