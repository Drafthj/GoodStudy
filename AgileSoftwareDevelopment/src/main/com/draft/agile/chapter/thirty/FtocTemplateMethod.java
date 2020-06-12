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
public class FtocTemplateMethod extends Application {
    private InputStreamReader isr;
    private BufferedReader br;
    @Override
    protected void init() {
        isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);
    }

    @Override
    protected void idle() {
        String fahrString = readLineAndReturnNullIfError();
        if (fahrString == null || fahrString.length() == 0) {
            setDone();
        } else {
            double fahr = Double.parseDouble(fahrString);
            double celcius = 5.0/9.0*(fahr-32);
            System.out.println("F=" + fahr + ", C=" + celcius);
        }
    }

    @Override
    protected void cleanup() {
        System.out.println("ftoc exit");
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
        new FtocTemplateMethod().run();
    }
}
