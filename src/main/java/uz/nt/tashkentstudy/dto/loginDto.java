package uz.nt.tashkentstudy.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class loginDto {
    private String username;
    private String password;
}
