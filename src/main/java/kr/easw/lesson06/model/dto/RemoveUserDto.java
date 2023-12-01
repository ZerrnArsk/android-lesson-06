package kr.easw.lesson06.model.dto;

import org.springframework.web.bind.annotation.RequestMapping;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RemoveUserDto {
    private String userId;

}
