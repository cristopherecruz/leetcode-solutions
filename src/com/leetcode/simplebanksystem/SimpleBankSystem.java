package com.leetcode.simplebanksystem;

//https://leetcode.com/problems/simple-bank-system
public class SimpleBankSystem {

    static void main() {

        long[] balance = {10, 100, 20, 50, 30};

        Bank obj = new Bank(balance);
        //boolean param_1 = obj.transfer(5, 1, 20);
        //boolean param_2 = obj.deposit(1, 10);
        //boolean param_3 = obj.withdraw(3, 10);
        //System.out.println(param_1);
    }

    static class Bank {

        private long[] balance;

        public Bank(long[] balance) {
            this.balance = balance;
        }

        public boolean transfer(int account1, int account2, long money) {
            boolean isFromAccount = givenBalanceReturnAccount(account1);
            boolean isToAccount = givenBalanceReturnAccount(account2);

            if (isFromAccount || isToAccount) {
                return false;
            }

            if (money <= balance[account1 - 1]) {
                balance[account1 - 1] -= money;
                balance[account2 - 1] += money;
                return true;
            }

            return false;
        }

        public boolean deposit(int account, long money) {
            boolean isAccount = givenBalanceReturnAccount(account);

            if (isAccount) {
                return false;
            }

            balance[account - 1] += money;

            return true;
        }

        public boolean withdraw(int account, long money) {
            boolean isAccount = givenBalanceReturnAccount(account);

            if (isAccount) {
                return false;
            }

            if (money <= balance[account - 1]) {
                balance[account - 1] -= money;
                return true;
            }

            return false;
        }

        private boolean givenBalanceReturnAccount(int accountToSearch) {
            return accountToSearch > balance.length;
        }
    }

}
