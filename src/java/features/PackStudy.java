package java.features;

import org.junit.Test;

/**
 *     封装
 * 定义：是对数据及函数内部抽象为一个不可分割的整体，对外提供更加简单直接的访问，或者使用方式，
 * 开发者不需要 了解具体的实现细节，可以直接使用
 * 1： 优点
 * （一） 代码角度
 * 1：提高代码的复用性，进而提高代码的可维护性
 * 2：更加容易定位问题
 * 3：有效的调节性能，更能定位那些模块影响性能
 * （二）系统角度
 * 1：减少系统的偶尔性，避免一处有问题，整个系统都不能用了
 *
 * @author PackStudy
 */
public class PackStudy {

    public  void main(String[] args) {

    }

    @Test
    public void packStudyTest(){
        People people = new People();
        people.setAge(10);
        System.out.println("成年了没有："+people.isAdult());
    }

    public  class People{



        private int age;
        private String name;
        private int gender;

        /**
         *  是否成年
         * @return
         */
        public Boolean isAdult(){
           return this.age>17?true:false;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }
    }

}
