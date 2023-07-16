public class OuterClass {
    private String OuterField = "OuterField";

    //GETTER
    public String getOuterField() {
        return OuterField;
    }

    class InnerClass {
        private String InnerField = "InnerField";

        //GETTER
        public String getInnerField() {
            return InnerField;
        }
    }

}
