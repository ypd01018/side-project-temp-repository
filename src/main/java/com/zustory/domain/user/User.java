package com.zustory.domain.user;

import com.zustory.domain.BaseEntity;
import javax.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String loginId;

    @Column(name = "user_name")
    private String name;

    private String profileImage;

    @Builder
    public User(String name) {
        this.name = name;
    }
}