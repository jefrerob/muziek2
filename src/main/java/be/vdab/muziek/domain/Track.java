package be.vdab.muziek.domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;
import java.time.LocalTime;
import java.util.Objects;

@Embeddable
@Access(AccessType.FIELD)
public class Track {
    private String naam;
    private LocalTime tijd;

    protected Track() {}

    public Track(String naam, LocalTime tijd) {
        this.naam = naam;
        this.tijd = tijd;
    }

    public String getNaam() {
        return naam;
    }

    public LocalTime getTijd() {
        return tijd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Track)) return false;
        Track track = (Track) o;
        return naam.toUpperCase().equals(track.naam.toUpperCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam.toUpperCase());
    }
}
