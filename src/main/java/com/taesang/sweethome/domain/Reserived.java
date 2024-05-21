package com.taesang.sweethome.domain;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(indexes = {
        @Index(columnList = "reserve_Id"),
        @Index(columnList = "userId"),
        @Index(columnList = "subHomeId"),
        @Index(columnList = "roomType"),
        @Index(columnList = "createdTime"),
        @Index(columnList = "lastModifiedTime")
})
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Reserived {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reserve_Id;

    @Column(nullable = false) private int userId;
    @Column(nullable = false) private int subHomeId;
    @Column(nullable = false) private String roomType;
    @LastModifiedDate private Timestamp createdTime;
    @LastModifiedDate private Timestamp lastModifiedTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserived reserived = (Reserived) o;
        return reserve_Id == reserived.reserve_Id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(reserve_Id);
    }
}
