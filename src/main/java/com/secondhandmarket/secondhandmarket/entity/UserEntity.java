package com.secondhandmarket.secondhandmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="User") //UserEntity라는 클래스를 엔터티 클래스라는 것을 지정한다. Entity명을 User라고 설정
@Table(name="User") // 데이터베이스에 있는 Table명과 매핑시킨다.
public class UserEntity {
    @Id // userEmail을 PK로 사용한다.
    private String userEmail; // 언더바를 카밀케이스로 바꿔준다.
    private String userPassword;
    private String userNickname;
    private String userPhoneNumber;
    private String userAddress;
    private String userProfile;
}
