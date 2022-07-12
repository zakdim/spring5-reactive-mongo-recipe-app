package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Créé par dab4926 le 2021-07-28.
 */
public interface ImageService {

    void saveImageFile(String recipeId, MultipartFile file);
}
