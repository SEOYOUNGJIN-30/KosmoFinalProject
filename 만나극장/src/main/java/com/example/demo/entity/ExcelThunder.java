package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "`thunder`")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExcelThunder {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "title")
    private String title;

    @Column(name = "category")
    private String category;

    @Column(name = "content")
    private String content;

    @Column(name = "image")
    private String image;

    @Column(name = "lat")
    private double lat;

    @Column(name = "lng")
    private double lng;

    @Column(name = "openlink")
    private String openlink;

    @Column(name = "regdate")
    private String regdate;

    @Column(name = "location")
    private String location;

    @Column(name = "tags")
    private String tags;

    @Column(name = "address")
    private String address;
}

