package ma.fstf.serverdetectionviolence.serverdetectionviolence.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Message {
    @Id
    @GeneratedValue
    Integer id;
    @Column
    String texte;
    @Column
    String img;
    private LocalDate date;
    @Column(columnDefinition = "boolean default false")
    private boolean vue;
    @ManyToOne
    @JoinColumn(name = "emmet_id")
    User emmet;
    @ManyToOne
    @JoinColumn(name = "recep_id")
    User recep;

}
