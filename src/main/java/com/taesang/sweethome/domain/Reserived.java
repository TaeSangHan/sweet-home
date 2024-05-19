package com.taesang.sweethome.domain;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(indexes = {
        @Index(columnList = "reviewId"),
        @Index(columnList = "userId"),
        @Index(columnList = "subHomeId"),
        @Index(columnList = "roomType"),
        @Index(columnList = "createdTime"),
        @Index(columnList = "updateTime")
})
@Entity
public class Reserived {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reserveId;

    private int userId;
    private int subHomeId;
    private String roomType;
    private Timestamp createdTime;
    private Timestamp updateTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserived reserived = (Reserived) o;
        return reserveId == reserived.reserveId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(reserveId);
    }
}
