package com.ex.coor.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ParamData implements Serializable {

    private double x;
    private double y;
    private int ctId;
    private int raidus;

}
