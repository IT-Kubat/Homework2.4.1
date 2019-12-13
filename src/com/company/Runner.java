package com.company;

public class Runner extends Thread {

    private int num = 1;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        if (getNum() - 1 == 5) {
            System.out.println(getName() + " beret palochku ");
            System.out.println("Runner 5 idet k finishu ");
            System.out.println(getName() + "bezhit k Runneru 4");
        } else if (getNum() == 1) {
            System.out.println(getName() + " bezhit k Runner" + getNum());
            System.out.println("Runner " + getNum() + " beret palochku ");
        } else {
            System.out.println(getName() + " beret palochku ");
            System.out.println(getName() + " bezhit k Runner" + getNum());
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
