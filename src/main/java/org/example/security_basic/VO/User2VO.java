package org.example.security_basic.VO;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="user2")
public class User2VO {
    @Id
    private String uid;
    private String pass;
    private String name;
    private String hp;
    private int age;
}
