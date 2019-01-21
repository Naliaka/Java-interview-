public class Counter {
  private int count = 0;
   public void incrementCount(int amount){
       this.setCount(this.getCount() + amount);
   }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
