/*
 * Copyright (C) 2018 Team Gateship-One
 * (Hendrik Borghorst & Frederik Luetkes)
 *
 * The AUTHORS.md file contains a detailed contributors list:
 * <https://github.com/gateship-one/odyssey/blob/master/AUTHORS.md>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.gateshipone.odyssey.artworkdatabase;

import android.database.sqlite.SQLiteDatabase;

public class AlbumArtTable {
    public static final String TABLE_NAME = "odyssey_album_artwork_items";

    public static final String COLUMN_ALBUM_NAME = "album_name";
    public static final String COLUMN_ARTIST_NAME = "artist_name";

    public static final String COLUMN_ALBUM_MBID = "album_mbid";

    public static final String COLUMN_ALBUM_ID = "album_id";

    public static final String COLUMN_IMAGE_FILE_PATH = "album_image_file_path";

    public static final String COLUMN_IMAGE_NOT_FOUND = "image_not_found";

    private static final String DATABASE_CREATE = "CREATE TABLE if not exists " +
            TABLE_NAME +
            " (" +
            COLUMN_ALBUM_NAME + " text," +
            COLUMN_ARTIST_NAME + " text," +
            COLUMN_ALBUM_MBID + " text," +
            COLUMN_ALBUM_ID + " text primary key," +
            COLUMN_IMAGE_NOT_FOUND + " integer," +
            COLUMN_IMAGE_FILE_PATH + " text" +
            ");";

    private static final String DATABASE_DROP = "DROP TABLE if exists " + TABLE_NAME;

    public static void createTable(final SQLiteDatabase database) {
        // Create table if not already existing
        database.execSQL(DATABASE_CREATE);
    }

    public static void dropTable(final SQLiteDatabase database) {
        // drop table if already existing
        database.execSQL(DATABASE_DROP);
    }
}
