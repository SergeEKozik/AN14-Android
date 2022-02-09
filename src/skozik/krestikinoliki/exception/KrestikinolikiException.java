/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.krestikinoliki.exception;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KrestikinolikiException extends Exception {
    private final int[] coordinates;

    public KrestikinolikiException(String message) {
        super(message);
        this.coordinates = new int[0];
    }

    public KrestikinolikiException(String message, int[] coordinates) {
        super(message);
        this.coordinates = coordinates;
    }

    @Override
    public String getMessage() {
        return String.format("%s coordinates: %s", super.getMessage(),
            Arrays.stream(this.coordinates).mapToObj(String::valueOf).collect(
                Collectors.joining("; ", "(", ")")));
    }
}
