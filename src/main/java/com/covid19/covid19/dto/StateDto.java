package com.covid19.covid19.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class StateDto {
	private String state;
	private List<DistrictDto> districtData;

}
