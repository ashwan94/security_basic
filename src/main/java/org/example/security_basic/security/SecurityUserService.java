package org.example.security_basic.security;

import lombok.RequiredArgsConstructor;
import org.example.security_basic.VO.User2VO;
import org.example.security_basic.repository.User2Repo;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SecurityUserService implements UserDetailsService {
    private User2Repo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        // Spring Security 인증 동작방식은 ID/PW 를 한번에 조회하는 방식이 아닌
        // ID 만 이용해서 사용자 정보를 load 하고 이후 PW 를 검증하는 방식이다

        // security : 사용자 계정 먼저 확인(username)
        User2VO user = repo.findById(username).get();

        if(user == null){
            throw new UsernameNotFoundException(username);
        }

        // 인증 거치는 과정(사용자가 form 에 입력한 정보가 맞는지 확인)
        UserDetails userDts = User.builder()
                .username(user.getUid())
                .password(user.getPass())
                .roles("MEMBER") // 마지막에 권한 추가
                .build();
        return userDts;
    }
}
