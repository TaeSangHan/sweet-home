package com.taesang.sweethome.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(indexes = {
        @Index(columnList = "SubHomesType"),
        @Index(columnList = "Name"),

})
@Entity
@EntityListeners(AuditingEntityListener.class)
public class SubHomesType {
    @Id
    @Column(nullable = false) private int SubHomesType;
    @Column(nullable = false) private String Name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubHomesType that = (SubHomesType) o;
        return SubHomesType == that.SubHomesType && Objects.equals(Name, that.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SubHomesType, Name);
    }
}
