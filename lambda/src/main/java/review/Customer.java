package review;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String confirmEmail;
    private String address;
    private String zipCode;
    private String city;
    private String state;
    private String phone;

}
