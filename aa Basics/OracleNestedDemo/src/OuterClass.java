public class OuterClass {

    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";
    private String privateOuterField = "Private Outer Field";

    //==============================================================
    class InnerClass {
        String innerField = "Inner Field";
        private String privateInnerField = "Private Inner Field";
        //NO STATIC ALLOWED

        void innerRequestsOuter() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
            System.out.println(privateOuterField);
        }

        void innerRequestsPrinner () {
            //System.out.println(prinnerField);               // NO ACCESS
            //System.out.println(privatePrinnerField);
        }

        void innerRequestsSNC () {
            //System.out.println(SNCField);                    // NO ACCESS
            //System.out.println(SNCStaticField);
            //System.out.println(SNCPrivateField);
            //System.out.println(SNCPrivateStaticField);
        }

        void innerRequestsPrSNC () {                            // NO ACCESS
            //System.out.println(PrSNCField);
            //System.out.println(PrSNCStaticField);
            //System.out.println(PrSNCPrivateField);
            //System.out.println(PrSNCPrivateStaticField);
        }

        void outerObjIntoInner(){
            OuterClass outerObj1 = new OuterClass();
        }

    }

    //===============================================================
     private class privateInnerClass {
        String prinnerField = "Field of private inner";
        private String privatePrinnerField = "Private field of private inner";
        //NO STATIC ALLOWED

        void prinnerRequestsOuter() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
            System.out.println(privateOuterField);
        }

        void prinnerRequestsInner() {
            //System.out.println(innerField);                    // NO ACCESS
            //System.out.println(privateInnerField);
        }

        void prinnerRequestsSNC () {
            //System.out.println(SNCField);                      // NO ACCESS
            //System.out.println(SNCStaticField);
            //System.out.println(SNCPrivateField);
            //System.out.println(SNCPrivateStaticField);
        }

        void prinnerRequestsPrSNC () {                            // NO ACCESS
            //System.out.println(PrSNCField);
            //System.out.println(PrSNCStaticField);
            //System.out.println(PrSNCPrivateField);
            //System.out.println(PrSNCPrivateStaticField);
        }

    }

    //===============================================================
    static class StaticNestedClass {

        String SNCField = "SNC field";
        static String SNCStaticField = "SNC static field";
        private String SNCPrivateField = "SNC private field";
        private static String SNCPrivateStaticField = "SNC private static field";

        void SNCRequestsOuter(OuterClass outer) {
            // System.out.println(outerField);       Compiler error: Cannot make a static reference to the non-static field outerField
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }

        void outerObjIntoSNC(){
            OuterClass outerObj3 = new OuterClass();
            System.out.println(outerObj3.outerField);
        }

    }

    private static class PrivateSNC {

        String PrSNCField = "PrSNC field";
        static String PrSNCStaticField = "PrSNC static field";
        private String PrSNCPrivateField = "PrSNC private field";
        private static String PrSNCPrivateStaticField = "PrSNC private static field";

    }


    // OUTER METHODS ==========================================
    InnerClass inner1 = new InnerClass();
    void outerRequestsInner() {
        System.out.println(inner1.innerField);           //NO ACCESS WITHOUT INNER OBJ
        System.out.println(inner1.privateInnerField);
    }

    privateInnerClass prInnerObj1 = new privateInnerClass();
    void outerRequestsPrinner() {
        System.out.println(prInnerObj1.prinnerField);         //NO ACCESS WITHOUT PRINNER OBJ
        System.out.println(prInnerObj1.privatePrinnerField);
    }

    StaticNestedClass SNCObj1 = new StaticNestedClass();
    void outerRequestsSNC () {
        System.out.println(SNCObj1.SNCField);                //NO ACCESS WITHOUT SNC OBJ
        System.out.println(SNCObj1.SNCStaticField);
        System.out.println(SNCObj1.SNCPrivateField);
        System.out.println(SNCObj1.SNCPrivateStaticField);
    }

    PrivateSNC PrSNCObj1 = new PrivateSNC();                  //NO ACCESS WITHOUT PrSNC OBJ
    void outerRequestsPrSNC () {
        System.out.println(PrSNCObj1.PrSNCField);
        System.out.println(PrSNCObj1.PrSNCPrivateField);
        System.out.println(PrSNCObj1.PrSNCStaticField);
        System.out.println(PrSNCObj1.PrSNCPrivateStaticField);
    }
}
