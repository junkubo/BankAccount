class Test {
  public static void main (String[] args) {
      BankAccount jun = new BankAccount(1234, "secret");
      System.out.println(jun.getBalance());
      System.out.println(jun.getAccountID());
      jun.deposit(500000);
      System.out.println(jun.getBalance());
      jun.withdraw(250000);
      System.out.println(jun.getBalance());
      jun.setPassword("newsecret");
      System.out.println(jun.password);
      System.out.println(jun.toString());
      BankAccount samuel = new BankAccount(9876, "terces");
      toTransfer(samuel, 100, "secret");
      System.out.println(jun.balance);
      System.out.println(samuel.balance);
  }
}
