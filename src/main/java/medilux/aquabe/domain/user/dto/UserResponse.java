package medilux.aquabe.domain.user.dto;

import lombok.Builder;
import lombok.Data;
import medilux.aquabe.domain.user.entity.Gender;

import java.time.LocalDate;
import java.util.UUID;

@Builder
@Data
public class UserResponse {
    private UUID userId;
    private String username;
    private String email;
    private String userImage;
    private LocalDate birthDate;
    private Integer userAge;
    private Gender gender;
}
