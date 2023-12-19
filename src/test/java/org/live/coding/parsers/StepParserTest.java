package org.live.coding.parsers;

import org.junit.jupiter.api.Test;

class StepParserTest {
    @Test
    void testParseMinutesField() {
        StepParser parser = new StepParser(CronFieldType.MINUTES);
        String field = "*/15";
        String expected = "0 15 30 45";

        assertEquals(expected, parser.parse(field));
    }

    @Test
    void testParseHoursField() {
        StepParser parser = new StepParser(CronFieldType.HOURS);
        String field = "*/2";
        String expected = "0 2 4 6 8 10 12 14 16 18 20 22";

        assertEquals(expected, parser.parse(field));
    }

    @Test
    void testParseDaysOfMonthField() {
        StepParser parser = new StepParser(CronFieldType.DAYS_OF_MONTH);
        String field = "*/3";
        String expected = "1 4 7 10 13 16 19 22 25 28 31";

        assertEquals(expected, parser.parse(field));
    }

    @Test
    void testParseMonthsField() {
        StepParser parser = new StepParser(CronFieldType.MONTHS);
        String field = "*/2";
        String expected = "1 3 5 7 9 11";

        assertEquals(expected, parser.parse(field));
    }

    @Test
    void testParseDaysOfWeekField() {
        StepParser parser = new StepParser(CronFieldType.DAYS_OF_WEEK);
        String field = "*/5";
        String expected = "1 6";

        assertEquals(expected, parser.parse(field));
    }
}