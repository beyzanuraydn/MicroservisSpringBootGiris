package com.beyzanur.entity;
import jakarta.persistence.*;
import lombok.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="tbl_auth")
public class Auth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String userName;
    String password;
    String email;
    Boolean isActive;
    Long createAt;


}
