package com.taesang.sweethome.domain;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(indexes = {
        @Index(columnList = "userId"),
        @Index(columnList = "userName"),
        @Index(columnList = "phoneNo"),
        @Index(columnList = "email"),
        @Index(columnList = "address"),
        @Index(columnList = "lastLogin"),
        @Index(columnList = "createdTime"),
        @Index(columnList = "userType")

})
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Users {
    @Id
    @Column(nullable = false) private String userId;
    @Column(nullable = false) private String userName;
    @Column(nullable = false) private String password;
    @Column(nullable = false) private int phoneNo;
    @Column(nullable = false) private String email;
    @Column(nullable = false) private String userType;

    private String address;
    private int point;
    private Timestamp lastLogin;
    @CreatedDate private Timestamp createdTime;
    @LastModifiedDate private Timestamp lastModifiedTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(userId, users.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userId);
    }
}
