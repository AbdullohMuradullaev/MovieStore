package com.example.movieproject.mapper;

import com.example.movieproject.model.Genre;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GenreMapper implements RowMapper<Genre> {
    @Override
    public Genre mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Genre(
                rs.getInt("id"),
                rs.getString("name")
        );
    }
}
