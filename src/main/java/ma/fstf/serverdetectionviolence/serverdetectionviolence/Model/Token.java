package ma.fstf.serverdetectionviolence.serverdetectionviolence.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Token {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(unique = true)
    public String token;
    @Enumerated(EnumType.STRING)
    public TokenType tokenType = TokenType.BEARER;
    public boolean revoked;
    public boolean expired;
    @ManyToOne
    @JoinColumn(name = "user_id")
    //@JsonProperty(access = JsonProperty.Access.READ_WRITE)
    public User user;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
