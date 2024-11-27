package kopo.poly.auth;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * JWT 토큰 종류에 대한 설명
 */
public enum JwtTokenType {
    ACCESS_TOKEN,
    REFRESH_TOKEN
}
