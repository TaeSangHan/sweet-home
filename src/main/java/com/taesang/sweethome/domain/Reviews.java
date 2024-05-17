package com.taesang.sweethome.domain;

import java.sql.Timestamp;

public class Reviews {

    private long reviewId;
    private int subHomeId;
    private String title;
    private String body;
    private int userId;
    private int rating;
    private Timestamp createdTime;
    private Timestamp updateTime;
}
