package ma.fstf.serverdetectionviolence.serverdetectionviolence.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User implements UserDetails {
    @Id
    @GeneratedValue

    private int id;
    @Column
    String userName;
    @Column
    String pass;
    @Column
    @Enumerated(EnumType.STRING)
    CategoryAge catAge;
    @Column
    @Enumerated(EnumType.STRING)
    Region region;


    @OneToMany(mappedBy = "user")
    private Collection<Token> token;

    public Collection<Token> getToken() {
        return token;
    }

    public void setToken(Collection<Token> token) {
        this.token = token;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return pass;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

