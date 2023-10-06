package com.prashantgarbuja.ResumeAPI.controller;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prashantgarbuja.ResumeAPI.model.ApiRoute.Route;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class RouteConverter implements AttributeConverter<List<Route>, String> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(List<Route> apiRoutes) {
        try {
            return objectMapper.writeValueAsString(apiRoutes);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("Could not convert ApiRoute to JSON", e);
        }
    }

    @Override
    public List<Route> convertToEntityAttribute(String json) {
        try {
            return objectMapper.readValue(json, List.class);
        } catch (IOException e) {
            throw new IllegalArgumentException("Could not convert JSON to ApiRoute", e);
        }
    }
}

