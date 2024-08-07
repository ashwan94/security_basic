package org.example.security_basic.repository;

import org.example.security_basic.VO.User2VO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface User2Repo extends JpaRepository<User2VO, String> {
    public User2VO findUser2VOByUidAndPass(String uid, String pass);
}
