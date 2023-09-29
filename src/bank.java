public class Bank {
    public static void main(String[] args) throws Exception {
        Account andrew = new Account("Andrew Bird", "A00001", 0.00);
		
		
		Account frank = new Account("Frank Sinatra", "F00002", 0.00);
		frank.showMenu();
    }
}
