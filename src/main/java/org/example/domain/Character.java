package org.example.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class Character {

    Integer id;
    String name;
    String status;
    String species;
    String gender;
    String type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Character character = (Character) o;

        if (!Objects.equals(id, character.id)) return false;
        if (!Objects.equals(name, character.name)) return false;
        if (!Objects.equals(status, character.status)) return false;
        if (!Objects.equals(species, character.species)) return false;
        if (!Objects.equals(gender, character.gender)) return false;
        if (!Objects.equals(type, character.type)) return false;
        return Objects.equals(episode, character.episode);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (species != null ? species.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (episode != null ? episode.hashCode() : 0);
        return result;
    }

    List<String> episode;

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", species='" + species + '\'' +
                ", gender='" + gender + '\'' +
                ", episode=" + episode +
                ", origin=" + origin +
                ", location=" + location +
                '}';
    }

    Origin origin;
    Location location;



}
