package com.taesang.sweethome.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(indexes = {
        @Index(columnList = "subHomeId"),
        @Index(columnList = "roomType"),
        @Index(columnList = "roomName"),
        @Index(columnList = "roomCnt"),
        @Index(columnList = "checkInTime"),
        @Index(columnList = "checkOutTime")
})
@Entity
public class SubHomeDetails {
    @Id
    @ManyToOne(optional = false)private SubHomes subHome;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false) private int roomType;
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
        return roomType == that.roomType && Objects.equals(subHome, that.subHome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subHome, roomType);
    }
}
