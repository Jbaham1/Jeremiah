package com.resume.Jeremiah.models;

import javax.persistence.*;

@Entity
@Table(name ="items")
public class Item {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long id;

    @Column(length = 500, nullable = false)
    private String description;

    @Column(length = 250, nullable = false)
    private String title;

    @Column(nullable = false)
    private Double price;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "image_id", nullable = false)
//    private Image image;

    public Item(){}

     public Item(long id, String title, String description, Double price){
        this.title = title;
        this.description = description;
        this.price = price;
    }
    public long getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public Double getPrice(){
        return price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
