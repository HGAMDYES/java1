package com.atguigu.exer;

import java.util.concurrent.Callable;

/**
 * @author HG
 * @create 2021-10-21-17:02
 */




class Clerk {
    private int productCount = 0;


    public synchronized void produceProduct() {
        if(productCount < 20){
            productCount++;
            System.out.println(Thread.currentThread().getName() + ":开始生产第" + productCount + "个产品");
            notify();
        }
        else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public synchronized void consumeProduct() {
        if(productCount > 0){
            System.out.println(Thread.currentThread().getName() + ":开始消费第" + productCount + "个产品");
            productCount--;
            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer extends Thread {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + "开始生产......");
        while (true) {
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.produceProduct();


        }

    }
}

class Consumer extends Thread {
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + "开始消费......");
        while (true) {
            try {
                sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.consumeProduct();


        }

    }
}


public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer p1 = new Producer(clerk);
        Consumer c1 = new Consumer(clerk);
        Consumer c2 = new Consumer(clerk);
        p1.setName("生产者");
        c1.setName("消费者");
        c2.setName("消费者2");
        p1.start();
        c1.start();
        c2.start();

    }
}
