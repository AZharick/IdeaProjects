public class PC {            //3 типа влож. классов: 1) нестатич. влож. К.; 2) статич. влож. К.; 3) класс в методе
    private String id;
    private static String LEDclr = "Blue";

    public PC(String id) {
        this.id = id;
    }

    // влож. нестатический класс, имеет доступ к полям О-та (в данном случае, id)
    private class CPU {          //обычно private, ибо доступ извне к ним не нужен
        String name = "Intel i7";
        int freq = 2000;
        public void startCPU (){
            System.out.println(name+" CPU is starting with freq "+freq+" on "+id+" PC");
        };
    }

    // влож. нестатический класс, имеет доступ к полям О-та (в данном случае, id)
    private class RAM {
        String name = "Corsair 7000";
        int freq = 1600;
        public void testMem (){
            System.out.println(name + " initializing on PC "+id+" with freq "+freq);
        };
    }

    //влож. статический класс, не имеет доступа к нестатическим полям О-та, обычно исп. для в\д извне, поэтому public
    public static class LEDlight {
        public void lights () {
            System.out.println(LEDclr+" LED lights are on!");
        }
    }

    void startPC () {
        CPU proz = new CPU();
        proz.startCPU();
        RAM mem = new RAM();
        mem.testMem();
        LEDlight lite = new LEDlight();
        lite.lights();

        final int x = 666;
        //класс в методе, имеет доступ и к нестатич. полям (id), и к VARs метода (x), но х должна быть final
//        Фишка в том, что при создании О-та вложенного класса внутри метода все VARs метода копируются в О-т этого вложенного класса.
//        То есть VARs в методе и VARs во вложенном в этот метод классе - это две разные VARs с одинаковым значением.
//        Пример:
//        public void test() {
//            final int a = 5; //    эта переменная
//            class SomeClass {
//                public void someMethod() {
//                    a = 1; //     отличается от этой переменной
//                }
//            }
//        }
//        Имея в виду такую особенность реализации вложенных классов в Java, разработчики языка решили, что возможность
//        передавать во вложенные классы не константы приведет к путанице:
//        Если бы вы могли передавать во вложенные классы VARs-неконстанты, то вы бы могли изменять их внутри вложенных классов.
//        Тогда, изменив переменную внутри класса, вы бы ожидали, что она изменится и в самом методе-обертке, но этого не произойдет потому,
//        что в методе и во вложенном классе хранятся разные переменные. И наоборот, изменяя VAR в методе, вы бы ожидали,
//        что она изменится во вложенном классе, но этого не произойдет. Поэтому, чтобы такой путаницы не возникало,
//        во вложенные классы можно передавать только final VARs.
        class inMethClass {
              void justMeth (){
                  System.out.println("id is "+id+"; x = "+x);
              }
        }
        inMethClass dadada = new inMethClass();
        dadada.justMeth();
    }

}
