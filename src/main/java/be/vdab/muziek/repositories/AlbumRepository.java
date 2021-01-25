package be.vdab.muziek.repositories;

import be.vdab.muziek.domain.Album;

import java.util.List;
import java.util.Optional;

public interface AlbumRepository {
    List<Album> findAll();
    Optional<Album> findById(long id);
}