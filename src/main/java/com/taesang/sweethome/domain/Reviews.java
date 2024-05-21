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
        @Index(columnList = "review_Id"),
        @Index(columnList = "title"),
        @Index(columnList = "userId"),
        @Index(columnList = "createdTime"),
        @Index(columnList = "lastModifiedTime")
})
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long review_Id;

    @ManyToOne(optional = false) private SubHomes subHome;
    @Column(nullable = false) private String title;
    @Column(nullable = false) private String body;
    @Column(nullable = false) private int userId;
    @Column(nullable = false) private int rating;
    @LastModifiedDate
    private Timestamp createdTime;
    @LastModifiedDate private Timestamp lastModifiedTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reviews reviews = (Reviews) o;
        return review_Id == reviews.review_Id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(review_Id);
    }
}
