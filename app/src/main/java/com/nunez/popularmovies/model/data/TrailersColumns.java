package com.nunez.popularmovies.model.data;

import net.simonvt.schematic.annotation.AutoIncrement;
import net.simonvt.schematic.annotation.DataType;
import net.simonvt.schematic.annotation.NotNull;
import net.simonvt.schematic.annotation.PrimaryKey;
import net.simonvt.schematic.annotation.References;

import static net.simonvt.schematic.annotation.DataType.Type.INTEGER;
import static net.simonvt.schematic.annotation.DataType.Type.TEXT;

/**
 * Created by paulnunez on 2/18/16.
 */
public interface TrailersColumns {
    @DataType(INTEGER) @PrimaryKey @AutoIncrement String _ID = "_id";
    @DataType(TEXT) @NotNull String TITLE = "title";
    @DataType(TEXT) @NotNull String TRAILER_ID = "trailer_id";
    @DataType(TEXT) @NotNull String SITE = "site";

    // Declaring one to many relation
    @DataType(INTEGER) @References(table = MoviesDatabase.TRAILERS,
            column = TrailersColumns.MOVIE_ID) String MOVIE_ID = "movie_id";
}
