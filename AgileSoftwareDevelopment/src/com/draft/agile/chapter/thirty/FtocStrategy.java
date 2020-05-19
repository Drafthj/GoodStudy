package com.draft.agile.chapter.thirty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author drafthj
 * @date 2020/4/24
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class FtocStrategy implements ApplicationInterface {
    InputStreamReader isr;
    BufferedReader br;
    private boolean isDone = false;

    @Override
    public void init() {
        isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);
        isDone = false;
    }

    @Override
    public void idle() {
        String fahrString = readLineAndReturnNullIfError();
        if (fahrString == null || fahrString.length() == 0) {
            isDone = true;
        } else {
            double fahr = Double.parseDouble(fahrString);
            double celcius = 5.0/9.0*(fahr-32);
            System.out.println("F=" + fahr + ", C=" + celcius);
        }
    }

    @Override
    public void cleanup() {
        System.out.println("ftoc exit");
    }

    @Override
    public boolean done() {
        return isDone;
    }
    private String readLineAndReturnNullIfError(){
        String s;
        try {
            s = br.readLine();
        }catch (IOException e) {
            s = null;
        }
        return s;
    }

    public static void main(String[] args) {
        new ApplicationRunner(new FtocStrategy()).run();
    }
}
