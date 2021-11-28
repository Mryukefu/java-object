package java.features;

import java.util.ArrayList;
import java.util.List;

// 多态
// 多态分为编译时多态和运行时多态:
// 编译时多态主要指方法的重载

// 运行时多态指程序中定义的对象引用所指向的具体类型在运行期间才确定 运行时多态有三个条件: 继承 覆盖(重写) 向上转型 下面的代码中，乐器类(Instrument)有两个子类: Wind 和 Percussion，
// 它们都覆盖了父类的 play() 方法，并且在 main() 方法中使用父类 Instrument 来引用 Wind 和 Percussion 对象。在 Instrument 引用调用 play() 方法时，会执行实际引用对象所在类的 play() 方法，而不是 Instrument 类的方法。
public class Instrument {
    public void play() {
        System.out.println("Instument is playing...");
    }
}

class Wind extends Instrument {
    @Override
    public void play() {
        System.out.println("Wind is playing...");
    }
}

class Percussion extends Instrument {
    @Override
    public void play() {
        System.out.println("Percussion is playing...");
    }
}

class Music {
    public static void main(String[] args) {
        List<Instrument> instruments = new ArrayList<>();
        instruments.add(new Wind());
        instruments.add(new Percussion());
        for(Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
