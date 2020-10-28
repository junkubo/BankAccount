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



}
