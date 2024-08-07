package org.example.security_basic.repository;

import org.example.security_basic.VO.User1VO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface User1Repo extends JpaRepository<User1VO, String> {
    public User1VO findUser1VOByUidAndPass(String uid, String pass);
}
