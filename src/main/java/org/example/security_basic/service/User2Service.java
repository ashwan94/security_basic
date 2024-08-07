package org.example.security_basic.service;

import lombok.RequiredArgsConstructor;
import org.example.security_basic.VO.User2VO;
import org.example.security_basic.repository.User2Repo;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class User2Service {
    private User2Repo repo;

    public User2VO selectUser2(String uid, String pass){
        return repo.findUser2VOByUidAndPass(uid, pass);
    }
}
