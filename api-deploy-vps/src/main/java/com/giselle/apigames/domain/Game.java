package com.giselle.apigames.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Game {
    public String title;
    public String developer;
    public String genre;
    public String platform;
    @JsonProperty("release_date")
    public int releaseDate;
    public String image;
    public String rating;
}
