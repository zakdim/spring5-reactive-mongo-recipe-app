package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Mono;

/**
 * Créé par dab4926 le 2021-07-28.
 */
public interface ImageService {

    Mono<Void> saveImageFile(String recipeId, MultipartFile file);
}
