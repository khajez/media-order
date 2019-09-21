package hu.agridorn.mediaorder.service;

import hu.agridorn.mediaorder.domain.Media;

import java.util.List;

public interface MediaFetchService {
    List<Media> findAll();
}
