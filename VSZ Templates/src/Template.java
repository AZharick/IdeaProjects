public class Template {
   private int order, section, part, numOfTempForPart;
   private int rack, shelf;
   private boolean isShell;

   //GnS ==================
   public boolean isShell() {
      return isShell;
   }
   public void setShell(boolean shell) {
      isShell = shell;
   }
   public int getOrder() {
      return order;
   }
   public void setOrder(int order) {
      this.order = order;
   }
   public int getSection() {
      return section;
   }
   public void setSection(int section) {
      this.section = section;
   }
   public int getPart() {
      return part;
   }
   public void setPart(int part) {
      this.part = part;
   }
   public int getShelf() {
      return shelf;
   }
   public void setShelf(int shelf) {
      this.shelf = shelf;
   }
   public int getRack() {
      return rack;
   }
   public void setRack(int rack) {
      this.rack = rack;
   }
}