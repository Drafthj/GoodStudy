package com.draft.agile.chapter.twentyfour;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/7/1
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class MockTimeSink implements Observer {
    private int hours;
    private int minutes;
    private int seconds;
    private TimeSource timeSource;

    public MockTimeSink(TimeSource timeSource) {
        this.timeSource = timeSource;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public void update() {
        this.hours = timeSource.getHours();
        this.minutes = timeSource.getMinutes();
        this.seconds = timeSource.getSeconds();
    }
}
