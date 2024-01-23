package io.maxzhivyn.appserver.domain.chahe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Student")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentCache {
    private String id;
    private String name;
    private Gender gender;
    private int grade;

    public enum Gender {
        MALE, FEMALE
    }
}
