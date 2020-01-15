public class Foo {

    private static final SimpleDateFormat sdf = new SimpleDateFormat();

    void bar() {

        sdf.format(); // bad

    }

    synchronized void foo() {

        sdf.format(); // good

    }

}
public class Foo {

    void good() {

        try{

            Integer.parseInt("a");

        } catch(Exception e){

            throw new Exception(e);

        }

    }

    void bad() {

        try{

            Integer.parseInt("a");

        } catch(Exception e){

            throw new Exception(e.getMessage());

        }

    }

}
          void bad() {

              List foo = getList();

                      if (foo.size() == 0) {

                            // blah

                      }

                }

      }
public class Foo {

    private int x;  //Why bother saving this?

    public void foo(int y) {

     x = y + 5;

     return x;

    }

}

