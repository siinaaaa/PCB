package com.example.finalpro.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table
@Data
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = true)

    private int id;

    @ManyToOne
    @JsonIgnore
    private Colleges college;
    @Column(unique = true)
    private String personalyCode;
    @Size(max = 48)
    private String name;
    @Size(max = 48)
    private String family;
    @Column(unique = true)
    private String nationalCode;

    @OneToMany(mappedBy = "teacher")
    private List<Lessons>lessons;



}
