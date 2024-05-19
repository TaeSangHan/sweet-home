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
        @Index(columnList = "title"),
        @Index(columnList = "userId"),
        @Index(columnList = "createdTime"),
        @Index(columnList = "updateTime")
})
@Entity
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reviewId;

    @ManyToOne(optional = false) private SubHomes subHome;
    private String title;
    private String body;
    private int userId;
    private int rating;
    private Timestamp createdTime;
    private Timestamp updateTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reviews reviews = (Reviews) o;
        return reviewId == reviews.reviewId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(reviewId);
    }
}
