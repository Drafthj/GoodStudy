package com.draft.agile.chapter.thirty;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/4/24
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ApplicationRunner {
    private ApplicationInterface applicationInterface;

    public ApplicationRunner(ApplicationInterface applicationInterface) {
        this.applicationInterface = applicationInterface;
    }

    public void run() {
        applicationInterface.init();
        while(!applicationInterface.done()) {
            applicationInterface.idle();
        }
        applicationInterface.cleanup();
    }
}
