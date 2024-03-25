package fr.uga.l3miage.exo1.endpoints;
import fr.uga.l3miage.exo1.responses.PlaylistResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.* ;

@Tag(name = "Gestion playlist", description = "Tous les endpoint de gestion d'une playlist")
@RestController
@RequestMapping("/api/playlist")
public interface PlaylistEndpoints {
    @PatchMapping("/{idPlaylist}/add")
    @ResponseStatus(HttpStatus.OK)
    PlaylistResponseDTO addSongInPlaylist(@PathVariable(name = "idPlaylist")String idPlaylist, @RequestParam String idSong);

    @Operation(description = "Récuperer une playlist")
    @ApiResponse(responseCode = "200", description = "Le son à été ajouté à la playlist")
    @ApiResponse(responseCode = "404", description = "la playlist ou le son demandée n'a pas été trouvé", content = @Content(schema = @Schema(implementation = AddPlaylistErrorResponse.class),mediaType = MediaType.APPLICATION_JSON_VALUE))
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{idPlaylist}")
    PlaylistResponseDTO getPlaylist(@PathVariable(name = "idPlaylist")String idPlaylist) ;
}
