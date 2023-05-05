package ma.fstf.serverdetectionviolence.serverdetectionviolence.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.fstf.serverdetectionviolence.serverdetectionviolence.Model.CategoryAge;
import ma.fstf.serverdetectionviolence.serverdetectionviolence.Model.Region;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
  private String userName;
  private String pass;
  private Region region;
  private CategoryAge categoryAge;
}