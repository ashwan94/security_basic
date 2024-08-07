package org.example.security_basic.service;

import lombok.RequiredArgsConstructor;
import org.example.security_basic.VO.User1VO;
import org.example.security_basic.repository.User1Repo;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class User1Service {
    private User1Repo repo;

    public User1VO selectUser1(String uid, String pass){
        return repo.findUser1VOByUidAndPass(uid, pass);
    }
}
