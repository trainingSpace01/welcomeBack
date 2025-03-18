import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDate;

public class UserDTO {

    private String key;
    private String name;
    private LocalDate registrationDate;
    private String status;
}
