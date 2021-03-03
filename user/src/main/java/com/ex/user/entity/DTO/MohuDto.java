package com.ex.user.entity.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MohuDto implements Serializable {

    private String Roleid;

    private String muhu;

    private String uUsername;

    private String uTrueName;
}
