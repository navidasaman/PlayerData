package com.playerdata.server.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data // lombok reduces boilerplate code in this sense: getters, setters, toString(), for a cleaner look.
@Entity // Denotes that Player is an entity to be persisted
public class Player {
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increments the id value in the database
    @Id // Denotes that the id is the primary key
    @JsonIgnore // This will exclude the id from the json response while still uniquely identifying the player
    private Long id;
    private String first_name;
    private String last_name;
    private String city;
    private LocalDate birth_date;
}

