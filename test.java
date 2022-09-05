public class test {
    private int itemCode;
  private String title;
  public BookMultiConstructor(int newItemCode, String newTitle) {
    setItemCode(newItemCode);
    setTitle(newTitle);
  }
  public Book(String newTitle) {
    setItemCode(0);
    setTitle(newTitle);
  }
  public int getItemCode() {
    return itemCode;
  }
  public void setItemCode (int newItemCode) {
    if (newItemCode > 0) itemCode = newItemCode; 
  }
  public String getTitle() {
    return title;
  }
  public void setTitle (String newTitle) {
    title = newTitle;
  }
  public void display() {
    System.out.println(itemCode + " add" + title);
  }
    
}
