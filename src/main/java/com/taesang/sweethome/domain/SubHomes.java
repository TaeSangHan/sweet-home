package com.taesang.sweethome.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(indexes = {
        @Index(columnList = "subHomeId"),
        @Index(columnList = "name"),
        @Index(columnList = "type"),
        @Index(columnList = "address1"),
        @Index(columnList = "address2"),
        @Index(columnList = "owner"),
        @Index(columnList = "phoneNo"),
        @Index(columnList = "longitude"),
        @Index(columnList = "latitude")
})

@EntityListeners(AuditingEntityListener.class)
@Entity
public class SubHomes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false) private long subHomeId;

    /*@OneToMany(mappedBy = "subHome")
    @ToString.Exclude
    private final Set<Reviews> SubHomeReviews = new LinkedHashSet<>();*/


    @Column(nullable = false) private String name;
    @Column(nullable = false) private int type;
    @Column(nullable = false) private String address1;
    @Column(nullable = false) private String address2;
    @Column(nullable = false) private double latitude;
    @Column(nullable = false) private double longitude;

    private String owner;
    private String phoneNo;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubHomes subHomes = (SubHomes) o;
        return subHomeId == subHomes.subHomeId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(subHomeId);
    }
}
