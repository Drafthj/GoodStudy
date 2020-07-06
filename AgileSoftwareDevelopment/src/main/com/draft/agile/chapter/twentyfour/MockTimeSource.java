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
public class MockTimeSource extends Subject implements TimeSource  {
    private int hours;
    private int minutes;
    private int seconds;

    public void setTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        notifyObserver();
    }
    @Override
    public int getHours() {
        return hours;
    }

    @Override
    public int getMinutes() {
        return minutes;
    }

    @Override
    public int getSeconds() {
        return seconds;
    }
}
