class Beverage{
    private void pour(int qty){
        System.out.println("add " + qty + "ml of beverage");
    }
    
    protected void addCondiment(){};
    
    protected void stir(){} //hook
    
    private void serve(){
        System.out.println("serve through waiter");
    }


public final void templateMethod(int qty){
    pour(qty);
    addCondiment();
    stir();
    serve();
    
}
}