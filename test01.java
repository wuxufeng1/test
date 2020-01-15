public class Foo {

  private int bar =2;

  public boolean isBarEqualsTo(int x) {

    // this bit of code

    if (bar == x) {

     return true;

    } else {

     return false;

    }

    // 上面可以简化为：

    // return bar == x;

  }

}
