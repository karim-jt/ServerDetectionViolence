package ma.fstf.serverdetectionviolence.serverdetectionviolence.DTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessaageDTO {

    Integer id;
    String Texte;
    String Img;
String Emetteur;
String Recepteur;
    LocalDateTime date;
    Integer id_emmet;

    Integer id_recep;
}
