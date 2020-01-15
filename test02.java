class Foo {

 void bar(Collection x) {

   // A bit inefficient

   x.toArray(new Foo[0]);

   // Much better; this one sizes the destination array, avoiding

   // a reflection call in some Collection implementations

   x.toArray(new Foo[x.size()]);

 }

}
