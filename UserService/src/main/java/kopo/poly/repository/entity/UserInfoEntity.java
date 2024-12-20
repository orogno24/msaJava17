package kopo.poly.repository.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USER_INFO")
@DynamicInsert
@DynamicUpdate
@Builder
@Cacheable
@Entity
public class UserInfoEntity {

    @Id
    @Column(name = "USER_ID")
    private String userId;

    @NonNull
    @Column(name = "USER_NAME", length = 500, nullable = false)
    private String userName;

    @NonNull
    @Column(name = "PASSWORD", length = 100, nullable = false)
    private String password;

    @NonNull
    @Column(name = "EMAIL", nullable = false)
    private String email;

    @NonNull
    @Column(name = "ADDR1", nullable = false)
    private String addr1;


    @NonNull
    @Column(name = "ADDR2", nullable = false)
    private String addr2;

    @NonNull
    @Column(name = "REG_ID", nullable = false)
    private String regId;

    @NonNull
    @Column(name = "REG_DT", nullable = false)
    private String regDt;

    @NonNull
    @Column(name = "CHG_ID")
    private String chgId;

    @NonNull
    @Column(name = "CHG_DT")
    private String chgDt;

    @NonNull
    @Column(name = "ROLES")
    private String roles;

}
