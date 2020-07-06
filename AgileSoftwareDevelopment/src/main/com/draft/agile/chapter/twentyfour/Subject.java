package com.draft.agile.chapter.twentyfour;

import java.util.Iterator;
import java.util.Vector;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/7/1
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class Subject {
    private Vector<Observer> itsObserver = new Vector<>();

    protected void notifyObserver() {
        Iterator<Observer> iterator = itsObserver.iterator();
        while (iterator.hasNext()) {
            Observer observer = iterator.next();
            observer.update();
        }
    }

    public void registerObserver(Observer observer) {
        itsObserver.add(observer);
    }
}
