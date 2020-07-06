package com.draft.agile.chapter.nineteen;

import java.time.LocalDateTime;

public class DateUtil {
    public static boolean isBetween(LocalDateTime theDate, LocalDateTime startDate, LocalDateTime endDate) {
        return theDate.compareTo(startDate) >= 0 && theDate.compareTo(endDate) <= 0;
    }
}
