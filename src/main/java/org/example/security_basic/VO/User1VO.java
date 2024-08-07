package org.example.security_basic.VO;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user1")
public class User1VO {
    @Id
    private String uid;
    private String pass;
    private String name;
    private String hp;
    private int age;
}
