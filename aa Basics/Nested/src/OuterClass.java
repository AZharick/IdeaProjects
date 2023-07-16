public class OuterClass {
    private int a1 = 35;
    int a2 = 22;

    class InnerClass {
        private int b1 = 666;
        int b2 = a1 + 15;

        void innerRequestsOuter() {
            System.out.println("outerPrivateField = " + a1);
            System.out.println("outerField = " + a2);
        }
    }

    static class StaticNestedClass {
        static float e = 2.7f;
        int g = 10;                                 // из MAIN обратиться к нестатичной переменной нельзя
        //int h = outerField+15;                    // из SNC нет доступа к полям внешнего К-са
        //int i = innerField1+10;                   // из SNC нет доступа к полям других влож. К-сов
    }

    //OUTER METHODS =====================================================
    InnerClass innerObj1 = new InnerClass();        //создание О-та inner-класса внутри внешнего
    void outerReqInner () {
        //System.out.println(innerField1);          доступ из внешнего К-са к полям внутреннего только через О-т
        System.out.println(innerObj1.b2);
        System.out.println(innerObj1.b1);
    }

    void outerReqStatSNC () {
        System.out.println(StaticNestedClass.e);
    }
    StaticNestedClass SNCObj1 = new StaticNestedClass();
    void outerReqSNC() {
        System.out.println(SNCObj1.g);               //g запрашивается только через О-т
    }

}
