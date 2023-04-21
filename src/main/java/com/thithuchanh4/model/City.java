package com.thithuchanh4.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    @Size(max = 20, message = "Tên quá dài")
    private String name;
    @ManyToOne
    @NotNull
    @JoinColumn(name = "nation_id")
    private Nation nation;
    @NotBlank
    @Min(value = 0,message = "diện tích số dương")
    private int size;
    @Min(value = 0,message = "dân số số dương")
    private int population;
    @Min(value = 0,message = "GDP>0")
    private long GDP;

    @Size(max = 20, message = "Mô tả quá ngắn")
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public long getGDP() {
        return GDP;
    }

    public void setGDP(long GDP) {
        this.GDP = GDP;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
