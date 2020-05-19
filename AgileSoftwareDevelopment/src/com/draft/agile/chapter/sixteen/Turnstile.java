package com.draft.agile.chapter.sixteen;

import java.util.Collections;
import java.util.List;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/5/5
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Turnstile {
    private static boolean isLocked = true;
    private static boolean isAlarming = false;
    private static int itsCoins = 0;
    private static int itsRefunds = 0;
    protected final static Turnstile LOCKED = new Locked();
    protected final static Turnstile UNLOCKED = new UnLocked();
    protected static Turnstile itsState = LOCKED;

    public void reset() {

    }

    public boolean locked() {
        return isLocked;
    }

    public boolean alarm() {
        return isAlarming;
    }

    public void coin() {
        itsState.coin();
    }

    public void pass() {
        itsState.pass();
    }

    protected void lock(boolean shouldLock) {
        isLocked = shouldLock;
    }

    protected void alarm(boolean shouldAlarm) {
        isAlarming = shouldAlarm;
    }

    public int coins() {
        return itsCoins;
    }

    public int refunds() {
        return itsRefunds;
    }

    public void deposit() {
        itsCoins++;
    }

    public void refund() {
        itsRefunds++;
    }
    static class Locked extends Turnstile {
        @Override
        public void coin() {
            itsState = UNLOCKED;
            lock(false);
            alarm(false);
            deposit();
        }

        public void pass() {
            alarm(true);
        }
    }

    static class UnLocked extends Turnstile {
        @Override
        public void coin() {
            refund();
        }

        public void pass() {
            lock(true);
            itsState = LOCKED;
        }
    }
}
