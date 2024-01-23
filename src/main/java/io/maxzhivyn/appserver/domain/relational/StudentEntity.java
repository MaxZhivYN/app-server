package io.maxzhivyn.appserver.domain.relational;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class StudentEntity {
    @Id
    private UUID uid;
    private String name;
    private Gender gender;
    private int grade;

    public StudentEntity(String name, Gender gender, int grade) {
        this.uid = UUID.randomUUID();
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }

    public enum Gender {
        MALE, FEMALE
    }
}
