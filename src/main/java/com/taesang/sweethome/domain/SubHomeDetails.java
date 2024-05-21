package com.taesang.sweethome.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(indexes = {
        @Index(columnList = "sub_home_id"),
        @Index(columnList = "roomType"),
        @Index(columnList = "roomName"),
        @Index(columnList = "roomCnt"),
        @Index(columnList = "checkInTime"),
        @Index(columnList = "checkOutTime")
})
@Entity
@EntityListeners(AuditingEntityListener.class)
public class SubHomeDetails {
    @EmbeddedId
    private SubHomeDetailsKey id;
    @Column(nullable = false) private String roomName;
    @Column(nullable = false) private int roomCnt;

    private int bookedRooms;
    private int checkInTime;
    private int checkOutTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubHomeDetails that = (SubHomeDetails) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
