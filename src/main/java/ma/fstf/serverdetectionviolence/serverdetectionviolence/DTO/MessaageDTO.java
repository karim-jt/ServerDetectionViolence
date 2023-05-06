package ma.fstf.serverdetectionviolence.serverdetectionviolence.DTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessaageDTO {

    Integer id;
    String Texte;
    String Img;

    Integer id_emmet;

    Integer id_recep;
}
