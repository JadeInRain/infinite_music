package InfiniteMusic.entity.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserLoginDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String password;

}
