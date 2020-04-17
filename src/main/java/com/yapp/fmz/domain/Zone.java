package com.yapp.fmz.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "zone")
public class Zone {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zone_id")
    private Long id;

    private Long zipcode;

    @Embedded
    private Address address;

    @Embedded
    private Location location;

    @OneToMany(mappedBy = "zone")
    private List<Room> rooms = new ArrayList<>();
}