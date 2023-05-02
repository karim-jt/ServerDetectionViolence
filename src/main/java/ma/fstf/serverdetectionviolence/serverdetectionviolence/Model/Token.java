package ma.fstf.serverdetectionviolence.serverdetectionviolence.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Token {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue
    private Integer id;
    @Column(unique = true)
    public String token;
    public boolean revoked;
    public boolean expired;
    @ManyToOne
    @JoinColumn(name = "user_id")
    //@JsonProperty(access = JsonProperty.Access.READ_WRITE)
    public USER user;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
