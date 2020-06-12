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
public class DelayedTyper implements Command {
    private long itsDelay;
    private char itsChar;
    private static ActiveObjectEngine engine =  new ActiveObjectEngine();
    private static boolean stop = false;

    public DelayedTyper(long itsDelay, char itsChar) {
        this.itsDelay = itsDelay;
        this.itsChar = itsChar;
    }

    @Override
    public void execute() throws Exception {
        System.out.println(itsChar);
        if (!stop) {
            delayAndRepeat();
        }
    }

    private void delayAndRepeat() {
        engine.addCommand(new SleepCommand(this, engine, itsDelay));
    }

    public static void main(String[] args) {
        engine.addCommand(new DelayedTyper(100, '1'));
        engine.addCommand(new DelayedTyper(300, '3'));
        engine.addCommand(new DelayedTyper(500, '5'));
        engine.addCommand(new DelayedTyper(700, '7'));
        Command stopCommand = new Command() {
            @Override
            public void execute() throws Exception {
                stop = true;
            }
        };
        engine.addCommand(new SleepCommand(stopCommand, engine, 20000));
        engine.run();
    }
}
