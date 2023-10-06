package com.prashantgarbuja.ResumeAPI.model;

import java.util.List;
import java.util.UUID;

import com.prashantgarbuja.ResumeAPI.controller.RouteConverter;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "api")
public class ApiRoute {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID _id;
	
	@Column(name = "api_route", columnDefinition = "jsonb")
	@Convert(converter = RouteConverter.class)
	private List<Route> apiRoute;
	
	public ApiRoute(List<Route> apiRoute) {
		super();
		this.apiRoute = apiRoute;
	}
	
	@Data
    @AllArgsConstructor
	public static class Route {

		private String description;
	    private String url;

	}

}
