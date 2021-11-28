package java.features;


import org.junit.Test;

/**
 * 继承
 * 定义：继承是 是一个ls-a 的关系，他拥有并且扩展了被继承者，所以 继承应该遵循里氏替换原则，子类对象必须能够替换掉所有父类对象。
 *
 * 优点：
 * 1 避免重复代码的编写
 * 2：可以进行向上转型，实现代码的抽象衔接
 * 缺点
 * 1：代码没有遵循里氏替换原则 对系统是灾难性的
 * 2：继承有时候设计的粒度太细，造成类爆炸
 * 3: 父类不能使用子类的函数
 * @author yukefu
 */
public class InheritStudy {


    @Test
    public void inheritTest(){
        Animal animal = new Bird();
        animal.run();
    }

      class Animal{
        private String foot;

        public Boolean run (){
            return true;
        }

    }
      class Bird extends Animal {
        private String foot;
        public Boolean fly(){
            return true;
        }

    }

}
