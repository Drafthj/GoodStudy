package com.draft.agile.chapter.thirty;

import java.util.LinkedList;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/4/23
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ActiveObjectEngine {
    LinkedList<Command> itsCommands = new LinkedList<>();
    public void addCommand(Command c) {
        itsCommands.add(c);
    }

    public void run() {
        while(!itsCommands.isEmpty()) {
            Command c = itsCommands.removeFirst();
            try {
                c.execute();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
