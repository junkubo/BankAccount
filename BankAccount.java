class BankAccount {
  double balance = 0;
  int accountID = 0;
  String password = "";

  public BankAccount(int ID, String pwd){
    accountID = ID;
    password = pwd;
    balance = 0;
  }
  public double getBalance(){
    return balance;
  }
  public int getAccountID(){
    return accountID;
  }
  public void setPassword(String newPass){
    password = newPass;
  }
  public boolean deposit(double amount){
    if (amount >= 0) {
      balance += amount;
      return true;
    }
    return false;
  }
  public boolean withdraw(double amount){
    if (amount >= 0) {
      if (balance >= amount) {
        balance -= amount;
        return true;
      }
    }
    return false;
  }
  public String toString(){
    return accountID + "\t" + balance;
  }
}
