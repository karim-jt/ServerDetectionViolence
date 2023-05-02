package ma.fstf.serverdetectionviolence.serverdetectionviolence.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class USER {
    @Id
    @GeneratedValue
    private int id;
    @Column
    String User_Name;
    @Column
    String Pass;
    @Column
    CategoryAge catAge;
    @Column
    Region region;


    @OneToMany(mappedBy = "user")
    private Collection<Token> token;

    public Collection<Token> getToken() {
        return token;
    }

    public void setToken(Collection<Token> token) {
        this.token = token;
    }
}

