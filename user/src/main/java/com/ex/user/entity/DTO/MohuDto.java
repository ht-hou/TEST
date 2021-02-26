package com.ex.user.entity.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MohuDto implements Serializable {

    private String Roleid;

    private String muhu;

    private String uUsername;

    private String uTrueName;
}
