package com.geekster.InstagramBasicDesign.Model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer postId;
    private Timestamp createdDate;
    private Timestamp updatedDate;
    private String postData;

    @ManyToOne(fetch = FetchType.LAZY)
    User user;

}