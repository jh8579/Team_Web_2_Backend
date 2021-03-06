package com.yapp.fmz.domain.vo;

import lombok.Data;

@Data
public class LocationVo {
    private Double x;
    private Double y;
    private Long time;

    public LocationVo(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
}
