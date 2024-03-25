package fr.uga.l3miage.exo1.responses;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Data
@Schema(description = "Représentation d'un album")
public class AlbumResponseDTO {
    @Schema(description = "Titre de l'album")
    private String title;
    @Schema(description = "Date de sortie")
    private Date releaseDate;
}
