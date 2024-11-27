package kopo.poly;

import kopo.poly.dto.UserInfoDTO;
import kopo.poly.util.CmmUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @param userInfoDTO 로그인된 사용자 정보 UserInfoRepository로부터 조회된 정보를 저장하기 위한 객체
 */
@Slf4j
public record AuthInfo(UserInfoDTO userInfoDTO) implements UserDetails {

    /**
     * 로그인한 사용자의 권한 부여하기
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        Set<GrantedAuthority> pSet = new HashSet<>();

        String roles = CmmUtil.nvl(userInfoDTO.roles());

        log.info("getAuthorities / roles : " + roles);
        if (roles.length() > 0) { //DB에 저장된 Role이 있는 경우에만 실행
            for (String role : roles.split(",")) {
                pSet.add(new SimpleGrantedAuthority(role));
            }
        }

        return pSet;
    }

    @Override
    public String getUsername() {
        return CmmUtil.nvl(userInfoDTO.userId());
    }

    @Override
    public String getPassword() {
        return CmmUtil.nvl(userInfoDTO.password());
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


}
