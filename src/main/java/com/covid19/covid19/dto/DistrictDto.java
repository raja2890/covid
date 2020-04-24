package com.covid19.covid19.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class DistrictDto {
	
	private String district;
	private Long active;
	private Long confirmed;
	private Long deceased;
	private Long recovered;
	private Delta delta;

}
