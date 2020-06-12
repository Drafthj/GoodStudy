package com.draft.agile.chapter.thirty;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/4/23
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class SleepCommand implements Command {
    private Command wakeupCommand = null;
    private ActiveObjectEngine engine = null;
    private long sleepTime = 0;
    private long startTime = 0;
    private boolean stared = false;

    public SleepCommand(Command wakeupCommand, ActiveObjectEngine engine, long sleepTime) {
        this.wakeupCommand = wakeupCommand;
        this.engine = engine;
        this.sleepTime = sleepTime;
    }

    @Override
    public void execute() throws Exception {
        long currentTime = System.currentTimeMillis();
        if (!stared) {
            stared = true;
            startTime = currentTime;
            engine.addCommand(this);
        } else if ((currentTime - startTime) < sleepTime) {
            engine.addCommand(this);
        } else {
            engine.addCommand(wakeupCommand);
        }
    }
}
